package dev.yeunikey.adapter;

import dev.yeunikey.adaptee.ImperialLengthService;
import dev.yeunikey.target.LengthConverter;

/**
 * The adapter class that bridges between {@link LengthConverter} and {@link ImperialLengthService}.
 */
public class LengthAdapter implements LengthConverter {

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
        return imperialService.metersToFeet(meters);
    }

    /**
     * Converts feet to meters using a conversion constant.
     *
     * @param feet      The value in feet as {@link Double}
     * @return          The converted value in meters as {@link Double}
     */
    @Override
    public double convertFeetToMeters(double feet) {
        return imperialService.feetToMeters(feet);
    }

}