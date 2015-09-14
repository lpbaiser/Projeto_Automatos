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
    private String[] alfabeto;
    private String[] estados;
    private String[] iniciais;
    private String[] finais;

    public String[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String[] alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String[] getEstados() {
        return estados;
    }

    public void setEstados(String[] estados) {
        this.estados = estados;
    }

    public String[] getIniciais() {
        return iniciais;
    }

    public void setIniciais(String[] iniciais) {
        this.iniciais = iniciais;
    }

    public String[] getFinais() {
        return finais;
    }

    public void setFinais(String[] finais) {
        this.finais = finais;
    }

    
}
