/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.pagecontroller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author BADEMBA
 */
@ManagedBean(name = "pageController")
@SessionScoped
public class PageController implements Serializable{

   private static final long serialVersionUID = 1L;
    public String C2BValidationPageContoller(){
    
         
        return "/C2BValidation.xhtml";
    }
    public String homePageController(){
        return "index";
    }
    
    
}
