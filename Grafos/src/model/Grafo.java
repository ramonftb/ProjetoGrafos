package model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Aresta;
import model.Vertice;


public class Grafo {
    private String nomeGrafo,tipoGrafo,lista;
    public List<Aresta> arestas = new ArrayList<Aresta>();
    public List<Vertice> vertices = new ArrayList<Vertice>();
    public String getNomeGrafo() {
        return nomeGrafo;
    }

    public void setNomeGrafo(String nome) {
        this.nomeGrafo = nome;
    }

    public String getTIpoGrafo() {
        return tipoGrafo;
    }

    public void setTipoGrafo(String tipo) {
        this.tipoGrafo = tipo;
    }

    public List<Aresta> getListaArestas() {
        return arestas;
    }
    public void setListaAresta(List<Aresta> aresta) {
        this.arestas = aresta;
    }
    public List<Vertice> getListaVertices() {
        return vertices;
    }

    public void setListaVertices(List<Vertice> vertice) {
        this.vertices = vertice;
    }
     public void addVertice(Vertice vertice){
        this.vertices.add(vertice);
    }
    public String removerVertice(String vertice){
        for(int i = 0; i < vertices.size();i++){
            if(vertices.get(i).id.equals(vertice)){
                vertices.remove(i);
                for(int a = 0; a < arestas.size();a++){
                    if(arestas.get(a).getNode1().getId().equals(vertice)){
                        arestas.remove(a);
                        
                    }
                }
                for(int a2 = 0; a2 < arestas.size();a2++){
                    if(arestas.get(a2).getNode2().getId().equals(vertice)){
                        arestas.remove(a2);
                        
                    }
                }
                return "Vertice "+ vertice+" removido com sucesso";
            }
        }
        return "removido";
    }
   public String EditarVertice(Grafo grafo,String vertice, String novo){
        for(int i = 0; i < grafo.getListaVertices().size();i++){
            if(grafo.getListaVertices().get(i).getId().equals(vertice)){
                grafo.getListaVertices().get(i).setId(novo);
                return "Vertice "+ vertice+" alterado com sucesso!\n" + vertice+"  --------->  "+novo;
            }
        }
        return "Erro! não foi possivel alterar";
    }
    public void addAresta(Aresta aresta) {
        this.arestas.add(aresta);
    }
    public String removerAresta(String no1,String no2){
        for(int i = 0; i <=arestas.size();i++){
            if(arestas.get(i).getNode1().getId().equals(no1)){
               for(int i2 = 0; i2 < arestas.size();i++){
                   if(arestas.get(i2).getNode2().getId().equals(no2)){
                      arestas.remove(i);
                      return "Aresta ("+no1+","+no2+") removido com sucesso";
                    }
                }
            }
        }
        return "removido";
    }
    public String EditarAresta(Grafo grafo,String no1,String no2,String novo){
         for(int a = 0; a < grafo.getListaArestas().size();a++){
                    if(grafo.getListaArestas().get(a).getNode1().getId().equals(no1)){
                      grafo.getListaArestas().get(a).getNode1().setId(no1);
                    }  
            }
          for(int a2 = 0; a2 < arestas.size();a2++){
                            if(grafo.getListaArestas().get(a2).getNode2().getId().equals(no2)){                                
                                grafo.getListaArestas().get(a2).getNode2().setId(novo);
                            }
                        }
        return "Alterado com sucesso!";
    } 
    public String getGrau(Grafo grafo) {
       String listaGrau = "";
        for (Aresta aresta : grafo.getListaArestas()) {
            aresta.getNode1().grau = 0;
            aresta.getNode2().grau = 0;
        }
        for (Aresta aresta : grafo.getListaArestas()) {
            aresta.getNode1().grau += 1;
            aresta.getNode2().grau += 1;
        }
            for (Vertice no : grafo.getListaVertices()) {

                listaGrau += "\n Grau Vertice " + no.getId() + " é " + no.getGrau();

            }
         
        return listaGrau;
    }
    public String getIncidentes(){
        String incidentes = "";
            for (Aresta aresta : getListaArestas()) {
                incidentes += " Os Vertices " + aresta.getNode1().getId() + " e " + aresta.getNode2().getId() + " são incidente com a aresta ("+ 
                         aresta.getNode1().getId() + "," + aresta.getNode2().getId()+")\n";
            }
            return incidentes;
    }
    public String getAdjacentes(){
        String adjacentes = "";
            for (Aresta aresta : arestas) {
                adjacentes += " Os Vertices " + aresta.getNode1().getId() + " e " + aresta.getNode2().getId() + " são adjacentes \n";
            }
         return adjacentes;
    }
    
