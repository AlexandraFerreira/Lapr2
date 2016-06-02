/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import lapr.project.model.*;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class JanelaInicial extends JFrame {

    private JButton btnLogin, btnRegistar;
    private JTextField txtUsername, txtPassword;
    private CentroExposicoes empresa;
    private JFrame frameInicial;
    private JTabbedPane tabPane;

    public JanelaInicial(CentroExposicoes empresa) {
        super("Empresa");

        frameInicial = JanelaInicial.this;
        this.empresa = empresa;

        setLayout(new GridLayout(3, 1));

        setPreferredSize(new Dimension(600, 300));
        setMinimumSize(new Dimension(600, 300));

        criarComponentes();

        JPanel pImagem = criarPainelImagem();
        JPanel p1 = criarPainelDados();
        JPanel p3 = criarPainelBotoes();

        add(pImagem, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void criarComponentes() {
        JMenuBar menuBar = criarBarraMenus();
        setJMenuBar(menuBar);
    }

    private JMenuBar criarBarraMenus() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(criarSubMenuLista());
        menuBar.add(criarMenuOpcoes());

        return menuBar;
    }

    private JMenu criarSubMenuLista() {
        JMenu menu = new JMenu("Ficheiros");
        menu.setMnemonic(KeyEvent.VK_F);

        menu.add(criarMenuImportar());
        menu.add(criarMenuExportar());

        return menu;
    }

    private JMenu criarMenuOpcoes() {
        JMenu menu = new JMenu("Opções");
        menu.setMnemonic(KeyEvent.VK_O);

        menu.add(criarSubMenuEstilo());
        menu.addSeparator();
        menu.add(criarItemAcerca());

        return menu;
    }

    private JMenuItem criarMenuImportar() {
        JMenuItem item = new JMenuItem("Importar", 'I');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
        );

        return item;
    }

    private JMenuItem criarMenuExportar() {
        JMenuItem item = new JMenuItem("Exportar", 'X');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        return item;
    }

    private JMenu criarSubMenuEstilo() {
        JMenu menu = new JMenu("Estilo");
        menu.setMnemonic(KeyEvent.VK_E);

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            menu.add(criarItemEstilo(info));
        }

        return menu;
    }

    private JMenuItem criarItemEstilo(UIManager.LookAndFeelInfo info) {
        JMenuItem item = new JMenuItem(info.getName());

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if (menuItem.getActionCommand().equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                    SwingUtilities.updateComponentTreeUI(JanelaInicial.this);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            JanelaInicial.this,
                            ex.getMessage(),
                            "Estilo " + menuItem.getActionCommand(),
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        return item;
    }

    private JMenuItem criarItemAcerca() {
        JMenuItem item = new JMenuItem("Acerca", 'A');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        JanelaInicial.this,
                        "@Copyright\nLAPR2 2015/2016\n"
                        + "Grupo 57:\n\tAlexandra Ferreira"
                        + "\n\tFábio Sousa\n\tMiguel Oliveira"
                        + "\n\tCristiano Melo\n\tJosé Lucas",
                        "Acerca",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        return item;
    }

    private JPanel criarPainelImagem() {
        return new Imagem();
    }

    private JPanel criarPainelDados() {
        JPanel pUsername = criarPainelUsername();
        JPanel pPassword = criarPainelPassword();

        JPanel p = new JPanel();
        GridLayout gl = new GridLayout(2, 1);
        p.setLayout(gl);

        p.add(pUsername);
        p.add(pPassword);

        return p;
    }

    public JPanel criarPainelUsername() {

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Username");
        panel.add(label);

        txtUsername = new JTextField(10);
        panel.add(txtUsername);

        return panel;
    }

    private JPanel criarPainelPassword() {
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Password");
        panel.add(label);

        txtPassword = new JTextField(10);
        panel.add(txtPassword);

        return panel;
    }

    public JPanel criarPainelBotoes() {

        JPanel panel = new JPanel();

        panel.add(criarBotaoLogin());
        panel.add(criarBotaoCriarNovoUtilizador());
        panel.add(criarBotaoSair());

        return panel;
    }

    public JButton criarBotaoLogin() {
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utilizador u = empresa.getRegistoUtilizadores().getUtilizador(txtUsername.getText());
                if (u == null) {
                    JOptionPane.showMessageDialog(JanelaInicial.this, "Utilizador não encontrado");
                } else if (!u.validaPassword(txtPassword.getText())) {
                    JOptionPane.showMessageDialog(JanelaInicial.this, "Passoword incorreta");
                } else {
                    setVisible(false);
                    txtUsername.setText("");
                    txtPassword.setText("");
                    new JanelaMenu(empresa, frameInicial, u);

                }
            }
        }
        );
        return btnLogin;
    }

    private JButton criarBotaoCriarNovoUtilizador() {
        btnRegistar = new JButton("Novo Utilizador");
        btnRegistar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnRegistar;
    }

    public JButton criarBotaoSair() {
        btnRegistar = new JButton("Sair");
        btnRegistar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }

        }
        );

        return btnRegistar;

    }
}
