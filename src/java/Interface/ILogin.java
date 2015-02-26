/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import database.model.Users;

/**
 *
 * @author a
 */
public interface ILogin {
    public String validateLogin(String username, String password);    
}
