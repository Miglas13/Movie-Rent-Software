/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.io.Serializable;

/**
 *
 * @author Andre
 */
public class Data  implements Serializable{
    private int dia,mes,ano;

    public Data(){
        dia=0;
        mes=0;
        ano=0;
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean equalsdata(Object o){
        if(o!=null && o instanceof Data)
            return(this.dia==((Data)o).dia && this.mes==((Data)o).mes && this.ano==((Data)o).ano);
        return false;
        
    }
    
    public Data clonedata(){
        Data d=new Data(this.dia,this.mes,this.ano);
        return d;
    }
    
    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
    
    
}
