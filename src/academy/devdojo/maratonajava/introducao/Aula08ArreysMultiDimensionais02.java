package academy.devdojo.maratonajava.introducao;

public class Aula08ArreysMultiDimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] arrey = {1,2,3};

        //Linhas de arreys que estão dentro do arreyInt
        arrayInt[0] = new int[2];
        arrayInt[1] = arrey;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        for(int[] arreyBase: arrayInt){
            System.out.println("\n----------------");
            for(int num: arreyBase){
                System.out.print(num + " ");
            }
        }

        //Outra forma de se declarar um arrey multi dimensional.
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

    }

    public static class Aula02TiposPrimitivos {
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
}
