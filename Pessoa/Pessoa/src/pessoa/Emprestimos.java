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
public class Emprestimos implements Serializable{
    private String nome,tipo;
    private int num;
    private Data  dd;
  
    public Emprestimos(){
        dd=null;
        nome="";
        tipo="";
        num=0;
    }

    public Emprestimos(String nome,int num,String tipo,int dia,int mes,int ano) {
        dd=new Data(dia,mes,ano);
        this.tipo=tipo;
        this.nome = nome;
        this.num =num;
       
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void setDD(int dia,int mes,int ano){
        dd.setDia(dia);
        dd.setMes(mes);
        dd.setAno(ano);
        
    }
    
  
    
    public Data getDD(){
        return dd;
    }

    @Override
    public String toString() {
        String s=dd.toString();
        s=s+"Devolucoes{" + "nome=" + nome + ", numero=" + num + '}';
        return s;
    }
    
   
    
    public boolean equalsemp(Object o){
        
        if(o!=null && o instanceof Emprestimos){
            return( this.dd.equalsdata(o) && this.nome.equals(((Emprestimos)o).nome)&& this.num==(((Emprestimos)o).num))&& this.tipo.equals(((Emprestimos)o).tipo);
        }else
            return false;
    }
    
    public Emprestimos clone(){
        Emprestimos e=new Emprestimos(this.nome,this.num,this.tipo,dd.getDia(),dd.getMes(),dd.getAno());
        return e;
    }
}
