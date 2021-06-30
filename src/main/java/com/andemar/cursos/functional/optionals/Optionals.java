package com.andemar.cursos.functional.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        Optional<List<String>> optional = getOptionalsNames();

        if(optional.isPresent()){
            // Hago la logica
        }

        // O se puede imprimir cada elemento
        optional.ifPresent(list -> list.forEach(System.out::print));

        

    }





    static List<String> getNames() {

        return new ArrayList<String>();
    }

    static Optional<List<String>> getOptionalsNames() {

        return Optional.of(new ArrayList<String>());
    }
}
