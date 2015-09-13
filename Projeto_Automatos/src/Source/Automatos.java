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
public class Automatos {
    private ArrayList<String> alfabeto;
    private ArrayList<String> estados;
    private ArrayList<String> iniciais;
    private ArrayList<String> finais;

    public ArrayList<String> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public ArrayList<String> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    public ArrayList<String> getIniciais() {
        return iniciais;
    }

    public void setIniciais(ArrayList<String> iniciais) {
        this.iniciais = iniciais;
    }

    public ArrayList<String> getFinais() {
        return finais;
    }

    public void setFinais(ArrayList<String> finais) {
        this.finais = finais;
    }
    
}
