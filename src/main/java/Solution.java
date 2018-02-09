import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zulfiquer on 1/15/18.
 */
public class Solution {

    class Data {
        private int hostId;
        private int listId;
        private float score;
        private String city;
        private boolean taken;

        public Data(final int hostId, final int listId, final float score, final String city) {
            this.hostId = hostId;
            this.listId = listId;
            this.score = score;
            this.city = city;
            this.taken = false;
        }

        public int getHostId() {
            return hostId;
        }

        public void setHostId(final int hostId) {
            this.hostId = hostId;
        }

        public int getListId() {
            return listId;
        }

        public void setListId(final int listId) {
            this.listId = listId;
        }

        public float getScore() {
            return score;
        }

        public void setScore(final float score) {
            this.score = score;
        }

        public String getCity() {
            return city;
        }

        public void setCity(final String city) {
            this.city = city;
        }

        public boolean isTaken() {
            return taken;
        }

        public void setTaken(final boolean taken) {
            this.taken = taken;
        }


        public String getData() {
         return hostId+","+listId+","+score+"," + city;
        }
    }



    public String[]  prepare(int num, List<Data> dataList, HashMap<Integer, Integer> hostCount) {





        List<Integer> pageHostTracker = new ArrayList<Integer>();

        int count = 0;
        boolean cycle = false;
        int total = 0;

        String[] result = new String[(total/num) + total + 1];
        int startIndex = 0;
        for (int i = 0; i < dataList.size(); i++) {

            if( total == dataList.size()) {
                return result;
            }


            Data data = dataList.get(i);
            if (data.isTaken()) {
                continue;
            }




            if(!pageHostTracker.contains(data.hostId) || cycle) {
                result[total] = data.getData();
                hostCount.put(data.hostId, hostCount.get(data.hostId) - 1);
                data.setTaken(true);
                count++;
                total++;
            } else {

                /*for (int j = i + 1; j < dataList.size(); j++) {
                    Data dataNext = dataList.get(j);
                    if(!pageHostTracker.contains(dataNext.hostId)) {
                        result.add(dataNext.getData());
                        hostCount.put(dataNext.hostId, hostCount.get(dataNext.hostId) - 1);
                        count++;
                        total--;
                    }
                }*/
                startIndex = i;


            }


            if (count == num) {
                result[total] = "";
                count = 0;
                i = startIndex != 0 ? startIndex : i;
                startIndex = 0;
                cycle = false;
            }

            if (i == dataList.size() -1 && startIndex != 0) {
                i = startIndex;
                cycle = true;
            }

        }

        return null;

    }


    public void test(int num, String[] str) {
        HashMap<Integer, Integer> hostCount = new HashMap<Integer, Integer>();
        List<Data> dataList = new ArrayList<Data>();
        for (int i = 0; i < str.length; i++) {
            String[] arr = str[i].split(",");
            int hostId = Integer.parseInt(arr[0]);
            dataList.add(new Data(hostId, Integer.parseInt(arr[1]), Float.parseFloat(arr[2]), arr[3]));
            if (hostCount.containsKey(hostId)){
                hostCount.put(hostId, hostCount.get(hostId) + 1);
            }
        }


        prepare(num, dataList, hostCount);


        System.out.println(dataList.size());

    }
}
