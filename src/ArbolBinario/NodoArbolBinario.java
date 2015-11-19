package ArbolBinario;

public class NodoArbolBinario {

    private String Caracter;
    private Integer frecuencia;
    private NodoArbolBinario izq;
    private NodoArbolBinario der;

    public NodoArbolBinario(String Caracter, Integer frecuencia) {
        this.Caracter = Caracter;
        this.frecuencia = frecuencia;
        this.der = null;
        this.izq = null;
    }

    public String getCaracter() {
        return Caracter;
    }

    public void setCaracter(String Caracter) {
        this.Caracter = Caracter;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    public NodoArbolBinario getIzq() {
        return izq;
    }

    public void setIzq(NodoArbolBinario izq) {
        this.izq = izq;
    }

    public NodoArbolBinario getDer() {
        return der;
    }

    public void setDer(NodoArbolBinario der) {
        this.der = der;
    }
    
    
    
}
