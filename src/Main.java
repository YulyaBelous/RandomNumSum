import java.util.ArrayList;

public class Main {
    static final long sum = 100;
    static final long count = 10;
    public static void main(String[] args) {
        ArrayList<Long> numbers;
        RandomNumber randomNum = new RandomNumber();
        for (int i = 0; i< 100; i++) {
            numbers = randomNum.randomUniform(sum, count);
            System.out.print("Generate: ");
            for(Long key: numbers) {
                System.out.print(key + " " );
            }
            System.out.println();
        }
    }

}