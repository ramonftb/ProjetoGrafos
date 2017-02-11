package model;

import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {
    String id;
    int grau;
    private int distancia;
    private boolean visitado = false;
    private Vertice pai;
    private List<Aresta> arestas = new ArrayList<Aresta>();
    public Vertice() {
    }

    public String getId() {
        return id;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public List<Aresta> getListaArestas() {
        return arestas;
    }

    public void setListaArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }

    @Override
    public int compareTo(Vertice vertice) {
        if (this.getDistancia() < vertice.getDistancia()) {
            return -1;
        } else if (this.getDistancia() > vertice.getDistancia()) {
            return 1;
        }

        return 0;
    }
    public void visitar() {
        this.visitado = true;
    }

    public boolean verificarVisita() {
        return visitado;
    }
    
    
}
