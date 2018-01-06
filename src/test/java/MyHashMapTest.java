import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/3/18.
 */
public class MyHashMapTest {

    private MyHashMap hashMap = new MyHashMap();


    @Test
    public void put() throws Exception {
        hashMap.put("Bipool", "Fahina");
        hashMap.put("Bipool", "Fahin");
        hashMap.put("Fariha", "Rakeen");

        Assert.assertEquals("Fahin", hashMap.get("Bipool"));
        Assert.assertEquals(null, hashMap.get("Bipools"));

    }

    @Test
    public void get() throws Exception {

    }

}