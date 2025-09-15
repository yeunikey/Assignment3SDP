package dev.yeunikey.client;

import dev.yeunikey.target.LengthConverter;

public class ConverterClient {

    private final LengthConverter lengthConverter;

    public ConverterClient(LengthConverter lengthConverter) {
        this.lengthConverter = lengthConverter;
    }

    public void demo() {
        double meters = 2.5;
        double feet = lengthConverter.convertMetersToFeet(meters);
        System.out.printf("%.2f meters = %.4f feet%n", meters, feet);

        double backToMeters = lengthConverter.convertFeetToMeters(feet);
        System.out.printf("%.4f feet = %.4f meters%n", feet, backToMeters);
    }

}
