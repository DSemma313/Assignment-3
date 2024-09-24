import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Metric Converter");
        System.out.println("Input your query. Example, 1 kg = lb");
        System.out.println("Enter 'exit' to leave the program");

        while (true) {
            System.out.print("Enter your number and unit to convert");
            String input = scanner.nextLine();

            if (input.equals("exit")){
                System.out.println("Goodbye");
                break;
                
            }

            String[] parts = input.split(" ");
            double value = Double.parseDouble(parts[0]);
            String fromUnit = parts[1];
            String toUnit = parts[3];

            if (fromUnit.equals("kg") && toUnit.equals("lb")) {
                System.out.println(value + " kg = " + (value *2.20462) + " lb ");
            }
            else if (fromUnit.equals("C") && toUnit.equals("F")){
                System.out.println(value + " C = " + ((value *1.8) + 32) + " F ");
            }
            else if (fromUnit.equals("km") && toUnit.equals("m")){
                System.out.println(value + " km = " + (value *1000) + " m ");
            }
            else if (fromUnit.equals("oz") && toUnit.equals("g")){
                System.out.println(value + " oz = " + (value *28.34949) + "g ");
            }

            
        }

        scanner.close();
    }
}