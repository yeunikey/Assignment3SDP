package dev.yeunikey.target;

/**
 * The target interface for length conversion.
 * Defines the operations that the client expects.
 */
public interface LengthConverter {

    /**
     * Converts meters to feet.
     *
     * @param meters    The value in meters as {@link Double}
     * @return          The converted value in feet as {@link Double}
     */
    double convertMetersToFeet(double meters);

    /**
     * Converts feet to meters.
     *
     * @param feet      The value in feet as {@link Double}
     * @return          The converted value in meters as {@link Double}
     */
    double convertFeetToMeters(double feet);

}
