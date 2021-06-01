package sistemaacademico.classes;

import java.text.MessageFormat;

public class Aluno {
    private int Id;
    private String NomeCivil;
    private long Matricula;
    private Curso Curso;
    private String Tel;
    private String Cell;
    private String DataNasc;
    private String Email;
    private String Rg;
    private String CPF;

    // Construtor do Aluno
    public Aluno(int id, String nome, long matricula, Curso curso, String tel, String cell, String nascimento,
                 String email, String rg, String cpf) {
        this.Id = id;
        this.NomeCivil = nome;
        this.Matricula = matricula;
        this.Curso = curso;
        this.Tel = tel;
        this.Cell = cell;
        this.DataNasc = nascimento;
        this.Email = email;
        this.Rg = rg;
        this.CPF = cpf;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeCivil() {
        return NomeCivil;
    }

    public void setNomeCivil(String nomeCivil) {
        NomeCivil = nomeCivil;
    }

    public long getMatricula() {
        return Matricula;
    }

    public void setMatricula(long matricula) {
        Matricula = matricula;
    }

    public sistemaacademico.classes.Curso getCurso() {
        return Curso;
    }

    public void setCurso(sistemaacademico.classes.Curso curso) {
        Curso = curso;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getCell() {
        return Cell;
    }

    public void setCell(String cell) {
        Cell = cell;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc) {
        DataNasc = dataNasc;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    // Edita dados do Aluno
    public void editarAluno(String tel, String cell, String email) {
        this.Tel = tel;
        this.Cell = cell;
        this.Email = email;
    }

    // Troca o curso do aluno
    public void trocarCurso(int alunoId, Curso curso){
        if(Id == alunoId){
            Curso = curso;
        }
    }

    @Override
    public String toString(){
        return MessageFormat.format("\n Id: {0}\n Nome: {1}\n Matricula: {2}\n Curso: {3}\n Telefone: {4}\n" +
                " Celular: {5}\n Data de Nascimento: {6}\n Email: {7}\n RG: {8}\n CPF: {9}\n",
                Id, NomeCivil, Matricula, Curso.Nome, Tel, Cell, DataNasc, Email, Rg, CPF );
    }
}
