package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimirMediaSal() {
        if (salarios != null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial: " + media);
    }
}
