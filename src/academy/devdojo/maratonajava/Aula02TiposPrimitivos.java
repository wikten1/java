package academy.devdojo.maratonajava;
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, duble, float, char, byte, short, long, boolean
        int idade = (int) 100000000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 3200;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String frase = "Esse é um grande texto!";
        System.out.println("A idade é: "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(frase);
    }
}
