import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Marcos
 *
 */
public class Act5App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text_numero = JOptionPane.showInputDialog("Introduce tu nombre");
		double numero = Double.parseDouble(text_numero);
		if (numero/2==0) {
			System.out.println("Resto = 0");
		} else {
			System.out.println("Resto = "+numero/2 );
		}
	}

}
