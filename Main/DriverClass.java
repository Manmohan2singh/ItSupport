package com.greatlearning.MailApplication.Main;
import java.util.Scanner;
import com.greatlearning.MailApplication.model.ItSupport;
import com.greatlearning.MailApplication.service.PswGenerator;
import com.greatlearning.MailApplication.service.mailgenrator;



public class DriverClass {
	public static String dep;
	public static String first_name;
	public static String last_name;
	public static void main(String[] args) {
	
		ItSupport itsupport= new ItSupport();
		PswGenerator psw = new PswGenerator();
		mailgenrator mail = new mailgenrator();
		Scanner sc = new Scanner(System.in);
		Scanner first = new Scanner(System.in);
		Scanner last = new Scanner(System.in);
		int len = 10;
		System.out.println(" Please Enter Your First Name:- ");
		first_name=first.next();
		System.out.println();
		System.out.println(" Please Enter Your Last Name:- ");
		last_name=first.next();
		System.out.println();
		System.out.println();
		System.out.println("!!!!! Please Enter the department of following !!!!!");
		int option;
		do {

			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("0. Exit");
			System.out.println("-----------------------------------------------");
			option = sc.nextInt();
			
			switch (option) {

			case 0:
				option = 0;
				break;
			case 1: {
				dep=itsupport.technical();
				System.out.println("Dear "+ first_name + " your generated credentials are as follows:-");
				mail.main(args);
				System.out.println("Password ---> " + psw.generateRandomPassword(len));


			}
			break;
			case 2: {
				dep=itsupport.admin();
				System.out.println("Dear "+ first_name + " your generated credentials are as follows:-");
				mail.main(args);
				System.out.println("Password ---> " + psw.generateRandomPassword(len));


			}
			break;
			case 3: {
				dep=itsupport.hr();
				System.out.println("Dear "+ first_name + " your generated credentials are as follows:-");
				mail.main(args);
				System.out.println("Password ---> " + psw.generateRandomPassword(len));


			}
			break;
			case 4: {
				dep=itsupport.legal();
				System.out.println("Dear "+ first_name + " your generated credentials are as follows:-");
				mail.main(args);
				System.out.println("Password ---> " + psw.generateRandomPassword(len));


			}
			break;
			
			default:
				System.out.println("enter valid option");
			}

		} while (option != 0);
		System.out.println("Exited successfully");
		sc.close();
	}
	

}
