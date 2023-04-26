import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.LongStream;

public class RandomNumber {
    public ArrayList<Long> randomUniform(long sum, long count) {
        Random random = new Random();
        long [] bufNum = LongStream.generate(() -> (long) (random.nextDouble() * sum)).limit(count).toArray();
        long sumBuf = Arrays.stream(bufNum).sum();
        ArrayList<Long> numbers = new ArrayList<>();
        int sumNumbers = 0;
        for(int i = 0; i < count-1; i++) {
            numbers.add(bufNum[i] * sum / sumBuf);
            sumNumbers += numbers.get(i);
        }
        numbers.add(sum - sumNumbers);
        return numbers;
    }

    public ArrayList<Integer> randomGaussian(int sum, int count) {
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
