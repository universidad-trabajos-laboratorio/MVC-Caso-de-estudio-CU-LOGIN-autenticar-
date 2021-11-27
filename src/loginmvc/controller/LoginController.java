package loginmvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import loginmvc.model.LoginModel;
import loginmvc.view.LoginView;

/*@author ABEL*/
public class LoginController implements ActionListener {

    private LoginView vlogin;
    private LoginModel mlogin;

    public LoginController() {
        mlogin = new LoginModel();
        vlogin = new LoginView(mlogin);
    }

    public void controlar() {
        vlogin.cargarVistaLogin();
        vlogin.btn_iniciarSesion.addActionListener(this);
    }

    public void iniciarSesion() {
        if (vlogin.recuperacionDeDatos()) {
            if (mlogin.isLoginActivo()) {
                vlogin.vistaBienvenida();
            } else {
                vlogin.vistaUsuarioBloqueado();
            }
        } else {
            if(!mlogin.calcularNumeroIncidencias()){
                vlogin.vistaUsuarioBloqueado();
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        iniciarSesion();
    }

    public static void main(String[] args) {
        LoginController cLogin = new LoginController();
        cLogin.controlar();
    }

}
