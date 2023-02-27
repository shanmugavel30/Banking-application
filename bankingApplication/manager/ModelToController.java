package com.bankingApplication.manager;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public interface ModelToController {

	void foundAllUsers(List<AccountHolder> allUsers);

	void removeUserSuccess();

	void removeUserFailure();

}
