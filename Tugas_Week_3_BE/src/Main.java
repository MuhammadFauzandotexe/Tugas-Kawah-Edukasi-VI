import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1.A
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama: ");
        String nameInput = input.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, "+nameInput);
//1.B
        short shortData1 = 10;
        short shortData2 = 10;
        double doubleData1 = 10;
        double doubleData2 = 10;
        char chartData1 = 'A';
        char chartData2 = 'B';
        boolean booleanData1 = true;
        boolean booleanData2 = false;
//1.C
        String string1 = "Saya senang";
        String string2 = "belajar";
        String string3 = "Java Language";
        String dataString = string1+" "+ string2+" "+string3;
        System.out.println(dataString);
    }
}