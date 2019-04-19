package acadêmico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("ray", 13);
        Aluno aluno2 = new Aluno("felps", 14);
        Aluno aluno3 = new Aluno("goku", 15);
        Aluno aluno4 = new Aluno("seila", 16);
        Aluno aluno5 = new Aluno("polaske", 17);
        Aluno aluno6 = new Aluno("naruto", 18);
        Aluno aluno7 = new Aluno("iop", 19);
        Aluno aluno8 = new Aluno("seya", 20);
        Aluno aluno9 = new Aluno("miki", 21);
        Aluno aluno10 = new Aluno("felipe", 22);

        Disciplina matematica = new Disciplina("matematica");
        Disciplina geografia = new Disciplina("geografia");
        Disciplina banco = new Disciplina("banco");
        Disciplina programacao = new Disciplina("programação");
        Disciplina historia = new Disciplina("historia");

        List<Disciplina> disciplinas = new ArrayList<>();

        disciplinas.add(matematica);
        disciplinas.add(geografia);
        disciplinas.add(banco);
        disciplinas.add(programacao);
        disciplinas.add(historia);

        RepositórioDeAvaliações repositórioDeAvaliações = new RepositórioDeAvaliações();

        adiconarAvaliacoes(repositórioDeAvaliações, aluno1, matematica, 5, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno1, geografia, 5, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno1, banco, 5, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno1, programacao, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno1, historia, 1, 1, 1, 1);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno2, matematica, 5, 6, 6, 8);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno2, geografia, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno2, banco, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno2, programacao, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno2, historia, 1, 1, 1, 1);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno3, matematica, 5, 8, 8, 8);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno3, geografia, 10, 1, 6, 8);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno3, banco, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno3, programacao, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno3, historia, 1, 1, 1, 1);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno4, matematica, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno4, geografia, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno4, banco, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno4, programacao, 1, 1, 1, 1);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno4, historia, 1, 1, 1, 1);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno5, matematica, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno5, geografia, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno5, banco, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno5, programacao, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno5, historia, 1, 1, 1, 1);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno6, matematica, 6, 7, 8, 9);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno6, geografia, 6, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno6, banco, 5, 9, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno6, programacao, 6, 7, 6, 6);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno6, historia, 6, 6, 6, 9);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno7, matematica, 5, 10, 10, 10);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno7, geografia, 5, 10, 6, 7);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno7, banco, 5, 10, 8, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno7, programacao, 7, 1, 6, 10);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno7, historia, 5, 8, 6, 7);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno8, matematica, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno8, geografia, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno8, banco, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno8, programacao, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno8, historia, 5, 10, 6, 4);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno9, matematica, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno9, geografia, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno9, banco, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno9, programacao, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno9, historia, 5, 10, 6, 4);

        adiconarAvaliacoes(repositórioDeAvaliações, aluno10, matematica, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno10, geografia, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno10, banco, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno10, programacao, 5, 10, 6, 4);
        adiconarAvaliacoes(repositórioDeAvaliações, aluno10, historia, 5, 10, 6, 4);

        disciplinas.forEach(disciplina -> System.out.println("Disciplina: " + disciplina.getNome() + "\n"
                + "Aprovados: " + Arrays.toString(repositórioDeAvaliações.obterAprovados(disciplina))));
    }

    private static void adiconarAvaliacoes(RepositórioDeAvaliações repositório, Aluno aluno, Disciplina disciplina, float... notas) {

        for (float nota : notas) {
            repositório.adicionar(new Avaliação(aluno, disciplina, nota));
        }

    }

}
