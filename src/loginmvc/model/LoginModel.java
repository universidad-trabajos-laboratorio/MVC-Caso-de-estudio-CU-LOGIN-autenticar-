package loginmvc.model;
/*@author ABEL*/
public class LoginModel {
    private String email;
    private String password;  
    private boolean estado;
    private int nIncidencias;
    
    public LoginModel(){
        this.estado=true;
        this.nIncidencias=0;
    }

    public int getnIncidencias() {
        return nIncidencias;
    }

    public boolean isLoginActivo(){
        return estado;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean calcularNumeroIncidencias(){
        nIncidencias++;
        if(nIncidencias>2){
            cambiarEstadoLogin(false);
        }   
        return estado;
    }
    
    private void cambiarEstadoLogin(boolean estado){
        this.estado=estado;
    }

}
