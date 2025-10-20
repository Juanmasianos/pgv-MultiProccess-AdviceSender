import java.io.File;
import java.util.Scanner;

import net.salesianos.csvreader.CSVReader;
import net.salesianos.datachecker.DataChecker;

public class App {

    private static void checkAndSend(String fileName) {

        DataChecker.checkData(CSVReader.getData(fileName));

    }

    private static String showMenu(Scanner scanner) {

        System.out.println("""
                Introduce el numero de la materia a revisar y enviar aviso:
                1. AED
                2. DAD
                3. PGL
                4. PGV
                5. SSG
                6. A10
                """);

        return scanner.nextLine();

    }

    public static void main(String[] args) throws Exception {



        Scanner scanner = new Scanner(System.in);
        boolean program = true;

        while (program) {

            System.out.println("Presione Enter para continuar...");
            scanner.nextLine();

            switch (showMenu(scanner)) {
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
