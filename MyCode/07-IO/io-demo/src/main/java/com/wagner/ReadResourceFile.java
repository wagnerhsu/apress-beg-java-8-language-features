package com.wagner;

import java.io.IOException;
import java.io.InputStream;

public class ReadResourceFile {
    public static void main() {
        InputStream in = App.class.getResourceAsStream("/input.txt");
        byte byteData;
        try {
            while ((byteData = (byte) in.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
