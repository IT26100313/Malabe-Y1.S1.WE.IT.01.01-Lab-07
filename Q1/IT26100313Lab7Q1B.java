import java.util.Scanner;

    public class IT26100313Lab7Q1B{
		
		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			
			for(int s = 1; s<=3; s++){
				System.out.println("Student"+ s);
				System.out.println("Enter Marks : ");
				
				double m1 = input.nextDouble();
				double m2 = input.nextDouble();
				double m3 = input.nextDouble();
				double m4 = input.nextDouble();
			
			 double avarage = (m1 + m2 + m3 + m4)/4.0;
			
			String grade;
			
			if(avarage >= 75){
				grade = "Distinction";
			}else if(avarage >= 50){
				grade = "Credit";
			}else{
				grade = "Fail";
			}
			
			System.out.println("Avarage = "+ avarage);
			System.out.println("Grade = "+ grade);
			
			}
			
		}
	}