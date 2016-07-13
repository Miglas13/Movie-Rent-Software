package pessoa;

import java.io.Serializable;

public class Videos implements Serializable{
    private int duracao;
    private String categoria;
    private String nome;
    private String realizador;
    private String disponibilidade;
    private int num;
    private Emprestimos n,e;
    public Videos(){
        
        duracao=0;
        categoria="";
        nome="";
        realizador="";
        disponibilidade="";
        num=0;
    }

    public Videos(int duracao,String categoria,String nome,String realizador,String disponibilidade,int num ) {
        this.num=num;
        this.disponibilidade=disponibilidade;
        this.duracao = duracao;
        this.categoria = categoria;
        this.nome = nome;
        this.realizador = realizador;
    }
    
    public int getDuracao(){
        return duracao;
    }
    public String getCategoria(){
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getRealizador() {
        return realizador;
    }
    

    public String getDisponibilidade() {
        return disponibilidade;
    }
    
    public int getNum(){
        return num;
    }
    

    public Emprestimos Devolvido(int dia,int mes,int ano) {
        disponibilidade ="disponivel";
        num=0;
        n=new Emprestimos(nome,num,"devolucao",dia,mes,ano);
            
        return n;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRealizador(String realizador) {
        this.realizador = realizador;
    }
    
    public Emprestimos Empresto(String nome,int num,int dia,int mes,int ano){
        disponibilidade="emprestado";
        this.num=num;
        e=new Emprestimos(nome,num,"emprestimo",dia,mes,ano);
        return e;
    }

    @Override
    public String toString() {
        String s;
        s="Videos{" + "duracao=" + duracao + ", categoria=" 
                + categoria + ", nome=" + nome + ", realizador=" 
                + realizador + ",disponibilidade="+ disponibilidade + '}';
        return s;
    }
    public boolean equals(Object o){
        if(o!=null && o instanceof Videos){
            Videos v=(Videos) o;
            return this.duracao==v.duracao && this.disponibilidade==v.disponibilidade && this.categoria==v.categoria && this.nome==v.nome && this.realizador==v.realizador && this.num==v.num;
        }
        return false;
    }
    public Videos clone(){
        Videos v=new Videos(this.duracao,this.categoria,this.nome,this.realizador,this.disponibilidade,this.num);
        return v;
    }
   }
