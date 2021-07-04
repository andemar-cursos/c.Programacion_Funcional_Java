package com.andemar.cursos.functional.math;

import java.util.List;
import java.util.stream.Stream;

public class MathReduce {

    public static void main(String[] args) {

        // De una lista de string de numeros, convertirlos
        // a enteros, luego sumarlos.

        Stream<String> listaString = List.of("1", "2", "3", "4", "5").stream();

        // Con lo que entiendo, se necesita el Parallel par apoder
        // ejecutar la funcion de Integer::sum
        int result = listaString.parallel().reduce(
                0,
                (count, valor) -> Integer.parseInt(valor),
                Integer::sum
        );

        System.out.println(result);

    }
}
