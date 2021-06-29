package com.andemar.cursos.functional.math;

import java.util.function.Function;

public class MathOperation2 {

    public static void main(String[] args) {

        // Ultima en ejecucion
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicando x: " + x + " por 3");
            return x * 3;
        };

        // Primera en ejecucion
        Function<Integer, Integer> add1MiltiplyBy3 =

                // Primero se ejecuta la funcion, y luego la funcion llamada
                // en este caso multiplyBy3
                multiplyBy3.compose(y -> {
                    System.out.println("Le agregare 1 a: " + y);
                    return y + 1;
                });

        // Tercera en ejecucion
        Function<Integer, Integer> andSquare =

                // Como se uso el andThen, la funcion se espera a que
                // add1MultiplyBy3 retorne su resultado.
                add1MiltiplyBy3.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return x * x;
                });

        System.out.println(andSquare.apply(3));
    }
}
