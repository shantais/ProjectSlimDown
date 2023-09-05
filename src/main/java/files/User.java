package files;

import java.util.Scanner;

public class User {
    // TODO: change name and height to something taken from a file
    // TODO: potentially change this class to be a generic one and add a CurrentUser class that inherits from this one
    // TODO: add age and maybe gender as parameters
    private final String name = "Shan";
    private final float height = 1.7f;
    private float weight;

    //TODO: Rethink constructor
    public User() {}

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = getMyWeight();
    }
    public float getMyWeight() {
        //TODO: ensure exception capture
        Scanner getUserWeight = new Scanner(System.in);
        System.out.print("Please enter your weight: ");
        return getUserWeight.nextFloat();
    }
}
