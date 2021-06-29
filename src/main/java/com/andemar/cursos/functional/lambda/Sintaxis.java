package com.andemar.cursos.functional.lambda;

import com.andemar.cursos.functional.reference_operator.NombreUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {

    public static void main(String[] args) {
        List<String> cursos = NombreUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        // Asi se usa una funcion sin parametros
        usarZero(() -> 2);

        // Asi se usaria un predicado, el cual solo retorna boolean y recibe  1 parametro
        usarPredicado(String::isEmpty);

        // Asi se enviarian dos parametros
        usarBifunction((x, y) -> x * y);

        // Si se ha de usar mas de una linea en el cuerpo, se debe abrir corchetesm
        // e indicar el retorno.
        usarBifunction((x, y) -> {
            System.out.println("Valor X y Y => " + x + " - " +y);
            return x + y;
        });

        // Asi se opera una funtion que no recibe ni retorna algo.
        usarNada(() -> {});
        // En este caso, no se estan enviando parametros y tampoco tien retorno.
        usarNada(() -> {
            System.out.println("Ola q ace");
        });
    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    static void usarPredicado(Predicate<String> predicado) {

    }

    static void usarBifunction(BiFunction<Integer, Integer, Integer> operacion) {

    }

    static void usarNada(OperarNada operarNada){

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }

}
