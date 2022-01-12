/**
 * 
 */

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;

public class Act11App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog("Dia de la semana");
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println(dia + " es un dia laboral");
			break;
		case "sabado":
		case "domingo":
			System.out.println(dia + " no es un dia laboral");
			break;
		default:
			System.out.println("Introduce un dia de la semana valido");
			break;
		}

	}

}
