package streams;

import java.io.*;

class WriterThread extends Thread {
    PipedOutputStream out;

    WriterThread(PipedOutputStream out) {
        this.out = out;
    }

    public void run() {
        try {
            String msg = "Hello";
            out.write(msg.getBytes());
            out.close();
        } catch (IOException e) {
            System.out.println("Writer error");
        }
    }
}

class ReaderThread extends Thread {
    PipedInputStream in;

    ReaderThread(PipedInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            int data;
            System.out.print("Reader got: ");
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Reader error");
        }
    }
}

public class PipedStream {

    public static void main(String[] args) {

        try {
            PipedInputStream input = new PipedInputStream();
            PipedOutputStream output = new PipedOutputStream(input);

            WriterThread writer = new WriterThread(output);
            ReaderThread reader = new ReaderThread(input);

            writer.start();
            reader.start();

        } catch (IOException e) {
            System.out.println("Pipe error");
        }
    }
}
