public class SearchRange {

    public int[] find(int[] data, int search) {

        int lower = searchLower(data, search, 0 , data.length-1);
        int higher = searchHigher(data, search, 0 , data.length-1);

        int[] result = {lower, higher};

        return result;

    }


    private int searchLower(int[] data, int search, int low, int high) {

        if(low > high) {
            return  -1;
        }

        int mid = ( low + high ) /2;

        if (data[mid] == search && (mid == 0 || data[mid-1] < search)) {
            return mid;
        }

        if (data[mid] < search) {
            return searchLower(data, search, mid + 1, high);
        }

        return searchLower(data, search, low, mid-1);
    }

    private int searchHigher(int[] data, int search, int low, int high) {

        if(low > high) {
            return  -1;
        }

        int mid = ( low + high ) /2;

        if (data[mid] == search && (mid == data.length-1 || data[mid+1] > search)) {
            return mid;
        }

        if (data[mid] <= search) {
            return searchHigher(data, search, mid + 1, high);
        }

        return searchHigher(data, search, low, mid-1);
    }
}
