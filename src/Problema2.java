/*David Tadeo Robles Lara
 * 06/09/2022*/
/*Definir un método que reciba como argumento una cadena de caracteres (CURP)
y utilice la expresión regular definida en el punto anterior para verificar
si la cadena es una CURP valida. El método debe regresar verdadero (true)
si la cadena es valida, de lo contrario debe regresar falso (false).*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Problema2 {
    public static void main(String[] args) {
        Problema2 v = new Problema2();

        for (String i:args) {
            System.out.println(v.Validez(i));
        }
    }

    public boolean Validez(String curp){
        Pattern pat = Pattern.compile("^[A-Z]{4}[0-9]{6}[H|M][A-Z]{2}[A-Z&&[^AEIOU]]{3}[A-Z1-9]{1}[0-9]$");

        Matcher mat = pat.matcher(curp);
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }

    }
}
