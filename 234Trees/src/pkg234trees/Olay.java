/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg234trees;

/**
 *
 * @author kubraocal
 */
public class Olay {
    Kurucu kok;
    int size;
    public Olay(){
        kok=null;
        size=0;
    }
    
    public String toString(){ //Burada ne demek istedi...
        if(kok==null)
        {
            return "";
        }
        else{
            return kok.toString();
        }
    }
    
}
