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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author leonardo
 */
public class GUI extends JFrame {

    Container cp = new Container(); // container principal, nele serão adicionados os paineis

    private JPanel painelCentro = new JPanel(); /// painel centro, nele serão add os componentes
    private JPanel painelSul = new JPanel(); /// painel centro, nele serão add os componentes
    private JFileChooser caixaDeDialogo = new JFileChooser();

    //Componentes
    ImageIcon iconeAbrir = new ImageIcon(getClass().getResource("/icones/folder_open.png"));
    ImageIcon iconeCheck = new ImageIcon(getClass().getResource("/icones/check.png"));
    private JButton btnAbrir = new JButton(iconeAbrir);
    private JButton btnExecutar = new JButton(iconeCheck);
    private JTextField txtCaminho = new JTextField(30);
    private JTextArea txtArquivo = new JTextArea();
    private String caminho = "";
    //--

    public GUI() {
        setTitle("Validação de  Automatos");
        setSize(500, 300);//tamanho inicial da tela
        setBackground(Color.CYAN);//cor do fundo da janela
        

        cp = getContentPane(); // vincula o layout do frame com o componente cp -- para ficar mais facil controlar

        cp.setLayout(new BorderLayout()); // define o tipo de layout -- este é de 5 posiçoes - norte, sul, leste, oeste e centro

        painelCentro.add(new JLabel("Caminho: "));
        painelCentro.add(txtCaminho);
        painelCentro.add(btnAbrir);
        painelCentro.add(btnExecutar);
        painelCentro.add(txtArquivo);

//        painelSul.add(new JLabel("Clique em \"Carregar\" para carregar um novo arquivo!"));

        cp.add(painelCentro, BorderLayout.CENTER);
        cp.add(painelSul, BorderLayout.SOUTH);
        
        setVisible(true); // deixa visivel o Frame
        setLocationRelativeTo(null); // posiciona o Frame no centro da tela
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        //listenner ao fechar a janela
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Sai do sistema  
                System.exit(0);
            }
        });

        btnAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");//Estabelece um filtro de tipo de arquivo
                caixaDeDialogo.setFileFilter(filter); //set o filtro
                caixaDeDialogo.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (caixaDeDialogo.showOpenDialog(new JPanel()) == JFileChooser.APPROVE_OPTION) {
                    caminho = caixaDeDialogo.getSelectedFile().getAbsolutePath(); //get o caminho do arquivo
                    ManipulaArquivo arq = new ManipulaArquivo();
                    List<String> texto;
                    texto = arq.abrirArquivo(caminho);
//                    txtArquivo.setText("");
//                    for (int i = 0; i < texto.size(); i++) {
//                        txtArquivo.append(texto.get(i) + System.getProperty("line.separator"));//coloca o conteudo do arquivo num textArea
//                    }
                    txtCaminho.setText(caminho);
//                    setTitle("Editor - " + caminho);
                }
            }
        });
        
        btnExecutar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!caminho.equals("")){
                    //chama o método que ira tratar as strings e validar os dados!
                    //esse método deve retornar se o automato é valido(true) ou inválido(false)
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Abra um arquivo primeiro antes de executar o teste!");
                }
            }
        });

    }

}
