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
 * @author emanuel;1136844
 */
public class mani {

    //Metodo que chama os metodos, e retorna a se as transicoes sao aceitas.

    public boolean integracao(List<String> txt, String trans) {
        Automatos aut = new Automatos();
        aut = manipula(txt);
        return validar(aut, aut.getTransicao(), trans);

    }

    // Metodo que manipula a String e à prepara para a validação

    public Automatos manipula(List<String> arq) {

        Transicao t = new Transicao();
        t.estado1 = new ArrayList<>();
        Automatos aut = new Automatos();
        aut.setAlfabeto(arq.get(0).split(" "));
        aut.setEstados(arq.get(1).split(" "));
        aut.setIniciais(arq.get(2));
        aut.setFinais(arq.get(3).split(" "));
        int i = 4;
        while (i < arq.size()) {
            String[] s = arq.get(i).split(" ");
            ArrayList<String> l = new ArrayList<String>();
            l.add(s[0]);
            l.add(s[1]);
            l.add(s[2]);
            t.estado1.add(l);
            i++;
        }
        aut.setTransicao(t);
        return aut;
    }

    //Metodo que Recebe o arquivo de transicoes e o manipula para validação

    public String[] getTransicoes(String trans) {
        String[] transicao = trans.split("-");

        return transicao;
    }

    //metodo que compara todos as transições e estados do automato.

    public boolean validar(Automatos aut, Transicao t, String transicoes) {
        int aux = 0;
        int i = 0;
        String[] transicao = getTransicoes(transicoes);
        while (aux < transicao.length && i < t.estado1.size()) {
            if (aut.getIniciais().equals(t.estado1.get(i).get(0))) {
                if (transicao[aux].equals(t.estado1.get(i).get(1))) {
                    if ((aut.getIniciais().equals(t.estado1.get(i).get(2)))) {
                        i--;
                    }
                    aut.setIniciais(t.estado1.get(i).get(2));
                    aux++;
                }
            }
            i++;
        }
        i = 0;
        while (i < aut.getFinais().length) {
            if (aut.getIniciais().equals(aut.getFinais()[i])) {
                return true;
            }
            i++;
        }
        return false;
    }
}
