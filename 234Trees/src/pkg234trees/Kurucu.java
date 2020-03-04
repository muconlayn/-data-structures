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
public class Kurucu {
    
    int keys;
    int key1;
    int key2;
    int key3;
    Kurucu anne;
    Kurucu cocuk1;
    Kurucu cocuk2;
    Kurucu cocuk3;
    Kurucu cocuk4;
    
    public Kurucu(int key)
    {
        keys=1;
        key1=key;
        anne=null;
        cocuk1=null;
        cocuk2=null;
        cocuk3=null;
        cocuk4=null;
    }
}
