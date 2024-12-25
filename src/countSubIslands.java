import java.util.LinkedList;
import java.util.Queue;

public class countSubIslands {
    public static void main(String[] args) {
        int[][] array2 = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0}
        };
        int[][] array1 = {
                {1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1}
        };
        System.out.println(countSubIslands(array1,array2));
    }
    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int n=grid1.length,m=grid1[0].length;
        int[][] vis=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j]==1 && vis[i][j]==0){
                    int[] flag={0};

                        bfs(i,j,grid1,grid2,vis,flag);
                        if(flag[0]==0 ){
                            ans++;

                    }


                }
            }
        }
        return ans;
    }
    public static void bfs(int row,int col,int[][] grid1,int[][] grid2,int[][] vis,int[] flag){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{row,col});
        vis[row][col]=1;
        while(!q.isEmpty()){
            int x=q.peek()[0];
            int y=q.peek()[1];
            if(grid1[x][y]!=1){
                flag[0]=1;
            }
            q.remove();
            int[] delr={-1,0,1,0};
            int[] delc={0,1,0,-1};
            for(int i=0;i<4;i++){
                int nrow=x+delr[i];
                int ncol=y+delc[i];
                if(nrow<=grid1.length-1 && ncol<=grid1[0].length-1  &&
                        nrow>=0 && ncol>=0 && vis[nrow][ncol]==0  && grid2[nrow][ncol]==1){
                    q.add(new int[]{nrow,ncol});

                    vis[nrow][ncol]=1;

                }
            }

        }
    }
}
