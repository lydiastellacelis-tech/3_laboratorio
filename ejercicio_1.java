//Ejercicio 1 - ciudades con Streams
import java.util.List;

public class ejericico_1 {
    public static void main(String[]arg){
        List<String> ciudades = List.of(
            "Medellin", "Bogota", "Cali", "Pereira",
            "Monteria", "Marinilla", "Malpelo", "Barranquilla"
        );
        List<String> resultado = ciudades.stream() //Convertimos la lista en un Stream
                .filter(ciudad -> ciudad.startsWith(M)) //Vamos filtrar nuestra busqueda, ciudad-> será nuestra landa y con el resto ahora si nos devolvera True en caso de que inicie en M algún elemento de la lista
                .map(String::toUpperCase)//Con map transformamos un elemento en otro, en este caso a mayuscula
                .sorted()//Ahora lo ordenamos en orden alfabetico
                .toList();
        System.out.println(resultado);
    }
}