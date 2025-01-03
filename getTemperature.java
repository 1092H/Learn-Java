import java.util.Scanner;

public class getTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        System.out.println("Enter the temperature:");
        temperature = scanner.nextDouble();
        System.out.println("The temperature is: " + temperature);
    }
    
}
