package Q2;

import javax.swing.JOptionPane;

public class Funcionario {
	
	String nome, str_salario, str_novo_salario;
	float salario;
	
	public void Ler_Dados() {
		nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Nome", JOptionPane.DEFAULT_OPTION);
		str_salario = JOptionPane.showInputDialog(null, "Digite o seu salario:", "Salario", JOptionPane.DEFAULT_OPTION);
		salario = Float.parseFloat(str_salario);
		
	}
	
	public void Aumento() {
		
		if(salario >= 1 && salario <= 1000) {
			salario = salario + (salario * 15/100);
		} else if(salario >= 1001 && salario <= 1500) {
			salario = salario + (salario * 10/100);
		} else if(salario >= 1501 && salario <= 2000) {
			salario = salario + (salario * 5/100);
		}
		
		str_novo_salario = Float.toString(salario);
	}
	
	public void Exibir_Dados() {
		JOptionPane.showMessageDialog(null, "Nome do funcionario: "+nome+"\nSalario antigo: R$"+str_salario+"\nNovo salario: R$"+str_novo_salario, "Dados do Funcionario", JOptionPane.DEFAULT_OPTION);
	}

}
