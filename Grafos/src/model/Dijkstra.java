package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {

   
    private Vertice caminho = new Vertice(); 
    private Vertice verticeAtual = new Vertice(); 
    private Vertice vizinho = new Vertice();  
    
    private int mudarLinha = 10; 
    
    private List<Vertice> menorCaminho = new ArrayList<Vertice>(); 
    private List<Vertice> naoVisitados = new ArrayList<Vertice>();
    
    public List<Vertice> menorCaminho(Grafo grafo, Vertice vertice1, Vertice vertice2) {
        for (Vertice no : grafo.getListaVertices()) {
            for (Aresta aresta : grafo.getListaArestas()) {
                if (no.equals(aresta.getNode1())) {
                    no.getListaArestas().add(aresta);
                }
            }
        }
        menorCaminho.add(vertice1);
        for (int i = 0; i < grafo.getListaVertices().size(); i++) {
            if (grafo.getListaVertices().get(i).equals(vertice1)) {
                grafo.getListaVertices().get(i).setDistancia(0);
                naoVisitados.add(grafo.getListaVertices().get(i));
            } else {
                grafo.getListaVertices().get(i).setDistancia(9999);
                grafo.getListaVertices().get(i).setVisitado(false);
                naoVisitados.add(grafo.getListaVertices().get(i));
            }
        }
        Collections.sort(naoVisitados);
        while (!naoVisitados.isEmpty()) {
            verticeAtual = naoVisitados.get(0);
            for (int i = 0; i < verticeAtual.getListaArestas().size(); i++) {
                vizinho = verticeAtual.getListaArestas().get(i).getNode2();
                
                if (!vizinho.verificarVisita()) {
                    int distancia = verticeAtual.getDistancia() + verticeAtual.getListaArestas().get(i).getPeso();
                    
                    if (vizinho.getDistancia() > distancia) {
                        vizinho.setDistancia(distancia);
                        vizinho.setPai(verticeAtual);
                       
                        if (vizinho.equals(vertice2)) {
                            menorCaminho.clear();
                            caminho = vizinho;
                            menorCaminho.add(vizinho);
                           
                            while (caminho.getPai() != null) {
                                menorCaminho.add(caminho.getPai());
                                caminho = caminho.getPai();
                            }
                            Collections.sort(menorCaminho);
                        }
                    }
                }
            }
            
            verticeAtual.visitar();
            this.naoVisitados.remove(verticeAtual);
            
            Collections.sort(naoVisitados);
        }
        return menorCaminho;
    }
}
