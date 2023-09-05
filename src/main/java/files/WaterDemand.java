package files;

public class WaterDemand {
    public WaterDemand() {
    }
    public static float countWaterDemand(float weight) {
        return 30*weight;
    }
    public static void getMyWaterDemand(float weight) {
        System.out.println("Potrzebujesz wlać w siebie " + countWaterDemand(weight) + "ml wody!");
    }
}
