package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import task1.Stack;


public class Algorithm {
    public static Double calculate(String s1) {
        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < s1.length() && (Character.isDigit(s1.charAt(i)) || s1.charAt(i) == '.')) {
                    sb.append(s1.charAt(i++));
                }
                i--;
                double value = Double.parseDouble(sb.toString());
                values.push(value);

            }
            else if (c == '(') {
                operators.push(c);
            }
            else if (c == ')') {
                while (operators.peek() != '(') {
                    double val2 = values.pop();
                    double val1 = values.pop();
                    char op = operators.pop();

                    double result = performOperation(op,val1,val2);
                    values.push(result);
                }
                operators.pop();
            }
            else if (isOperator(c)) {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    double val2 = values.pop();
                    double val1 = values.pop();
                    char op = operators.pop();

                    double result = performOperation(op,val1,val2);
                    values.push(result);
                }

                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            double val2 = values.pop();
            double val1 = values.pop();
            char op = operators.pop();

            double result = performOperation(op,val1,val2);
            values.push(result);
        }

        return values.pop();
    }

    public static ArrayList<Double> calculateFromFile(String filePath) throws FileNotFoundException {
       ArrayList<String> expressions = FileUtils.readFile(filePath);
        ArrayList<Double> results = new ArrayList<>();

        for (String expression : expressions) {
            Double result = calculate(expression);
            results.add(result);
        }

        return results;
    }


    private static double performOperation(char operator, double value1, double value2) {
        switch (operator) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            case '%':
                return value1 % value2;
            case '^':
                return Math.pow(value1, value2);
            case '√':
                return Math.sqrt(value1);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
        private static boolean isOperator(char c) {
            return c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '^' || c == '√';
        }
        private static int precedence(char c) {
            switch (c) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                case '%':
                    return 2;
                case '^':
                case '√':
                    return 3;
                default:
                    return -1;
            }
        }
}