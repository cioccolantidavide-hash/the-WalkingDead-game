package entita;
public class Medicinale extends Risorsa
{
    private String tipoMedicinale;
    private String dataScadenza;
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
    public String getTipoMedicinale()
    {
        return this.tipoMedicinale;
    }
    public void setTipoMedicinale(String tipoMedicinale)
    {
        this.tipoMedicinale = tipoMedicinale;
    }
    public String getDataScadenza()
    {
        return this.dataScadenza;
    }
    public void setDataScadenza(String dataScadenza)
    {
        this.dataScadenza = dataScadenza;
    }
}
