/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rhuan.silva
 */
public class Clientes {

    private List<String> nomes = new ArrayList<>();

    public Clientes() {
        nomes.add("Rhuan Felipe");
        nomes.add("Giselle Albuquerque");
        nomes.add("Lara Vitória");
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }
    
}
