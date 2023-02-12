import java.util.Scanner;
import java.text.DecimalFormat;

public class tugasNoDua {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        System.out.println("Masukkan Pilihan Anda: ");
        System.out.println("1.Manghitung Luas Lingkaran ");
        System.out.println("2.Manghitung Volume Balok ");
        System.out.print("code: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1 -> hitungLuasLingkaran();
            case 2 -> hitungVolumeBalok();
            default -> System.out.println("pilihan tidak valid");
        }
    }
    static void hitungLuasLingkaran(){
        final double phi = 3.14;
        System.out.println("anda memilih menghitung luas lingkaran : ");
        System.out.print("amsukkan jari-jari lingkaran: ");
        int r = input.nextInt();
        Double luasLingkaran = phi*r*r;
        System.out.println("luas lingkarannya adalah: "+df.format(luasLingkaran) +" cm");
    }
    static void hitungVolumeBalok(){
        System.out.println("Anda Memilih Menghitung Volume");
        System.out.print("Masukkan Panjang Balok: ");
        float P = input.nextFloat();
        System.out.print("Masukkan Lebar Balok: ");
        float L = input.nextFloat();
        System.out.print("Masukkan Tinggi Balok: ");
        float T = input.nextFloat();
        float volume = P*L*T;
        System.out.println("Volume Balok Adalah : "+ df.format(volume)+" cm");
    }
}
