package academy.devdojo.maratonajava.javacore.Eblocosinicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocado espaço de memoria para o objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3 - O bloco de inicialização é executado
    //4 - O construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int epsodio: this.episodios) {
            System.out.print(epsodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
