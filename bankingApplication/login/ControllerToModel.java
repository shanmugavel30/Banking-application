package com.bankingApplication.login;

public interface ControllerToModel {

	void checkUserExist(int accNo, String name);

	void checkAdmin(String managerName, String password);

}
