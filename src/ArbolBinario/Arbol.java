package ArbolBinario;

public class Arbol {

    private NodoArbolBinario raiz;

    public NodoArbolBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolBinario raiz) {
        this.raiz = raiz;
    }

    public Arbol() {
        raiz = null;
    }

    public Arbol(String s, Integer suma) {
        raiz = new NodoArbolBinario(s, suma);
    }

    public void AgregarHojas(NodoArbolBinario izq, NodoArbolBinario der) {
        raiz.setIzq(izq);
        raiz.setDer(der);
    }
}
