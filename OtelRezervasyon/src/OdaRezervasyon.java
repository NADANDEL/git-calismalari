import java.util.HashMap;

public class OdaRezervasyon {
    private int odaNumarasi;
    private boolean rezervasyonDurumu;

    private static HashMap<Integer, Boolean> odaDurumları = new HashMap<>();

    public OdaRezervasyon(int odaNumarasi, boolean rezervasyonDurumu) {
        this.odaNumarasi = odaNumarasi;
        this.rezervasyonDurumu = rezervasyonDurumu;

        odaDurumları.put(odaNumarasi, rezervasyonDurumu);
    }
}