package entita;
public abstract class Risorsa
{
    String nomeRisorsa;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeRisorsa == null) ? 0 : nomeRisorsa.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Risorsa other = (Risorsa) obj;
        if (nomeRisorsa == null) {
            if (other.nomeRisorsa != null)
                return false;
        } else if (!nomeRisorsa.equals(other.nomeRisorsa))
            return false;
        return true;
    }
    int quantita;
    public abstract String getNomeRisorsa();
    public abstract void setNomeRisorsa(String nomeRisorsa);
    public abstract int getQuantita();
    public abstract void setQuantita(int quantita);
}