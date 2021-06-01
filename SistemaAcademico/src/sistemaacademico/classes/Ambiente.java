/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.classes;

import java.text.MessageFormat;

/**
 *
 * @author Matheus Schmidt
 */
public class Ambiente {
    
    private int Id;
    private String Nome;
    private int TipoAmbienteId;
    private boolean Ativo; 
    
    // Construtor do Ambiente
    public Ambiente(int id, String nome, int tipoambienteid, boolean ativo){
        this.Id = id;
        this.Nome = nome;
        this.TipoAmbienteId = tipoambienteid;
        this.Ativo = ativo;
    }   
    
    // Desativa o Ambiente
    public void Desativar(int id){
        if(this.Id == id){
            this.Ativo = false;
        }else{
            System.out.println("Não foi possível desativar o ambiente, Id incorreto!");
        }
    }
    
    @Override
    public String toString(){
        return MessageFormat.format("Id: {0}, Nome: {1}, TipoAmbienteId: (4),  Ativo: {3}", Id, Nome, TipoAmbienteId, Ativo);
    }
}
