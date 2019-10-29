public class ExtractDigits {
    public static void main(String[] args) {
        int n = 5814;
        int digit = n / 1000;
        n = n % 1000;
        System.out.print("The digits of n are " + digit);
        digit = n / 100;
        n = n % 100;
        System.out.print(", " + digit);
        digit = n / 10;
        n = n % 10;
        System.out.print(", " + digit);
        System.out.print(", " + n);
    }
}
