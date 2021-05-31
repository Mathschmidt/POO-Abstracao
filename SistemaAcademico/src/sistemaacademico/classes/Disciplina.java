package sistemaacademico.classes;

import java.text.MessageFormat;
import java.util.Scanner;
public class Disciplina {

    //Atributos
    private int id;
    private String nome;
    private int codigo;
    private int cargaHoraria;
    private int creditos;
    private Professor professor;

    //Construtores
    public Disciplina(Disciplina disciplina){//para quando for atribuída à um aluno
        this.id=disciplina.getId();
        this.nome=disciplina.getNome();
        this.codigo=disciplina.getCodigo();
        this.cargaHoraria=disciplina.getCargaHoraria();
        this.creditos=disciplina.getCreditos();
    }


    public Disciplina (int id, String nome, int codigo, int cargaHoraria, int creditos, Professor professor){
        this.id=id;
        this.nome=nome;
        this.codigo=codigo;
        this.cargaHoraria=cargaHoraria;
        this.creditos=creditos;
        this.professor=professor;

    }

// Metodos get e set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria=cargaHoraria;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCreditos(int creditos){
        this.creditos=creditos;
    }
    public int getCreditos(){
        return creditos;
    }

    @Override
    public String toString(){
        return MessageFormat.format("\n Id: {0}\n Disciplina: {1}\n Código: {2}\n Carga Horária: {3}\n Créditos: {4}\n" +
                " Professor: {5}\n", id, nome, codigo, cargaHoraria, creditos, professor.getNomeCivil());
    }
}
