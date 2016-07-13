
package pessoa;

import java.util.logging.Logger;

public class Venda extends Data{
    private float preco;
    Data registo;
    public Venda(){
    super();    
    preco=0; 
    }

    public Venda(float preco,int dia,int mes,int ano) {
        super(dia,mes,ano);
        this.preco = preco;
    }
    
    public float getPreco() {
        return preco;
    }

    public Data getRegisto() {
        Data d=new Data(super.getDia(),super.getMes(),super.getAno()) ;
        return d;
    }

    public void setRegisto(int dia,int mes,int ano) {
        super.setDia(dia);
        super.setMes(mes);
        super.setAno(ano);
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String s=super.toString();
         s=s+"Venda{" + "preco=" + preco + '}';
         return s;
    }
    public boolean equals(Object o){
        if(o!=null && o instanceof Venda){
            Venda v=(Venda) o;
            Data n=new Data(super.getDia(),super.getMes(),super.getAno()) ;
            return this.preco==v.preco && n.equalsdata(v) ;
        }
        return false;
    }
    public Venda clone(){
        Venda v=new Venda(this.preco,super.getDia(),super.getMes(),super.getAno());
        return v;
    }
}
