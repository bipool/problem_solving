import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxHotelRoomTest {

    private MaxHotelRoom maxHotelRoom = new MaxHotelRoom();

    @Test
    public void maxRoom() {
        int[][] dates = {{2,5}, {1,3}, {4,7}};

        int maxDate = maxHotelRoom.maxRoom(dates);
        Assert.assertEquals(2, maxDate);
    }


    @Test
    public void maxRoomManyRooms() {
        int[][] dates = {{2,5}, {1,3}, {4,7}, {2,8}, {3,6}};

        int maxDate = maxHotelRoom.maxRoom(dates);
        Assert.assertEquals(4, maxDate);
    }


    @Test
    public void maxRoomOnlyOnRooms() {
        int[][] dates = {{1,2},{2,4}, {5,8}, {8,10}};

        int maxDate = maxHotelRoom.maxRoom(dates);
        Assert.assertEquals(1, maxDate);
    }
}