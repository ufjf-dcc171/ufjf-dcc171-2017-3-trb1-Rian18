/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rian Alves
 */
class Inicio extends JFrame{
    
    private JPanel principal = new JPanel();
    private JLabel lbl1 ;
    private JButton btnIniciar;
    private JButton btnSobre;
    

    public Inicio() throws HeadlessException {
        
        super("Restaurante");
        
        lbl1 = new JLabel("Controle de Pedidos");
        lbl1.setFont(new Font("Controle de Pedidos", Font.PLAIN, 36));
        
        btnIniciar= new JButton("Iniciar Pedido");
        btnSobre = new JButton("Sobre");
       
        
        
        
        principal.setLayout(null);
        
        principal.add(lbl1);
        lbl1.setSize(500,50);
        lbl1.setLocation(70, 0);
        
        principal.add(btnIniciar);
        btnIniciar.setIcon(new ImageIcon("imagens/inicio.png"));
        btnIniciar.setBackground(Color.WHITE);
       // btnIniciar.setVerticalTextPosition(190);
        btnIniciar.setSize(200, 200);
        btnIniciar.setLocation(120,100);
        
        principal.add(btnSobre);
        btnSobre.setSize(200, 200);
        btnSobre.setLocation(120,330);
        
     
        
     
        add(principal);
        
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restaurante.telaPedidos();
            }
        });
        
        btnSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Universidade Federal de Juiz de Fora\n" + "Laboratório de Programação III" +"\n" + "Rian das Dores Alves\n" +"201676040\n "+"Outubro de 2017");
            }
        });
        
       
    }
}
