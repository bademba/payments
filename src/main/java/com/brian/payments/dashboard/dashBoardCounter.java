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
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author BADEMBA
 */
@ManagedBean
@ViewScoped
public class dashBoardCounter {

    private DashboardModel model;
    public int C2BConfirmationCounter;
    public int stkDashboardCounter;
    public int b2bDashboardCounter;
    public int b2cDashboardCounter;
    dashBoardCounterController dbc = new dashBoardCounterController();
    //C2B Dashboard counter

    public int getC2BConfirmationCounter() throws SQLException {  
        return dbc.c2bconfirmationsController();
    }

    public void setC2BConfirmationCounter(int C2BConfirmationCounter) {
        this.C2BConfirmationCounter = C2BConfirmationCounter;
    }

    //STK Dashboard counter
    public int getStkDashboardCounter() throws SQLException {
        return dbc.stkDashboardController();
    }

    public void setStkDashboardCounter(int stkDashboardCounter) {
        this.stkDashboardCounter = stkDashboardCounter;
    }
    
    //B2B Dashboard counter
    public int getB2bDashboardCounter() throws SQLException {  
        return dbc.b2bDashboardController();
    }
    
    public void setB2bDashboardCounter(int b2bDashboardCounter) {
        this.b2bDashboardCounter = b2bDashboardCounter;
    }
    
    //B2c Dashboard counter 
    public int getB2cDashboardCounter() throws SQLException {  
        return dbc.b2cDashboardController();
    }
  
    public void setB2cDashboardCounter(int b2cDashboardCounter) {
        this.b2cDashboardCounter = b2cDashboardCounter;
    }

    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();

        column1.addWidget("c2b");
        column1.addWidget("stk");

        column2.addWidget("b2b");
        column2.addWidget("waea");

        column3.addWidget("b2c");

        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
    }
    public DashboardModel getModel() {
        return model;
    }
}
