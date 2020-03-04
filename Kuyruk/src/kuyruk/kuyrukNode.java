/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyruk;


public class kuyrukNode {
    public String ad;
    public kuyrukNode sonraki;
    public kuyrukNode(String ad){
        this.ad=ad;
        this.sonraki=null;    
    }    
}
class kuyrukk{
    public int boyut;
    public kuyrukNode bas,son;
    
    public kuyrukk(){
        bas=null;
        son=null;
        boyut=0; 
    }
    public void ekle(String ad){
        kuyrukNode yeni=new kuyrukNode(ad);
        if(bas==null){
            bas=yeni;
            bas.sonraki=bas;
            son=bas;
        }else{
            son.sonraki=yeni;
            son=yeni;
            boyut++;
        }
    }
    public kuyrukNode Cekme(){
        kuyrukNode b;
        b=bas;
        bas=bas.sonraki;
        boyut--;
        return b;  
    }
    public void listele(){
        kuyrukNode aktif;
        aktif=bas;
        if(aktif==null){
            System.out.println("Boş");
        }else{
            while(aktif!=null){
                System.out.println(aktif.ad);
                aktif=aktif.sonraki;
            }
        }
    }
    
}