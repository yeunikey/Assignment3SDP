package dev.yeunikey.adapter;

import dev.yeunikey.adaptee.ImperialLengthService;
import dev.yeunikey.target.LengthConverter;

public class LengthAdapter implements LengthConverter {

    private static final double METERS_TO_FEET = 3.280839895013123;
    private static final double FEET_TO_METERS = 1.0 / METERS_TO_FEET;

    private final ImperialLengthService imperialService;

    public LengthAdapter(ImperialLengthService imperialService) {
        this.imperialService = imperialService;
    }

    @Override
    public double convertMetersToFeet(double meters) {
        double feet = meters * METERS_TO_FEET;
        return feet;
    }

    @Override
    public double convertFeetToMeters(double feet) {
        double meters = feet * FEET_TO_METERS;
        return meters;
    }

}