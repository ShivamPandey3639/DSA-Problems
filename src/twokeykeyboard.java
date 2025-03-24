public class twokeykeyboard {
    public static void main(String[] args) {
        System.out.println(minSteps(3));
    }
    public static int minSteps(int n) {
        if(n==1)return 0;
        return 1+func(1,n-1,n);
    }
    public static int func(int p,int n,int on){
        if(n==0)return 0;
        if(p>n)return Integer.MAX_VALUE;


        int x=func(p,n-p,on);

        if(x!=Integer.MAX_VALUE){
            x+=1;
        }
        if(on-n==p){
            return x;
        }
        int y=func(on-n,n,on);
        if(y!=Integer.MAX_VALUE){
            y+=1;
        }
        return Math.min(x,y);
    }
}
