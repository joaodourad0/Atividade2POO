package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private int numeroNota;
    private List<ItemPedido> itens;
    
   
    public Pedido(int numeroNota) {
        this.numeroNota = numeroNota;
        this.itens = new ArrayList<>();
    }
    
    
    public void adicionaItem(ItemPedido item) {
        itens.add(item);
    }
    
   
    public int getNumeroNota() {
        return numeroNota;
    }
    
  
    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }
    
    public List<ItemPedido> getItens() {
        return itens;
    }
    
    public double getValorTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getProduto().getValor() * item.getQuantidade();
        }
        return valorTotal;
    }
}