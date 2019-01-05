import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PermutationBitString {
    public void generate() {

        List<String> list = new ArrayList<>();
        int[] bitString = {0,0,0};
        permutation(0, bitString, list, 3);
        list.forEach(System.out::println);
    }


    private void permutation(int i, int[] bitString, List<String> list, int n) {

        if (i == n) {
            //list.add(Arrays.stream(bitString).boxed().toArray(Integer[]::new));
            list.add(Arrays.toString(bitString));

            return;
        }

        bitString[i] = 0;
        permutation(i + 1, bitString, list, n);

        bitString[i] = 1;
        permutation(i + 1, bitString, list, n);

    }


    private void printBitString(int[] bitString) {
        Arrays.stream(bitString).forEach(System.out::print);
        System.out.println("");
    }
}
