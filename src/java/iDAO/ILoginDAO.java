/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iDAO;

import database.model.Users;


/**
 *
 * @author a
 */
public interface ILoginDAO {
    public Users fetchUserByUsername(String uname);
    public Users fetchUserByEmail(String email);
}
