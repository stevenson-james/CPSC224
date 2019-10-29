import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Farenheit: ");
        double farenheit = input.nextDouble();
        double celsius = 5 * (farenheit - 32) / 9;
        System.out.print("Temperature " + farenheit + " in Celsius is " + celsius);
    }
}
