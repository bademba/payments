/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.payments.tx;

import com.brian.db.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author BADEMBA
 */
@ManagedBean(name="B2BTransactions")
@SessionScoped
public class B2BTransactions {
    public List<B2BTransactionsUtils> getB2BTransactions() throws SQLException{
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = " SELECT uid,Txdate,TransactionID,InitiatorAccountCurrentBalance,DebitAccountCurrentBalance,Amount,DebitPartyAffectedAccountBalance,TransCompletedTime,DebitPartyCharges,ReceiverPartyPublicName,BillReferenceNumber FROM b2b order by Txdate desc";
        ResultSet rs = stmt.executeQuery(sql);

        List<B2BTransactionsUtils> list = new ArrayList<B2BTransactionsUtils>();
        while(rs.next()){
        B2BTransactionsUtils b2butils= new B2BTransactionsUtils();
        b2butils.setTxdate(rs.getString("Txdate"));
        b2butils.setTransactionID(rs.getString("TransactionID"));
        b2butils.setAmount(rs.getDouble("Amount"));
        b2butils.setTransCompletedTime(rs.getString("TransCompletedTime"));
        b2butils.setDebitPartyCharges(rs.getString("DebitPartyCharges"));
        b2butils.setReceiverPartyPublicName(rs.getString("ReceiverPartyPublicName"));
        list.add(b2butils);
        }
        return list;
    }
    
}
