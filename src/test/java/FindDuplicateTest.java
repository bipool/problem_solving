import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 11/27/17.
 */
public class FindDuplicateTest {
    private FindDuplicate duplicate = new FindDuplicate();

    @Test
    public void test_2_duplicates() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res =  duplicate.find(nums);
        for ( int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

}