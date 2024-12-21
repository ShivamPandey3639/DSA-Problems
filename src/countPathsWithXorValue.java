public class countPathsWithXorValue {
    public static int countPathsWithXorValue2(int[][] grid, int k) {
        int m=grid.length-1,n=grid[0].length-1;
        int[][] dp=new int[m+1][n+1];
        return func(0,0,0,dp,grid,k);
    }
    public static int func(int r,int c,int sum,int[][] dp,int[][] grid,int k){
        if(r>grid.length-1 || c> grid[0].length-1 || r<0 || c<0){
            return 0;
        }
        if(r==grid.length-1 && c==grid[0].length-1 ){
            int x=sum^grid[r][c];
            if(x==k){
                return 1;
            }else{
                return 0;
            }
        }


        int right=func(r,c+1,sum^grid[r][c],dp,grid,k);
        int down=func(r+1,c,sum^grid[r][c],dp,grid,k);

        return right+down;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 3, 3},
                {0, 3, 3, 2},
                {3, 0, 1, 1}
        };
        System.out.println(countPathsWithXorValue2(array,2));
    }
}
