public class Power {
    public void print(){
        System.out.println("a\tb\tpow(a, b)");

        for (int a = 1, b = 2; a <= 5; a++, b++) {
            int power = calculatePower(a, b);
            System.out.println(a + "\t" + b + "\t" + power);
        }
    }
    private int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
