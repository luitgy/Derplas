package com.alonsosolera.derplas.example;

import com.alonsosolera.derplas.json.JsonTransformer;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author luitgy
 */
@Controller
public class UsuarioController {

    @Autowired
    private JsonTransformer jsonTransformer;

    @RequestMapping(value = {"/Usuario"})
    public void prueba(HttpServletRequest httpRequest, HttpServletResponse httpServletResponse) throws IOException {

        //JsonTransformer jsonTransformer=new JsonTransformerImpl();
        Usuario usuario = new Usuario("Alberto Tortosa", "alberto_tortosa@gmail.com", 91);
        String jsonUsuario = jsonTransformer.toJson(usuario);

        httpServletResponse.getWriter().println(jsonUsuario);

    }

}
