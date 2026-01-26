package streams;

import java.io.*;

public class ImageByteArray {

    public static void main(String[] args) {

        String inputImage = "input.jpg";     
        String outputImage = "output.jpg";

        try {
            // Read image into byte array using ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to image using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((data = bais.read()) != -1) {
                fos.write(data);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted successfully!");
            

        } catch (IOException e) {
            System.out.println("Error while processing image.");
        }
    }
}

