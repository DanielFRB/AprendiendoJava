package EstructurasDeDatos;

/**
 * @author danfe
 */

public class PilasOperations {
    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();
        System.out.println("<<-- Ejemplo de Pila -->>");
        pila.agregarNodo(4);
        pila.agregarNodo(16);
        pila.agregarNodo(12);
        pila.agregarNodo(8);
        pila.agregarNodo(65);
        System.out.println("<<-- Pila -->>");
        pila.listarPila();
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getSize());
        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.eliminarNodoTop();
        pila.listarPila();
        System.out.println("Tamaño: " + pila.getSize());
        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 16 por 24 -->>");
        pila.editarNodo(16, 24);
        pila.listarPila();
        System.out.println("Tamaño: " + pila.getSize());
        System.out.println("\n<<-- Eliminar el nodo con el valor 24 -->>");
        pila.eliminarNodo(24);
        pila.listarPila();
        System.out.println("Tamaño: " + pila.getSize());
        System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
        System.out.println(pila.buscarNodo(65));
        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminarPila();
        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.estaVacia());
        
        System.out.println("\n<<-- Fin de ejemplo pila -->>");
    }
}

class Nodo {
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }
        
    public int getValor() {
        return valor;
    }
        
    public void setValor(int valor) {
        this.valor = valor;
    }
        
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  
        
    private int valor;
    private Nodo siguiente;
}

class Pila {
    public Pila() {
        inicio = null;
        size = 0;
    }
        
    public boolean estaVacia() {
        return inicio == null;
    }
        
    public int getSize() {
        return size;
    }
        
    public void agregarNodo(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        size++;
    }
        
    public void eliminarNodoTop() {
        if (!estaVacia()) {
            inicio = inicio.getSiguiente();
            size--;
        }
    }
        
    public int getNodoTop() throws Exception {
        if (!estaVacia()) {
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
        
    public boolean buscarNodo(int referencia) {
        Nodo aux = inicio;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (referencia == aux.getValor()) {
                existe = true;
            }
            else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }
        
    public void eliminarNodo(int referencia) {
        if (buscarNodo(referencia)) {
            Nodo pilaAux = null;
            while (referencia != inicio.getValor()) {
                Nodo temp = new Nodo();
                temp.setValor(inicio.getValor());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                eliminarNodoTop();
            }
            eliminarNodoTop();
            while (pilaAux != null) {
                agregarNodo(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }
        
    public void editarNodo(int referencia, int valor) {
        if (buscarNodo(referencia)) {
            Nodo pilaAux = null;
            while (referencia != inicio.getValor()) {
                Nodo temp = new Nodo();
                temp.setValor(inicio.getValor());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                eliminarNodoTop();
            }
            inicio.setValor(valor);
            while (pilaAux != null) {
                agregarNodo(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }
            
    public void eliminarPila() {
        inicio = null;
        size = 0;
    }
    
    public void listarPila(){
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("|\t"+ aux.getValor() +"\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
        
    private Nodo inicio;
    private int size;
}
