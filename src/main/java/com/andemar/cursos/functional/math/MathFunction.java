package com.andemar.cursos.functional.math;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction  {

    public static void main(String[] args) {

        // Ejemplo 1 ******************************

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

//        System.out.println(square.apply(5));
//        System.out.println(square.apply(10));


        // Ejemplo 2 ******************************

        // Revisa si es un par
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
//        System.out.println( isOdd.apply(4) );

        // Revisa si es un par
        // Predicate siempre retorna un boolean
        Predicate<Integer> isEven = x -> x % 2 == 0;
//        System.out.println( isEven.test(4) );


        // Ejemplo 3 ******************************

        Predicate<Student> aprobo = student -> student.getCalificacion() >= 6;

//        System.out.println(aprobo.test(new Student(5.0)));


        // Ejemplo 4 ****************

        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x*y;

        System.out.println(multiplicacion.apply(5,5));

    }


    static class Student {

        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }

}
