package Calculator;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        final String input = ReadInput.read();
        Queue<String> operations;
        Queue<String> numbers;
        boolean isValid = input.matches("^(\\d+[+\\-*/])+\\d+$");


        String[] numbersArr = input.split("[-+*/]");
        String[] operatorsArr = Arrays.copyOfRange(input.split("[0-9.]+"), 1, input.split("[0-9.]+").length) ;

        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(operatorsArr));

        Double res = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty()) {
            String op = operations.poll();
            Operate operate;
            switch (op) {
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }
            Double num = Double.parseDouble(numbers.poll());

            res = operate.getResult(res, num);
        }

        System.out.println(res);

    }
}
