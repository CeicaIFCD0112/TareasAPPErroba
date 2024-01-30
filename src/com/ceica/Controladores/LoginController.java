package com.ceica.Controladores;

import com.ceica.modelos.Usuario;

public class LoginController {
    public static boolean login(String usuario,String password){
        return Usuario.getUsuario(usuario,password);
    }
}
