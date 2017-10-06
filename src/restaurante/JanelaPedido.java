/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.Color;
<<<<<<< HEAD
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rian Alves
 */
public class JanelaPedido extends JFrame {

    private final JList lstLista = new JList(new DefaultListModel());
    private ArrayList<Item> listaItem = new ArrayList<>();

    private int numero = 0;
    private Date data;
    private JPanel principal = new JPanel();
    private JPanel principal2 = new JPanel();
    private JLabel lbl1;
    private JLabel lbl2 = new JLabel("");
    private JButton btnVoltar;
    private JButton btnAdicionar;
    private JButton btnFecharPedido;

    private JComboBox<Item> cmbItens = new JComboBox<>();
    
    //Botões das Mesas
    private JButton btnMesa1;
    private JButton btnMesa2;
    private JButton btnMesa3;
    private JButton btnMesa4;
    private JButton btnMesa5;
    private JButton btnMesa6;
    private JButton btnMesa7;
    private JButton btnMesa8;
    private JButton btnMesa9;
    DefaultListModel modelo = (DefaultListModel) lstLista.getModel();

    List<Pedido> mesas; // Lista com as mesas que terão os pedidos.

    public JanelaPedido() throws HeadlessException {

        super("Faça seu Pedido: ");
        this.mesas = new ArrayList<Pedido>();
        for (int i = 0; i < 11; i++) {
            mesas.add(i, null);
        }

        Cardapio c = new Cardapio();
        List<Item> a = new ArrayList<>(c.getItens());

        for (int i = 0; i < a.size(); i++) {
            cmbItens.addItem(a.get(i));
        }

        telaMesas();

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                modelo.addElement(cmbItens.getSelectedItem());
                listaItem.add((Item) cmbItens.getSelectedItem());
                mesas.get(getIndice()).setItens(listaItem);

            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal2.setVisible(true);
                btnVoltar.setVisible(false);
                modelo.clear();
                System.out.println(getIndice() + "  " + mesas.get(getIndice()).isStatus());
                setIndice(0);

            }
        });

        btnFecharPedido.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Long horarioFinal = new Long(System.currentTimeMillis());
                Date dataFinal = new Date(horarioFinal);
                mesas.get(getIndice()).setHoraFim(dataFinal);
                Double soma = 0.0;
                System.out.println(getIndice());

                for (int i = 0; i < mesas.get(getIndice()).getItens().size(); i++) {
                    System.out.println(mesas.get(getIndice()).getItens());
                    soma = soma + mesas.get(getIndice()).getItens().get(i).getPreco();

                }
                mesas.get(getIndice()).setSomaT(soma);

                JOptionPane.showMessageDialog(null, "Encerramento!\n" + "Horário Inicial:" + mesas.get(getIndice()).getHoraInicio()
                        + "\n" + "Pedidos Realizados: \n" + modelo + "\n" + "Horário Final : " + mesas.get(getIndice()).getHoraFim() + "\n"
                        + "Valor Total: \n" + mesas.get(getIndice()).getSomaT() + "\nDirija-se ao Caixa. Obrigado!");

                System.out.println("Pedido Encerrado! Receber o pagamento!");

                //   mesas.get(getIndice()).getItens().clear();               
                TrocarVerde(getIndice());
                principal2.setVisible(true);
                btnFecharPedido.setVisible(false);
                soma = 0.0;
                mesas.set(getIndice(), null);
                modelo.removeAllElements();

            }

        });

        btnMesa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(0).actionPerformed(e);
                setIndice(0);
            }
        });

        btnMesa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(1).actionPerformed(e);
                setIndice(1);
            }
        });
        btnMesa3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(2).actionPerformed(e);
                setIndice(2);
            }
        });

        btnMesa4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(3).actionPerformed(e);
                setIndice(3);
            }
        });
        btnMesa5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(4).actionPerformed(e);
                setIndice(4);
            }
        });

        btnMesa6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(5).actionPerformed(e);
                setIndice(5);
            }
        });
        btnMesa7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(6).actionPerformed(e);
                setIndice(6);
            }
        });

        btnMesa8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(7).actionPerformed(e);
                setIndice(7);
            }
        });

        btnMesa9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PedidoM(8).actionPerformed(e);
                setIndice(8);
            }
        });

    }

    public class PedidoM implements ActionListener {

        public PedidoM(int j) {
            numero = j;
            System.out.println("---" + numero);
            System.out.println("---" + getIndice());
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (mesas.get(numero) == null) {

                modelo.clear();

                TrocarVermelho(numero);
                Long horarioInicial = new Long(System.currentTimeMillis());
                Date dataInicial = new Date(horarioInicial);
                setDataInicial(data);
                lbl2.setText(dataInicial.toString());

                listaItem = new ArrayList<>();
                mesas.add(numero, new Pedido(dataInicial, null, true, listaItem));

                System.out.println("Iniciar Mesa" + numero);
                System.out.println("Dados: " + getIndice() + "  " + mesas.get(numero).getHoraInicio() + "  " + mesas.get(numero).isStatus());
                telaPedido();

            } else if (mesas.get(numero) != null) {
                System.out.println("Entrou");
                // DefaultListModel modelo = (DefaultListModel) lstLista.getModel();
                setIndice(numero);
                TrocarVermelho(numero);

                Iterator it = (mesas.get(numero).getItens()).iterator();
                lstLista.setModel(modelo);
                String itemLista;
                while (it.hasNext()) {
                    itemLista = String.valueOf(it.next());
                    modelo.addElement(itemLista);
                }
                /* for (int i = 0; i < mesas.get(numero).getItens().size(); i++) {
                    modelo.addElement(mesas.get(numero).getItens());
                }*/
                telaPedido();
            }

        }

    }

    public void setIndice(int i) {
        this.numero = i;
    }

    public int getIndice() {
        return numero;

    }

    public void setDataInicial(Date i) {
        this.data = i;
    }

    public Date getDataInicial() {
        return data;

    }

    public void telaPedido() {

        principal2.setVisible(false);
        principal.setLayout(null);

        principal.add(lbl1);
        lbl1.setSize(500, 50);
        lbl1.setLocation(20, 0);

        principal.add(lbl2);
        lbl2.setSize(300, 50);
        lbl2.setLocation(290, 0);

        principal.add(cmbItens);
        cmbItens.setSize(400, 25);
        cmbItens.setLocation(20, 40);

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

    private void telaMesas() {
        lbl1 = new JLabel("Digite os Pedidos da Mesa");
        lbl1.setFont(new Font("Digite os Pedidos da Mesa", Font.BOLD, 14));
        lbl2 = new JLabel("Horário de Abertura");
        lbl2.setFont(new Font("", Font.BOLD, 14));

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

    public void TrocarVerde(int num) {
        switch (num) {
            case 0:
                btnMesa1.setBackground(Color.GREEN);
                break;
            case 1:
                btnMesa2.setBackground(Color.GREEN);
                break;
            case 2:
                btnMesa3.setBackground(Color.GREEN);
                break;
            case 3:
                btnMesa4.setBackground(Color.GREEN);
                break;

            case 4:
                btnMesa5.setBackground(Color.GREEN);
                break;

            case 5:
                btnMesa6.setBackground(Color.GREEN);
                break;

            case 6:
                btnMesa7.setBackground(Color.GREEN);
                break;

            case 7:
                btnMesa8.setBackground(Color.GREEN);
                break;

            case 8:
                btnMesa9.setBackground(Color.GREEN);
                break;
            default:

                System.out.println("Este não é um botão válido!");

        }
    }

    public void TrocarVermelho(int num) {
        switch (num) {
            case 0:
                btnMesa1.setBackground(Color.RED);
                break;
            case 1:
                btnMesa2.setBackground(Color.RED);
                break;
            case 2:
                btnMesa3.setBackground(Color.RED);
                break;
            case 3:
                btnMesa4.setBackground(Color.RED);
                break;

            case 4:
                btnMesa5.setBackground(Color.RED);
                break;

            case 5:
                btnMesa6.setBackground(Color.RED);
                break;

            case 6:
                btnMesa7.setBackground(Color.RED);
                break;

            case 7:
                btnMesa8.setBackground(Color.RED);
                break;

            case 8:
                btnMesa9.setBackground(Color.RED);
                break;
            default:

                System.out.println("Este não é um botão válido!");

        }
    }
=======
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

>>>>>>> origin/master
}
