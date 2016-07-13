package pessoa;
import java.io.Serializable;
import java.util.Vector;

public class Movel implements Serializable{
    private Vector<Videos> prateleira;
    private Videos p;
    
    public Movel(){
         prateleira=new Vector<Videos>();
    }
    
    public void insertVideo(Videos v){
        try{
        prateleira.addElement(v);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void insertVideoAt(Videos v,int n){
        try{
        prateleira.insertElementAt(v,n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Videos elementAt(int n){
   
         try{ 
            p=prateleira.elementAt(n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return p;
    }
    
    public void removeVideoAt(int n){ 
        try{
        prateleira.removeElementAt(n);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void setElementAt(Videos v, int n){
        try{
        prateleira.setElementAt(v, n);
        }
        
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }        
    }
    
    public void eliminaVideos(Videos v,int n){
        try{
        prateleira.clear();
        }
         catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Vector clonevector(){
        
        prateleira.clone();
        return prateleira;
        
    }
    
    public boolean contains(Videos v){
      
          return prateleira.contains(v);
       
    }
    
    public boolean vazia(Videos v){
        return prateleira.isEmpty();
    }
    
    public int size(){
        
        return prateleira.size();
    }
    
    
}