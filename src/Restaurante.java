
import java.util.ArrayList;


/**
 *
 * @author btd
 */
public class Restaurante {
    private String nome;
    private ArrayList<Mesa> mesas;

    public Restaurante(String nome, ArrayList<Mesa> mesas) {
        this.nome = nome;
        this.mesas = mesas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addMesa(){
        Mesa mesaNova = new Mesa();
        mesas.add(mesaNova);
    }
    
    public void removeMesa(){
        
        //verifica se ainda tem mesas
        if(!mesas.isEmpty()){
            mesas.remove(mesas.size()-1);
        }
    }
}
