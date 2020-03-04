/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ağaclar;



public class Avlagac {
    AvlDugum kok;
    int b=0;
    
    public Avlagac(){
    kok=null;
    
}
    public AvlDugum rotateRight(AvlDugum k1){
        AvlDugum k2=k1.sag;
        k1.sag=k2.sol;
        k2.sol=k1;
        return k2;
        
    }
    public AvlDugum rotateLeft(AvlDugum k2){
        AvlDugum k1 =k2.sol;
        k2.sol=k1.sag;
        k1.sag=k2;
        return k1;
    }
    public AvlDugum doubleRotateRight(AvlDugum k1){
        k1.sag=rotateLeft(k1.sag);
        return rotateRight(k1);
    }
    public AvlDugum doubleRotateLeft(AvlDugum k3){
        k3.sol=rotateRight(k3.sol);
        return rotateLeft(k3);

      }
    private int height(AvlDugum t){
        return t==null ? -1: t.boy;
    }
    private int max(int lhs,int rhs){
        return lhs>rhs ? lhs:rhs;
        
    }


}

