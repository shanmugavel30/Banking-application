package com.bankingApplication.accountholder;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public interface ViewToController {

	void creditAmount(List<AccountHolder> account, int creditAmount);

	void debitAmount(List<AccountHolder> account, int debitAmount, String pin);

	void getTransations(List<AccountHolder> account);

}
