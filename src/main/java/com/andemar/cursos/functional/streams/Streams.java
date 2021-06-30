package com.andemar.cursos.functional.streams;

import com.andemar.cursos.functional.reference_operator.NombreUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<String> curseList = NombreUtils.getList("Java, Frontend, Backend, FullStack");

        // Originalmente se hace asi
        for (String curse: curseList) {
            // Logica
        }

        Stream<String> coursesStream = Stream.of("Java", "Frontend", "Backend", "FullStack");

        // Retorna el objeto, si se cumple la funcion.
        Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));

        Stream<String> emphasisCourses = justJavaCourses.map(course -> course + "!");

        emphasisCourses.forEach(System.out::print);

        // Este metodo no se puede usar debido a que no se puede volver
        // a llamar el Stream de coursesStream. Los Streams son de unica ejecucion.
//        Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());
//        Optional<Integer> longest = courseLengthStream.max((x,y) -> y - x);
    }
}
