import java.util.*;
public class dua {
    dua(){
        List<Integer> pialaDunia = new ArrayList<>();
        List<String> makanan = new ArrayList<>();
        List<String> provinsi = new ArrayList<>();
        List<String> bahasaPemrograman = new ArrayList<>();
        Collections.addAll(pialaDunia, 1934, 1938, 1942, 1946, 1950);
        pialaDunia.add(1954);
        Collections.addAll(makanan,"Rendang","Soto","Sate"
                ,"batagor","rujak","Mi Aceh ","Bika Ambon","Pempek",
                "Otak-Otak ","Gulai Ikan Patin");
        makanan.add("Gulai Kepala Ikan");
        Collections.addAll(provinsi,"Riau","Benkulu","Jawa Tengah"
        ,"Jambi","Lampung","DKI Jakarta","Jawa Barat","Bali","Maluku","Nusa Tenggara","Papua Barat","Papua Selatan");
        provinsi.add("Jawa Timur");
        Collections.addAll(bahasaPemrograman,"Java","Python","C","PHP",
                "Rust","Rust","Go","Kotlin",
                "Perl","Darl","Scale","Ruby");
        System.out.println("List makanan: "+makanan);
        System.out.println("List tahun piala dunia: "+ pialaDunia);
        System.out.println("Provinsi Sebelum Disorting: "+ provinsi);
        Collections.sort(provinsi, Collections.reverseOrder());
        System.out.println("Provinsi Setelah DiSrting Descending: "+provinsi);
        System.out.println("List bahasa pemrograman sebelum di remove: "+bahasaPemrograman);
        Collections.sort(bahasaPemrograman,Collections.reverseOrder());
        bahasaPemrograman.subList(0, 4).clear();
        System.out.println("Lis bahasa pemrograman setelah di remove : "+bahasaPemrograman);
    }
}
