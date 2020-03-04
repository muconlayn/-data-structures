/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list;


public class LinkedListDene {

  
    public static void main(String[] args) {
        bizimLL list=new bizimLL();
        list.basaEkle(2);
        list.basaEkle(7);
        list.basaEkle(4);
        list.Listele();
        
        System.out.println("  ");
        list.sonaEkle(9);
        list.bastanSil();
        list.sondanSil();
        list.Listele();
        

    }
    
}
