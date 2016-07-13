//Trabalho realizado por André Louro nº32061; André Pinho nº32795; Miguel Cardoso nº32936; Tiago Mendes nº32122


package pessoa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import myinputs.Ler;

public class Teste {
    public static void main(String[] args){
        int op;
        Vemp emp=new Vemp();
        Movel m=new Movel();
        Videos v;
        Venda v2;
        Vpes pes=new Vpes();
        Emprestimos e1;
        File f1=new File("videos.dat");
        File f2=new File("pessoas.dat");
        File f3=new File("emprestimos.dat");
        try{
           FileInputStream is = new FileInputStream(f1);
        ObjectInputStream oIS= new ObjectInputStream(is);
           m=(Movel)oIS.readObject();
           oIS.close();
        }
        catch(IOException e){
           System.out.println("hhhhhh"+e.getMessage());
           
        }
         catch(ClassNotFoundException e){
           System.out.println("Classe nÃ£o existente - " + e.getMessage());
         }
        try{
           FileInputStream is2 = new FileInputStream (f2);
           ObjectInputStream oIS2= new ObjectInputStream(is2);
           pes=(Vpes)oIS2.readObject();
           oIS2.close();
        }
        catch(IOException e){
           System.out.println("hhhhhh"+e.getMessage());
        }
        catch (ClassNotFoundException e){
           System.out.println("Classe nÃ£o existente - " + e.getMessage()); 
        }
        try{
           FileInputStream is3 = new FileInputStream (f3);
           ObjectInputStream oIS3= new ObjectInputStream(is3);
           emp=(Vemp)oIS3.readObject();
           oIS3.close();
        }
        catch(IOException e){
           System.out.println("hhhhhh"+e.getMessage());
    
       }
       catch (ClassNotFoundException e){
           System.out.println("Classe nÃ£o existente - " + e.getMessage());
       }   
        do{
        System.out.println("******MENU********");
        System.out.println("1-Inserir Video");
        System.out.println("2-Mostrar todos videos");
        System.out.println("3-Mostrar videos disponiveis");
        System.out.println("4-Emprestar videos disponiveis");
        System.out.println("5-Devolver videos emprestados");
        System.out.println("6-Comprar videos");
        System.out.println("7-Apagar um video");
        System.out.println("8-Pesquisa");
        System.out.println("9-Adicionar uma Pessoa");
        System.out.println("10-Remover uma Pessoa");
        System.out.println("0-Terminar");
        op=Ler.umInt();
        switch(op){
            case 1:{
                System.out.println("Introduza o titulo:");
                String s=Ler.umaString();
                System.out.println("Introduza a categoria:");
                String c=Ler.umaString();
                System.out.println("Introduza a duracao:");
                int d=Ler.umInt();
                System.out.println("Introduza o nome do realizador:");
                String r=Ler.umaString();
                v=new Videos(d,c,s,r,"disponivel",0);
                m.insertVideo(v);
                break;
            }
            case 2:{
                for(int i=0;i<m.size();i++){
                    v=(Videos)m.elementAt(i);
                    System.out.println(v.toString());
                }
                break;
            }
             case 3:{
                int i,j;
                j=m.size();
                for(i=0;i<j;i++){
                    v=(Videos)m.elementAt(i);
                    String d="disponivel";
                    if(v.getDisponibilidade().equals(d)) {
                        System.out.println(v.toString());
                    }
                }
                break;
            }
             case 4:{
                    System.out.println("Qual o video que deseja emprestar?");
                    String s=Ler.umaString();
                    System.out.println("Qual o dia do emprestimo?");
                    int dia=Ler.umInt();
                    System.out.println("Qual o mês do emprestimo?");
                    int mes=Ler.umInt();
                    System.out.println("Qual o ano do emprestimo?");
                    int ano=Ler.umInt();
                    System.out.println("Qual o numero da  pessoa:");
                    int num=Ler.umInt();
                    System.out.println("Qual o nome da pessoa:");
                    String nome=Ler.umaString();
                    int j=m.size();
                    for(int i=0;i<j;i++){
                        v=(Videos)m.elementAt(i);
                        if(v.getNome().equals(s))
                              emp.insertEmp(v.Empresto(v.getNome(),v.getNum(),dia,mes,ano));
                    }
                    Pessoa p=new Pessoa(nome,num);
                    pes.insertPes(p);
                    break;
            }
             case 5:{
                 System.out.println("Diga o dia em que o video foi emprestado.");
                 int dia=Ler.umInt();
                 System.out.println("Diga o mes");
                 int mes=Ler.umInt();
                 System.out.println("Diga o ano");
                 int ano=Ler.umInt();
                 for(int i=0;i<emp.size();i++){
                     e1=(Emprestimos)emp.elementAt(i);
                     if(e1.getDD().getDia()==dia && e1.getDD().getMes()==mes && e1.getDD().getAno()==ano){
                         for(int n=0;n<m.size();n++){
                             v=(Videos)m.elementAt(n);
                             if(v.getNome().equals(e1.getNome()))   v.Devolvido(dia, mes, ano);
                         }
                     }
                 }
                 break;
             }
            case 6:{
                    System.out.println("Qual o video que deseja comprar?");
                    String s=Ler.umaString();
                    System.out.println("Qual o dia da compra?");
                    int a=Ler.umInt();
                    System.out.println("Qual o mês da compra?");
                    int b=Ler.umInt();
                    System.out.println("Qual o ano da compra?");
                    int c=Ler.umInt();
                    System.out.println("Qual o preço do video?");
                    float f=Ler.umFloat();
                    int j=m.size();
                    Venda d;
                    for(int i=0;i<j;i++){
                        v=(Videos)m.elementAt(i);
                        if(v.getNome().equals(s)){
                            d=new Venda(f,a,b,c);
                            m.removeVideoAt(i);
                        }
                    }
                    break;
            }
            case 7:{
                System.out.println("Qual o nome do video que deseja apagar?");
                String s=Ler.umaString();
                int j=m.size();
                for(int i=0;i<j;i++){
                    v=(Videos)m.elementAt(i);
                    if(v.getNome().equals(s))
                        m.removeVideoAt(i);
                }
                break;
            }
            case 8:{
                System.out.println("Pesquisa da Pessoa que mais emprestimos pediu:");
                int maior=0,mpos=0,vezes=0;
                String sl;
                String video;
                System.out.println("Introduza o nome do video:");
                video=Ler.umaString();
                for(int j=0;j<pes.size();j++){
            
                for(int i=0;i<emp.size();i++){
            
                    if(emp.elementAt(i).getTipo().equals("emprestado")){
                if(emp.elementAt(i).getNome().equals(video))
                {
                if(emp.elementAt(i).getNum()==pes.elementAt(j).getNum())
                    vezes++;
                
                }
            }
            
        }
            if(vezes>maior){
                maior=vezes;
                mpos=j;
            }
            vezes=0;
        
        }
        
        sl=pes.elementAt(mpos).getNome();
         System.out.println(sl);
                break;
            }
            case 9:{
                int num;
                String nome;
                Pessoa p;
                System.out.println("Num da pessoa");
                num=Ler.umInt();
                System.out.println("Nome da Pessoa:");
                nome=Ler.umaString();
                p=new Pessoa(nome,num);
                pes.insertPes(p);
                break;
            }
            case 10:{
                System.out.println("Qual o nome da Pessoa que quer remover:");
                String nome=Ler.umaString();
                for(int i=0;i<pes.size();i++){
                    Pessoa p=(Pessoa)pes.elementAt(i);
                    if(p.getNome().equals(nome))    pes.removePesAt(i);
                }
                break;
            }
        }
        }while(op!=0);
        try{
        FileOutputStream os = new FileOutputStream (f1);
       ObjectOutputStream oOs = new ObjectOutputStream(os);
       oOs.writeObject(m);
       
       oOs.close();
          
       }
       catch(IOException e){
           System.out.println(e.getMessage());
           
       }
       
       
       try{
       FileOutputStream os2 = new FileOutputStream (f2);
       ObjectOutputStream oOs2 = new ObjectOutputStream(os2);
       oOs2.writeObject(pes);
       
       oOs2.close();
          
       }
       catch(IOException e){
           System.out.println(e.getMessage());
           
       }
       
       
    try{
       FileOutputStream os3 = new FileOutputStream (f3);
       ObjectOutputStream oOs3 = new ObjectOutputStream(os3);
       oOs3.writeObject(emp);
       
       oOs3.close();
           
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       
}
}
    