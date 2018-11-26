import javax.swing.*;

public class Aufgabe2_PKZ {
    public static void main(String[] args)
    {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
        int schritte = 0;

        //Falls zwei indentische Zahlen eingegeben werden, wird Zahl 1 direkt in die Konsole ausgegeben.
        if (zahl1==zahl2)
        {
            System.out.println("Die Zahl war: " + zahl1);

        }else
        {
            //Falls die Zahl 1 größer ist, wird die Zahl 2 immer um eins erhöht.
            //Die while Schleife läuft so lange bis die sie nicht mehr war ist.
            while (zahl1>zahl2)
            {
                //Zur simulierung könnte man die Zahl nach jeden Durchgang ausgeben lassen.     System.out.println(zahl2);
                zahl2++;

                //Schritte zählen
                schritte++;

            }
            //Falls die Zahl 2 größer ist, wird die Zahl 1 immer um eins erhöht.

            while (zahl1<zahl2)
            {
                //Zur simulierung könnte man die Zahl nach jeden Durchgang ausgeben lassen.     System.out.println(zahl1);
                zahl1++;

                //Schritte zählen
                schritte++;
            }
        }

        System.out.println( "Die höhere Zahl war: " + zahl1 + ". Es benötigte " + schritte + " Schritte bis die Zahl ermittelt werden konnte.");

    }
}
