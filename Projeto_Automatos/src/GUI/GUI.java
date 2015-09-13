/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author leonardo
 */
public class GUI extends JFrame{
    
    Container cp = new Container(); // container principal, nele serão adicionados os paineis
    
    private JPanel painelCentro = new JPanel(); /// painel centro, nele serão add os componentes
    private JPanel painelSul = new JPanel(); /// painel centro, nele serão add os componentes
    
    //Componentes
    ImageIcon iconeAbrir = new ImageIcon(getClass().getResource("/icones/folder_open.png"));
    private JButton btnAbrir = new JButton(iconeAbrir);
    private JTextField txtCaminho = new JTextField(30);
    private String caminho = "";
    //--
    
    public GUI(){
        setSize(500, 300);//tamanho inicial da tela
        setBackground(Color.CYAN);//cor do fundo da janela
        
        cp = getContentPane(); // vincula o layout do frame com o componente cp -- para ficar mais facil controlar
        
        cp.setLayout(new BorderLayout()); // define o tipo de layout -- este é de 5 posiçoes - norte, sul, leste, oeste e centro
        
        painelCentro.add(new JLabel("Caminho: "));
        painelCentro.add(txtCaminho);
        painelCentro.add(btnAbrir);
        
        painelSul.add(new JLabel("Clique em \"Carregar\" para carregar um novo arquivo!"));
        
        cp.add(painelCentro, BorderLayout.CENTER);
        cp.add(painelSul, BorderLayout.SOUTH);
    
        setVisible(true); // deixa visivel o Frame
        setLocationRelativeTo(null); // posiciona o Frame no centro da tela
        
        
    }
    
}
