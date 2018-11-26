import javax.swing.*;

public class Aufgabe5_1810653831 {
    public  static void main(String[] args)
    {
        forschleife(6);
        forschleife(17);
        whileschleife(5);
        whileschleife(10);
        nutzerschleife();
    }

    static  void forschleife(int a)
    {
        for (int i = 0;i<=a;i++)
        {
            System.out.println("Die For Schleife läuft gerade das " + i + "te mal.");
        }
    }

    static void whileschleife(int a)
    {
        // die Variable i steht für die getätigten durchläufe der Schleife
        int i = 0;
        // Die While Schleife läuft so lange, bis sie die angegebenen Durchlaufen hat.(Parameter = anzahl der Durchläufe)
        while (i<a)
        {
            // Wenn die Zahl gerade ist, hüpft man in die IF schleife. Dort bleibt man, bis man die erzielten Durchläufe hat.
            // Da die IF schleife immer mit dem Param. abgeglichen wird.
            // anschließend wird sie um 1 erhöht und nur zur Hilfestellung ausgegeben
            //anschließend wird nochmal geprüft ob diese Zahl gerade ist. Wenn nicht verlässt man die Methode.
            //falls doch, wird an der Konsole ausgegeben in welchem Durchgang man sich gerade befindet.(werden nur Gerade Durchgänge ausgegeben)
            if (a%2==0)
            {
                ++i;
               // System.out.println("Durchgang" + i);
                if (i%2==0)
                {
                    System.out.println("Der Param. war gerade und dies ist der " + i + "te Durchgang.");
                }
            }
            //fals der Param. nicht gerade ist, hüpft man in die Else Schleife.
            //dort wird der duchgang dan um 1 erhöht und geprüft ob der Durchgang gerade ist.
            //ist dies nicht der Fall, fängt der Prozess von vorne an. Ansonsten wird die Anzahl der Durchgänge ausgegeben.
            else
                {
                    ++i;
                    //System.out.println("Durchgang" +i);
                    if (i%2==0)
                    {
                        System.out.println("Der Param. war ungerade und dies ist der " + i + "te Durchgang.");
                    }
                }
        }
    }

    static void nutzerschleife()
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
        int c = a*b;
        //Die For Schleife läuft so lange, wie der 1 Param.
        //In der For Schleife läuft noch eine, welche so oft wie (Param 1 * Param 2). Die 2 For schleife läuft genau wie die
        //erste insgesamt a mal. und gibt b mal d aus.
        for (int i=0; i<=a;i++)
        {
            System.out.println( i + " Duchgang.");

            for (int d = 0; d<=c;d++)
            {
                System.out.println("Dies ist der " + d + ". Durchgang.");
            }
        }
    }

}
