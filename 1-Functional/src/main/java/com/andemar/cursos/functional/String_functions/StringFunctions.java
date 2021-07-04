package com.andemar.cursos.functional.String_functions;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {

        // Ejemplo 1 ***********************

        UnaryOperator<String> quote = text -> "\"" + text + "\"";

//        System.out.println( quote.apply("Prueba") );

        // Ejemplo 2 ***********************

        BiFunction<String, Integer, String> leftPag = (text, number) ->
                String.format("%" + number + "s", text);

        System.out.println(leftPag.apply("Java", 10));
    }
}
