import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Problema3 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("^[A-Z]{4}[0-9]{6}[H|M][A-Z]{2}[A-Z&&[^AEIOU]]{3}[A-Z1-9]{1}[0-9]$");

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese CURP(en mayusculas):");
        Matcher mat = pat.matcher(sc.nextLine());
        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No es una CURP válida");
        }

    }
}
