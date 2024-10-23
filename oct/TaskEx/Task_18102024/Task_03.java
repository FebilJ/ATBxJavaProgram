package oct.TaskEx.Task_18102024;

import java.util.Scanner;
public class Task_03 {
	public static void main(String args[]) {
		//input type
		//select conversion
		// covert calculation
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
		System.out.println("Select the conversion");
		System.out.println("Choose 1 for km->miles Choose 2 for Clecius to Farenheit");
		
		if(sc.hasNextInt()) {
			num = sc.nextInt();
			break;
			}else{
				System.out.println("Invalid Selection!! Only select 1 or 2");
				sc.next();
			}
		
		switch(num){
			case 1:
				System.out.println("Enter KM");
				double km = sc.nextDouble();
				double miles = km*0.621;
                System.out.printf("Miles = "+miles);
                break;
			
			case 2:
                System.out.println("Enter Celcius:");
                double celcius = sc.nextDouble();
                double farenheit = (celcius*9/5)+32;
                System.out.printf("Farenheit = " +farenheit);
                break;
                
            default:
                System.out.println("Invalid Selection!!");
                break;
		}
		sc.close();
	}
	}
}
