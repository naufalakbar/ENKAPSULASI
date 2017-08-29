/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

/**
 *
 * @author khardie
 */
public class bola {
    
    private double jari;
    
    public void setjari(double jari){
        this.jari = jari;
    }
    public void showd() {
        double Diameter = this.jari * 2;
        System.out.println("Diameter = "+ Diameter);
    }
    public void showv(){
        double volume = Math.PI * this.jari *this.jari *this.jari *3/4;
        System.out.println("Volume Bola = "+volume);
    }
    public void showl() {
        double Luas = 2 * Math.PI * this.jari * this.jari;
        System.out.println("Luas Bola = "+ Luas);
    }
}
