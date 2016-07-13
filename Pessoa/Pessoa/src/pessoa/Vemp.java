package pessoa;
import java.io.Serializable;
import java.util.Vector;


public class Vemp implements Serializable{
    private Vector<Emprestimos> emp;
    private Emprestimos p;
    public Vemp(){
        
         emp=new Vector<Emprestimos>();
    }
    
    public void insertEmp(Emprestimos v){
        try{
        emp.addElement(v);
        }
         catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void insertEmpAt(Emprestimos v,int n){
        try{
        emp.insertElementAt(v,n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
         catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
     public Emprestimos elementAt(int n){
   
         try{ 
            p=emp.elementAt(n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return p;
    }
    
    public void removeEmpAt(int n){
        try{
        emp.removeElementAt(n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void setElementAt(Emprestimos v, int n){
        try{
        emp.setElementAt(v, n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
         catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void eliminaEmp(Emprestimos v,int n){
        try{
        emp.clear();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Vector<Emprestimos> clonevector(){
        emp.clone();
        return emp;
    }
    
    public boolean contains(Emprestimos v){
        return emp.contains(v);
    }
    
    public boolean vazia(Emprestimos v){
        return emp.isEmpty();
    }
    
    public int size(){
        return emp.size();
    }
    
    public String toString(){
        return emp.toString();
    }
}