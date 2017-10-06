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

import javax.swing.SwingConstants;

/**
 *
 * @author Rian Alves
 */
class Inicio extends JFrame{
    
    private JPanel principal = new JPanel();
    private JLabel lbl1 ;
    private JButton btnIniciar;
    private JButton btnCardapio;
    private JButton btnSobre;
    

    public Inicio() throws HeadlessException {
        
        super("Restaurante");
        
        lbl1 = new JLabel("Controle de Pedidos");
        lbl1.setFont(new Font("Controle de Pedidos", Font.PLAIN, 36));
        
        btnIniciar= new JButton("Iniciar Pedido");
        btnCardapio= new JButton("Gerenciar CardÃ¡pio");
        btnSobre = new JButton("Sobre");
       
        
        
        
        principal.setLayout(null);
        
        principal.add(lbl1);
        lbl1.setSize(500,50);
        lbl1.setLocation(70, 0);
        
        principal.add(btnIniciar);
        btnIniciar.setIcon(new ImageIcon("imagens/Mesa.png"));
        btnIniciar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnIniciar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnIniciar.setBackground(Color.WHITE);
        btnIniciar.setSize(200, 200);
        btnIniciar.setLocation(120,100);
        
        principal.add(btnCardapio);
        btnCardapio.setBackground(Color.WHITE);
        btnCardapio.setIcon(new ImageIcon("imagens/inicio.png"));
        btnCardapio.setHorizontalTextPosition(SwingConstants.CENTER);
        btnCardapio.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnCardapio.setSize(200, 200);
        btnCardapio.setLocation(120,330);
        
        principal.add(btnSobre);
        btnSobre.setBackground(Color.WHITE);
        btnSobre.setIcon(new ImageIcon("imagens/Sobre.png"));
        btnSobre.setSize(200, 200);
        btnSobre.setLocation(120,550);
        
     
        
     
        add(principal);
        
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restaurante.telaPedidos();
            }
        });
        
         btnCardapio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restaurante.telaCardapio();
            }
        });
        
        btnSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Universidade Federal de Juiz de Fora\n" + "LaboratÃ³rio de ProgramaÃ§Ã£o III" +"\n" + "Rian das Dores Alves\n" +"201676040\n "+"Outubro de 2017");
            }
        });
        
       
    }
}

