package files;

public class WaterDemand {
    public WaterDemand() {
    }
    public float countWaterDemand(float weight) {
        return 30*weight;
    }
    public void getMyWaterDemand(float weight) {
        System.out.println("Potrzebujesz wlać w siebie " + countWaterDemand(weight) + "ml wody!");
    }
}
