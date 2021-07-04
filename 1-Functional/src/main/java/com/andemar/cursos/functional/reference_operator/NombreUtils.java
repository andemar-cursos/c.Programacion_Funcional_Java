package com.andemar.cursos.functional.reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombreUtils {

    public static void main(String[] args) {
        List<String> profesores = getList("Nicoleas", "Juan", "Andemar");

        // Ejemplo 1.1
        Consumer<String> printer = s -> System.out.println(s);
        profesores.forEach(printer);

        // Ejemplo 1.2
        profesores.forEach(System.out::println);
    }

    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
