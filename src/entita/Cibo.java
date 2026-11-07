package entita;
public class Cibo extends Risorsa
{
    private String tipoCibo;
    private String scadenza;
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
    public String getTipoCibo()
    {
        return this.tipoCibo;
    }
    public void setTipoCibo(String tipoCibo)
    {
        this.tipoCibo = tipoCibo;
    }
    public String getScadenza()
    {
        return this.scadenza;
    }
    public void setScadenza(String scadenza)
    {
        this.scadenza = scadenza;
    }
}