    public String matrizIncidencia(Grafo grafo) {
        String incidencia = " ";
        String espaco = " ";
        int index = 0, i, j;
        int size1 = grafo.getListaVertices().size();
        int size2 = grafo.getListaArestas().size();
        int matriz[][] = new int[size1][size2];
        for (Aresta aresta : grafo.getListaArestas()) {
            int no1 = grafo.getListaVertices().indexOf(aresta.getNode1());
            int no2 = grafo.getListaVertices().indexOf(aresta.getNode2());
            
            matriz[no1][index] = 1;
            matriz[no2][index] = 1;
            index++;
        }
        for (int a = 0; a < size1; a++) {
            incidencia += espaco + grafo.getListaVertices().get(a).getId();
        }
        for (i = 0; i < size1; i++) {
            incidencia += "\n" + grafo.getListaVertices().get(i).getId();
            for (j = 0; j < size2; j++) {
                incidencia += espaco + matriz[i][j];
            }
        }
        return incidencia;
    }
    public String listaAdjacencia(Grafo grafo) {
        String lista = "";
         int size = grafo.getListaVertices().size(), i, j;
        int matriz[][] = new int[size][size];
        for (Aresta aresta : grafo.getListaArestas()) {
            int no1 = grafo.getListaVertices().indexOf(aresta.getNode1());
            int no2 = grafo.getListaVertices().indexOf(aresta.getNode2());
            matriz[no1][no2] = 1;
             matriz[no2][no1] = 1;
        }
        for (i = 0; i < size; i++) {
            lista += "\n" + grafo.getListaVertices().get(i).getId();
            for (j = 0; j < size; j++) {
                if (matriz[i][j] == 1) {
                    lista += " ->" + grafo.getListaVertices().get(j).getId();
                }
            }
        }
      return lista;  
    
    }
    public String matrizAdjacencia(Grafo grafo) {
        String espaco = " ";
        int size = grafo.getListaVertices().size(), i, j;
        int matriz[][] = new int[size][size];
        String matrizTotal = "";
        for (Aresta aresta : grafo.getListaArestas()) {
            int no1 = grafo.getListaVertices().indexOf(aresta.getNode1());
            int no2 = grafo.getListaVertices().indexOf(aresta.getNode2());
            matriz[no1][no2] = 1;
            matriz[no2][no1] = 1;
        }
        for (int a = 0; a < size; a++) {
            matrizTotal += espaco + grafo.getListaVertices().get(a).getId();
        }
        for (i = 0; i < size; i++) {
            matrizTotal += "\n" + grafo.getListaVertices().get(i).getId();
            for (j = 0; j < size; j++) {
                matrizTotal += espaco + matriz[i][j];
            }
        }
        return (matrizTotal);
    }
    public String geraGrafico(Grafo grafo){
        int a,v;
        String lista = "digraph G {\n";
        for (a = 0; a < grafo.getListaArestas().size();a++) {
            lista +=  grafo.getListaArestas().get(a).getSource() + " -> " +  grafo.getListaArestas().get(a).getTarget() + "[label=" +  grafo.getListaArestas().get(a).getPeso() + "];\n";

        }
        if(grafo.getListaArestas().size() > 0){
            for (v = a; v < grafo.getListaVertices().size();v++) {
            lista += grafo.getListaVertices().get(v).getId()+";\n";

            }
        }
        lista += "}";
      return lista;  
    }
     public String conjunto(Grafo grafo) {
        String conjunto, no = "", arestas = "";
        for (Vertice vertice : grafo.getListaVertices()) {
            no += vertice.getId() + " --> ";
        }
        for (int i =0; i < getListaArestas().size();i++) {
            arestas += getListaArestas().get(i).getNode1().getId()+","+getListaArestas().get(i).getNode2().getId() + " --> ";
        }
        conjunto = "Vértices \n" + no + "\n Arestas \n" + arestas;
        return conjunto;
    }
  
}
