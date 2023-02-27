package com.bankingApplication.manager;

import com.bankingApplication.repository.BankRepository;

public class ManagerModel implements ControllerToModel{
	private ModelToController managercontroller;
	
	public ManagerModel(ManagerController managercontroller) {	
		this.managercontroller=managercontroller;
	}

	public void getAllUsers() {
		BankRepository.getInstance().getAllUsers();
		managercontroller.foundAllUsers(BankRepository.getInstance().allUsers);
	}

	public void removeUser(int accNumber) {
		BankRepository.getInstance().removeUser(accNumber);
		if(BankRepository.getInstance().remove) {
			managercontroller.removeUserSuccess();
		}
		else {
			managercontroller.removeUserFailure();
		}
	}
}
