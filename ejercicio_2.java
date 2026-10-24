//Ejercicio 2 - Procesamiento de notas
import java.util.List;

public class ejercicio_2 {
    public static void main(String[] args){
        List<Double> notas = List.of(2.5, 4.0, 3.5, 1.8, 4.8, 3.0, 2.9);

        notas.stream()
            .filter(nota -> nota >= 3.0)
            .map(nota -> Math.min(nota + 0.2, 5.0))
            .forEach(System.out::println);
    }
}