package Modelo;

public class controle
{   
    public String Calcular(String n1, String n2, String op)
    {
    String resultado="";
    Validacao validacao = new Validacao();
    validacao.validar(n1,n2);
    if (validacao.mensagem.equals(""))
    {
    Calcular calcular=new Calcular();
    resultado=calcular.calcular(validacao.num1,validacao.num2,op);
    
    }
    else{
    resultado=validacao.mensagem;
    }
    return resultado;
    }
    
}