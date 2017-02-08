package model;

public class Aresta {
    Vertice node1;
    Vertice node2; 
    String id;
    private String source;
    private String target;
    private int peso;

    public Aresta() {
    }

    
    public Vertice getNode1() {
        return node1;
    }

    public void setNode1(Vertice node1) {
        this.node1 = node1;
        this.source=node1.getId();
    }

    public Vertice getNode2() {
        return node2;
    }

    public void setNode2(Vertice node2) {
        this.node2 = node2;
        this.target=node2.getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
