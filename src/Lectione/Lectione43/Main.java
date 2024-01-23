package Lectione.Lectione43;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists()); // false

        String string = "Hallo Java";

        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] buffer = string.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // FileInputStream

        try (FileInputStream fis = new FileInputStream(file)) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //
        System.out.println("reading in buffer array");

        try (FileInputStream fin = new FileInputStream(file)) {
            byte[] buffer = new byte[512];
            int counter;
            while ((counter = fin.read(buffer)) != -1) {
                for (int i = 0; i < counter; i++) {
                    System.out.println((char) buffer[i]);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
