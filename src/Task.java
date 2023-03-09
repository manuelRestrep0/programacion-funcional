import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {
        //imprimir todos nombres que contengan la letra a y m
        List<String> words = List.of("mateo", "maria", "pepe", "sofia", "clara");
        words.stream()
                .filter(palabra -> palabra.contains("a") && palabra.contains("m"))
                .forEach(palabra -> System.out.println(palabra));
        // filtrar los numeros pares
        //Despues ordenarlos de menor a mayor.
        // despues cada numero multiplicarlo por dos
        //Nota: usar filter, map, sorted.
        List<Integer> numers = List.of(6, 5, 7, 8, 9,10);
        List<Integer> numerosFiltrados = numers.stream()
                .filter(numero -> numero%2==0)
                .sorted()
                .map((numero) -> numero*2)
                .collect(Collectors.toList());
        numerosFiltrados.stream()
                .forEach(numero -> System.out.println(numero));

    }
}
