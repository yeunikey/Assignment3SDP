package dev.yeunikey;

import dev.yeunikey.adaptee.ImperialLengthService;
import dev.yeunikey.adapter.LengthAdapter;
import dev.yeunikey.client.ConverterClient;

public class Main {

    public static void main(String[] args) {
        ImperialLengthService imperialLengthService = new ImperialLengthService();

        LengthAdapter lengthAdapter = new LengthAdapter(imperialLengthService);

        ConverterClient client = new ConverterClient(lengthAdapter);
        client.demo();
    }

}