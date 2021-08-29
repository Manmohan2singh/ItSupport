package com.greatlearning.MailApplication.service;
import com.greatlearning.MailApplication.Main.DriverClass;

public class mailgenrator {
	
	static DriverClass depart=new DriverClass();
	
	public static void main(String[] args) {
		String firstname=depart.first_name;
		String lastname=depart.last_name;
		String department=depart.dep;
		System.out.println("Email ---> " + firstname+lastname+"@"+department+".GL.com");
		
	}

}
