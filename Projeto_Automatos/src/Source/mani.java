/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.List;



/**
 *
 * @author emanuel;1136844
 */
public class mani {
    
    public boolean integracao(List<String> txt,String trans){
        Automatos aut=new Automatos();
       aut= manipula(txt);
        return validar(aut,aut.getTransicao(),trans);
        
    }
    
   public Automatos manipula(List<String> arq){
       
       int aux=0;
       Transicao t=new Transicao();
       t.estado1=new String[100][3];
       //String[] nova=arq.split("\n");
       Automatos aut=new Automatos();
       aut.setAlfabeto(arq.get(0).split(" "));
       aut.setEstados(arq.get(1).split(" "));
       aut.setIniciais(arq.get(2));
       aut.setFinais(arq.get(3).split(" "));
       int i=4;
       System.out.println(arq.size());
       while(i<arq.size()){
           String [] s=arq.get(i).split(" ");
//           t.estado1[aux][0]=s[0];
//           t.estado1[aux][1]=s[1];
//           t.estado1[aux][2]=s[2];
           t.estado1[aux]=s;
           //t.setEstado1()[i]; Setters em matrizes?
           System.out.println(arq.get(i));
           i++;
           aux++;
       }
       aut.setTransicao(t);
       return aut;
   }
   ///data/BCC/4 Periodo/Automatos/Exemplo.txt
   public String[] getTransicoes(String trans){
       String[] transicao= trans.split("-");
       return transicao;
   }
   
   public boolean validar(Automatos aut,Transicao t,String transicoes){
       int aux=0;
       int i=0;
       String[] transicao=getTransicoes(transicoes);
       while(i<t.estado1.length){
           if(aut.getIniciais().equals(t.estado1[i][0])){
               if(transicao[aux].equals(t.estado1[i][1])){
                   aut.setIniciais(t.estado1[i][2]);
                   aux++;
               }
               
           }
           System.out.println(t.estado1[i][2]);
           //System.out.println(aut.getIniciais());
           i++;
       }
       i=0;
       while(i<aut.getFinais().length){
            if (aut.getIniciais().equals(aut.getFinais()[i])){
                return true;
            }
           
            i++;
       }
       return false;
   }
}
