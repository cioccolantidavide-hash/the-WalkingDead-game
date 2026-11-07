import java.util.Comparator;

public class ComparatoreSopravvisuto implements Comparator<Sopravvissuto>
{
    @Override 
    public int compare(Sopravvissuto arg0, Sopravvissuto arg1) {
        int result;
        result = Integer.compare(arg0.getForza() + arg0.getSalute(), arg1.getForza() + arg1.getSalute());
        return result;
    }
}