/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vc
 */
public class Calcular
{
   
    public String calcular(Double n1, Double n2,String op){
     Double resultado=0.0;   
     
        if (op==("+")){
        resultado=n1+n2;
    }  
        if (op==("-")){
        resultado= n1-n2;
    }
        if (op==("*")){
        resultado=n1*n2;
    }
        if (op==("/")){
        resultado= n1/n2;
    }
        return resultado.toString();
        
       
        
        
     }
     
     
     
    
    
    
}