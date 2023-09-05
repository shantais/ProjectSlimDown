package files;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public enum Bmi {
    SEVERE_THINNESS(0.0f,16.0f),
    MODERATE_THINNESS(16.0f,17.0f),
    MILD_THINNESS(17.0f,18.5f),
    NORMAL(18.5f,25.0f),
    OVERVEIGHT(25.0f,30.0f),
    OBESE_CLASS_I(30.0f,35.0f),
    OBESE_CLASS_II(35.0f,40.0f),
    OBESE_CLASS_III(40.0f,1000.0f),;
    private final float minValue;
    private final float maxValue;

    Bmi(float minValue, float maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public static float countMyBmi(float weight, float height) {
        return (float) (weight/Math.pow(height,2));
    }

    public static void getMyBmiRange(float weight, float height) {
        List<Bmi> enumList = new LinkedList<>(Arrays.asList(Bmi.values()));
        float bmiValue = countMyBmi(weight, height);
        boolean foundRange = false;
        for (Bmi enumValue : enumList) {
            if (bmiValue >= enumValue.minValue && bmiValue < enumValue.maxValue) {
                System.out.println("Your BMI is currently at: " + bmiValue + " and is in " + enumValue + " range.");
                foundRange = true;
            }
        }
        if (!foundRange) System.out.println("Value out of bounds.");
    }
}
