import javax.swing.*;

public class Aufgabe3_1810653831 {
    public static void main(String[] args)
    {
        double alter;
        //Eine Zahl wird abgefragt und als String gespeichert.

        String eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein (Double):");

             //Der eingegebene String wird nun in alter als double Variable gespeichert.
             alter = Double.parseDouble(eingabe);
             JOptionPane.showMessageDialog(null, "Die eingegeben Zahl war: " + alter + ". (Double)");


        eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Int):");
        alter = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter + ". (Int)");

            //eine Variable Double kann nicht in einen Boolean umgewandelt werden, da dieser nur War oder Falsch annehmen kann.
            //man kann mit ihm nur zwei variablen miteinander vergleichen ob sie ture oder false sind a == b
            //boolean alter2;
            //String eingabe2 = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Boolean):");
            //alter2 = Boolean.parseBoolean(eingabe2);


            //String eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Boolean):");
            // alter = Boolean.parseBoolean(eingabe);
            // JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter + ". (Boolean)");


        eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Long):");
        alter = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter + ". (Long)");


            eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Char):");
            alter = eingabe.charAt(0);
            JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter + ". (Char)");


        eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Byte):");
        alter = Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter+ ". (Byte)");


            eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Short):");
            alter = Short.parseShort(eingabe);
            JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter + ". (Short)");


        eingabe = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein(Float):");
        alter = Float.parseFloat(eingabe);
        JOptionPane.showMessageDialog(null, "Die eingegebene Zahl war: " + alter + ". (Float)");

        //Man kann der Variable Alter nicht direkt einen String zuweisen. Dafür muss man wie
        //Mit der Methode String.valueOf() kann man alle oben ausgeführten Typen in eine String umwandeln.
        alter = 67;
        String.valueOf(alter);
        JOptionPane.showMessageDialog(null,"Die zugewiesene Zahl war: " + alter);


    }
}
