package domain;

public class ListaEncadeada {
    private Node primeiro, ultimo;

    public ListaEncadeada(){
        primeiro = null;
        ultimo = null;
    }

    public boolean listaVazia(){
        return primeiro == null;
    }

    public void inserirInicio(int elemento) {
        Node newNode = new Node(elemento);

        if(listaVazia()){
            this.ultimo = newNode;
        } else {
            newNode.setProximo(this.primeiro);
        }

        this.primeiro = newNode;
    }

    public void inserirFinal(int elemento) {
        Node newNode = new Node(elemento);

        if(listaVazia())
            this.primeiro = newNode;
        else
            this.ultimo.setProximo(newNode);

        this.ultimo = newNode;
    }

    public boolean removerNode(int elemento){
        boolean encontrou = false;
        Node nodeTemp = primeiro;
        Node nodeAnterior = null;

        while (nodeTemp != null && !encontrou) {
            if (nodeTemp.getElemento() == elemento){
                encontrou = true;
            }
            else {
                nodeAnterior = nodeTemp;
                nodeTemp = nodeTemp.getProximo();
            }
        }
        if (encontrou) {
            if (nodeTemp == primeiro) // se o elemento está no primeiro Node
                primeiro = nodeTemp.getProximo();
            else
                nodeAnterior.setProximo(nodeTemp.getProximo());

            if (nodeTemp == ultimo) // elemento está no último Node
                ultimo = nodeAnterior;
        }
        if (!listaVazia())
            System.out.println("\nPrimeiro: " + primeiro.getElemento() + " Último: " + ultimo.getElemento());

        return encontrou;
    }

    public int contarNodes() {
        int tamanho = 0;
        Node nodeTemp = primeiro;

        while (nodeTemp != null) {
            tamanho = tamanho + 1;
            nodeTemp = nodeTemp.getProximo();
        }

        return tamanho;
    }

    public void visualizarLista() {
        Node nodeTemp = primeiro;

        while (nodeTemp != null){
            System.out.println("Elemento " + nodeTemp.getElemento());
            nodeTemp = nodeTemp.getProximo();
        }
    }
}
