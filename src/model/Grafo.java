/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Grafo {

    private String id, edgedefault;
    private List<Vertice> listaVertice = new ArrayList<Vertice>();
    private List<Aresta> listaAresta = new ArrayList<Aresta>();

    public Grafo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdgedefault() {
        return edgedefault;
    }

    public void setEdgedefault(String edgedefault) {
        this.edgedefault = edgedefault;
    }

    public List<Vertice> getListaVertice() {
        return listaVertice;
    }

    public void setListaVertice(List<Vertice> listaVertice) {
        this.listaVertice = listaVertice;
    }

    public List<Aresta> getListaAresta() {
        return listaAresta;
    }

    public void setlistaAresta(List<Aresta> Aresta) {
        this.listaAresta = listaAresta;
    }

    public void addAresta(Aresta aresta) {
        this.listaAresta.add(aresta);
    }
}
