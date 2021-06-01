package sistemaacademico.classes;


public class AmbienteDisciplina {
    
    private int id;
    private int ambienteid;
    private Ambiente ambiente;
    private int disciplinaid;
    private Disciplina disciplina;
    
    //Construtores
    public AmbienteDisciplina (int id, int  ambienteid, int disciplinaid){
        this.id=id;
        this.ambienteid=ambienteid;
        this.disciplinaid=disciplinaid;
    }
    
// Metodos get e set
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    
    public int getambienteid() {
        return ambienteid;
    }

    public void setAmbienteid(int ambienteid) {
        this.ambienteid = ambienteid;
    }
    
    public int getdisciplinaid() {
        return disciplinaid;
    }

    public void setDisciplinaid(int disciplinaid) {
        this.disciplinaid = disciplinaid;
    }
    
   
    
}
