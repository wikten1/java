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
}
