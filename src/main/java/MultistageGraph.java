public class MultistageGraph {

    private int[][] costMatrix = {  {0,0, 2, 3, 4, 0, 0},
                                    {0,0, 2, 3, 4, 0, 0},
                                    {0,0, 2, 3, 4, 0, 0},
                                    {0,0, 2, 3, 4, 0, 0},
                                    {0,0, 2, 3, 4, 0, 0},
                                    {0,0, 2, 3, 4, 0, 0},
                                    {0,0, 2, 3, 4, 0, 0},
                                };
    private int stage = 4;
    private int[] dist = {};
    private int[] cost = {};
    private int noOfNode = 8;

    public void findPath() {
        dist[noOfNode-1] = 0;
        for (int i = noOfNode -1; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = i + 1; j < noOfNode; j++) {
                if(costMatrix[i][j] != 0 && costMatrix[i][j] + cost[j] < min) {
                    min = costMatrix[i][j] + cost[j];
                    dist[i] = 0;
                }
            }
        }

    }

}
