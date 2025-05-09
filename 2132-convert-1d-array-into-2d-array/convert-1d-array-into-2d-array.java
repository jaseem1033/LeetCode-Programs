class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][]=new int[m][n];
        int k=0;
        if(original.length!=m*n) return new int[][]{};
        while(k<original.length)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=original[k++];
                }
            }
        }
        return arr;
    }
}