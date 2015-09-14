/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.FileReader;
import java.io.LineNumberReader;

/**
 *
 * @author emanuel
 */
public class mani {
   public boolean manipula(String arq){
       //LineNumberReader qtlinha=new LineNumberReader(new FileReader(arq)); quantidade de linhas pesquisar
       int aux=0;
       Transicao t=new Transicao();
       String[] nova= new String [100];
       nova=arq.split("\n");
       Automatos aut=new Automatos();
       aut.setAlfabeto(nova[0].split(" "));
       aut.setEstados(nova[1].split(" "));
       aut.setIniciais(nova[2].split(" "));
       aut.setFinais(nova[3].split(" "));
       int i=4;
       while(i<nova.length){
           t.estado1[aux]=(nova[i].split(" "));
           //t.setEstado1()[i]; Setters em matrizes?
           i++;
           aux++;
       }
       while(i<t.estado1.length){
           if(aut.getIniciais().equals(t.getEstado1()[i])){
               
           }
       }
       
       
       
       
       
   }
   
    
}
