package sistemaacademico.classes;

import java.text.MessageFormat;

public class Nota {
    private float[] nota;
    private float media;
    private Disciplina disciplina;

    public Nota(Disciplina disciplina, float[] nota){
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public void setNota(float[] nota) {
        this.nota = nota;
    }

    public float getMedia() {
        return obterMedia();
    }

    private float obterMedia(){
        for (float nota : nota) {
            media = media + nota;
        }
        media = media / nota.length;
        return media;
    }

    @Override
    public String toString(){
        return MessageFormat.format("\n Nota1 = {0}\n Nota = {1}\n Nota = {2}\n Média = {3}", nota[0], nota[1],
                nota[2], obterMedia());
    }
}