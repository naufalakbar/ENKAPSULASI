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
public class testbola {
 
    public static void main(String[] args){
        
        double jari = 10;
        
        System.out.println("Jari-Jari: "+jari);
        
        bola bunder = new bola();
        
        bunder.setjari(jari);
        
        bunder.showd();
        
        bunder.showl();
        
        bunder.showv();
        
        
    }
}
