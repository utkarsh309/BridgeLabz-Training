import java.util.Scanner;

// Create MatrixOperations class
public class MatrixOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Create random matrices
        int[][] matrixA = createRandomMatrix(rows, columns);
        int[][] matrixB = createRandomMatrix(rows, columns);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nAddition (A + B):");
        int[][] addition = addMatrices(matrixA, matrixB);
        displayMatrix(addition);

        // Subtraction
        System.out.println("\nSubtraction (A - B):");
        int[][] subtraction = subtractMatrices(matrixA, matrixB);
        displayMatrix(subtraction);

        // Multiplication (only if possible)
        if (rows == columns) {
            System.out.println("\nMultiplication (A × B):");
            int[][] multiplication = multiplyMatrices(matrixA, matrixB);
            displayMatrix(multiplication);
        } else {
            System.out.println("\nMatrix multiplication not possible (rows must equal columns)");
        }

        input.close();
    }

    // Method to create random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {

        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {

        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {

        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
