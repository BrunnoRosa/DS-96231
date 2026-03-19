package org.example.sobrecargademetodos;

public class Calculadora {

    // Métodos com o mesmo nome.
    // Mas com assintauras diferentes.

    public int calcular (int a, int b) {
        return a + b;
    }

    public double calcular (double a, double b) {
        return a + b;
    }

    public String calcular (String a, String b){
        return a + b;
    }


}
