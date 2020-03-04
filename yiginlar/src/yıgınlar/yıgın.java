/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yıgınlar;

/**
 *
 * @author Mücahit ÇELİK
 */
public class yıgın {
    private yıgınNode ust,temp;
    
    
    public yıgın(){
        ust=null;
    }
    public void koy(int eleman){
        yıgınNode x=new yıgınNode(eleman);
        x.sonraki=ust;
        ust=x;
    }
    public boolean bosMu(){
        if(ust==null)
            return true;
        else 
            return false;
    }
    public int ustAlma(){
        if(bosMu()){
            System.out.println("yığın Boş");
            
        return -1;}
        
   temp=ust;
   ust=ust.sonraki;
   return temp.eleman;
}  
    public void listele(){
        if(bosMu()){
            System.out.println("Boş");
        }else 
            temp=ust;
            while(ust!=null){
                System.out.println(ust.eleman);
                ust=ust.sonraki;
            }
    }
    
    
}    

