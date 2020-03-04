/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splaytrees;


public class Olay {
    
    private Kurucu kok;
    private int count=0;        
    public Olay(){
        kok = null;
    }
    public boolean bos(){
    return kok == null;
    }        
    public void ekle(int ele){ //ana fonksiyondan çağırıldıkça ekleme yapılır.
    Kurucu z = kok;
    Kurucu p = null;
    while (z != null){ //burada yer belirleniyor
        p = z;
        if(ele > p.element)
            z = z.sag;
        else
             z = z.sol;
        }
        z = new Kurucu(); //burada yuvarlak oluşturuluyo
        z.element = ele; //burada ekleme yapılır.
        z.parent = p;
        if(p == null)
            kok = z; 
        else if(ele > p.element)
             p.sag = z;
        else
            p.sol = z;
    Splay(z); // farklı bir fonksiyon
    count++;
    }
    public void SolCocukEbeveynOlur(Kurucu c, Kurucu p){
            if ((c == null) || (p == null) || (p.sol != c) || (c.parent != p))
                throw new RuntimeException("Hata");
            if(p.parent != null){
                if(p == p.parent.sol)
                    p.parent.sol = c;
                else
                    p.parent.sag = p;
                c.parent = p.parent;
                p.parent = c;
                p.sol = c.sag;
                c.sag = p; 
            }
    }
     public void SagCocukEbeveynOlur(Kurucu c, Kurucu p){
            if ((c == null) || (p == null) || (p.sag != c) || (c.parent != p))
                throw new RuntimeException("Hata");
            if(p.parent != null){
                if(p == p.parent.sol)
                    p.parent.sol = c;
                else
                    p.parent.sag = p;
                if(c.sol!=null)
                    c.sol.parent=p;
                c.parent = p.parent;
                p.parent = c;
                p.sag = c.sol;
                c.sol = p; 
            }
    }
    public void Splay(Kurucu x)
    {
        Kurucu parent=x.parent;
        Kurucu GrandParent=parent.parent;
        if(GrandParent==null)
        {
            if(x==parent.sol)
                SagCocukEbeveynOlur(x,parent);
            else
                SolCocukEbeveynOlur(x,parent);
        }
        else{
            if(x==parent.sol)
            {
                if(parent==GrandParent.sol)
                {
                    SolCocukEbeveynOlur(parent,GrandParent);
                    SolCocukEbeveynOlur(x,parent);
                }
                else{
                    SolCocukEbeveynOlur(x,x.parent);
                    SagCocukEbeveynOlur(x,x.parent);
                }
            }
            else{
                if(parent==GrandParent.sol)
                {
                    SagCocukEbeveynOlur(x,x.parent);
                    SolCocukEbeveynOlur(x,x.parent);
                }
                else
                {
                    SagCocukEbeveynOlur(parent,GrandParent);
                    SagCocukEbeveynOlur(x,parent);
                }
            }
        }
        kok=x;
    }
}
