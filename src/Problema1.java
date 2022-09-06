/*David Tadeo Robles Lara
* 06/09/2022*/
/*Definir una expresión regular en Java para validar la sintaxis de una CURP*/
import java.util.regex.*;
public class Problema1 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("^[A-Z]{4}[0-9]{6}[H|M][A-Z]{2}[A-Z&&[^AEIOU]]{3}[A-Z1-9]{1}[0-9]$");
        Matcher mat = pat.matcher("ROCE000131HNLDNDA9");
        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }

    }
}
