package com.vmgo.reserva;
public class ReservaService {
  private  String cidade;
 private String endereco;


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
  
    
    public String Reservar(String cidade, String endereco){
        
        if(cidade == "Belo Horizonte" ||  cidade == "Contagem"){
            return " Motorista a caminho";
        }else{
            return "Área fora de cobertura";
        }
        
    }
 
    public static void main(String[] args) {
        
    }
}