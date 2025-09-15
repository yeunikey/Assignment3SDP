package dev.yeunikey.adaptee;

public class ImperialLengthService {

    public double feetToInches(double feet) {
        return feet * 12.0;
    }

    public double inchesToFeet(double inches) {
        return inches / 12.0;
    }

    public double milesToFeet(double miles) {
        return miles * 5280.0;
    }

}
