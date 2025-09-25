package dev.yeunikey.adapter;

import dev.yeunikey.adaptee.ImperialLengthService;
import dev.yeunikey.target.LengthConverter;

/**
 * The adapter class that bridges between {@link LengthConverter} and {@link ImperialLengthService}.
 */
public class LengthAdapter implements LengthConverter {

    private static final double METERS_TO_FEET = 3.280839895013123;
    private static final double FEET_TO_METERS = 1.0 / METERS_TO_FEET;

    private final ImperialLengthService imperialService;

    /**
     * The main constructor for initializing the adapter.
     *
     * @param imperialService    The {@link ImperialLengthService} to adapt
     */
    public LengthAdapter(ImperialLengthService imperialService) {
        this.imperialService = imperialService;
    }

    /**
     * Converts meters to feet using a conversion constant.
     *
     * @param meters    The value in meters as {@link Double}
     * @return          The converted value in feet as {@link Double}
     */
    @Override
    public double convertMetersToFeet(double meters) {
        double feet = meters * METERS_TO_FEET;
        return feet;
    }

    /**
     * Converts feet to meters using a conversion constant.
     *
     * @param feet      The value in feet as {@link Double}
     * @return          The converted value in meters as {@link Double}
     */
    @Override
    public double convertFeetToMeters(double feet) {
        double meters = feet * FEET_TO_METERS;
        return meters;
    }

}