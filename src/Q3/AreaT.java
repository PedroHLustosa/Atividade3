package Q3;

import javax.swing.JOptionPane;

public class AreaT {
	
	String str_a1, str_b1, str_c1, str_a2, str_b2, str_c2, str_area1, str_area2, str_maior;
	float a1, b1, c1, a2, b2, c2, p, area1, area2;
	
	public void Ler_Dados() {
		str_a1 = JOptionPane.showInputDialog(null, "Digite o lado 'a' do primeiro triangulo:", "Lado 'a'", JOptionPane.DEFAULT_OPTION);
		str_b1 = JOptionPane.showInputDialog(null, "Digite o lado 'b' do primeiro triangulo:", "Lado 'b'", JOptionPane.DEFAULT_OPTION);
		str_c1 = JOptionPane.showInputDialog(null, "Digite o lado 'c' do primeiro triangulo:", "Lado 'c'", JOptionPane.DEFAULT_OPTION);
			
		a1 = Float.parseFloat(str_a1);
		b1 = Float.parseFloat(str_b1);
		c1 = Float.parseFloat(str_c1);
		
		str_a2 = JOptionPane.showInputDialog(null, "Digite o lado 'a' do segundo triangulo:", "Lado 'a'", JOptionPane.DEFAULT_OPTION);
		str_b2 = JOptionPane.showInputDialog(null, "Digite o lado 'b' do segundo triangulo:", "Lado 'b'", JOptionPane.DEFAULT_OPTION);
		str_c2 = JOptionPane.showInputDialog(null, "Digite o lado 'c' do segundo triangulo:", "Lado 'c'", JOptionPane.DEFAULT_OPTION);
			
		a2 = Float.parseFloat(str_a2);
		b2 = Float.parseFloat(str_b2);
		c2 = Float.parseFloat(str_c2);	
	}
	
	public void Area() {
		p = (a1 + b1 + c1) /2;
		area1 = (float) Math.sqrt(p*(p-a1)*(p-b1)*(p-c1));
		str_area1 = Float.toString(area1);
		
		p = (a2 + b2 + c2) /2;
		area2 = (float) Math.sqrt(p*(p-a2)*(p-b2)*(p-c2));
		str_area2 = Float.toString(area2);
		
		if(area1>area2) {
			str_maior = "Primeiro triangulo e tem "+str_area1;			
		} else if(area2>area1) {
			str_maior = "Segundo triangulo e tem "+str_area2;
		} else if (area1 == area2) {
			str_maior = "Os dois triangulos tem a mesma area";
		}
		
		JOptionPane.showMessageDialog(null, "A area do primeiro triangulo eh: "+str_area1+"\nA area do segundo triangulo eh: "+str_area2+"\n\nA maior area eh: "+str_maior);
	}
}
