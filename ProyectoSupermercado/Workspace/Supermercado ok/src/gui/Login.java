/*package gui;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Login extends Applet
	//public String name;
	//public String pass;
	implements ActionListener{
	
	public TextField name;
	public TextField pass;
	
	public void init() {
		Label namep=new Label ("Nombre: ",Label.RIGHT);
		Label passp=new Label ("Password: ",Label.RIGHT);
		name = new TextField(12);
		pass = new TextField(8);
		pass.setEchoChar('*');
		
		add(namep);
		add(name);
		add(passp);
		add(pass);
		
		name.addActionListener(this);
		pass.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		repaint();
		}
	}
	

}
*/


package gui;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import control.Verificador;
//import gui.GUI;

public class Login extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel lblusuario,lblpassword;
	JTextField txtusuario;
	JPasswordField txtpassword;
	JButton btnAceptar,btnCancelar;
	int postObt=0;
	public Login(JFrame g){
		super(g, true);
		Container c= getContentPane();
		c.setLayout(new GridLayout(3,2));
		lblusuario=new JLabel("Usuario");
		lblpassword=new JLabel("Password");
		txtusuario=new JTextField("");
		txtpassword=new JPasswordField("");
		btnAceptar=new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnCancelar=new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		c.add(lblusuario);
		c.add(txtusuario);
		c.add(lblpassword);
		c.add(txtpassword);
		c.add(btnAceptar);
		c.add(btnCancelar);
		setTitle("SISTEMA MiniSuper");
		setSize(330,120);
		setVisible(true);
	}
	public void Verificar(){
		Verificador x=new Verificador(txtusuario.getText());
		x.VerificarDatos(txtusuario.getText(),txtpassword.getText());
		postObt=x.ObtenerValor();
		if(postObt!=0){
			JOptionPane.showMessageDialog(null,"Bienvenido al Sistema MiniSuper");
			this.setVisible(false);
		}
		else{
			JOptionPane.showMessageDialog(null,"Acceso Denegado");
		}
	}
	public void Cancelar(){
		System.exit(1);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnAceptar){
			Verificar();
		}
		if(e.getSource()==btnCancelar){
			Cancelar();
		}		
	}
}