package calculator;

import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		
		
		int num1, num2, resul = 0;
		char op;
		
		num1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));
		op=JOptionPane.showInputDialog("Ingresa una letra: S-suma, R-resta, P-producto, D-división").charAt(0);
				
		if(op=='S' || op=='s') {
			resul=num1+num2;
		}
		else if(op=='R' || op=='r'){
			resul=num1-num2;
		}
		else if(op=='P' || op=='p') {
			resul=num1*num2;
		}
		else if(op=='D' || op=='d') {
			resul=num1/num2;
		}
		else {
			JOptionPane.showConfirmDialog(null, "Ingresa una operación válida");
		}

		
		JOptionPane.showConfirmDialog(null, "El resultado es: "+resul);
		
	}

}
