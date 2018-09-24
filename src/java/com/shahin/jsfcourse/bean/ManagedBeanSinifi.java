
package com.shahin.jsfcourse.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ManagedBeanSinifi implements Serializable{

    String isimSoyisim;
    String adres;
    String il;
    String parola;
    String ehliyetVarMi;
    String mesaj;
    List<String> cinsiyet = new ArrayList<String>();
    boolean kabulEdildiMi;

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEhliyetVarMi() {
        return ehliyetVarMi;
    }

    public void setEhliyetVarMi(String ehliyetVarMi) {
        this.ehliyetVarMi = ehliyetVarMi;
    }

    public String getMesaj() {
        if (!kabulEdildiMi) {
            mesaj = "Sartlari kabul etmediniz!";
        } else {
            mesaj = "Sartlari kabul ettiniz!";
        }
        return mesaj;
    }

//    public void setMesaj(String mesaj) {
//        this.mesaj = mesaj;
//    }

    public List<String> getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(List<String> cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public boolean isKabulEdildiMi() {
        return kabulEdildiMi;
    }

    public void setKabulEdildiMi(boolean kabulEdildiMi) {
        this.kabulEdildiMi = kabulEdildiMi;
    }
}
