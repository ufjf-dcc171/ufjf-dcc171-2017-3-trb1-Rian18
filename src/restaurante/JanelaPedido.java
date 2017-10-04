/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rian Alves
 */
public class JanelaPedido extends JFrame {

    private final JList lstLista = new JList(new DefaultListModel());
    private final JList encerramento = new JList(new DefaultListModel());
    private ArrayList<String> listaItem = new ArrayList<>();
    private Pedido pedido = null;
    private int numencerramento;
    private JPanel principal = new JPanel();
    private JPanel principal2 = new JPanel();
    private JLabel lbl1;
    private JLabel lbl2 = new JLabel("");
    private JButton btnVoltar;
    private JButton btnAdicionar;
    private JButton btnFecharPedido;
    private static JTextField txtPedido;

    private JButton btnVoltar1;
    private JButton btnMesa1;
    private JButton btnMesa2;
    private JButton btnMesa3;
    private JButton btnMesa4;
    private JButton btnMesa5;
    private JButton btnMesa6;
    private JButton btnMesa7;
    private JButton btnMesa8;
    private JButton btnMesa9;

    Pedido[] mesas = new Pedido[10];

    public JanelaPedido() throws HeadlessException {

        super("Faça seu Pedido: ");

        telaMesas();

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultListModel modelo = (DefaultListModel) lstLista.getModel();
                modelo.addElement(txtPedido.getText());

                listaItem.add(txtPedido.getText());
                txtPedido.setText("");
                txtPedido.requestFocus();
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal2.setVisible(true);
                btnVoltar.setVisible(false);
                lstLista.setModel(new DefaultListModel());

            }
        });

        btnFecharPedido.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int num = getIndice();
                Long horarioFinal = new Long(System.currentTimeMillis());
                Date dataFinal = new Date(horarioFinal);
                mesas[num].setHoraFim(dataFinal);
                DefaultListModel modelo = (DefaultListModel) encerramento.getModel();

                for (int i = 0; i < listaItem.size(); i++) {
                    System.out.println(mesas[num].getItens().get(i));
                    modelo.addElement(mesas[num].getItens().get(i));
                }
                JOptionPane.showMessageDialog(null, "Encerramento!\n" + "Horário Inicial:" + mesas[num].getHoraInicio() + "\n" + "Pedidos Realizados: \n" + modelo + "\n" + "Horário Final : " + mesas[num].getHoraFim() + "\n" + " Dirija-se ao Caixa. Obrigado!");

                System.out.println("Pedido Encerrado! Receber o pagamento!");

                mesas[num] = null;
                if (mesas[num] == null) {
                    TrocarVerde(num);
                    principal2.setVisible(true);
                    btnFecharPedido.setVisible(false);
                   
                    
                }
            }

            
        
        });
        
       
        btnMesa1.addActionListener(new PedidoM(1));
        btnMesa2.addActionListener(new PedidoM(2));
        btnMesa3.addActionListener(new PedidoM(3));
        btnMesa4.addActionListener(new PedidoM(4));
        btnMesa5.addActionListener(new PedidoM(5));
        btnMesa6.addActionListener(new PedidoM(6));
        btnMesa7.addActionListener(new PedidoM(7));
        btnMesa8.addActionListener(new PedidoM(8));
        btnMesa9.addActionListener(new PedidoM(9));

    }
    
     public void TrocarVerde(int num) {
                switch (num) {
                    case 1:
                        btnMesa1.setBackground(Color.GREEN);
                        break;
                    case 2:
                        btnMesa2.setBackground(Color.GREEN);
                        break;
                    case 3:
                        btnMesa3.setBackground(Color.GREEN);
                        break;
                    case 4:
                        btnMesa4.setBackground(Color.GREEN);
                        break;

                    case 5:
                        btnMesa5.setBackground(Color.GREEN);
                        break;

                    case 6:
                        btnMesa6.setBackground(Color.GREEN);
                        break;

                    case 7:
                        btnMesa7.setBackground(Color.GREEN);
                        break;

                    case 8:
                        btnMesa8.setBackground(Color.GREEN);
                        break;

                    case 9:
                        btnMesa9.setBackground(Color.GREEN);
                        break;
                    default:

                        System.out.println("Este não é um botão válido!");

                }
        }

      public void TrocarVermelho(int num) {
                switch (num) {
                    case 1:
                        btnMesa1.setBackground(Color.RED);
                        break;
                    case 2:
                        btnMesa2.setBackground(Color.RED);
                        break;
                    case 3:
                        btnMesa3.setBackground(Color.RED);
                        break;
                    case 4:
                        btnMesa4.setBackground(Color.RED);
                        break;

                    case 5:
                        btnMesa5.setBackground(Color.RED);
                        break;

                    case 6:
                        btnMesa6.setBackground(Color.RED);
                        break;

                    case 7:
                        btnMesa7.setBackground(Color.RED);
                        break;

                    case 8:
                        btnMesa8.setBackground(Color.RED);
                        break;

                    case 9:
                        btnMesa9.setBackground(Color.RED);
                        break;
                    default:

                        System.out.println("Este não é um botão válido!");

                }
        }
    private void telaMesas() {
        lbl1 = new JLabel("Digite os Pedidos da Mesa");
        lbl1.setFont(new Font("Digite os Pedidos da Mesa", Font.BOLD, 14));
        lbl2 = new JLabel("Horário de Abertura");
        lbl2.setFont(new Font("", Font.BOLD, 14));

        txtPedido = new JTextField("");
        txtPedido.setFont(new Font("", Font.PLAIN, 14));
        btnVoltar = new JButton("Voltar a Mesas");
        btnFecharPedido = new JButton("Encerrar Pedido");
        btnAdicionar = new JButton("Adicionar");

        btnMesa1 = new JButton("Mesa 1");
        btnMesa2 = new JButton("Mesa 2");
        btnMesa3 = new JButton("Mesa 3");
        btnMesa4 = new JButton("Mesa 4");
        btnMesa5 = new JButton("Mesa 5");
        btnMesa6 = new JButton("Mesa 6");
        btnMesa7 = new JButton("Mesa 7");
        btnMesa8 = new JButton("Mesa 8");
        btnMesa9 = new JButton("Mesa 9");
        btnVoltar1 = new JButton("Voltar");

        principal2.setLayout(new GridLayout(3, 3));

        principal2.add(btnMesa1);
        btnMesa1.setBackground(Color.GREEN);
        btnMesa1.setForeground(Color.WHITE);
        btnMesa1.setFont(new Font("Mesa 1", Font.BOLD, 18));
        
        principal2.add(btnMesa2);
        btnMesa2.setBackground(Color.GREEN);
        btnMesa2.setForeground(Color.WHITE);
        btnMesa2.setFont(new Font("Mesa 2", Font.BOLD, 18));
        
        principal2.add(btnMesa3);
        btnMesa3.setBackground(Color.GREEN);
        btnMesa3.setForeground(Color.WHITE);
        btnMesa3.setFont(new Font("Mesa 3", Font.BOLD, 18));
        
        principal2.add(btnMesa4);
        btnMesa4.setBackground(Color.GREEN);
        btnMesa4.setForeground(Color.WHITE);
        btnMesa4.setFont(new Font("Mesa 4", Font.BOLD, 18));
        
        principal2.add(btnMesa5);
        btnMesa5.setBackground(Color.GREEN);
        btnMesa5.setForeground(Color.WHITE);
        btnMesa5.setFont(new Font("Mesa 5", Font.BOLD, 18));
        
        principal2.add(btnMesa6);
        btnMesa6.setBackground(Color.GREEN);
        btnMesa6.setForeground(Color.WHITE);
        btnMesa6.setFont(new Font("Mesa 6", Font.BOLD, 18));
        
        principal2.add(btnMesa7);
        btnMesa7.setBackground(Color.GREEN);
        btnMesa7.setForeground(Color.WHITE);
        btnMesa7.setFont(new Font("Mesa 7", Font.BOLD, 18));
        
        principal2.add(btnMesa8);
        btnMesa8.setBackground(Color.GREEN);
        btnMesa8.setForeground(Color.WHITE);
        btnMesa8.setFont(new Font("Mesa 8", Font.BOLD, 18));
        
        principal2.add(btnMesa9);
        btnMesa9.setBackground(Color.GREEN);
        btnMesa9.setForeground(Color.WHITE);
        btnMesa9.setFont(new Font("Mesa 9", Font.BOLD, 18));
          

        add(principal2);
    }

    public class PedidoM implements ActionListener {

        int numero;

        public PedidoM(int i) {
            numero = i;
                    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (mesas[numero] == null) {
                TrocarVermelho(numero);
                Long horarioInicial = new Long(System.currentTimeMillis());
                Date dataInicial = new Date(horarioInicial);
                lbl2.setText(dataInicial.toString());
                ArrayList<String> lista = new ArrayList<>();
                listaItem = lista;
                mesas[numero] = new Pedido(dataInicial, null, true, lista);
                setIndice(numero);
                System.out.println("Iniciar Mesa" + numero);
            } else {
                setIndice(numero);
                DefaultListModel modelo = (DefaultListModel) lstLista.getModel();
                for (int i = 0; i < listaItem.size(); i++) {
                    modelo.addElement(mesas[numero].getItens());
                }

            }

            telaPedido();
        }

    }

    public void setIndice(int i) {
        this.numencerramento = i;
    }

    public int getIndice() {
        return numencerramento;

    }

    public void telaPedido() {
        
        
        txtPedido.setText("");

        principal2.setVisible(false);
        principal.setLayout(null);

        principal.add(lbl1);
        lbl1.setSize(500, 50);
        lbl1.setLocation(20, 0);

        principal.add(lbl2);
        lbl2.setSize(300, 50);
        lbl2.setLocation(290, 0);

        principal.add(txtPedido);
        txtPedido.setSize(400, 25);
        txtPedido.setLocation(20, 40);

        principal.add(btnAdicionar);
        btnAdicionar.setBackground(Color.GREEN);
        btnAdicionar.setForeground(Color.WHITE);
        btnAdicionar.setFont(new Font("", Font.BOLD, 14));
        btnAdicionar.setSize(100, 30);
        btnAdicionar.setLocation(320, 70);

        principal.add(lstLista);
        lstLista.setSize(400, 350);
        lstLista.setLocation(20, 110);

        principal.add(btnFecharPedido);
        btnFecharPedido.setVisible(true);
        btnFecharPedido.setBackground(Color.RED);
        btnFecharPedido.setForeground(Color.WHITE);
        btnFecharPedido.setFont(new Font("", Font.BOLD, 14));
        btnFecharPedido.setSize(150, 30);
        btnFecharPedido.setLocation(270, 480);

        principal.add(btnVoltar);
        btnVoltar.setBackground(Color.BLUE);
        btnVoltar.setForeground(Color.WHITE);
        btnVoltar.setFont(new Font("", Font.BOLD, 14));
        btnVoltar.setSize(150, 30);
        btnVoltar.setLocation(20, 480);
        btnVoltar.setVisible(true);

        add(principal);

    }

}
