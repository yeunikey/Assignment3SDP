package dev.yeunikey.adaptee;

/**
 * The adaptee class that provides conversion methods within the Imperial system.
 * It allows converting between meters and feet using predefined constants.
 */
public class ImperialLengthService {

    private static final double METERS_TO_FEET = 3.280839895013123;
    private static final double FEET_TO_METERS = 1.0 / METERS_TO_FEET;

    /**
     * Converts meters to feet using the METERS_TO_FEET constant.
     *
     * @param meters the value in meters (primitive double)
     * @return the converted value in feet (primitive double)
     */
    public double metersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    /**
     * Converts feet to meters using the FEET_TO_METERS constant.
     *
     * @param feet the value in feet (primitive double)
     * @return the converted value in meters (primitive double)
     */
    public double feetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

}
