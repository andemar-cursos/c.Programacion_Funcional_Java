package com.andemar.cursos.functional.chaining;

public class Chaining {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ola")
                     .append("q")
                     .append("ace");

        Chainer chainer = new Chainer();

        chainer .sayHi()
                .sayBye();
    }

    static class Chainer {

        public Chainer sayHi() {
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Adios");
            return this;
        }
    }
}
