package Day6;

import java.util.Scanner;
public class FibonacciSeries {
    static int num1 = 0, num2 = 1, nextNum, arrSize;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the numbers to print: ");
        arrSize = sc.nextInt();
        FibonacciSeries input = new FibonacciSeries();
        input.fibonacci();
    }

    private void fibonacci() {
        for (int i = 0; i < arrSize; i++) {
            nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
            System.out.print(nextNum + " ");
        }

    }
}