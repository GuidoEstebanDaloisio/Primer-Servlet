package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    //Operacion CREATE
    public void crearUsuario(Usuario usu){
        usuJpa.create(usu);
    }
    
    //Operacion READ
    public List<Usuario> traerUsuarios(){
        return usuJpa.findUsuarioEntities();
    }
}
