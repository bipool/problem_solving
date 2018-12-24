
import java.util.stream.IntStream;

public class PrimeCheck {

    public int[] check(int n) {
       return  IntStream.rangeClosed(2, n).filter((int i) -> {
            return  !IntStream.rangeClosed(2, i/2).anyMatch( p -> i % p == 0); // check any number is prime or not
        }).toArray();

    }
}
