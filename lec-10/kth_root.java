public class kth_root {
    public static void main(String[] args) {

int n=143;
int k=3;
System.out.println(kthRoot(n, k));
    }
    public static int kthRoot(int n,int k){
        int low=0;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(Math.pow(mid,k)<=n){
                 ans=mid;
                 low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
