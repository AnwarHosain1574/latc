package com.example.LATC.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity(name = "MONEY_RECEIPT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoneyReceipt implements Serializable{
	
	private static final long serialVersionUID = 9132875688068247271L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	@JsonIgnore
	private Integer id;

	@Column(name="mr_serial_number")
	private String mrSerialNumber;

	@Column(name="office_branch_code")
	private String officeBranchCode;

	@Column(name="office_branch_name")
	private String officeBranchName;

	@Column(name="mr_number")
	private String mrNumber;

	@Column(name="mr_date")
	private String mrDate;

	@Column(name="class_insurance")
	private String classInsurance;

	@Column(name="insured_name")
	private String insuredName;

	@Column(name="insured_address")
	private String insuredAddress;

	@Column(name="insured_email")
	private String insuredEmail;

	@Column(name="mode_of_payment")
	private String modeOfPayment;

	@Column(name="payment_detail")
	private String paymentDetail;

	@Column(name="cover_note_number")
	private String coverNoteNumber;

	@Column(name="addendum_number")
	private String addendumNumber;

	@Column(name="endorsement_number")
	private String endorsementNumber;

	@Column(name="net_premium")
	private String netPremium;

	@Column(name="vat")
	private String vat;

	@Column(name="stamp")
	private String stamp;

	@Column(name="total_premium")
	private String totalPremium;

	@Column(name="cheque_drawn_on")
	private String chequeDrawnOn;

	@Column(name="cheque_date")
	private String chequeDate;

	@Column(name="deposit_date")
	private String depositDate;

	@Column(name="deposited_to_bank")
	private String depositedToBank;

	@Column(name="deposited_to_branch")
	private String depositedToBranch;

	@Column(name="deposited_to_account_number")
	private String depositedToAccountNumber;
	
	@Column(name="mfs")
	private String mfs;

	@Column(name="mfs_account_number")
	private String mfsAccountNumber;

	@Column(name="is_coInsurance")
	private String isCoInsurance;

	@Column(name="is_leader")
	private String isLeader;

	@Column(name="financing_bank_name")
	private String financingBankName;

	@Column(name="financing_bank_address")
	private String financingBankAddress;

	@Column(name="financing_bank_email")
	private String financingBankEmail;
	
	@Column(name="financing_bank_mobile")
	private String financingBankMobile;

	@Column(name="is_multi_document")
	private String isMultiDocument;

	@Column(name="bank_guarantee_number")
	private String bankGuaranteeNumber;


}
