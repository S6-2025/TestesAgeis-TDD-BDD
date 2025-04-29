package runner.steps;

import io.cucumber.java.pt.*;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class ReservaSteps {

    private String enderecoInformado;
    private String cidadeInformado;
    private String mensagem;

    private Map<String, String> bancoEnderecos = new HashMap<>();
    
    @Dado("que o usuário esteja em uma cidade válida")
        public void o_usuario_esta_em_cidade_valida() {
            System.out.println("=== Step foi executado ===");
            bancoEnderecos.put("tanto faz","CONTAGEM");
        }

    @Quando("informar o endereço {string} e a cidade {string}")
        public void o_usuario_digita_o_endereco_e_cidade(String endereco, String cidade){
             this.enderecoInformado = endereco;
             this.cidadeInformado = cidade;
        }
       
    @Quando("confirmar as informações")
        public void clicar_no_botao_de_login() {
            String cidadeValida = bancoEnderecos.get(cidadeInformado);
        if (cidadeValida != null && cidadeValida.equals(cidadeInformado)) {
            mensagem = "Motorista a caminho";
        } else {
            mensagem = "Area fora de cobertura";
        }
    }
    @Então("o sistema deve mostrar a mensagem {string}")
        public void o_sistema_deve_mostrar_a_mensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, mensagem);

    }
}
