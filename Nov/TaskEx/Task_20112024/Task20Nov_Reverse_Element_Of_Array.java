package Nov.TaskEx.Task_20112024;

public class Task20Nov_Reverse_Element_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = new Integer[5];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		
		System.out.println("Original Array");
		for(int i = 0;  i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Reversed Array");
		for(int j = arr.length-1;  j >= 0; j--) {
			System.out.println(+ arr[j]);
		}
	}
}