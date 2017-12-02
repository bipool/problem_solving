import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zulfiquer on 11/12/17.
 */
public class ReverseVowel {

    public String generate(String str) {
        if (str.length() <= 1) {
            return str;
        }


        Set<Character> vowels = new HashSet<Character>(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));

        char[] list=str.toCharArray();
        ArrayList<Integer> position = new ArrayList<Integer>();
        for (int i = 0 ; i < list.length; i++) {
            if (vowels.contains(list[i])){
                position.add(i);
            }
        }

        int foundVowels = position.size();
        if (foundVowels <= 1) {
            return str;
        }

        for (int i = 0; i < foundVowels/2; i++) {
            int pos1 = position.get(i);
            int pos2 = position.get(foundVowels-i-1);
            Character temp = list[pos1];
            list[pos1] = list[pos2];
            list[pos2] = temp;
        }

        return String.valueOf(list);

    }
}
