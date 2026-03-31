package runtimeanalysis;

public class StringPerformanceTest {

    private static final int COUNT = 1_000_000;

    public static void main(String[] args) {

        // String
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < COUNT; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start) + " ms");

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < COUNT; i++) {
            sbf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");
    }
}

