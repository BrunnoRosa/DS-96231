package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Processador p1 = new Processador("Samsung", "Samsung", "165hz");
        Memoria m1 = new Memoria("Intel", "Sandisk", 512);
        PlacaMae pm1 = new PlacaMae("GigaByte", "Intell", "AMD5");
        DispositivoDeArmazenamento dm1 = new DispositivoDeArmazenamento("Sandisk", "UltraHigh", "2 TB", "Sata");
        System.out.println(p1.toString());
        System.out.println(m1.toString());
        System.out.println(pm1.toString());
        System.out.println(dm1.toString());

    }
}
