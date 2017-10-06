/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rian Alves
 */
public class Cardapio extends JFrame {

    private JTextField txtItem = new JTextField("", 10), txtCodigo = new JTextField("", 20), txtPreco = new JTextField("", 10);
    private JButton btnAdicionar, btnRemover;
    private JLabel lbl = new JLabel(new ImageIcon("imagens/inicio.png"));
    private final JList lista = new JList(new DefaultListModel());

    private final JPanel principal = new JPanel();

    private List<Item> itensCardapio;
    private Item item;

    public Cardapio() throws HeadlessException {

        super("Cardápio");

        btnAdicionar = new JButton("Adicionar");
        btnRemover = new JButton("Remover");

        principal.setLayout(null);

        principal.add(txtCodigo);
        txtCodigo.setSize(100, 25);
        txtCodigo.setLocation(20, 40);

        principal.add(txtItem);
        txtItem.setSize(150, 25);
        txtItem.setLocation(150, 40);

        principal.add(txtPreco);
        txtPreco.setSize(100, 25);
        txtPreco.setLocation(330, 40);

        principal.add(btnAdicionar);
        btnAdicionar.setSize(100, 25);
        btnAdicionar.setLocation(330, 80);

        principal.add(btnRemover);
        btnRemover.setSize(100, 25);
        btnRemover.setLocation(200, 80);

        principal.add(lista);
        lista.setSize(400, 400);
        lista.setLocation(20, 130);

        principal.add(lbl);
        add(principal);

        DefaultListModel modelo = (DefaultListModel) lista.getModel();
        itensCardapio = new ArrayList<Item>();
        
        item = new Item(1, "Arroz a grega", 20.0);
        Item item1 = new Item(1, "Feijão Tropeiro", 20.0);
        Item item2 = new Item(1, "Farofa", 15.0);
        Item item3 = new Item(1, "Batata Frita", 12.0);
                
        itensCardapio.add(item);
        itensCardapio.add(item1);
        itensCardapio.add(item2);
        itensCardapio.add(item3);
        int cont = 0;
        
        for (Object o : itensCardapio) {

            System.out.println(o);
            modelo.addElement(itensCardapio.get(cont).getCodigo() + "........" + itensCardapio.get(cont).getDescricao() + "....... R$" + itensCardapio.get(cont).getPreco());
            cont++;
        }

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                item = new Item();
                item.setCodigo(Integer.parseInt(txtCodigo.getText()));
                item.setDescricao(txtItem.getText());
                item.setPreco(Double.parseDouble(txtPreco.getText()));
                modelo.addElement(item.getCodigo() + "........." + item.getDescricao() + "......... R$" + item.getPreco());

                itensCardapio.add(item);

                txtCodigo.setText("");
                txtItem.setText("");
                txtPreco.setText("");
                txtCodigo.requestFocus();
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Object o : lista.getSelectedValuesList()) {
                    System.out.println(o);
                    modelo.removeElement(o);
                }
                
                txtCodigo.setText("");
                txtItem.setText("");
                txtPreco.setText("");
                txtCodigo.requestFocus();
            }
        });

    }
    
      public List <Item> getItens() {
        return itensCardapio;
    }

    

}
