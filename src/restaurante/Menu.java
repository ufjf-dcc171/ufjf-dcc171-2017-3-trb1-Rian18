/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author Rian Alves
 */
public class Menu {
    
    private ArrayList<Item> itens;

    public Menu(ArrayList<Item> itens) {
        this.itens = itens;
    }

    /**
     * @return the itens
     */
    public ArrayList<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    
    
    
}
