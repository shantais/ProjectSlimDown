package files;

/**
 * This main file is supposed to only run methods from other files
 */


public class Main {
    public static void main(String[] args) {
        // User basic information
        User user = new User();

        // get current weight from user and set it in User class
        user.setWeight();

        // write the weight down with current date and time in a .csv file
        // Using Map to store the weight and date info where: key: date and time value: weight
        Bmi.getMyBmiRange(user.getWeight(), user.getHeight());

        // method to count BMI and see in what range are you currently in

    }
}