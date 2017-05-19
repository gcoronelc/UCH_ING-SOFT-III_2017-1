/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.uch.java.security;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 *
 * @author sac
 */
public class uchCallbackHandler implements CallbackHandler {

    public void handle(Callback[] callbackArray) throws IOException, UnsupportedCallbackException {
        
        NameCallback nameCallback = null;
        PasswordCallback passwordCallback = null;
        int contador = 0;
       
        while (contador < callbackArray.length) {
            
            if (callbackArray[contador] instanceof NameCallback) {
                
                nameCallback = (NameCallback) callbackArray[contador++];
                System.out.println(nameCallback.getPrompt());
                nameCallback.setName((new BufferedReader(new InputStreamReader(System.in))).readLine());
                
            } else if (callbackArray[contador] instanceof PasswordCallback) {
                
                passwordCallback = (PasswordCallback) callbackArray[contador++];
                System.out.println(passwordCallback.getPrompt());
                passwordCallback.setPassword((new BufferedReader(new InputStreamReader(System.in))).readLine().toCharArray());

            }
        }
    }
}
