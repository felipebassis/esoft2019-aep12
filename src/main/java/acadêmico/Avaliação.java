package acadêmico;



public class Avaliação {


    private Aluno aluno;
    private Disciplina disciplina;


    private float nota;

    public Avaliação(Aluno aluno,Disciplina disciplina, float nota) {
        if (validaNota(nota)) {
            this.nota = nota;

        } else {
            throw new RuntimeException("Nota invalida!");
        }
        this.aluno=aluno;
        this.disciplina=disciplina;
    }
    public Aluno getAluno(){
        return this.aluno;
    }

    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    public float getNota(){
        return this.nota;
    }

    private boolean validaNota(float nota) {
        return nota >= 0 && nota <= 10;

    }
}
