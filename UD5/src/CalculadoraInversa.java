/**
 * 
 */

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;
public class CalculadoraInversa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text_num1 = JOptionPane.showInputDialog("Introduce un numero");
		int num1= Integer.parseInt(text_num1);
		String text_num2 = JOptionPane.showInputDialog("Introduce un segundo  numero");
		int num2= Integer.parseInt(text_num2);
		String signo= JOptionPane.showInputDialog("Introduce un signo aritmético");
		
		switch (signo) {
		case "+":
			System.out.println("Resultado= "+(num1+num2));
			break;
		case "-":
			System.out.println("Resultado= "+(num1-num2));
			break;
		case "*":
			System.out.println("Resultado= "+(num1*num2));
			break;
		case "/":
			System.out.println("Resultado= "+(num1/num2));
			break;
		case "^":
			System.out.println("Resultado= "+(num1^num2));
			break;
		case "%":
			System.out.println("Resultado= "+(num1%num2));
			break;
		default:
			System.out.println("Introduce un signo aritmético valido");
			break;
		}
		
	}


}
