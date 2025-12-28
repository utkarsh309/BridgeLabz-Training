import java.util.Scanner;

// Create MatrixOperationsTwo class
public class MatrixOperationsTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Create random matrix
        int[][] matrix = createRandomMatrix(rows, columns);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        // Transpose
        System.out.println("\nTranspose Matrix:");
        int[][] transpose = findTranspose(matrix);
        displayMatrix(transpose);

        // Determinant and Inverse only for 2x2 matrix
        if (rows == 2 && columns == 2) {

            int determinant = findDeterminant2x2(matrix);
            System.out.println("\nDeterminant: " + determinant);

            if (determinant != 0) {
                double[][] inverse = findInverse2x2(matrix, determinant);
                System.out.println("\nInverse Matrix:");
                displayDoubleMatrix(inverse);
            } else {
                System.out.println("\nInverse not possible (Determinant = 0)");
            }

        } else {
            System.out.println("\nDeterminant and Inverse only applicable for 2x2 matrix");
        }

        input.close();
    }

    // Method to create random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0 to 9
            }
        }
        return matrix;
    }

    // Method to find transpose
    public static int[][] findTranspose(int[][] matrix) {

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static int findDeterminant2x2(int[][] matrix) {

        // | a b |
        // | c d |  => ad - bc
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];

        return (a * d) - (b * c);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] findInverse2x2(int[][] matrix, int determinant) {

        double[][] inverse = new double[2][2];

        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];

        // Inverse formula:
        // 1/det * | d  -b |
        //         | -c  a |
        inverse[0][0] = d / (double) determinant;
        inverse[0][1] = -b / (double) determinant;
        inverse[1][0] = -c / (double) determinant;
        inverse[1][1] = a / (double) determinant;

        return inverse;
    }

    // Method to display int matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display double matrix
    public static void displayDoubleMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
