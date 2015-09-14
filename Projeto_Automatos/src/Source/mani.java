/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.List;



/**
 *
 * @author emanuel
 */
public class mani {
   public boolean manipula(List<String> arq){
       int aux=0;
       Transicao t=new Transicao();
       //String[] nova=arq.split("\n");
       Automatos aut=new Automatos();
       aut.setAlfabeto(arq.get(0).split(" "));
       aut.setEstados(arq.get(1).split(" "));
       aut.setIniciais(arq.get(2));
       aut.setFinais(arq.get(3).split(" "));
       int i=4;
       while(i<arq.size()){
           t.estado1[aux]=(arq.get(i).split(" "));
           //t.setEstado1()[i]; Setters em matrizes?
           i++;
           aux++;
       }       
       return true;
   }
   
   public boolean validar(Automatos aut,Transicao t){
       int aux=0;
       int i=0;
       while(i<t.estado1.length){
           if(aut.getIniciais().equals(t.estado1[i][0])){
               if(aut.getTransicao()[aux].equals(t.estado1[i][1])){
                   aut.setIniciais(t.estado1[i][2]);
                   aux++;
               }
               
           }
           i++;
       }
       return aut.getIniciais().equals(aut.getFinais());
   }
}
