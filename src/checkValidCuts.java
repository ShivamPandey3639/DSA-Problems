public class checkValidCuts {
    public static boolean checkValidCuts(int n, int[][] rectangles) {
        int[][] v=new int[rectangles.length][2];
        int[][] h=new int[rectangles.length][2];
        for(int i=0;i<rectangles.length;i++){
            v[i][0]=rectangles[i][0];
            v[i][1]=rectangles[i][2];
            h[i][0]=rectangles[i][1];
            h[i][1]=rectangles[i][3];
        }
        int cnt=0,flag=0;
        for(int i=1;i<=n;i++){
            for(int[] it: v){
                if(it[0]<i && i<it[1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                cnt++;
            }
            if(cnt>=2){
                return true;
            }
            flag=0;
        }
        cnt=0;
        flag=0;
        for(int i=1;i<=n;i++){
            for(int[] it: h){
                if(it[0]<i && i<it[1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                cnt++;
            }
            if(cnt>=2){
                return true;
            }
            flag=0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 1},
                {2, 0, 3, 4},
                {0, 2, 2, 3},
                {3, 0, 4, 3}
        };
        System.out.println(checkValidCuts(4,grid));
    }
}
