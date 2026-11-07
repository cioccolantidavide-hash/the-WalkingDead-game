import java.util.ArrayList;

import entita.*;

public class GestoreRisorse<T extends Risorsa>
{
    private ArrayList<T> listaRisorse = new ArrayList<T>();
    public void aggiungiRisorsa(T risorsa)
    {
        this.listaRisorse.add(risorsa);   
    }
    public void rimuoviRisorsa(T risorsa)
    {
        this.listaRisorse.remove(risorsa);
    }
    public T cercaRisorsa(String nomeRisorsa)
    {
        for(int i=0; i<listaRisorse.size(); i++)
        {
            if(listaRisorse.get(i).getNomeRisorsa().equals(nomeRisorsa))
            {
                return listaRisorse.get(i);
            }
        }
        return null;
    }
}
