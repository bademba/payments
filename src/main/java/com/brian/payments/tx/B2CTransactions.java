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
@ManagedBean(name="B2CTransactions")
@SessionScoped
public class B2CTransactions {
    public List<B2CTransactionsUtils> getB2CTransactions() throws SQLException{
        
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT uid,Txdate,TransactionID,TransactionAmount,BeneficiaryName,TxCompletedDateTime,B2CUtilityAccountAvailableFunds,B2CWorkingAccountAvailableFunds FROM b2c order by Txdate desc";
        ResultSet rs = stmt.executeQuery(sql);

        List<B2CTransactionsUtils> list = new ArrayList<B2CTransactionsUtils>();
        while(rs.next()){
        B2CTransactionsUtils b2cUtils=new B2CTransactionsUtils();
        b2cUtils.setUid(rs.getString("uid"));
        b2cUtils.setTxdate(rs.getDate("Txdate"));
        b2cUtils.setTransactionID(rs.getString("TransactionID"));
        b2cUtils.setTransactionAmount(rs.getDouble("TransactionAmount"));
        b2cUtils.setBeneficiaryName(rs.getString("BeneficiaryName"));
        b2cUtils.setTxCompletedDateTime(rs.getString("TxCompletedDateTime"));
        b2cUtils.setB2CUtilityAccountAvailableFunds(rs.getDouble("B2CUtilityAccountAvailableFunds"));
        b2cUtils.setB2CWorkingAccountAvailableFunds(rs.getDouble("B2CWorkingAccountAvailableFunds"));
        list.add(b2cUtils);
        }
        return list;
    }
}
