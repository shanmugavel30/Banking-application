package com.bankingApplication.manager;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public class ManagerController implements ModelToController,ViewToController{
	private ControllerToView managerview;
	private ControllerToModel managermodel;
	
	public ManagerController(ManagerView managerview) {
		this.managerview=managerview;
		managermodel=new ManagerModel(this);
	}

	public void getAllUsers() {
		managermodel.getAllUsers();
	}

	public void foundAllUsers(List<AccountHolder> allUsers) {
		managerview.foundAllUsers(allUsers);
	}

	public void removeUsers(int accNumber) {
		managermodel.removeUser(accNumber);
	}

	public void removeUserSuccess() {
		managerview.removeUserSuccess();
	}

	public void removeUserFailure() {
		managerview.removeUserFailure();
	}

}
