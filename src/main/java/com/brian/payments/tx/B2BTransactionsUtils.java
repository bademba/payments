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
public class B2BTransactionsUtils {
    public String Txdate;
    public String TransactionID;
    public String InitiatorAccountCurrentBalance;
    public String DebitAccountCurrentBalance;
    public double Amount;
    public String DebitPartyAffectedAccountBalance;
    public String TransCompletedTime;
    public String DebitPartyCharges;
    public String ReceiverPartyPublicName;
    public String BillReferenceNumber;

    public String getTxdate() {
        return Txdate;
    }

    public void setTxdate(String Txdate) {
        this.Txdate = Txdate;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getInitiatorAccountCurrentBalance() {
        return InitiatorAccountCurrentBalance;
    }

    public void setInitiatorAccountCurrentBalance(String InitiatorAccountCurrentBalance) {
        this.InitiatorAccountCurrentBalance = InitiatorAccountCurrentBalance;
    }

    public String getDebitAccountCurrentBalance() {
        return DebitAccountCurrentBalance;
    }

    public void setDebitAccountCurrentBalance(String DebitAccountCurrentBalance) {
        this.DebitAccountCurrentBalance = DebitAccountCurrentBalance;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public String getDebitPartyAffectedAccountBalance() {
        return DebitPartyAffectedAccountBalance;
    }

    public void setDebitPartyAffectedAccountBalance(String DebitPartyAffectedAccountBalance) {
        this.DebitPartyAffectedAccountBalance = DebitPartyAffectedAccountBalance;
    }

    public String getTransCompletedTime() {
        return TransCompletedTime;
    }

    public void setTransCompletedTime(String TransCompletedTime) {
        this.TransCompletedTime = TransCompletedTime;
    }

    public String getDebitPartyCharges() {
        return DebitPartyCharges;
    }

    public void setDebitPartyCharges(String DebitPartyCharges) {
        this.DebitPartyCharges = DebitPartyCharges;
    }

    public String getReceiverPartyPublicName() {
        return ReceiverPartyPublicName;
    }

    public void setReceiverPartyPublicName(String ReceiverPartyPublicName) {
        this.ReceiverPartyPublicName = ReceiverPartyPublicName;
    }

    public String getBillReferenceNumber() {
        return BillReferenceNumber;
    }

    public void setBillReferenceNumber(String BillReferenceNumber) {
        this.BillReferenceNumber = BillReferenceNumber;
    }
    
    
}
