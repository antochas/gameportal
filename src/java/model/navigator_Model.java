/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author a
 */
public class navigator_Model {
    
    public static String jSPChooser(String path){
        switch (path) {
            case "/test1":
                return "/pages/testCat1";
            case "/test2":
                return "/pages/testCat2";
        }
        return "0";
    }
}
