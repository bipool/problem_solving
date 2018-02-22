import java.util.Arrays;

public class MaxHotelRoom {

    public int maxRoom(int[][] dates) {

        int[] enter = new int[dates.length];
        int[] exit = new int[dates.length];

        for (int i = 0; i < dates.length; i++) {
            enter[i] = dates[i][0];
            exit[i] = dates[i][1];
        }

        Arrays.sort(enter);
        Arrays.sort(exit);

        int roomCount = 0;
        int j = 0;
        int maxRoom = 0;

        for (int i = 0; i < enter.length; i++) {

            if (enter[i] < exit[j]) {
                roomCount++;
            } else if (enter[i] > exit[j]) {
                roomCount--;
                j++;
                i--;
            } else {
                j++;
            }


            if ( maxRoom < roomCount) {
                maxRoom = roomCount;
            }

        }

        return maxRoom;
    }

}
