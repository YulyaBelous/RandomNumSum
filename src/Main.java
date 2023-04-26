import java.util.ArrayList;

public class Main {
    static final int sum = 100;
    static final int count = 10;
    public static void main(String[] args) {
        ArrayList<Integer> numbers;
        RandomNumber randomNum = new RandomNumber();
        for (int i = 0; i< 100; i++) {
            numbers = randomNum.randomInt(sum, count);
            System.out.print("Generate: ");
            for(Integer key: numbers) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

}