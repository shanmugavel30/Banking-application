package com.bankingApplication.login;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public interface ModelToController {

	void userNotFound();

	void userFound(List<AccountHolder> currentAccount);

	void adminSuccess();

	void adminFailure();

}
