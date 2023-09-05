package files;

public enum CPM {
    BRAK_AKTYWNOSCI_FIZYCZNEJ(1.2f),
    LEKKA_AKTYWNOSC_FIZYCZNA(1.4f),
    SREDNIA_AKTYWNOSC_FIZYCZNA(1.6f),
    WYSOKA_AKTYWNOSC_FIZYCZNA(1.8f),
    BARDZO_WYSOKA_AKTYWNOSC_FIZYCZNA(2f);
    private final float pal;
    private double myPpm = PPM.getMyPpm();

    CPM(float pal) {
        this.pal = pal;
    }
    public double getMyCpm(){
        return PPM.getMyPpm()*pal;
    }
}
