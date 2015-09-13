/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.ArrayList;

/**
 *
 * @author emanuel
 */
public class Transicao {
  private ArrayList<String> estado1;
  private ArrayList<String> trans;
  private ArrayList<String> estado3;

    public ArrayList<String> getEstado1() {
        return estado1;
    }

    public void setEstado1(ArrayList<String> estado1) {
        this.estado1 = estado1;
    }

    public ArrayList<String> getTrans() {
        return trans;
    }

    public void setTrans(ArrayList<String> trans) {
        this.trans = trans;
    }

    public ArrayList<String> getEstado3() {
        return estado3;
    }

    public void setEstado3(ArrayList<String> estado3) {
        this.estado3 = estado3;
    }

  
}