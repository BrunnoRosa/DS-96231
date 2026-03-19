package org.example.exercicio4;


public class Diretor extends CargoDeConfiança implements Contratacao{
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + funcionario.getNome());

    }

    @Override
    public double obterSalarioFinal() {
        double salarioFinal = super.salarioBase;
        salarioFinal *= Bonificacao.DIRETOR.getValor();
        salarioFinal *= this.PREMIO;
        return salarioFinal;
        //return Bonificacao.DIRETOR.getValor() * super.salarioBase;
    }
}
