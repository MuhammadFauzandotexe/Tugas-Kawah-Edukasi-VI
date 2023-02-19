import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class satu {
    String data;
    String ipAddress = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    String email = "^((?!\\.)[\\w_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])";
    String date1 = "(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}";
    String date2 = "(Senin|Selasa|Rabu|Rabu|Kamis|Jumat|Sabtu|Miggu),(Januari|Februari|Maret|April|Mei|Juni|Juli|Agustus|September|Oktober|November|Desember),\\d{2}";
    List<String> patern = new ArrayList<>();
    public void regexValidation(String data){
        this.data = data;
        if (bacadata(data,ipAddress)==true){
            System.out.println("this is ipAdress : "+data);
        } else if (bacadata(data,email)==true) {
            System.out.println("this is email : "+data);
        }
        else if (bacadata(data,date1)==true) {
            System.out.println("this is date1 dd-mm-yyyy : "+data);
        }
        else if (bacadata(data,date2)==true) {
            System.out.println("this is date2 dddd-mmmm-yy : "+data);
        }
        else {
            System.out.println("pattern not found");
        }
    }
    boolean bacadata(String data,String patern){
        Pattern myPatern = Pattern.compile(patern);
        Matcher myMatc = myPatern.matcher(data);
        boolean b = myMatc.matches();
        return b;
    }
}
