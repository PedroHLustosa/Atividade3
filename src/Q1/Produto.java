package Q1;

import javax.swing.JOptionPane;

public class Produto {
	String str_nome, str_preco, str_quant, str_valor_total_estoq;
	float preco, quant, valor_total_estoq, retirada;
	
	public void Ler_Dados() {
		str_nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:", "Nome", JOptionPane.DEFAULT_OPTION);
		str_preco = JOptionPane.showInputDialog(null, "Digite o preco do produto:", "Preco", JOptionPane.DEFAULT_OPTION);
		str_quant = JOptionPane.showInputDialog(null, "Digite a quantidade do produto:", "Quantidade", JOptionPane.DEFAULT_OPTION);
		
		preco = Float.parseFloat(str_preco);
		quant = Float.parseFloat(str_quant);
		
		valor_total_estoq = quant * preco;
		
		str_valor_total_estoq = Float.toString(valor_total_estoq);
	}
	
	public void Exibir_Dados(){
		JOptionPane.showMessageDialog(null, "Esses sao os dados do produto:\n\nNome: "+str_nome+"\nPreco: "+str_preco+"\nQuantidade no estoque: "+str_quant+"\nValor total no estoque: "+str_valor_total_estoq);
		
	}
	
	public void  Entrada() {
		str_quant = JOptionPane.showInputDialog(null, "Digite a quantidade a ser acrescentada do produto:", "Quantidade Acrescentada", JOptionPane.DEFAULT_OPTION);
		
		quant += Float.parseFloat(str_quant);
		
		str_quant = Float.toString(quant);
		
		valor_total_estoq = quant * preco;
		
		str_valor_total_estoq = Float.toString(valor_total_estoq);
		
	}
	
	public void Saida() {
		str_quant = JOptionPane.showInputDialog(null, "Digite a quantidade a ser retirada do produto:", "Quantidade Retirada", JOptionPane.DEFAULT_OPTION);

		retirada = Float.parseFloat(str_quant);
		
		if(retirada > quant) {
			JOptionPane.showMessageDialog(null, "A quantidade informada excede a quantidade disponível no estoque.", "Invalido", JOptionPane.INFORMATION_MESSAGE);
		}else {
			
			quant -= retirada;
			
			str_quant = Float.toString(quant);
			
			valor_total_estoq = quant * preco;
			
			str_valor_total_estoq = Float.toString(valor_total_estoq);
			
		}
		
	}

}