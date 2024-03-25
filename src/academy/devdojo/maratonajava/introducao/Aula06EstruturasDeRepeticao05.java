package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado.
    //condição valor da parcela >= 1000.
    public static void main(String[] args) {
        float valorCarro = 50000f;
        System.out.println("É possível parcelar o carro em: ");
        for(int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro/parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
