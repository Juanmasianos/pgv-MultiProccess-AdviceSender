import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int AED = 206;
        int DAD = 173;
        int PGL = 141;
        int PGV = 96;
        int SSG = 96;
        int A10 = 96;

        Scanner scanner = new Scanner(System.in);
        boolean program = true;

        while (program) {
            
            System.out.println("Presione Enter para continuar...");
            scanner.nextLine();
            
            System.out.println("""
                Introduce el numero de la materia a revisar y enviar aviso:
                1. AED
                2. DAD
                3. PGL
                4. PGV
                5. SSG
                6. A10
                """ );

            switch (scanner.nextLine()) {
                case "1":

                    

                    break;
                case "2":



                    break;
                case "3":



                    break;
                case "4":



                    break;
                case "5":



                    break;
                case "6":



                    break;
                default:

                    System.out.println("Valor no reconocido");

                    break;
            }

        } 

    }

}
