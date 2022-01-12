import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Marcos
 *
 */
public class Act6App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double iva = 0.21;
		String text_numero = JOptionPane.showInputDialog("Introduce un numero");
		double numero  = Double.parseDouble(text_numero);
		System.out.println("El precio con iva = "+ (numero+(numero*iva)));
	}

}
