import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        satu regex =  new satu();
        Scanner datain = new Scanner(System.in);
        System.err.print("masukkan data : ");
        String inputUser = datain.nextLine();
        regex.regexValidation(inputUser);
        dua piala = new dua();
    }
}