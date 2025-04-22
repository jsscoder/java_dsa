package omkar;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {11,12,18,19};
		
		int length=arr.length;
		int sum=0;
		for(int i=0; i<length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum: "+sum);
		float avg=sum/length;
		System.out.println("average: "+ avg);
	}

}
