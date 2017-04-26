/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.webvalor.aphoras.beans;

import java.io.IOException;

import javax.enterprise.inject.Model;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Felipe
 */
@Model
public class AuthenticationBean {
    
    public String doLogin() throws IOException, ServletException{
        ExternalContext context =FacesContext.getCurrentInstance().getExternalContext();
        RequestDispatcher dispatcher =  ((ServletRequest) context.getRequest())
                .getRequestDispatcher("/j_spring_security_check_");
        dispatcher.forward((ServletRequest)context.getRequest(), (ServletResponse)context.getResponse());
        FacesContext.getCurrentInstance().responseComplete();
        return null;
    }
    
    public String doLogout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "logout";
    }
}
