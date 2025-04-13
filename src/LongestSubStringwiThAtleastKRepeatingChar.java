import java.util.Map;
import java.util.TreeMap;

public class LongestSubStringwiThAtleastKRepeatingChar {
    public static void main(String[] args) {
        System.out.println(smallestPalindrome("babab"));
    }
    public static String smallestPalindrome(String s) {
        Map<Character,Integer> mpp=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=0;
        for(var c:mpp.keySet()){
            int x=mpp.get(c);
            if(x%2==1){
                if(x==1){
                    sb.setCharAt(s.length()/2,c);
                }else{
                    sb.setCharAt(s.length()/2,c);
                    x--;

                    while(x!=0){
                        sb.setCharAt(i,c);
                        sb.setCharAt(s.length()-i-1,c);
                        i++;
                        x-=2;
                    }
                }
            }else{
                while(x!=0){
                    sb.setCharAt(i,c);
                    sb.setCharAt(s.length()-i-1,c);
                    i++;
                    x-=2;
                }
            }
        }
        String ans=sb.toString();
        return ans;
    }
}
