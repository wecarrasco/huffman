package ClasesParaHuffman;

public class listaNodosHuffman {

    NodoHuffman head;

    public listaNodosHuffman() {
        this.head = null;
    }

    public NodoHuffman getHead() {
        return head;
    }

    public void setHead(NodoHuffman head) {
        this.head = head;
    }

    
    public void add(String ch) {
        NodoHuffman nuevo = new NodoHuffman(ch);
        if (head == null) {
            head = nuevo;
        } else {
            NodoHuffman temp = head;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
        }
    }
    
    public void textToList(String texto){
        for (int i = 0; i < texto.length(); i++) {
            this.add(String.valueOf(texto.charAt(i)));
        }
    }
    
    public void recorrer(){
		if(head == null)
			System.out.println("no hay head");
		else{
			NodoHuffman temp = this.getHead();
			
			while(temp != null){
				System.out.print(" -> "+temp.getCaracter());
				temp = temp.getSiguiente();
			}
			
		}
	}
}
