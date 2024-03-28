package model;

public class Principal {

	    public static void main(String[] args) {
	       
	        Produto produto1 = new Produto(1, 7.0, "Arroz");
	        Produto produto2 = new Produto(2, 9.0, "Feijão");
	        Produto produto3 = new Produto(3, 5.0, "Macarrão");

	      
	        ItemPedido item1 = new ItemPedido(10, produto1); 
	        ItemPedido item2 = new ItemPedido(5, produto2); 
	        ItemPedido item3 = new ItemPedido(2, produto3);
	     
	        Pedido pedido = new Pedido(1);
	        pedido.adicionaItem(item1);
	        pedido.adicionaItem(item2);
	        pedido.adicionaItem(item3);

	    
	        System.out.println("Número da Nota: " + pedido.getNumeroNota());
	        System.out.println("Itens do Pedido:");
	        for (ItemPedido item : pedido.getItens()) {
	            System.out.println("- Produto: " + item.getProduto().getDescricao() +
	                    ", Quantidade: " + item.getQuantidade() +
	                    ", Preço Unitário: R$" + item.getProduto().getValor() +
	                    ", Preço Total: R$" + item.getProduto().getValor() * item.getQuantidade());
	        }
	        System.out.println("Valor Total do Pedido: R$" + pedido.getValorTotal());
	    }
	}

