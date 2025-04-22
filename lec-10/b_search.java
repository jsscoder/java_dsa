public class b_search {

    public static void main(String[] args) {
        int arr []={2,3,4,5,7,8,9,13,16,18,19,20,21};
        int item=13;
        System.out.println(Searc(arr, item));
    }
    public static int Searc(int[] arr,int item){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==item){
return mid;
            }
            else if(arr[mid]<item){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
}
