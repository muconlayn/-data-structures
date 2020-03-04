
package linked.list;


public class bizimLL {
    Eleman bas,son;
    public bizimLL(){
        bas=null;
        son=null; 
    }
    public void bubbleSort(){
        if(!doluMu()){
            System.out.println("Zaten Eleman Yoooh ");} // Listede Eleman yok
        else if(bas==son){
            System.out.println("Tek Eleman Var "); // Tek Eleman Var 
        }else {
            //BubbleSort Başlar
            boolean degisiklikYapildiMi = true;
            Eleman birinci;
            Eleman ikinci;
            Eleman onceki;
            while(degisiklikYapildiMi){
                degisiklikYapildiMi=false;
               birinci=bas;
               ikinci=birinci.siradaki;
               if(ilkiBuyukMu(birinci, ikinci)){
                   yerDegistir(null, birinci, ikinci);
                   degisiklikYapildiMi=true;
               }
               
            }
            
        }  }
    public boolean ilkiBuyukMu(Eleman birinici,Eleman ikinci){
        if(birinici.sayi>=ikinci.sayi){
            return true;
        }else {
            return false;
        }
    }
        // birinci ve ikinci elemanın yerlerini değiştirir.
        public void yerDegistir(Eleman onceki,Eleman birinci, Eleman ikinci ){
            if(birinci==bas){//birinci eleman bas ise 
                if(ikinci==son){//ikinicide sonda yer alıyor
                    ikinci.siradaki=birinci;
                    birinci.siradaki=null;
                    son=birinci;
                    bas=ikinci;
                }else{
                    birinci.siradaki = ikinci.siradaki;
                    ikinci.siradaki=birinci;
                    ikinci=bas;   
                } 
                }else if( ikinci==son){ 
                        ikinci.siradaki=birinci;
                        birinci.siradaki=null;
                        onceki.siradaki=ikinci;
                        son=birinci;
                        
                        }else { //birinci ikinci listenin icinde 
                    birinci.siradaki=ikinci.siradaki;
                    ikinci.siradaki=birinci;
                    onceki.siradaki=ikinci;
                }
                        
                        
        }
        
         
    
     public boolean doluMu(){
        if(bas !=null){
           return true;
        }else {
            return false;
        }
    }
    public void basaEkle(int sayi){
        Eleman yeniEleman=new Eleman(sayi);
        if(doluMu()){
            //Liste Dolu
            yeniEleman.siradaki=bas;
            bas=yeniEleman;
        }else {//Liste Boş
            bas=yeniEleman;
            son=yeniEleman;
            
        }
    }
    public void sonaEkle(int sayi){
        Eleman yeniEleman=new Eleman(sayi);
        if(doluMu()){
            son.siradaki=yeniEleman;
            son=yeniEleman;   
        }else{
           bas=yeniEleman;
           son=yeniEleman;
        }  
    }
    public void bastanSil(){
        if(doluMu()){
            if(bas==son){//Listede Tek Eleman Var
                bas=null;
                son=null;
            }else{
                Eleman yeniBas =bas.siradaki;
                bas.siradaki=null;
                bas=yeniBas;   
            }
        }
    }
    public void sondanSil(){
        if(doluMu()){
            if(bas==son){
                bas=null;
                son=null;
            }else{
                Eleman isaretci=bas;
                while(isaretci.siradaki != son){
                    isaretci=isaretci.siradaki;   
                }
                isaretci.siradaki=null;
                son=isaretci;
            }
        }
    }
    public void Listele(){
        Eleman gecici=bas;
        int sayac=0;
        if(doluMu()){
          while(gecici!=null){
            System.out.println(gecici.sayi + " ");
            gecici=gecici.siradaki;
            sayac++;
              
        }  
          System.out.println("Eleman Sayısı"+ sayac);
        }else{
            System.out.println("Liste Boş");
        }     
         
    }  
}
