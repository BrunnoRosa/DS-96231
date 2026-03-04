package com.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Mabru", 5, "Pitbull");
        Cliente cliente1 = new Cliente("Bruno Rosa", 35, pet1);
        Cliente cliente2 = new Cliente("Geovane Paixão", 40,
                new Pet("Lupíta", 9, "Pinscher"));

        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("Idade do cliente: " + cliente1.getIdade());
        System.out.println("Nome do Animal: " + cliente1.getPet().getNome());
        System.out.println("Raça do Animal: " + cliente1.getPet().getRaca());
        System.out.println("Idade do animal: " + cliente1.getPet().getIdade());

        System.out.println("Nome do Cliente2: " + cliente2.getNome()+ "seu pet se chama:" + cliente2.getPet().getNome());
    }
}
