package com.bankingApplication.login;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public class LoginController implements ModelToController,ViewToController{
	private ControllerToView loginview;
	private ControllerToModel loginmodel;
	
	public LoginController(LoginView loginview) {
		this.loginmodel=new LoginModel(this);
		this.loginview=loginview;
	}

	public void checkUserExist(int accNo, String name) {
		loginmodel.checkUserExist(accNo,name);
	}

	public void userNotFound() {
		loginview.userNotFound();
	}

	public void userFound(List<AccountHolder> currentAccount) {
		loginview.userFound(currentAccount);
	}

	public void checkAdmin(String managerName, String password) {
		loginmodel.checkAdmin(managerName,password);
	}

	public void adminSuccess() {
		loginview.adminSuccess();
	}

	public void adminFailure() {
		loginview.adminFailure();
	}

}
