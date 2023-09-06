package files;

public enum CPM {
    BRAK_AKTYWNOSCI_FIZYCZNEJ(1.2f),
    LEKKA_AKTYWNOSC_FIZYCZNA(1.4f),
    SREDNIA_AKTYWNOSC_FIZYCZNA(1.6f),
    WYSOKA_AKTYWNOSC_FIZYCZNA(1.8f),
    BARDZO_WYSOKA_AKTYWNOSC_FIZYCZNA(2f);
    private final float pal;

    CPM(float pal) {
        this.pal = pal;
    }

    public float getPal() {
        return pal;
    }

    public static double getMyCpm(double myPpm, float pal){
        double cpm = myPpm*pal;
        System.out.println("CPM, czyli potrzebujesz " + (float) cpm + "kcal dziennie.");
        return cpm;
    }
}
