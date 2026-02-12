package org.example.metodos;

public class ComparacaoTipos {
    public static void main(String[] args) {
        // Declaração de variaveis
        String nomeUsuario  =  "Marta";
        int senha  = 321;

        // Comparação de String e inteiros
        boolean resultadoNome = nomeUsuario.equals("Bruno");
        boolean resultadoSenha = (senha == 321);

        // Exibindo resultados
        System.out.println("O nome do usuário correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);


    }
}
