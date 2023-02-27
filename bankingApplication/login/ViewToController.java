package com.bankingApplication.login;

public interface ViewToController {

	void checkAdmin(String managerName, String password);

	void checkUserExist(int accNo, String name);

}
