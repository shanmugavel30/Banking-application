package com.bankingApplication.manager;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public interface ControllerToView {

	void foundAllUsers(List<AccountHolder> allUsers);

	void removeUserSuccess();

	void removeUserFailure();

}
