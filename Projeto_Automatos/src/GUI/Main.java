/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Source.mani;
import java.util.List;

/**
 *
 * @author leonardo
 */
public class Main {
    
    public static void main(String[] args) {
//        GUI telaInical = new GUI();
        
        ManipulaArquivo arq = new ManipulaArquivo();
        String caminho = "/data/BCC/4 Periodo/Automatos/Exemplo.txt";
                    List<String> texto = arq.abrirArquivo(caminho);
                    
        mani m = new mani();
        m.integracao(texto, "0-0-1");
                    
        
         
        
    }
    
}
