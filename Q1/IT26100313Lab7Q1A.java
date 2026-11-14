import java.util.Scanner;

    public class IT26100313Lab7Q1A{
		
		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter subject mark 1 : ");
			double sub1 = input.nextDouble();
			
			System.out.print("Enter subject mark 2 : ");
			double sub2 = input.nextDouble();
			
			System.out.print("Enter subject mark 3 : ");
			double sub3 = input.nextDouble();
			
			System.out.print("Enter subject mark 4 : ");
			double sub4 = input.nextDouble();
			
			double avarage = (sub1 + sub2 + sub3 + sub4)/4.0;
			
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