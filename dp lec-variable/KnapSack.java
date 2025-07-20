public class KnapSack {
    public static void main(String[] args) {

        int cap = 4;
        int[] wt = { 1, 2, 3, 2, 4 };
        int[] val = { 8, 4, 0, 5, 3 };
System.out.println(KnapSack(wt,val,cap,0));
    }

    public static int KnapSack(int[] wt, int[] val, int cap, int i) {
        if(i==wt.length || cap==0){
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if (cap >= wt[i]) {
            inc = val[i] + KnapSack(wt, val, cap - wt[i], i + 1);
        }
        exc=KnapSack(wt,val,cap,i+1);
        return Math.max(inc,exc);
    }

}
