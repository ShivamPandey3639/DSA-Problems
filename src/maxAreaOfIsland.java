import java.util.LinkedList;
import java.util.Queue;

public class maxAreaOfIsland {

        public static int maxAreaOfIsland(int[][] grid) {
            int n=grid.length,m=grid[0].length;
            int[][] vis=new int[n+1][m+1];
            int mx=-1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==1 && vis[i][j]==0){
                        int[] ans={1};
                        BFS(i,j,grid,vis,ans);
                        mx=Math.max(mx,ans[0]);
                    }
                }
            }
            return mx;
        }
        public  static void BFS(int row,int col,int[][] grid,int[][] vis,int[] ans){
            Queue<int[]> q=new LinkedList<>();
            q.add(new int[]{row,col});
            vis[row][col]=1;
            while(!q.isEmpty()){
                int x=q.peek()[0];
                int y=q.peek()[1];
                q.remove();
                int[] delr={-1,0,1,0};
                int[] delc={0,1,0,-1};
                for(int i=0;i<4;i++){
                    int nrow=x+delr[i];
                    int ncol=y+delc[i];
                    if(nrow<=grid.length-1 && ncol<=grid[0].length-1  &&
                            nrow>=0 && ncol>=0 && vis[nrow][ncol]==0  && grid[nrow][ncol]==1){
                        q.add(new int[]{nrow,ncol});
                        ans[0]++;
                        vis[nrow][ncol]=1;
                    }
                }

            }
        }

        public static void main(String[] args) {
            int[][] array = {
                    {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
            };
            System.out.println(maxAreaOfIsland(array));
    }
}
