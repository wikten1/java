package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado.
    //condição valor da parcela >= 1000.
    public static void main(String[] args) {
        float valorCarro = 50000f;
        System.out.println("É possível parcelar o carro em: ");
        for(int parcela = 1; parcela <= valorCarro; parcela++){
            float resultado = valorCarro/parcela;
            if (resultado < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+resultado);
        }
    }
}
