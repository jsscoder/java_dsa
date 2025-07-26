public class  Subarray_product {
    public static void main(String[] args) {
    
        
int arr[]={2,3,1,2,4,3};

int k=10;

System.out.println(Product_less_than_k(arr, k));


    }

public static int Product_less_than_k(int []arr,int k){

    int ei=0,si=0,ans=0,p=1;
    while(ei<arr.length){
        //grow
        p=p*arr[ei];
        //shrink
        while(p>=k){
        p=p/arr[si];
        si++;
        
    }
        ans=ans+(ei-si+1);
        ei++;
        
} 
        //ans
    
       return ans;
    
}

}


