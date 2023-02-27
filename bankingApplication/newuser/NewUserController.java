package com.bankingApplication.newuser;

public class NewUserController implements ModelToController,ViewToController {
	private ControllerToView userview;
	private ControllerToModel usermodel;
	
	public NewUserController(NewUserView userview) {
		this.userview=userview;
		usermodel=new NewUserModel(this);
	}

	public void createAccount(String name, String num, String address, long phoneNo) {
		usermodel.createAccount(name,num,address,phoneNo);
	}

	public void createAccountSuccess(int accNo) {
		userview.createAccountSuccess(accNo);
	}
}
