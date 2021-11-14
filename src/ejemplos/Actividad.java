package ejemplos;

import javax.swing.JOptionPane;

public class Actividad {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Imgrese su nombre:");
		String apellido = JOptionPane.showInputDialog("Ingrese su apelllido");
		String edad = JOptionPane.showInputDialog("Imgrese su edad");
		String hobbie = JOptionPane.showInputDialog("Ingres su hobbie");
		String editor = JOptionPane.showInputDialog("Ingrese su editor de código preferido");
		String sistema = JOptionPane.showInputDialog("Ingrese su sistema operativo que utiliza");
							
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		System.out.println(hobbie);
		System.out.println(editor);
		System.out.println(sistema);		

	}

}
