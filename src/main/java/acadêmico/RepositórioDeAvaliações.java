package acadêmico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositórioDeAvaliações {

    private List<Avaliação> avaliações = new ArrayList<>();

    public void adicionar(Avaliação avaliação) {
        this.avaliações.add(avaliação);
    }

    public Aluno[] obterAprovados(Disciplina disciplina) {
        List<Avaliação> avaliaçõesPorDisciplina = this.avaliações
                .stream()
                .filter(avaliação -> avaliação.getDisciplina().equals(disciplina))
                .collect(Collectors.toList());
        List<Aluno> alunosDaDisciplina = avaliaçõesPorDisciplina.stream()
                .map(Avaliação::getAluno)
                .collect(Collectors.toList());
        List<Aluno > alunosAprovados = new ArrayList<>();
        for (Aluno aluno : alunosDaDisciplina) {
            List<Avaliação> avaliaçõesDoAluno = avaliaçõesPorDisciplina.stream()
                    .filter(avaliação -> avaliação.getAluno().equals(aluno))
                    .collect(Collectors.toList());
            float média = 0;
            for (Avaliação avaliação : avaliaçõesDoAluno) {
                média += avaliação.getNota();
            }
            média = média / avaliaçõesDoAluno.size();
            if (média >= 6) {
                alunosAprovados.add(aluno);
            }
        }

        return (Aluno[]) alunosAprovados.toArray();
    }
}
