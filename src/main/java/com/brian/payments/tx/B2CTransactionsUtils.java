/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.payments.tx;

import java.sql.Date;

/**
 *
 * @author BADEMBA
 */
public class B2CTransactionsUtils {
    public String uid;
    public Date Txdate;
    public String TransactionID;
    public double TransactionAmount;
    public String BeneficiaryName;
    public String TxCompletedDateTime;
    public double B2CUtilityAccountAvailableFunds;
    public double B2CWorkingAccountAvailableFunds;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    
    
    public Date getTxdate() {
        return Txdate;
    }

    public void setTxdate(Date Txdate) {
        this.Txdate = Txdate;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public double getTransactionAmount() {
        return TransactionAmount;
    }

    public void setTransactionAmount(double TransactionAmount) {
        this.TransactionAmount = TransactionAmount;
    }

    public String getBeneficiaryName() {
        return BeneficiaryName;
    }

    public void setBeneficiaryName(String BeneficiaryName) {
        this.BeneficiaryName = BeneficiaryName;
    }

    public String getTxCompletedDateTime() {
        return TxCompletedDateTime;
    }

    public void setTxCompletedDateTime(String TxCompletedDateTime) {
        this.TxCompletedDateTime = TxCompletedDateTime;
    }

    public double getB2CUtilityAccountAvailableFunds() {
        return B2CUtilityAccountAvailableFunds;
    }

    public void setB2CUtilityAccountAvailableFunds(double B2CUtilityAccountAvailableFunds) {
        this.B2CUtilityAccountAvailableFunds = B2CUtilityAccountAvailableFunds;
    }

    public double getB2CWorkingAccountAvailableFunds() {
        return B2CWorkingAccountAvailableFunds;
    }

    public void setB2CWorkingAccountAvailableFunds(double B2CWorkingAccountAvailableFunds) {
        this.B2CWorkingAccountAvailableFunds = B2CWorkingAccountAvailableFunds;
    }
    
    
}
