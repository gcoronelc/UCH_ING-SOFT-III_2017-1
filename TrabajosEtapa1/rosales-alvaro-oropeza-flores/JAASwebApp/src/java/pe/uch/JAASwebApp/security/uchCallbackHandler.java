/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uch.JAASwebApp.security;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class uchCallbackHandler implements CallbackHandler {

    private String user = null;
    private String password = null;

    public uchCallbackHandler(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public void handle(Callback[] callbackArray) throws IOException, UnsupportedCallbackException {
        int contador = 0;
        while (contador < callbackArray.length) {

            if (callbackArray[contador] instanceof NameCallback) {
                NameCallback nameCallback = (NameCallback) callbackArray[contador++];
                nameCallback.setName(user);
                
            } else if (callbackArray[contador] instanceof PasswordCallback) {
                
                PasswordCallback passwordCallback = (PasswordCallback) callbackArray[contador++];
                passwordCallback.setPassword(password.toCharArray());
            }
        }
    }

}
