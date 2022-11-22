import java.util.ArrayList;
import java.util.List;

public class Colas {

    List<Elemento> listaDeElementos;


    public Colas () {
        listaDeElementos =  new ArrayList<Elemento>();

    }


    public boolean is_empty(){
        return listaDeElementos.isEmpty();

    }

    public int length(){
       return listaDeElementos.size();
    }

    public void enqueue(Elemento e){
        listaDeElementos.add(e);

    }
    public Elemento dequeue(){
        Elemento elemento = listaDeElementos.get (0);

        listaDeElementos.remove(0);
        return elemento;

    }

    @Override
    public String toString() {
        return String.format("Hay %d elemento en la cola",listaDeElementos.size());
    }
}

