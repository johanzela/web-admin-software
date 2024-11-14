/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JOHAN ZELA
 */
public class login {
    private String us;
    private String contra;

    public login() {
    }

    public login(String us, String contra) {
        this.us = us;
        this.contra = contra;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }
    
    
}