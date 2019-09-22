package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.BankerEntity;

@ManagedBean(name = "banker")
@SessionScoped
public class Banker implements Serializable {
	private static final long serialVersionUID = 1L;

	private String Name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestationCountry;
	private int AccountNumber;
	private float Amount;

	public void setName(String name) {
		Name = name;
	}


	public String getName() {
		return Name;
	}

	public String getSourcePassport() {
		return SourcePassport;
	}


	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}


	public String getDestinationPassport() {
		return DestinationPassport;
	}


	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}


	public String getDestinationBank() {
		return DestinationBank;
	}


	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}


	public String getDestationCountry() {
		return DestationCountry;
	}


	public void setDestationCountry(String destationCountry) {
		DestationCountry = destationCountry;
	}


	public int getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}


	public float getAmount() {
		return Amount;
	}


	public void setAmount(float amount) {
		Amount = amount;
	}





	public BankerEntity getEntity()
	{
		BankerEntity bankerEntity = new BankerEntity();
		bankerEntity.setName(Name);
		bankerEntity.setSourcePassport(SourcePassport);;
		bankerEntity.setDestinationPassport(DestinationPassport);;
		bankerEntity.setDestinationBank(DestinationBank);;
		bankerEntity.setDestationCountry(DestationCountry);;
		bankerEntity.setAccountNumber(AccountNumber);;
		bankerEntity.setAmount(Amount);;
		return bankerEntity;
	}




}
