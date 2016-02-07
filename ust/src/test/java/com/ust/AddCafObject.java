package com.ust;

import java.io.Serializable;

public class AddCafObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7340766206065324654L;
	private int activationFee;
	private String message;
	private int installationCharge;
	private int totalAmount;
	
	public int getActivationFee() {
		return activationFee;
	}
	public void setActivationFee(int activationFee) {
		this.activationFee = activationFee;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getInstallationCharge() {
		return installationCharge;
	}
	public void setInstallationCharge(int installationCharge) {
		this.installationCharge = installationCharge;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
}
