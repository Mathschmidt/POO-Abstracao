package sistemaacademico.teste;

import sistemaacademico.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args){
        Curso engenharia = new Curso(1, "Engenharia de Computação", true);

        Curso direito = new Curso(2, "Direito", true);

        Aluno joao = new Aluno(1, "João", 2020123456, engenharia, "(19)3272-5689",
                "(19)99965-4895", "15/12/1999", "joao@gmail.com", "49.165.754-6", "195.164.792-04");

        Aluno fernando = new Aluno(2, "fernando", 123543, engenharia, "(19)92929292",
                "(19)01230192", "10/08/1990", "fernando@hotmail.com", "59.189.984-5", "984.159.456-59");

        List<Aluno> alunosEngenharia = new ArrayList<Aluno>();
        alunosEngenharia.add(joao);
        alunosEngenharia.add(fernando);

        Turma turmaEngenharia = new Turma(1, "Noite", alunosEngenharia);

        //System.out.println(turmaEngenharia.Aluno);

        //fernando.editarAluno("(19)9999999", "(12)92929292", "fernando@gmail.com");

        //System.out.println(fernando);

        Professor cassio = new Professor(1, "Cassio", 123456, "(19)93939393", "(19)91919191",
                "08/10/1980", "cassio@gmail.com", "123.456.789-9", "987.654.321-10");

        Disciplina calculo = new Disciplina(1, "Cálculo", 122, 320, 3000, cassio);

        float[] notas = {6.5f,7.0f,8.3f};
        Nota notasJoao = new Nota(calculo, notas);

        //System.out.println(calculo);

        //notasJoao.setNota(notas);

        System.out.println(notasJoao);

    }
}
