package model;
import java.util.List;
import java.util.ArrayList;


public class AgendaTelefonica {
	    
	    private List<Contato> contatos;

	    
	    public AgendaTelefonica() {
	        this.contatos = new ArrayList<>();
	    }

	    
	    public void adicionarContato(Contato contato) {
	        contatos.add(contato);
	    }

	    
	    public void removerContato(String nome) {
	        for (Contato contato : contatos) {
	            if (contato.getNome().equals(nome)) {
	                contatos.remove(contato);
	                return;
	            }
	        }
	        System.out.println("Contato não encontrado: " + nome);
	    }

	    
	    public Contato buscarContato(String nome) {
	        for (Contato contato : contatos) {
	            if (contato.getNome().equals(nome)) {
	                return contato;
	            }
	        }
	        System.out.println("Contato não encontrado: " + nome);
	        return null;
	    }
}
