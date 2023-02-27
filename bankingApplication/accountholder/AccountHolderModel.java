package com.bankingApplication.accountholder;

import java.util.List;

import com.bankingApplication.pojoclass.AccountHolder;
import com.bankingApplication.repository.BankRepository;

public class AccountHolderModel implements ControllerToModel{
	private ModelToController acccontroller;
	
	public AccountHolderModel(AccountHolderController acccontroller) {
		this.acccontroller=acccontroller;
	}

	public void creditAmount(List<AccountHolder> account,int creditAmount) {
		BankRepository.getInstance().creditAmount(account, creditAmount);
		acccontroller.creditSuccess(account,creditAmount);
	}

	public void debitAmount(List<AccountHolder> account, int debitAmount,String pin) {
		BankRepository.getInstance().debitAmount(account, debitAmount,pin);
		if(BankRepository.getInstance().pinstate) {
		  if(BankRepository.getInstance().flag) {
			  acccontroller.debitSuccess(account,debitAmount);
		  }
		  else {
			acccontroller.debitFailure(account,BankRepository.getInstance().pinstate);
		  }
		}
		else {
			acccontroller.debitFailure(account,BankRepository.getInstance().pinstate);
		}
	}

	public void getTransactions(List<AccountHolder> account) {
		if(BankRepository.getInstance().transactionAmount.isEmpty()) {
			acccontroller.transactionNotFound(account);
			return;
		}
		acccontroller.foundTransaction(account,BankRepository.getInstance().transactionType,BankRepository.getInstance().transactionAmount,BankRepository.getInstance().currentBal);
	}

}
