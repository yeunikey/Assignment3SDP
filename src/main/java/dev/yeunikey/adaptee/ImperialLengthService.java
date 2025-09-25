package dev.yeunikey.adaptee;

/**
 * The adaptee class that provides conversion methods within the Imperial system.
 * It does not directly support meters, only feet, inches, and miles.
 */
public class ImperialLengthService {

    /**
     * Converts feet to inches.
     *
     * @param feet  The value in feet as {@link Double}
     * @return      The converted value in inches as {@link Double}
     */
    public double feetToInches(double feet) {
        return feet * 12.0;
    }

    /**
     * Converts inches to feet.
     *
     * @param inches    The value in inches as {@link Double}
     * @return          The converted value in feet as {@link Double}
     */
    public double inchesToFeet(double inches) {
        return inches / 12.0;
    }

    /**
     * Converts miles to feet.
     *
     * @param miles     The value in miles as {@link Double}
     * @return          The converted value in feet as {@link Double}
     */
    public double milesToFeet(double miles) {
        return miles * 5280.0;
    }

}
