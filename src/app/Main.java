package app;

public class Main {
    private static final double COEF_M = 1.60934;

    public static void main(String[] args) {
        System.out.println("Kilometers to Miles converter\n" +
                "===============================");
        double kms = 10, miles = 10;
        System.out.println(kms + " kilometers: " + kmsToMiles(kms) + " miles");
        System.out.println(miles + " miles: " + milesToKms(miles) + " kilometers");
    }

    private static double kmsToMiles(double kms){
        return kms / COEF_M;
    }

    private static double milesToKms(double miles){
        return miles * COEF_M;
    }
}
