package acadêmico;

public class Aluno {

    private String nome;
    private int ra;


    public Aluno (String nome, int ra){
        this.nome=nome;
        this.ra=ra;
    }

    public String getNome() {
        return this.nome;

    }

    @Override
    public String toString() {
        return "\n" + "nome: " + nome
                + ", ra: " + ra;
    }

    public int getRA (){
        return this.ra;
    }
}
