/**
 * 
 */

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;
public class Act4App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = Math.PI;
		String text_radio = JOptionPane.showInputDialog("Introduce el radio");
		double radio = Double.parseDouble(text_radio);
		System.out.println("El area del circulo es= "+ pi*Math.pow(radio, 2));
	}

}
