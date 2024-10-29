package oct.TaskEx.Task_29102024;

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] num = {1,2,3,4,5,6,7,8,9,8,10};
		
		
		boolean result = duplicatecheck(num);
		
		if(result){
			System.out.println("The array contain duplicates");
		}else {
			System.out.println("The array does not contain duplicates");
		}
	}
	
	static boolean duplicatecheck(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
