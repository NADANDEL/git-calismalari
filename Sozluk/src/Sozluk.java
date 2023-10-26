import java.util.HashMap;
public class Sozluk {

        public static void main(String[] args) {

            HashMap<String, String> sozluk = new HashMap<>();

            sozluk.put("ev", "house");
            sozluk.put("kitap", "book");
            sozluk.put("araba", "car");
            sozluk.put("bilgisayar", "computer");

            String ceviri = sozluk.get("kitap");
            System.out.println("Kitap kelimesinin çevirisi: " + ceviri);
        }
    }

