import java.util.Scanner;

public class NumberInWord {

    public static String printUsingNestedIf(int number) {
        if (number == 1) return "ONE";
        else if (number == 2) return "TWO";
        else if (number == 3) return "THREE";
        else if (number == 4) return "FOUR";
        else if (number == 5) return "FIVE";
        else if (number == 6) return "SIX";
        else if (number == 7) return "SEVEN";
        else if (number == 8) return "EIGHT";
        else if (number == 9) return "NINE";
        else return "OTHER";
    }

    public static String printUsingSwitchCase(int number) {
        switch (number) {
            case 1: return "ONE";
            case 2: return "TWO";
            case 3: return "THREE";
            case 4: return "FOUR";
            case 5: return "FIVE";
            case 6: return "SIX";
            case 7: return "SEVEN";
            case 8: return "EIGHT";
            case 9: return "NINE";
            default: return "OTHER";
        }
    }
}
