package Trab_LOO_Parte1;

import java.util.LinkedList;

public class PilhaPaginas {

    private LinkedList<Pagina> pilha;

    public PilhaPaginas() {
        this.pilha = new LinkedList<>();
    }

    public boolean isEmpty() {
        return (this.pilha.isEmpty());
    }

    public Pagina peek() {
        return this.pilha.getFirst();
    }

    public void push(Pagina pg) {
        this.pilha.addFirst(pg);
    }

    public Pagina pop() {
        return this.pilha.removeFirst();
    }

    public LinkedList<Pagina> mostrarHistorico() {
        LinkedList<Pagina> historico = new LinkedList<>();

        if (this.pilha.isEmpty()) {
            return null;
        } else {
            while (!this.pilha.isEmpty()) {
                Pagina p = this.pilha.pop();
                historico.add(p);
            }
            return historico;
        }
    }
}
