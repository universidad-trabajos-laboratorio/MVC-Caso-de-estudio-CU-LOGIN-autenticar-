package loginmvc.view;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import loginmvc.model.LoginModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author ABEL
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form VLogin
     */
    private LoginModel mlogin;

    public LoginView(LoginModel mlogin) {
        this.mlogin = mlogin;
    }

    public void cargarVistaLogin() {
        this.initComponents();
        this.setVisible(true);

    }

    public boolean recuperacionDeDatos() {
        Validacion validacion = new Validacion();
        mlogin.setEmail(validacion.inEmail(input_email.getText()));        
        mlogin.setPassword(validacion.inPassword(input_password.getText()));       
        
        /*Las los mensajes de validacion las dibujo aqui pos no queria pasar los (JLabel)a la clase Validacion*/
        mostrarMensaje(validacion.getMensaje());
        return validacion.estadoValidacionDatos();

    }

    public void vistaUsuarioBloqueado() {
        //No es una vista en si, pero bloquea los inputs de entrada y muestra un mensaje de bloqueo
        input_email.setEnabled(false);
        input_password.setEnabled(false);
        mostrarMensaje("Usuario Bloqueado <p>NO PUEDE INGRESAR AL SISTEMA</p>");
        System.out.println("EL USUARIO ESTA BLOQUEADO");
       
    }
    public void mostrarMensaje(String mensaje){
        text_notification.setText("<html>"+mensaje+"</html>");
        System.out.println(mensaje);
        
    }
            

    public void vistaBienvenida() {
        //Para no mostrar solo un mensaje de bienvenida cree una cambiando de panel que actua como mensaje de bienvenida
        JPanel bienvenida = new JPanel();
        bienvenida.setLayout(new GridBagLayout());
        bienvenida.add(new JLabel("Bienvenido"));
        bienvenida.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        bienvenida.setBackground(new java.awt.Color(255, 255, 255));
        
        this.getContentPane().removeAll();
        this.getContentPane().add(bienvenida, new AbsoluteConstraints(0, 0,261, 311));
        System.out.println("BIENVENIDO");
     
}

    //"Código de creación de vista Generado por NetBeans"
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vista_login = new javax.swing.JPanel();
        btn_iniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_notification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vista_login.setBackground(new java.awt.Color(255, 255, 255));

        btn_iniciarSesion.setBackground(new java.awt.Color(79, 113, 246));
        btn_iniciarSesion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciarSesion.setText("Iniciar Sesión");
        btn_iniciarSesion.setBorder(null);
        btn_iniciarSesion.setBorderPainted(false);
        btn_iniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciarSesion.setFocusPainted(false);
        btn_iniciarSesion.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 52, 99));
        jLabel1.setText("Login");

        input_email.setBackground(new java.awt.Color(242, 242, 242));
        input_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_email.setForeground(new java.awt.Color(13, 13, 13));
        input_email.setText("a.llontopmeza@gmail.com");
        input_email.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        input_email.setCaretColor(new java.awt.Color(0, 0, 0));
        input_email.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_email.setSelectionColor(new java.awt.Color(78, 104, 227));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 113, 246));
        jLabel2.setText("Email");
        jLabel2.setAlignmentY(0.0F);

        input_password.setBackground(new java.awt.Color(242, 242, 242));
        input_password.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_password.setForeground(new java.awt.Color(13, 13, 13));
        input_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        input_password.setCaretColor(new java.awt.Color(0, 0, 0));
        input_password.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_password.setSelectionColor(new java.awt.Color(78, 104, 227));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(79, 113, 246));
        jLabel3.setText("Password");
        jLabel3.setAlignmentY(0.0F);

        text_notification.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        text_notification.setForeground(new java.awt.Color(248, 57, 57));
        text_notification.setToolTipText("");
        text_notification.setAlignmentY(0.0F);

        javax.swing.GroupLayout vista_loginLayout = new javax.swing.GroupLayout(vista_login);
        vista_login.setLayout(vista_loginLayout);
        vista_loginLayout.setHorizontalGroup(
            vista_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vista_loginLayout.createSequentialGroup()
                .addGroup(vista_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vista_loginLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(vista_loginLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vista_loginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(vista_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_email, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_password)
                            .addComponent(text_notification, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        vista_loginLayout.setVerticalGroup(
            vista_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vista_loginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(vista_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vista_loginLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(vista_loginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(vista_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(vista_loginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input_password, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(text_notification, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(vista_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_iniciarSesion;
    public javax.swing.JTextField input_email;
    public javax.swing.JTextField input_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel text_notification;
    private javax.swing.JPanel vista_login;
    // End of variables declaration//GEN-END:variables
}
