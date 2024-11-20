import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escribe el numero de la pelicula que deseas consultar");
        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GuardarArchivo guardar = new GuardarArchivo();
            guardar.guargarJson(pelicula);

        }catch (NumberFormatException e){
            System.out.println("Numero de pelicula no encontrado " + e.getMessage());

        }catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion");
        }
    }
}
