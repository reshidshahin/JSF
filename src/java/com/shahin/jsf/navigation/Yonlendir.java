/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahin.jsf.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Shahin_Rashidbayli
 */
@ManagedBean
@RequestScoped
public class Yonlendir {
    int reqem;

    public int getReqem() {
        return reqem;
    }

    public void setReqem(int reqem) {
        this.reqem = reqem;
    }
    
    public String yonlendir(){
        if(reqem>50){
            return "boyuk?faces-redirect=true";
        }else{
            return "kicik?faces-redirect=true";
        }
    }
    
}
