package com.bankingApplication.login;

import java.util.ArrayList;
import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;
import com.bankingApplication.repository.BankRepository;

public class LoginModel implements ControllerToModel {
	
	private ModelToController logincontroller;
	
	public LoginModel(LoginController logincontroller) {
		this.logincontroller=logincontroller;
	}

	public void checkUserExist(int accNo, String name) {
		List<AccountHolder> currentAccount=new ArrayList<>();
		currentAccount=BankRepository.getInstance().getAccount(accNo,name);
//		System.out.println(currentAccount);
		if(currentAccount==null) {
			logincontroller.userNotFound();
		}
		else {
			logincontroller.userFound(currentAccount);
		}
	}

	public void checkAdmin(String managerName, String password) {
		if(managerName.equalsIgnoreCase("shanmugavel") && password.equalsIgnoreCase("Selvam@20")) {
			logincontroller.adminSuccess();
		}
		else {
			logincontroller.adminFailure();
		}
	}

}
