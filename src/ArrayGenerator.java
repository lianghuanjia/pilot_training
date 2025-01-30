import java.util.Random;
public class ArrayGenerator {
    private int[] array;


    public ArrayGenerator(int N) {
        Random random = new Random();
        this.array =  new int[N];
        for (int i = 0; i < N; i ++) {
            this.array[i] = random.nextInt(100);
        }
    }

    public int[] getArray() {
        return this.array;
    }
}
