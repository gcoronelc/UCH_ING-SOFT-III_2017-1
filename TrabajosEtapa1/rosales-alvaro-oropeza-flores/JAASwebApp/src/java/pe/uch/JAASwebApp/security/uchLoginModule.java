/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uch.JAASwebApp.security;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import javax.swing.JOptionPane;

/**
 *
 * @author sac
 */
public class uchLoginModule implements LoginModule {
    public static final String TEST_USERNAME = "sac";
    public static final String TEST_PASSWORD = "123456";
    private CallbackHandler callbackHandler = null;
    private boolean authenticationSuccessFlag = false;
    
    @Override
    public void initialize(Subject sbjct, CallbackHandler callbackHandler, Map<String, ?> map, Map<String, ?> map1) {
        this.callbackHandler= callbackHandler;
    }

    @Override
    public boolean login() throws LoginException {
        
        Callback[] callbackArray = new Callback[2];
        callbackArray[0] = new NameCallback("user");
        callbackArray[1] = new PasswordCallback("Password",false);
        
        try {
            callbackHandler.handle(callbackArray);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (UnsupportedCallbackException ex) {
            ex.printStackTrace();
        }
        
        String name = ((NameCallback) callbackArray[0]).getName();
        String password = new String (((PasswordCallback)callbackArray[1]).getPassword());
        if (TEST_USERNAME.equals(name)&& TEST_PASSWORD.equals(password)) {
            System.out.println("autenticacion realizada...");
            authenticationSuccessFlag = true; 
        }else {
            authenticationSuccessFlag = false;
            throw new FailedLoginException("autenticacion fallida...");
        }
        return authenticationSuccessFlag;
    }

    @Override
    public boolean commit() throws LoginException {
        return authenticationSuccessFlag;
    }

    @Override
    public boolean abort() throws LoginException {
        return false;
    }

    @Override
    public boolean logout() throws LoginException {
        return false;
    }
     
}
