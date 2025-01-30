import java.util.*;

public class MathCalculator {
    public static int evaluateExpression(int[] numbers, String[] operators) {
        // Convert to a list for processing
        List<Integer> numList = new ArrayList<>();
        for (int num : numbers) numList.add(num);

        List<String> opList = new ArrayList<>(Arrays.asList(operators));

        // Multiplication and Division first (left to right)
        for (int i = 0; i < opList.size(); ) {
            if (opList.get(i).equals("Mul") || opList.get(i).equals("Div")) {
                int left = numList.get(i);
                int right = numList.get(i + 1);
                int result = (opList.get(i).equals("Mul")) ? left * right : (int) Math.floor((double) left / right);

                // Replace with result and remove used number/operator
                numList.set(i, result);
                numList.remove(i + 1);
                opList.remove(i);
            } else {
                i++;
            }
        }

        // Process Addition and Subtraction (left to right)
        int result = numList.get(0);
        for (int i = 0; i < opList.size(); i++) {
            int right = numList.get(i + 1);
            if (opList.get(i).equals("Add")) {
                result += right;
            } else {
                result -= right;
            }
        }

        return result;
    }
}
