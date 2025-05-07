import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius;

        celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("%.1fF is equal to %.1fC\n", fahrenheit, celsius);

        scanner.close();
    }
}