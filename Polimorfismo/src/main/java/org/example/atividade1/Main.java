package org.example.atividade1;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Galo galo = new Galo();
        Gato gato = new Gato();
        Pato pato = new Pato();

        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comer());

        System.out.println(galo.emitirSom());
        System.out.println(galo.comer());
        System.out.println(pato.emitirSom());
        System.out.println(pato.comer());
        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());
    }
}
