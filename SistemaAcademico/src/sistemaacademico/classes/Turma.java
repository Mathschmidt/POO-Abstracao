package sistemaacademico.classes;

import java.util.List;

public class Turma {
    public int Id;
    public String Periodo;
    public List<Aluno> Aluno;

    // Construtor da turma
    public Turma(int id, String periodo, List<Aluno> aluno){
        Id = id;
        Periodo = periodo;
        Aluno = aluno;
    }

    // Lista os alunos da turma
    public void listarAlunos(){
        System.out.println(Aluno);
    }
}
