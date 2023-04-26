import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {
    public ArrayList<Integer> randomInt(int sum, int count) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();
        int bufNum, bufSum = 0;
        for(int i = 1; i < count; i++) {
            bufNum = (int) (r.nextGaussian() * sum/count);
            if(bufNum < 0) {
                bufNum *= -1;
            }
            if(bufSum + bufNum >= sum) {
                bufNum = (sum - bufSum)/2;
            }
            numbers.add(bufNum);
            bufSum += bufNum;
        }
        numbers.add(sum - bufSum);
        return numbers;
    }
}
