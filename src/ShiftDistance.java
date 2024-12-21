public class ShiftDistance {
    public static long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long cost=0L;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i))continue;

            if(s.charAt(i)!=t.charAt(i)) {
                if (nextCost[s.charAt(i) - 'a'] == previousCost[s.charAt(i) - 'a'] && s.charAt(i) > t.charAt(i)) {
                    int a = (int)(s.charAt(i) - t.charAt(i));
                    int b = Math.abs(s.charAt(i) - 'z') + Math.abs((int) ('a' - t.charAt(i)));
                    if (b > a) {
                        int ind = (int) (s.charAt(i) - 'a');
                        if (s.charAt(i) == 'a') {
                            ind = 25;
                            cost += previousCost[s.charAt(i) - 'a'];
                        }
                        int dest = Math.abs((int) ((int) ('a' + ind) - t.charAt(i)));
                        while (dest != 0) {
                            if (ind < 0) ind = 25;
                            cost += previousCost[ind--];
                            dest--;
                        }
                        continue;
                    } else {
                        int ind = (int) (s.charAt(i) - 'a');
                        if (s.charAt(i) == 'z') {
                            ind = 0;
                            cost += nextCost[s.charAt(i) - 'a'];
                        }
                        int dest = b+1;
                        while (dest != 0) {
                            if (ind > 25) ind = 0;
                            cost += nextCost[ind++];
                            dest--;
                        }
                        continue;
                    }
                } else if(nextCost[s.charAt(i) - 'a'] == previousCost[s.charAt(i) - 'a'] && s.charAt(i) < t.charAt(i)){
                    int a = Math.abs(s.charAt(i) - t.charAt(i));
                    int b = Math.abs(s.charAt(i) - 'a') + (int) ('z' - t.charAt(i));
                    if (b > a) {
                        int ind = (int) (s.charAt(i) - 'a');
                        if (s.charAt(i) == 'z') {
                            ind = 0;
                            cost += nextCost[s.charAt(i) - 'a'];
                        }
                        int dest = Math.abs((int) (('a' + ind) - t.charAt(i)));
                        while (dest != 0) {
                            if (ind > 25) ind = 0;
                            cost += nextCost[ind++];
                            dest--;
                        }
                        continue;
                    } else {
                        int ind = (int) (s.charAt(i) - 'a');
                        if (s.charAt(i) == 'a') {
                            ind = 25;
                            cost += previousCost[s.charAt(i) - 'a'];
                        }
                        int dest = b+1;
                        while (dest != 0) {
                            if (ind < 0) ind = 25;
                            cost += previousCost[ind--];
                            dest--;
                        }
                        continue;
                    }

                }
                if(nextCost[s.charAt(i)-'a']>previousCost[s.charAt(i)-'a']){
                    int ind=(int)(s.charAt(i)-'a');
                    if(s.charAt(i)=='a'){
                        ind=25;
                        cost+=previousCost[s.charAt(i)-'a'];
                    }
                    int b = Math.abs(s.charAt(i) - 'z') + Math.abs((int) ('a' - t.charAt(i)));
                    int dest=b+1;
                    while(dest!=0){
                        if(ind<0)ind=25;
                        cost+=previousCost[ind--];
                        dest--;
                    }

                } else {
                    int ind=(int)(s.charAt(i)-'a');
                    if(s.charAt(i)=='z'){
                        ind=0;
                        cost+=nextCost[s.charAt(i)-'a'];
                    }
                    int dest=Math.abs((int)(('a'+ind)-t.charAt(i)));
                    while(dest!=0){
                        if(ind>25)ind=0;
                        cost+=nextCost[ind++];
                        dest--;
                    }
                }




            }
        }
        return cost;
    }

    public static void main(String[] args) {
        String s ="ccdbbcaadb", t = "aadbbdaaac";

        int[] nextCost = {6,6,9,8,2,4,10,10,6,4,9,5,5,5,2,7,9,7,4,1,4,10,1,5,2,4}, previousCost = {0,4,5,6,7,10,5,5,8,1,1,10,7,8,10,8,7,2,3,3,6,3,0,6,4,0};

        System.out.println(shiftDistance(s,t,nextCost,previousCost));

    }
}
