/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanuel
 */
public class Transicao {
   ArrayList<ArrayList<String>> estado1;
  private String[] trans;

    public ArrayList<ArrayList<String>> getEstado1() {
        return estado1;
    }

    public void setEstado1(ArrayList<ArrayList<String>> estado1) {
        this.estado1 = estado1;
    }


    public String[] getTrans() {
        return trans;
    }

    public void setTrans(String[] trans) {
        this.trans = trans;
    }

   
   
}