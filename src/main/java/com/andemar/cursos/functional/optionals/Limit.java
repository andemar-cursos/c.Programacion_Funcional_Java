package com.andemar.cursos.functional.optionals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {

    public static void main(String[] args) {

        Stream<String> listaString = List.of("1", "2", "3", "4", "5").stream();

        List<String> result = listaString.limit(3).collect(Collectors.toList());

        System.out.println(result);
    }
}
