import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner teclado = new Scanner(System.in);
        /*int a = 10;
        int b = 0;
        int b = teclado.nextInt();
        int b= Integer.parseInt(teclado.nextLine());*/

        try {
            int a = 10;
            int b = Integer.parseInt(teclado.nextLine());
            System.out.println("Division: " + (a / b));
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("No se puede dividir entre cero");
        }catch (NumberFormatException nfe){
            System.out.println("No has capturado el dato de manera correcta");
        } finally {
            System.out.println("Siempre se ejecuta");
        }
        System.out.println("Fin del programa");

    }
}
