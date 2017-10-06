<<<<<<< HEAD

package restaurante;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rian Alves
 */
public class Pedido {
    
    private Date horaInicio;
    private Date horaFim;
    private boolean status;
    private Double somaT;
    private ArrayList <Item> itens;

    public Pedido(Date horaInicio, Date horaFim, boolean status, ArrayList<Item> itens) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = status;
        this.itens = itens;
    }

    Pedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * @return the horaInicio
     */
    public Date getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public Date getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the itens
     */
    public ArrayList <Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList <Item> itens) {
        this.itens = itens;
    }
    
  
    /**
     * @return the somaT
     */
    public Double getSomaT() {
        return somaT;
    }

    /**
     * @param somaT the somaT to set
     */
    public void setSomaT(Double somaT) {
        this.somaT = somaT;
    }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rian Alves
 */
public class Pedido {
    
    private Date horaInicio;
    private Date horaFim;
    private boolean status;
    private ArrayList <String> itens;

    public Pedido(Date horaInicio, Date horaFim, boolean status, ArrayList<String> itens) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = status;
        this.itens = itens;
    }

    
    /**
     * @return the horaInicio
     */
    public Date getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public Date getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the itens
     */
    public ArrayList <String> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList <String> itens) {
        this.itens = itens;
    }
    
>>>>>>> origin/master
    
            
            
            
    
}
