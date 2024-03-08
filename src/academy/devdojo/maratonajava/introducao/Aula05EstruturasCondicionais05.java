package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            
            case 2:
                System.out.println("Seg");
                break;

            case 3:
                System.out.println("Ter");
                break;

            case 4:
                System.out.println("Quar");
                break;

            case 5:
                System.out.println("Quin");
                break;

            case 6:
                System.out.println("Sex");
                break;

            case 7:
                System.out.println("Sab");
                break;

            default:
                System.out.println("A semana só tem 7 dias seu animal!!!");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;

            case 'F':
                System.out.println("Mulher");
                break;
        
            default:
                System.out.println("Opção invalida!");
                break;
        }

    }
}
