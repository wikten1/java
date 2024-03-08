package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        float salario = 70000f;
        double primeiraFaixa = 9.70/100;
        double segundoFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;
        if (salario < 34712) {
            valorImposto = salario*primeiraFaixa;
        } else if (salario >= 34712 && salario <= 68507) {
            valorImposto = salario*segundoFaixa;
        } else{
            valorImposto = salario*terceiraFaixa;
        }

        System.out.println(valorImposto);



    }
}
