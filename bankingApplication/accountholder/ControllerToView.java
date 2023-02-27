package com.bankingApplication.accountholder;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public interface ControllerToView {

	void creditSuccess(List<AccountHolder> account, int creditAmount);

	void debitSuccess(List<AccountHolder> account, int debitAmount);

	void debitFailure(List<AccountHolder> account, boolean pinstate);

	void transactionNotFound(List<AccountHolder> account);

	void foundTransaction(List<AccountHolder> account, List<String> transactionType, List<Integer> transactionAmount,
			List<Integer> currentBal);

}
