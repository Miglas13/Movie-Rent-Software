package pessoa;
import java.io.Serializable;
import java.util.Vector;

public class Vpes implements Serializable{
    private Vector<Pessoa> pes;
    private Pessoa p;
    
    public Vpes(){
         pes=new Vector<Pessoa>();
    }
    
    public void insertPes(Pessoa v){
        try{
        pes.addElement(v);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void insertPesAt(Pessoa v,int n){
        try{
        pes.insertElementAt(v,n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void removePesAt(int n){
        try{
        pes.removeElementAt(n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void setElementAt(Pessoa v, int n){
        try{
        pes.setElementAt(v, n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public Pessoa elementAt(int n){
   
         try{ 
            p=pes.elementAt(n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return p;
    }
    
    public void eliminaPes(Pessoa v,int n){
        try{
        pes.clear();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Vector<Pessoa> clonevector(){
        pes.clone();
        return pes;
    }
    
    public boolean contains(Pessoa v){
        return pes.contains(v);
    }
    
    public boolean vazia(Pessoa v){
        return pes.isEmpty();
    }
    
    public int size(){
        return pes.size();
    }
    
    public String toString(){
        return pes.toString();
    }
}