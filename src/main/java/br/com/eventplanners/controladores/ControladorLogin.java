package br.com.eventplanners.controladores;

public class ControladorLogin {
    public boolean entrarNoSistema(String usuario, String senha){
        if(usuario.equals("admin") && senha.equals("master")){
            return true;
        }else {
            return false;
        }
    };
}
