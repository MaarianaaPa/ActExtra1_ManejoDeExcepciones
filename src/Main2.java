import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args) {
        // leer archivos
        String ruta = "datos.txt";
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException fnfe){
            System.out.println("El archivo no existe");
            // que nos obtanda msj de excepcion, falla porque no encuentra
            System.out.println(fnfe.getMessage());
        }
    }
}
