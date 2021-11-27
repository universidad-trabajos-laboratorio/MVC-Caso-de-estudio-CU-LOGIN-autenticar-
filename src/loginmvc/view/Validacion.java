package loginmvc.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*@author ABEL*/
public class Validacion {

    private String mensaje = "";

    public String inEmail(String email) {
        String regx = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            mostrarError("Formato de email incorrecto");
            return "";
        }
        return email;
    }

    public String inPassword(String password) {
        boolean isUpperCase = false;
        boolean isLoweCase = false;
        boolean isNumeric = false;
        int maxCharacter = 6;

        for (char letra : password.toCharArray()) {
            if (Character.isUpperCase(letra)) {
                isUpperCase = true;
            }
            if (Character.isLowerCase(letra)) {
                isLoweCase = true;
            }
            if (Character.isDigit(letra)) {
                isNumeric = true;
            }
        }
        if (!isUpperCase) {
            mostrarError("La contraseña requiere minimo una mayuscula");
            return "";
        }
        if (password.length() < maxCharacter) {
            mostrarError("La contraseña requirere mínimo 6 caracteres");
            return "";
        }
        if (!isLoweCase) {
            mostrarError("La contraseña requiere mínimo una minúscula");
            return "";
        }
        if (!isNumeric) {
            mostrarError("La contraseña requiere mínimo una cifra");
            return "";
        }

        return password;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void mostrarError(String mensajesValidacion) {
        this.setMensaje("Error: " + mensajesValidacion);
    }

    public boolean estadoValidacionDatos() {
        return mensaje.equals("");
    }

}
