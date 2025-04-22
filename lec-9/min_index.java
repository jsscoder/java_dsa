public class min_index {
    public static void main(String[] args) {
int arr[]={4,-1,5,3,1,2};
//System.out.println(idx_min(arr, 3));
sort(arr);
for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
}

    }

    public static int idx_min(int arr[], int idx) {
        int min_idx = idx;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] < arr[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int idx=idx_min(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

        }
    }

    }
