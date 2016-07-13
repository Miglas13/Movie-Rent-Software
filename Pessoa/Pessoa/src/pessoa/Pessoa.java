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
public class Pessoa  implements Serializable{

    private String nome;
    private int num;
    private Movel emprestimo;
    
    public Pessoa(){
        nome="";
        num=0;
    }

    public Pessoa(String nome, int num) {
        this.nome = nome;
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public int getNum() {
        return num;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public boolean equalspes(Object o){
        if(o!=null && o instanceof Pessoa)
            return(this.nome.equals(((Pessoa)o).nome)&& this.num==((Pessoa)o).num);
        else
            return false;
    }
    
    public Pessoa clone(){
        Pessoa p=new Pessoa(this.nome,this.num);
        return p;
    }

   
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", num=" + num + '}';
    }
    
    
}
