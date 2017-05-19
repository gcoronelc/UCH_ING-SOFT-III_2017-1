/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.uch.java.security;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

/**
 *
 * @author sac
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.security.auth.login.config", "Jaas.config");
        LoginContext loginContext=null;
        try {
            loginContext = new LoginContext("JaasPrueba", new uchCallbackHandler());
        } catch (LoginException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(0);
        }
        while(true){
            try {
                loginContext.login();
                System.exit(0);
            } catch (LoginException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
