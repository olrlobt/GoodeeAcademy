package com.im.start.BankMembers;

import java.util.List;

import com.im.start.bankaccount.BankAccountDTO;

public class BankMembersDTO {
	
	private String ID;
	
	
	private String PW;
	private String name;
	private String email;
	private String phone;
	private List<BankAccountDTO> accountDTOs;
	private BankMembersFileDTO bankMembersFileDTO;
	

	public BankMembersFileDTO getBankMembersFileDTO() {
		return bankMembersFileDTO;
	}
	public void setBankMembersFileDTO(BankMembersFileDTO bankMembersFileDTO) {
		this.bankMembersFileDTO = bankMembersFileDTO;
	}
	public List<BankAccountDTO> getAccountDTOs() {
		return accountDTOs;
	}
	public void setAccountDTOs(List<BankAccountDTO> accountDTOs) {
		this.accountDTOs = accountDTOs;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
