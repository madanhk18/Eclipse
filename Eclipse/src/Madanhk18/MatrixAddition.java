package Madanhk18;
import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if the user provided the matrix size as a command-line argument
        if (args.length != 1) {
            System.out.println("Please provide the size of the square matrices as a command-line argument.");
            return;
        }

        int size = Integer.parseInt(args[0]);

        // Validate input size
        if (size <= 0) {
            System.out.println("Matrix size must be a positive integer.");
            return;
        }

        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] resultMatrix = new int[size][size];

        // Input matrix A
        System.out.println("Enter elements of matrix A:");
        inputMatrixElements(scanner, matrixA);

        // Input matrix B
        System.out.println("Enter elements of matrix B:");
        inputMatrixElements(scanner, matrixB);

        // Perform matrix addition
        addMatrices(matrixA, matrixB, resultMatrix);

        // Print the result matrix
        System.out.println("Sum of matrices:");
        printMatrix(resultMatrix);
    }

    // Method to input elements into a matrix
    private static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    private static void addMatrices(int[][] matrixA, int[][] matrixB, int[][] resultMatrix) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }
}
