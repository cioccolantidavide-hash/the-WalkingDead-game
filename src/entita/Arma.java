package entita;
public class Arma extends Risorsa
{
    private String tipoArma;
    private int danno;
    public String getNomeRisorsa()
    {
        return this.nomeRisorsa;
    }
    public void setNomeRisorsa(String nomeRsiorsa)
    {
        this.nomeRisorsa = nomeRsiorsa;
    }
    public int getQuantita()
    {
        return this.quantita;
    }
    public void setQuantita(int quantita)
    {
        this.quantita = quantita;
    }
    public String getTipoArma()
    {
        return this.tipoArma;
    }
    public void setTipoArma(String tipoArma)
    {
        this.tipoArma = tipoArma;
    }
    public int getDanno()
    {
        return this.danno;
    }
    public void setDanno(int danno)
    {
        this.danno = danno;
    }
}
