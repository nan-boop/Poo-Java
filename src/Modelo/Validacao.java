
package Modelo;


public class Validacao
{
public Double num1;
public Double num2; 
public String mensagem = "";
    public String validar(String n1,String n2)
    {
    this.mensagem="";
    try 
    {
     this.num1 = Double.parseDouble(n1);
     this.num2 = Double.parseDouble(n2);
    
    } 
     catch(Exception e)
     {
     mensagem = "Erro!";
     
     }
    return this.mensagem;        
    
    }
    
    
    
    
    }

