import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import entita.Arma;
import entita.Cibo;
import entita.Medicinale;
import entita.Risorsa;

public class AssegnaDati 
{
    File file = new File("input.txt");
    ArrayList<Risorsa> listaRisorse = new ArrayList<>();
    ArrayList<Sopravvissuto> listaSopravvissuti = new ArrayList<>();
    ArrayList<String[]> listaRisorseTotali = new ArrayList<>();
    public void leggiRisorse()
    {
        try(Scanner scanner = new Scanner(file))
        {
            String riga;
            String[] rigaDivisa; 
            while(scanner.hasNextLine())
            {
                riga = scanner.nextLine();
                if(riga.contains("#")) return;
                rigaDivisa = riga.trim().split(","); // 5 caselle
                switch (rigaDivisa[0]) 
                {
                    case "Cibo":
                        Cibo cibo = new Cibo();
                        cibo.setNomeRisorsa(rigaDivisa[1]);
                        cibo.setQuantita(Integer.parseInt(rigaDivisa[2]));
                        cibo.setTipoCibo(rigaDivisa[3]);
                        cibo.setScadenza(rigaDivisa[4]);
                        listaRisorse.add(cibo);
                        break;
                    case "Medicinale":
                        Medicinale medicinale = new Medicinale();
                        medicinale.setNomeRisorsa(rigaDivisa[1]);
                        medicinale.setQuantita(Integer.parseInt(rigaDivisa[2].trim()));
                        medicinale.setTipoMedicinale(rigaDivisa[3]);
                        medicinale.setDataScadenza(rigaDivisa[4]);
                        listaRisorse.add(medicinale);
                        break;
                    case "Arma":
                        Arma arma = new Arma();
                        arma.setNomeRisorsa(rigaDivisa[1]);
                        arma.setQuantita(Integer.parseInt(rigaDivisa[2].trim()));
                        arma.setTipoArma(rigaDivisa[3]);
                        arma.setDanno(Integer.parseInt(rigaDivisa[4].trim()));
                        listaRisorse.add(arma);
                        break;
                        default:
                        System.out.println("ERRORE LETTURA TIPO RISORSA!");

                }

            }
        }
        catch (Exception e) 
        {
            System.out.println("ERRORE LETTURA FILE");
        }
    }
    public void leggiSopravvissuti()
    {
        try(Scanner scanner = new Scanner(file))
        {
            while(scanner.hasNext())
            {
                if(scanner.nextLine().contains("#")) break;
            }
            String[] stats;
            String[] armi;
            String[] zaino;
            String[] risorsa;
            String riga;
            while(scanner.hasNext())
            {
                riga = scanner.nextLine();
                if(riga.contains("#"));
                stats = riga.substring(0, riga.indexOf("[")-1).split(",");
                armi = riga.substring(riga.indexOf("[")+1, riga.indexOf("]")-1).split(",");
                zaino = riga.substring(riga.indexOf("{")+1, riga.indexOf("}")-1).split(",");
                Sopravvissuto sopravvissuto = new Sopravvissuto();
                sopravvissuto.setNome(stats[0]);
                sopravvissuto.setSalute(Integer.parseInt(stats[1].trim()));
                sopravvissuto.setForza(Integer.parseInt(stats[2].trim()));
                for(int i=0; i<armi.length; i++) //puoi usare slidingwindow alghoritm
                {
                    for(int j=0; j<listaRisorse.size(); j++)
                    {
                        if(listaRisorse.get(j).getNomeRisorsa().equals(armi[i])) 
                        {
                            sopravvissuto.aggiungiArmaInventario((Arma)listaRisorse.get(j));
                            break;
                        }
                    }
                   
                }
                for(int i=0; i<zaino.length; i++)
                {
                    risorsa = zaino[i].split(":");
                    for(int j=0; j<listaRisorse.size(); j++)
                    {
                        if(listaRisorse.get(j).getNomeRisorsa().equals(risorsa[0])) 
                        {
                            sopravvissuto.aggiungiRisorsaZaino(listaRisorse.get(j), Integer.parseInt(risorsa[1].trim()));
                            break;
                        }
                    }
                }
            }
        }
        catch (Exception e) 
        {
            System.out.println("ERRORE LETTURA SOPRAVVISSUTI!");
        }
    }
    public void leggiRisorseTotali()
    {
        String riga;
        String[] risorsa; 
        try(Scanner scanner = new Scanner(file))
        {
            while(scanner.hasNext())
            {
                if(scanner.nextLine().contains("#")) break;
            }
            while(scanner.hasNext())
            {
                if(scanner.nextLine().contains("#")) break;
            }
            while(scanner.hasNext())
            {
                
                riga = scanner.nextLine();
                risorsa = riga.split(",");
                listaRisorseTotali.add(risorsa);
            }   
        }
        catch(Exception e)
        {
            System.out.println("ERRORE LETTURA FILE!");
        }
    }
}