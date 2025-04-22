package omkar;

public class arr_new_reference {

	public static void main(String[] args) {
		int arr []= {10,20,30,40,50};
		System.out.println(arr[0],arr[1]);
		System.out.println(swap(arr,arr[0],arr[1]));
	}
	
	public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

// java is always call by value