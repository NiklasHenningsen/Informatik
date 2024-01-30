
/**
 * Beschreiben Sie hier die Klasse Provisionsrechner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Scanner;
public class Provisionsrechner
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Provisionsrechner
     */
    public Provisionsrechner()
    {
        // Instanzvariable initialisieren
        Scanner f = new Scanner(System.in);
        System.out.print("Hallo, wählen sie bitte zwischen den beiden Programmen aus. Geben sie die 1 für den Provisionsrechner und die 2 für den Einkausrabatt ein:  ");
        int y = f.nextInt();
        if (y==1) {
            Umsatzfrage();
        }else if (y==2) {
             UmfrageRabatt();   
        }else
            System.out.print("Sie haben die Falsche Zahl eingegeben, bitte versuchen sie es erneut");
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    
        public double aufgabe1(double Umsatz)

    {
        if (Umsatz>=40000) { 
            return Umsatz*0.12;
        }else if (Umsatz>=30000) {
            return Umsatz*0.10;
        }else  {
            return Umsatz*0.075;
        
        }
    
        
        
    }
    
    public void Umsatzfrage()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Ich bitte sie höflichst mir ihren Umsatz zu verraten:  ");
        double Umsatz = s.nextDouble();
        double Provision = aufgabe1(Umsatz);
        System.out.print("Hallo, ich habe die Provision für sie berechnet. Sie haben bei einem Umsatz von " + Umsatz + " Euro eine Provision von " + Provision + " Euro.");
        s.close();
        }
        
        
    /**
     * Aufgabe Einkausrabatt
     */
    
    public double Einkaufsrabatt(double Preis)
    {
        if (Preis>=3500) {
            return Preis-1000;
        }else if (Preis>=1800) {
            return Preis-500;
        }else {
            return Preis-50;
        }
        }
    
    public void UmfrageRabatt()
    {
        Scanner r = new Scanner(System.in);
        System.out.print("Ich bitte sie höflich mir ihren Einkaufspreis zu verraten, sodass ich den Rabatt ausrechnen kann:  ");
        double Preis = r.nextDouble();
        double Rabattpreis = Einkaufsrabatt(Preis);
        System.out.print("Hallo, ihr Einkaufspreis nach dem der Rabatt abgezogen wurde beträgt " + Rabattpreis + " Euro.");
        r.close();
    }

}
