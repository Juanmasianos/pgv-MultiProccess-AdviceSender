import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


import net.salesianos.csvreader.CSVReader;
import net.salesianos.datachecker.DataChecker;
import net.salesianos.model.Advice;

public class App {

    private static void checkAndSend(String fileName) throws IOException {

        ArrayList<Advice> advices = DataChecker.checkData(CSVReader.getData(fileName), fileName);

        try {

            for (Advice advice : advices) {
                
                initMailSenderProccess(advice);
            
            }

            System.out.println("Mails lanzados, para comprobar sus estados, compruebe en la carpeta maillogs.");
        
        } catch (IOException e) {
                e.printStackTrace();
        }


    }

    private static String showMenu(Scanner scanner) {

        System.out.println("""
                Introduce el numero de la materia a revisar y enviar aviso:
                0. Cerrar el programa
                1. AED
                2. DAD
                3. PGL
                4. PGV
                5. SSG
                6. A10
                """);

        return scanner.nextLine();

    }

    private static void initMailSenderProccess(Advice advice) throws IOException {

        String senderRoute = "./src/net/salesianos/mailsender/MailSender.java";
        String packageRoute = "./lib/jakarta.mail-2.0.2.jar;./lib/jakarta.activation-2.0.1.jar";

        ProcessBuilder builder = new ProcessBuilder("java", "-cp", packageRoute, senderRoute, advice.getName(), advice.getEmail(), advice.getSubject(), String.valueOf(advice.getPercentage()));

        String outputFileRoute = "./src/net/salesianos/maillogs/" + advice.getName() + "_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss")) +".txt";
        File outputFile = new File(outputFileRoute);

        String errorFileRoute = "./src/net/salesianos/maillogs/" + advice.getName() + "_error_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss")) +".txt";
        File errorFile = new File(errorFileRoute);

        builder.redirectOutput(outputFile);
        builder.redirectError(errorFile);

        builder.start();

    }



    public static void main(String[] args) throws Exception {



        Scanner scanner = new Scanner(System.in);
        boolean program = true;

        while (program) {

            System.out.println("Presione Enter para continuar...");
            scanner.nextLine();

            switch (showMenu(scanner)) {
                case "0": 

                    System.out.println("Cerrando el programa");
                    program = false;

                    break;
                case "1":

                    checkAndSend("aed");

                    break;
                case "2":
                
                    checkAndSend("dad");

                    break;
                case "3":
                
                    checkAndSend("pgl");

                    break;
                case "4":
                
                    checkAndSend("pgv");

                    break;
                case "5":
                
                    checkAndSend("ssg");

                    break;
                case "6":
                
                    checkAndSend("a10");

                    break;

                default:

                    System.out.println("Valor no reconocido");

                    break;

        }

        }

    }

}
