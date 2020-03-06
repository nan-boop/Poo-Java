/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dell-9BQM7S1
 */
public class Calcular
{
   
    public String  Calcular(String n1, String n2,String op){
        
        
        
    
     Double num1=Double.parseDouble(n1);
     Double resultado= 0.0;
     Double num2=Double.parseDouble(n2);
        if (op=="+"){
        resultado=num1+num2;
    }  
        if (op=="-"){
        resultado= num1-num2;
    }
        if (op=="*"){
        resultado=num1*num2;
    }
        if (op=="/"){
        resultado= num1/num2;
    }
        return resultado.toString();
        
       
        
        
     }
     
     
     
    
    
    
}