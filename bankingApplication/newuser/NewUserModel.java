package com.bankingApplication.newuser;

import com.bankingApplication.repository.BankRepository;

public class NewUserModel implements ControllerToModel{
	private  ModelToController usercontroller;
	
	public NewUserModel(NewUserController usercontroller) {
		this.usercontroller=usercontroller;
	}

	public void createAccount(String name, String num, String address, long phoneNo) {
		BankRepository.getInstance().createAccount(name,num,address,phoneNo);
		usercontroller.createAccountSuccess(BankRepository.getInstance().accNo);
	}
}
