/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import lapr.project.controller.RegistarCandidaturaController;
import lapr.project.model.*;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class JanelaMenu extends JFrame {


    private CentroExposicoes empresa;
    private Utilizador u;
    private CandidaturaAExposicao c;
    private RegistarCandidaturaController controller;
    private JButton btnUC1, btnUC2, btnUC3, btnUC4, btnUC5, btnUC6, btnUC7, btnUC8, btnUC9, btnLogout;
    private JFrame frameInicial;

    public JanelaMenu(CentroExposicoes empresa, JFrame frameInicial, Utilizador u) {
        super("MENU");

        this.empresa = empresa;
        this.frameInicial = frameInicial;
        this.u=u;
        
        setPreferredSize(new Dimension(600, 300));

        setMinimumSize(new Dimension(600, 300));

        JPanel panel = criarComponentes();
        add(panel);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel criarComponentes() {
        
        JPanel p = new JPanel((new GridLayout(5, 2, 40, 20)));
        btnUC1 = criarBotaoCriarExposicao();
        btnUC2 = new JButton("Definir FAE");
        btnUC3 = criarBotaoAtribuirCandidaturas();
        btnUC4 = criarBotaoDecidirCandidaturas();
        btnUC5 = criarBotaoRegistarCandidatura();
        btnUC6 = new JButton("Registar Utilizador");
        btnUC7 = new JButton("Confirmar Registo de Utilizador");
        btnUC8 = new JButton("Criar Demonstração de Exposição");
        btnUC9 = new JButton("Definir Recurso");
        btnLogout = criarBotaoLogout();

        p.add(btnUC1);
        p.add(btnUC2);
        p.add(btnUC3);
        p.add(btnUC4);
        p.add(btnUC5);
        p.add(btnUC6);
        p.add(btnUC7);
        p.add(btnUC8);
        p.add(btnUC9);
        p.add(btnLogout);
        
        btnUC2.setEnabled(false);
        btnUC6.setEnabled(false);
        btnUC7.setEnabled(false);
        btnUC8.setEnabled(false);
        btnUC9.setEnabled(false);
        
        JMenuBar menuBar = criarBarraMenus();
        setJMenuBar(menuBar);

        return p;
    }
    
    private JMenuBar criarBarraMenus() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(criarSubMenuLista());

        return menuBar;
    }
    
    private JMenu criarSubMenuLista() {
        JMenu menu = new JMenu("Alterações");
        menu.setMnemonic(KeyEvent.VK_F);

        menu.add(criarMenuAlterarUtilizador());

        return menu;
    }
    
    private JMenuItem criarMenuAlterarUtilizador() {
        JMenuItem item = new JMenuItem("Alterar Utilizador", 'U');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl U"));

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AlterarUtilizadorUI(JanelaMenu.this, empresa, u);
            }
        }
        );

        return item;
    }
    
    private JButton criarBotaoCriarExposicao(){
        JButton btn = new JButton("Criar Exposição");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                new CriarExposicaoUI(empresa, u);
            }
        });

        return btn;
    }

    private JButton criarBotaoAtribuirCandidaturas() {
        JButton btn = new JButton("Atribuir Candidaturas");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

        return btn;
    }


    private JButton criarBotaoDecidirCandidaturas() {
        JButton btn = new JButton("Decidir Candidaturas");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });

        return btn;
    }

    private JButton criarBotaoRegistarCandidatura() {
        btnUC5 = new JButton("Registar Candidatura");
        btnUC5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistarCandidaturaUI(empresa,u,controller,c);
            }
        });
        return btnUC5;
    }

    private JButton criarBotaoLogout() {
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                frameInicial.setVisible(true);
            }
        });
        return btnLogout;
    }
}   
