/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Aresta {
    Vertice vertice;
    Vertice vertice1; 
    String id, source, target;

    public Aresta() {
    }

    // retorna o vertice 
    public Vertice getVertice() {
        return vertice;
    }
    // 
    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
        this.source = vertice.getId();
    }

    public Vertice getVertice1() {
        return vertice1;
    }

    public void setVertice1(Vertice vertice1) {
        this.vertice1 = vertice1;
        this.target = vertice1.getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
