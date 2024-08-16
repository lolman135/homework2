package app;

public class Main {
    private static final double COEF_M = 1.60934;
    public static void main(String[] args) {
        System.out.println("Kilometers to Miles converter");
    }
    private static double kmsToMiles(double kms){
        return kms / COEF_M;
    }
}
