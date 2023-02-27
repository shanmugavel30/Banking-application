package com.bankingApplication.accountholder;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;

public class AccountHolderController implements ModelToController,ViewToController {
	private ControllerToView accview;
	private ControllerToModel accmodel;
	
	public AccountHolderController(AccountHolderView accview) {
		this.accview=accview;
		this.accmodel=new AccountHolderModel(this);
	}

	public void creditAmount(List<AccountHolder> account,int  creditAmount) {
		accmodel.creditAmount(account,creditAmount);
	}

	public void creditSuccess(List<AccountHolder> account,int creditAmount) {
		accview.creditSuccess(account,creditAmount);
	}

	public void debitAmount(List<AccountHolder> account, int debitAmount,String pin) {
		accmodel.debitAmount(account,debitAmount,pin);
	}

	public void debitSuccess(List<AccountHolder> account,int debitAmount) {
		accview.debitSuccess(account,debitAmount);
	}

	public void debitFailure(List<AccountHolder> account,boolean pinstate) {
		accview.debitFailure(account,pinstate);
	}

	public void getTransations(List<AccountHolder> account) {
		accmodel.getTransactions(account);
	}

	public void transactionNotFound(List<AccountHolder> account) {
		accview.transactionNotFound(account);
	}

	public void foundTransaction(List<AccountHolder> account, List<String> transactionType,
			List<Integer> transactionAmount,List<Integer> currentBal) {
		accview.foundTransaction(account,transactionType,transactionAmount,currentBal);
	}
}
