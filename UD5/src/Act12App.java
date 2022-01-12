/**
 * 
 */

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;

public class Act12App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passwd = "1234";
		int intentos = 0;
		boolean correcto = false;
		do {
			String password = JOptionPane.showInputDialog("Introduce una contraseña");
			if (password.equals(passwd)) {
				System.out.println("Enhorabuena");
				correcto = true;
			} else {
				System.out.println("Contraseña incorrecta, prueba otra vez");
				intentos++;
			}
		} while (!correcto && intentos < 3);

	}
}
