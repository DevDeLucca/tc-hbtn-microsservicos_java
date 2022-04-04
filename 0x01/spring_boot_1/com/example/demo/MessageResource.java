import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome(String msg) {
       msg = "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT";
       return msg;
    }

    @GetMapping(value = "/login")
    public String login(String user, String password){
        String result = null;
        String usuario = "andreza secon";
        String senha = "123456789";

        if (usuario.isBlank() && senha.isBlank()){
            result = "USUÁRIO E SENHA NÃO INFORMADOS";
        }
        else if (usuario.length() => 15 && senha.length() => 15){
            result = "USUÁRIO E SENHA INVÁLIDOS";
        }else {
            result = "LOGIN EFETUADO COM SUCESSO !!!";
        }

        return result;
    }
}
