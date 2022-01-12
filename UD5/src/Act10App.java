import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Marcos
 *
 */
public class Act10App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text_numero_ventas = JOptionPane.showInputDialog("Introduce un numero de ventas");
		int numero_ventas = Integer.parseInt(text_numero_ventas);
		int total = 0;
		for (int i = 0; i < numero_ventas; i++) {
			String text_coste_ventas = JOptionPane.showInputDialog("Introduce coste venta");
			int coste = Integer.parseInt(text_coste_ventas);
			total = total + coste;
		}
		System.out.println("Numero de ventas: " + numero_ventas);
		System.out.println("Total coste ventas= " + total);
	}

}
