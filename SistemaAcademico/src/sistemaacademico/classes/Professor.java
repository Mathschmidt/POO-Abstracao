package sistemaacademico.classes;

import java.text.MessageFormat;

public class Professor {
    private int id;
    private String nomeCivil;
    private long matricula;
    private String tel;
    private String cell;
    private String dataNasc;
    private String email;
    private String rg;
    private String cpf;

    // Construtor do Professor
    public Professor(int id, String nome, long matricula, String tel, String cell, String nascimento,
                     String email, String rg, String cpf) {
        this.id = id;
        this.nomeCivil = nome;
        this.matricula = matricula;
        this.tel = tel;
        this.cell = cell;
        this.dataNasc = nascimento;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCivil() {
        return nomeCivil;
    }

    public void setNomeCivil(String nomeCivil) {
        this.nomeCivil = nomeCivil;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void editarProfessor(String tel, String cell, String email) {
        this.tel = tel;
        this.cell = cell;
        this.email = email;
    }

    @Override
    public String toString(){
        return MessageFormat.format("\n Id: {0}\n Nome: {1}\n Matricula: {2}\n Telefone: {3}\n" +
                        " Celular: {4}\n Data de Nascimento: {5}\n Email: {6}\n RG: {7}\n CPF: {8}\n",
                id, nomeCivil, matricula, tel, cell, dataNasc, email, rg, cpf );
    }
}
