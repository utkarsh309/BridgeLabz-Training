public class LeetCode69SqrtX {

    public static int mySqrt(int x) {

        int i = 1;

        while (i * i <= x) {
            i++;
        }

        return i - 1;
    }

    public static void main(String[] args) {

        int number = 16;

        int sqrt = mySqrt(number);

        System.out.println("Square root of " + number + " is: " + sqrt);
    }
}
