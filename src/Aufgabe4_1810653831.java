public class Aufgabe4_1810653831 {
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        int c = 10;
        int d = 0;

        //Die While Schleife wird so lange ausgeführt bis die Anweisung false ist.
        while (a<=10)
        {
            System.out.println("Der Schleifenzähler ist: " + a);
            a++;
        }

        //Die do Schleife wird so lange ausgeführt bis die While Anweisung false ist.
        do {
            System.out.println("Der Schleifenzähler ist b: " + b);
            b++;
        }while (b<=10);

        //Die For Schleifenanweisung besteht aus drei Teilen:
        //1: Zähler variable
        //2: Bedingung (wie oft die Schleife läuft.)
        //3: Schrittweite (was passiert wenn die bedingung wahr ist.)
        //[läuft so lange bis die Bedingung war ist.]

        for (int i = 0;i<=c;i++)
        {
            System.out.println("Der Schleifenzähler ist c: " + i);
        }

    }
}
