package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Del Rey";
        carro1.modelo = "Ouro";
        carro1.ano = 1981;

        carro2.nome = "Santana";
        carro2.modelo = "Pratinha bolado";
        carro2.ano = 2005;

        //carro2 = carro1; Quando eu faço isso o carro 2 pega como referência o mesmo endereço de memoria do carro1 e
        // os valores do carro 2 se perdem na memória. OBS: só é possível fazer isso quando se tem dois objetos do
        // mesmo tipo;

        System.out.println("Nome: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println("Nome: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}
