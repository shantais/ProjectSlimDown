package files;

public class PPM {
    String gender;
    float height;
    float weight;
    int age;

    public PPM(String gender, float height, float weight, int age) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public double countMyBasicMetabolism(){
        /**
         *
         */

        if (gender.equals("Kobieta")){
            // Podstawowa Przemiana Materii (PPM) wzór Harrisa-Benedicta dla kobiet
            double ppmHB = 655.1+(9.563*weight)+(1.85*height*100)-(4.676*age);
            // Podstawowa Przemiana Materii (PPM) wzór Mifflina dla kobiet
            double ppmM = (10*weight)+(6.25*height*100) -(5*age)-161;
            System.out.println("Według Harrisa-Benedicta potrzebujesz: " + ppmHB + "kcal, żeby mieć energię na oddychanie i siedzenie w miejscu.");
            System.out.println("Według Mifflina potrzebujesz: " + ppmM + "kcal, żeby mieć energię na oddychanie i siedzenie w miejscu.");
            System.out.println("Uśrednione: " + (ppmHB+ppmM)/2);
            return (ppmHB+ppmM)/2;
        } else if (gender.equals("Mężczyzna")){
            // Podstawowa Przemiana Materii (PPM) wzór Harrisa-Benedicta dla mężczyzn
            double ppmHB = 66.5+(13.75*weight)+(5.003*height*100)-(6.775*age);
            // Podstawowa Przemiana Materii (PPM) wzór Mifflina dla mężczyzn
            double ppmM = (10*weight)+(6.25*height*100) -(5*age)+5;
            System.out.println("Według Harrisa-Benedicta potrzebujesz: " + ppmHB + "kcal, żeby mieć energię na oddychanie i siedzenie w miejscu.");
            System.out.println("Według Mifflina potrzebujesz: " + ppmM + "kcal, żeby mieć energię na oddychanie i siedzenie w miejscu.");
            System.out.println("Uśrednione: " + (ppmHB+ppmM)/2);
            return (ppmHB+ppmM)/2;
        }
        return 0;
    }
    public double getMyPpm(){
        return countMyBasicMetabolism();
    }
}
