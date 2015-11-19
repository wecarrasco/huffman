package ClasesParaHuffman;

public class NodoHuffman {
    String caracter;
    NodoHuffman siguiente;

    public NodoHuffman() {
        
    }

    public NodoHuffman(String caracter) {
        this.caracter = caracter;
        this.siguiente = null;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public NodoHuffman getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHuffman siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
