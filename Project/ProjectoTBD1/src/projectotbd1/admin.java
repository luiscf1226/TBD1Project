/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectotbd1;

import java.util.ArrayList;

/**
 *
 * @author Luis Carlos Flores
 */
public class admin {
    public ArrayList <Products> listap=new ArrayList();
    public ArrayList <Orders> listao=new ArrayList();
    public ArrayList <OrderDetails> listaod=new ArrayList();

    public admin() {
    }

    public ArrayList<Products> getListap() {
        return listap;
    }

    public void setListap(ArrayList<Products> listap) {
        this.listap = listap;
    }

    public ArrayList<Orders> getListao() {
        return listao;
    }

    public void setListao(ArrayList<Orders> listao) {
        this.listao = listao;
    }

    public ArrayList<OrderDetails> getListaod() {
        return listaod;
    }

    public void setListaod(ArrayList<OrderDetails> listaod) {
        this.listaod = listaod;
    }
    
}
