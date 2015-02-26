/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.LoginDAO;
import Interface.ILogin;
import database.model.Users;

/**
 *
 * @author a
 */
public class LoginModel implements ILogin{

    @Override
    public String validateLogin(String username, String password) {
        
        String result = "/index";
        Users users;
        
        LoginDAO ld = new LoginDAO();
        if(!username.contains("@")){
        
            users = ld.fetchUserByUsername(username);
            
        }
        else{
        
            users = ld.fetchUserByEmail(username);
        
        }
        
        if(users == null ){
        
            result = "/pages/categories/testCat.jsp";
            
        }
        else{
        
            if(users.getPassword().equals(password)){
            
                result = "/index.jsp";
            
            }
            else{
            
                result = "/pages/categories/testCat2.jsp";
            
            }
            
        }
        
        
        
        return result;
    }


    
}
