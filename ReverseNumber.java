package Day6;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int rev = 0;
        while (number > 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number /= 10;
        }
        System.out.println("The reversed number is: " + rev);
    }
}
