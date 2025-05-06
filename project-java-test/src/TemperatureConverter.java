public class TemperatureConverter {
    public static void main(String[] args) {
        int fahrenheit = 98;
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        String message = fahrenheit + "F is equal to " + celsius + "C";
        System.out.println(message);

        double roundedCelsius = Math.round(celsius * 100.0) / 100.0;
        String formattedMessage = String.format("%dF is equal to %.2fC",fahrenheit, roundedCelsius);
        System.out.println(formattedMessage);

        double celsius2 = 37.0;
        double fahrenheit2 = (int) (celsius * 9.0 / 5.0 + 32);
        System.out.println(celsius + "C is approximately " + fahrenheit + "F");
    }
}
