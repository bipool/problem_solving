package algorithm;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 12/9/17.
 */
public class DictonaryTest {

    private Dictonary dictonary = new Dictonary();

    @Before
    public void addWords() {
        dictonary.addWord("Bipool");
        dictonary.addWord("Fahin");
        dictonary.addWord("Fariha");
        dictonary.addWord("Rakeen");

    }

    @Test
    public void searchExist_test() {
        boolean isExist = dictonary.searchWord("Fahin");
        Assert.assertEquals(true, isExist);
    }

    @Test
    public void searchExistPartially_test() {
        boolean isExist = dictonary.prefixSearch("Fa");
        Assert.assertEquals(true, isExist);
    }

    @Test
    public void searchNotExistPartially_test() {
        boolean isExist = dictonary.prefixSearch("Bl");
        Assert.assertEquals(false, isExist);
    }

    @Test
    public void searchNotExist_test() {
        boolean isExist = dictonary.searchWord("Faheen");
        Assert.assertEquals(false, isExist);
    }
}