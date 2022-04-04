import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class HelloWorldResource {

    @GetMapping
    public String home(){
        String msg = "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!";
        return msg;
    }
}
