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
@ManagedBean(name="C2BTransactions")
@SessionScoped
public class C2BTransactions {
 
    
    public List<C2BTransactionsUtils> getC2BTransactionList() throws SQLException, ClassNotFoundException {
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT uid,TransactionType,TransID,TransAmount,BusinessShortCode,BillRefNumber,InvoiceNumber,OrgAccountBalance,ThirdPartyTransID,MSISDN,FirstName,MiddleName,LastName,TransTime FROM c2b_confirmation ";
        ResultSet rs = stmt.executeQuery(sql);

        List<C2BTransactionsUtils> list = new ArrayList<C2BTransactionsUtils>();

        while (rs.next()) {
            C2BTransactionsUtils c2bTransactionsUtils = new C2BTransactionsUtils();
            c2bTransactionsUtils.setUid(rs.getString("uid"));
            //c2bTransactionsUtils.setArrivalTime(rs.getDate("ArrivalTime"));
            c2bTransactionsUtils.setTransactiontype(rs.getString("TransactionType"));
            c2bTransactionsUtils.setTransid(rs.getString("TransID"));
            c2bTransactionsUtils.setTransamount(rs.getDouble("TransAmount"));
            c2bTransactionsUtils.setBusinessshortcode(rs.getString("BusinessShortCode"));
            c2bTransactionsUtils.setBillrefnumber(rs.getString("BillRefNumber"));
            c2bTransactionsUtils.setInvoicenumber(rs.getString("InvoiceNumber"));
            c2bTransactionsUtils.setOrgaccountbalance(rs.getDouble("OrgAccountBalance"));
            c2bTransactionsUtils.setThirdpartytransid(rs.getString("ThirdPartyTransID"));
            c2bTransactionsUtils.setMsisdn(rs.getString("MSISDN"));
            c2bTransactionsUtils.setFirstname(rs.getString("FirstName"));
            c2bTransactionsUtils.setMiddlename(rs.getString("MiddleName"));
            c2bTransactionsUtils.setLastname(rs.getString("LastName"));
            c2bTransactionsUtils.setTranstime(rs.getString("TransTime"));

            //store all data into a List
            list.add(c2bTransactionsUtils);
        }

        return list;
   
    }
}
