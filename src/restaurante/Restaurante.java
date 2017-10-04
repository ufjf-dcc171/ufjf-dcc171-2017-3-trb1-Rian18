/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Rian Alves
 */
public class Restaurante {

    public static void main(String[] args) {
        
        
        Inicio janelaInicio = new Inicio();
        janelaInicio.setVisible(true); //ideal colocar por último 
        janelaInicio.setSize(470,600);
        janelaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaInicio.setLocationRelativeTo(null); // Tela aparece no centro 

        

        Pedido[] mesas = new Pedido[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Mesas : " + mesas[i]);
        }

    }

    public static void telaPedidos()
    {
        JanelaPedido janelaPedidos = new JanelaPedido();
        janelaPedidos.setVisible(true); //ideal colocar por último 
        janelaPedidos.setSize(470, 600);
        janelaPedidos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        janelaPedidos.setLocationRelativeTo(null);
    
    }
}
