import java.time.LocalDateTime;
import java.util.function.*;

public class Funtional {
    public static void main(String[] args){
        //supplier
        Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
        LocalDateTime time = dateTime.get();
        //consumer
        Consumer<String> print = (x) -> System.out.println(x);
        print.accept(time.toString());
        //function
        Function<String, Integer> size = (s) -> s.length();
        int timeSize = size.apply(time.toString());
        System.out.println("imprimiento desde function: "+timeSize);
        //bifunction
        BiFunction<Integer, Integer, Integer> suma = (number1, number2) -> number1+number2;
        int sum = suma.apply(1,2);
        System.out.println("Sumando desde una bifuncion: "+ sum);
        BiFunction<Integer, Integer, Double> pow = (number1, number2) -> Math.pow(number1, number2);
        Double potencia = pow.apply(2,3);
        System.out.println("Potencia desde una bifunction "+potencia);
        //predicate
        Predicate<String> validador = (nombre) -> nombre.equals("pepe");
        boolean esIgual = validador.test("Mateo");
        System.out.println("predicate: "+esIgual);

    }



}
