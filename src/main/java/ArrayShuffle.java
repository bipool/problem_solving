import java.util.Random;

public class ArrayShuffle {

    public int[] shuffle(int[] data) {

        int length = data.length;

        for (int i = length-1; i > 0 ; i--) {
            int position = getRandom(i);
            int tmp = data[position];
            data[position] = data[i];
            data[i] = tmp;
        }

        return data;
    }


    public int getRandom( int max) {
        //return (int)(Math.random() * max + 1);
        Random rand = new Random();
        return rand.nextInt(max);
    }
}
