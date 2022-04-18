import domain.ListaEncadeada;

import java.util.LinkedList;
import java.util.List;

public class ListaEncadeadaApp {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        list.inserirInicio(1);
        list.inserirInicio(2);
        list.inserirInicio(3);
        list.inserirInicio(4);
        list.inserirFinal(10);

        list.visualizarLista();
        System.out.println("Tamanho total da lista: " + list.contarNodes());

        if (list.removerNode(3)) {
            System.out.println("Elemento 3 excluído com sucesso");
            list.visualizarLista();
        }
        else
            System.out.println("Elemento 3 não está presente na lista");

        if (list.removerNode(5)) {
            System.out.println("Elemento 5 excluído com sucesso");
            list.visualizarLista();
        }
        else {
            System.out.println("Elemento 5 não está presente na lista. Inserido no final");
            list.inserirFinal(5);
        }

        if (list.removerNode(4)) {
            System.out.println("Elemento 4 excluído com sucesso");
            list.visualizarLista();
        }

        if (list.removerNode(1)) {
            System.out.println("Elemento 1 excluído com sucesso");
            list.visualizarLista();
        }

        if (list.removerNode(5)) {
            System.out.println("Elemento 5 excluído com sucesso");
            list.visualizarLista();
        }

        if (list.removerNode(2)) {
            System.out.println("Elemento 2 excluído com sucesso");
            list.visualizarLista();
        }

        if (list.removerNode(10)) {
            System.out.println("Elemento 10 excluído com sucesso");
            list.visualizarLista();
        }


            //***********************************
        //Java LinkedList
        LinkedList<String> linkedList = new LinkedList<>(List.of("Valdir","Alexandre","Rubens"));

        //Inserindo
        linkedList.add("aaa");
        linkedList.push("abc");
        linkedList.offer("bgs");
        linkedList.addFirst("asda");
        linkedList.addLast("asda");

        //Consumindo
        linkedList.poll();
        linkedList.remove();
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.pop();

    }
}
