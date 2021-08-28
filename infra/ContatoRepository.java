
package com.infnet.infra;

import com.infnet.domain.Contato;
import java.util.ArrayList;
import java.util.HashMap;

public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos = new HashMap<>();
    
    public ArrayList<Contato> listarContatos(){
        
        return new ArrayList(contatos.values());
    }
    
    public void inserirContato(Contato contato) {
        
        int id = contato.getId();
        if(id == 0) {
            
            id = contatos.values().size() + 1;
            contato.setId(id);
            contatos.put(id, contato);
        }
    }
    public Contato obterContato(int id){
        return contatos.get(id);
    }
    public void excluirContato(int id){
        contatos.remove(id);
    }
}
