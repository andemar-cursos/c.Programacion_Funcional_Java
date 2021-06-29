package com.andemar.cursos.functional.defaults;

public class StringFunctions {

    @FunctionalInterface
    interface StringOperation {
        int getAmount();

        default void operate(String text) {
            int x = getAmount();
            while (x-- > 0) {
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoOperation{
        void take(String text);

        default void execute(int x, String texto) {
            while (x-- > 0) {
                take(texto);
            }
        }
    }


    public static void main(String[] args) {

//        StringOperation six = () -> 6;
//        six.operate("Alumno");


        // En esta operacion, indico la funcion que se va a realizar
        // y con execute indico los valores de esta.
        DoOperation operation = text -> System.out.println(text);
        operation.execute(3, "andemarNext");
    }

}
