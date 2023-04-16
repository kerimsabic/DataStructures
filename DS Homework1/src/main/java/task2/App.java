package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("M - manual input\nF - file input\n");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("M")) {
            System.out.println("Enter the expression:");
            String expression = input.nextLine();
            Double result = Algorithm.calculate(expression);
            System.out.println("Result: " + result);
        }
        else if (choice.equalsIgnoreCase("F")) {
            System.out.println("Enter the path of a file:");
            String filePath = input.nextLine();
            try {
                ArrayList<String> expressions = FileUtils.readFile(filePath);
                ArrayList<Double> results = Algorithm.calculateFromFile(filePath);
                for (int i = 0; i < expressions.size(); i++) {
                    System.out.println("Expression: " + expressions.get(i));
                    System.out.println("Result: " + results.get(i));
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found: " + filePath);
            }
        }
        else {
            System.out.println("Invalid input. Exiting program.");
        }
    }
}

