/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.payments.dashboard;

import com.brian.db.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BADEMBA
 */
public class dashBoardCounterController {

    public int b2bcount;
    public int b2ccount;
    public int stkcount;
    public int c2confirmationsbcount;
    

    public int b2bDashboardController() throws SQLException {
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT distinct count(uid) from b2b";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            return rs.getInt(1);
        }
        b2bcount = rs.getInt(1);
        return b2bcount;

    }

    public int b2cDashboardController() throws SQLException {
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT distinct count(uid) from b2c";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            return rs.getInt(1);
        }
        b2ccount = rs.getInt(1);
        return b2ccount;

    }

    public int stkDashboardController() throws SQLException {
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT distinct count(uid) from stkcallback";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            return rs.getInt(1);
        }
        stkcount = rs.getInt(1);
        return stkcount;
    }
    
    public int c2bconfirmationsController() throws SQLException{
        Connection con = null;
        con = DBConnector.getMysqlDBConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT distinct count(uid) from c2b_confirmation";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            return rs.getInt(1);
        }
        c2confirmationsbcount = rs.getInt(1);
        return c2confirmationsbcount;  
    }
}
