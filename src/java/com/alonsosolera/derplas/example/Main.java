package com.alonsosolera.derplas.example;

import com.alonsosolera.derplas.json.JsonTransformer;
import com.alonsosolera.derplas.json.impl.JsonTransformerImpl;

/**
 *
 * @author luitgy
 */
public class Main {

    public static void main(String[] args) {

        try {

            JsonTransformer jsonTransformer = new JsonTransformerImpl();

            Usuario usuario = new Usuario("Alberto Tortosa", "alberto_tortosa@gmail.com", 91);

            String jsonUsuario = jsonTransformer.toJson(usuario);

            System.out.println(jsonUsuario);

            Usuario newUsuario = (Usuario) jsonTransformer.fromJson(jsonUsuario, Usuario.class);

            System.out.println("Nombre:" + newUsuario.getNombre());
            System.out.println("E-Mail:" + newUsuario.getEmail());
            System.out.println("Edad:" + newUsuario.getEdad());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
