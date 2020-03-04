/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splaytrees;

/**
 *
 * @author kubraocal
 */
public class Kurucu {
    Kurucu sol,sag,parent;
    int element;
    public Kurucu(){
        this(0,null,null,null);
    }
    public Kurucu(int ele){
        this(ele,null,null,null);
    }
    public Kurucu(int ele,Kurucu sol,Kurucu sag,Kurucu parent)
    {
        this.sol=sol;
        this.sag=sag;
        this.parent=parent;
        this.element=ele;
    }
}
