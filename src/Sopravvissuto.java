import java.util.ArrayList;
import java.util.HashMap;

import entita.*;
public class Sopravvissuto 
{
    private String nome;
    private int salute;
    private int forza;
    private ArrayList<Arma> inventario = new ArrayList<>();
    private HashMap<Risorsa, Integer> zaino = new HashMap<>();
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setSalute(int salute)
    {
        this.salute = salute;
    }
    public int getSalute()
    {
        return this.salute;
    }
    public void setForza(int forza)
    {
        this.forza = forza;
    }
    public int getForza()
    {
        return this.forza;
    }
    public void aggiungiArmaInventario(Arma arma)
    {
        inventario.add(arma);
    }
    public Arma cercaArmaInventario(String nomeArma)
    {
        for(int i=0; i<inventario.size(); i++)
        {
            if(inventario.get(i).getNomeRisorsa().equals(nomeArma))
            {
                return inventario.get(i);
            }
        }
        return null;
    }
    public void rimuoviArmaInventario(Arma arma)
    {
        inventario.remove(arma);
    }
    public void aggiungiRisorsaZaino(Risorsa risorsa, int quantita)
    {
        zaino.put(risorsa, quantita);
    }
    
    
}