package omkar;

public class float_arr_sum {
public static void main(String[] args) {
	
	// practice prob1
	
	float arr []= {12,13,14,15,16,17};
	float sum=0;
	for(int i=0; i<arr.length; i++) {
	 sum=sum+arr[i];
	}
	System.out.println("sum: " +sum);
	float avg=sum/arr.length;
	System.out.println("average: "+avg);
	
}
}
