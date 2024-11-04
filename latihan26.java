package pertemuan5;
 import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class latihan26 {
  
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        Date currentTime = Calendar.getInstance().getTime();

        // Format waktu menjadi string
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        String formattedTime = formatter.format(currentTime);

        // Menampilkan waktu
        System.out.println("Hari ini adalah hari : " + formattedTime);
    }
}

