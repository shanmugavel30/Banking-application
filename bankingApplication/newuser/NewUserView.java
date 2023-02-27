package com.bankingApplication.newuser;

import java.util.Scanner;

import com.bankingApplication.login.LoginView;

public class NewUserView implements ControllerToView{
	private ViewToController usercontroller;
	private Scanner scan = new Scanner(System.in);
	
	public NewUserView() {
		usercontroller=new NewUserController(this);
	}
	
	public void pageForNewUser(String name) {
		System.out.println("<---Create a account--->");
		System.out.println("Enter your favourite 4 digit Number:");
		String num=scan.next();
		System.out.println("Enter the Address:");
		scan.nextLine();
		String address=scan.nextLine();
		
		System.out.println("Enter the phone Number:");
		long phoneNo=scan.nextLong();
		String str=String.valueOf(phoneNo);
		if(str.length()==10) {
		   usercontroller.createAccount(name,num,address,phoneNo);
		}
		while(str.length()!=10) {
			System.out.println("Please enter valid phone No...!");
			pageForNewUser(name);
			
		}
	}

	public void createAccountSuccess(int accNo) {
		System.out.println("Your account created successfully.");
		System.out.println("Your  account number is: "+accNo);
		LoginView ref=new LoginView();
		ref.mainPage();
	}

}
