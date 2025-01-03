class Solution {
    public int equalPairs(int[][] grid) {
        // fetch grid size 
        int n = grid.length;

        // make a tranpose matrix 
        int [][] transpose_grid= new int[n][n];
        for(int i = 0 ; i< n ; i++)
        {
            for(int j = 0 ; j< n ; j++)
            {
                transpose_grid[j][i]=grid[i][j];
            }
        }
        // initizie counter variable 
        int count= 0;
        for(int i = 0 ; i< n ; i++)
        {
            for(int j = 0 ; j< n ; j++)
            {
               if(Arrays.equals(grid[i],transpose_grid[j])) count++;
            }
        }
        return count ;

    }
}