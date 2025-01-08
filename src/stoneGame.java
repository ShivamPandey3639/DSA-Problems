public class stoneGame {
    public static boolean stoneGame(int[] piles) {
        if(piles.length==2){
            return true;
        }
        return func(0,piles.length-1,0,0,0,piles);

    }
    public static boolean func(int i,int j,int p,int a,int b,int[] arr){
        if(i==arr.length || j<0 || j<i){
            return a>b?true:false;
        }
        boolean x=false,y=false;
        
        if(p==0){
            x=func(i+1,j,1,a+arr[i],b,arr);
            y=func(i,j-1,1,a+arr[j],b,arr);
            return x || y;
        }else{
            x=func(i+1,j,0,a,b+arr[i],arr);
            int g=1;
            y=func(i,j-1,0,a,b+arr[j],arr);


            return x || y;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,3,4,5};
        System.out.println(stoneGame(arr));
    }
}
