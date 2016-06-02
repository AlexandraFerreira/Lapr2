/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class Imagem extends JPanel {
    
    private static final ImageIcon ICON = 
            new ImageIcon(Imagem.class.getResource("lapr/project/image/login.jpg"));
    
    public Imagem() {
        super();
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        Dimension dimensaoPainel = getSize(); 	              
        double largura = dimensaoPainel.getWidth();
        double altura = dimensaoPainel.getHeight();
        
        Image img2 = ICON.getImage().getScaledInstance(
                (int) largura, 
                (int) altura, 
                Image.SCALE_SMOOTH);
        
        Image img3 = new ImageIcon(img2).getImage();
        
        g.drawImage(img3, 0, 0, this);
        
    }
}