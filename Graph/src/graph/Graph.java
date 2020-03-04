/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Ogrenci
 */
public class Graph {

    private boolean adjMatrix[][];
    private int numVertices;
    public Graph(int numVertices){
        this.numVertices=numVertices;
        adjMatrix=new boolean[numVertices][numVertices];
    }
    public void addEdge(int i,int j){//düğümler arası bağlantı ekler 
        adjMatrix[i][j]=true;
        adjMatrix[j][i]=true;
    }
    public void removeEdge(int i,int j)//düğümler arası ilişkiyi kaldırma
    {
        adjMatrix[i][j]=false;
        adjMatrix[j][i]=false;
    }
    public boolean isEdge(int i,int j){//iki düğüm arasında ilişki var mı
        return adjMatrix[i][j];
    }
    public String toString(){//çıktının görünmesini sağlayan fonksiyon
        StringBuilder s=new StringBuilder();
        for(int i=0;i<numVertices;i++){
            s.append(i+": ");
            for(boolean j:adjMatrix[i])
            {
                s.append((j?1:0)+" ");
            }
            s.append("\n");
       }
        return s.toString();
    }
    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        
        System.out.println(g.toString());
    }
    
}
