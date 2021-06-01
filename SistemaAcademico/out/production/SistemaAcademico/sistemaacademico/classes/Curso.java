
package sistemaacademico.classes;


import java.text.MessageFormat;
import java.util.List;

public class Curso {
    public int Id;
    public String Nome;
    private boolean Ativo;
    private List<Disciplina> disciplina;

    // Construtor do Curso
    public Curso(int id, String nome, boolean ativo){
        this.Id = id;
        this.Nome = nome;
        this.Ativo = ativo;
    }

    // Desativa o curso
    public void Desativar(int id){
        if(this.Id == id){
            this.Ativo = false;
        }else{
            System.out.println("Não foi possível desativar o curso, Id incorreto!");
        }
    }

    @Override
    public String toString(){
        return MessageFormat.format("Id: {0}, Nome: {1}, Ativo: {2}", Id, Nome, Ativo);
    }
}