import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float a,b,hasil;
        char op;
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        System.out.println("======OPERASI======");
        System.out.println("+ = Tambah");
        System.out.println("- = Kurang");
        System.out.println("x = Kali");
        System.out.println(": = Bagi");
        System.out.println("% = Modulo");
        System.out.print("Masukkan op: ");
        op = inputUser.next().charAt(0);
        System.out.print("Nilai A: ");
        a = inputUser.nextFloat();
        System.out.print("Nilai B: ");
        b = inputUser.nextFloat();

        {
            if (op == '+') {
                hasil = a + b;
                System.out.printf("%f + %f = %f ", a, b, hasil);
                saveTxt(a,b,hasil,op);
            } else if (op == '-') {
                hasil = a - b;
                System.out.printf("%f - %f = %f ", a, b, hasil);
                saveTxt(a,b,hasil,op);
            } else if (op == 'x' || op == 'X') {
                hasil = a * b;
                System.out.printf("%f x %f = %f ", a, b, hasil);
                saveTxt(a,b,hasil,op);
            } else if (op == ':') {
                if (!(a == 0) && !(b == 0)) {
                    hasil = a / b;
                    System.out.printf("%f : %f = %f ", a, b, hasil);
                    saveTxt(a,b,hasil,op);
                } else {
                    System.out.println("dak bisa dibagi nol");
                }
            } else if (op == '%') {
                hasil = a % b;
                System.out.printf("%f mod %f = %f ", a, b, hasil);
            } else {
                System.out.println("Operasi Tidak Dikatahui!");
            }
        }
    }
    public static void saveTxt(float a,float b,float hasil,char op){
        try {
            String A = Float.toString(a);
            String B = Float.toString(b);
            String HASIL = Float.toString(hasil);
            String OP = Character.toString(op);

            Random rand = new Random();//buat namafile random
            int rand_int1 = rand.nextInt(1000);
            String ID = Integer.toString(rand_int1);
            String FILE = OP+ID+".txt";
            FileWriter myWriter = new FileWriter(FILE);

            myWriter.write(A+" "+OP+" "+B+" = "+HASIL);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}