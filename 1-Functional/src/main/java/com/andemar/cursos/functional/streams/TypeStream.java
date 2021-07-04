package com.andemar.cursos.functional.streams;

import java.util.stream.IntStream;

public class TypeStream {

    public static void main(String[] args) {

        // Seed: En que valor se iniciara la operacion
        // f: Funcion que se aplicara por cada valor
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);

        // Con limit inicio la ejecucion, pero limito el
        // numero de operaciones a 1000
        infiniteStream.limit(1000)
                    // Esto permite la ejecucion de las funciones
                    // de forma concurente (Pero la data no es ordenada)
                    .parallel()
                    .filter(x -> x % 2 == 0)
                    .forEach(System.out::println);
                    // Esto sirve para verificar si toda la data
                    // pasa x condicion.
//                  .allMatch(x -> x % 2 == 0);
    }
}
