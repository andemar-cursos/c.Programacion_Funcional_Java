package com.andemar.cursos.functional.sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    public static void main(String[] args) {

        // Agrega 0, al dia y mes, que sean menor a 10.
        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" + addCeros.apply(month) + "-" + addCeros.apply(day));

        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(
                                            parseDate.apply(day, month, year),
                                            LocalDate.now())
                                            .getYears();

        System.out.println( calculateAge.apply( 16, 12, 1996) );
    }


    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
