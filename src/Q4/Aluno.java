package Q4;

import javax.swing.JOptionPane;

public class Aluno {
	String str_nota_primeiro, str_nota_segundo, str_nota_terceiro, str_somatorio, str_pendencia;
	float nota_primeiro = -1, nota_segundo = -1, nota_terceiro = -1, somatorio, pendencia;
	public void Ler_Dados() {
		while(nota_primeiro<0 || nota_primeiro>30) {
			
			str_nota_primeiro = JOptionPane.showInputDialog(null, "Digite a primeira nota, referente ao primeiro trimestre(30 pts):", "Primeiro Trimestre", JOptionPane.DEFAULT_OPTION);
			nota_primeiro = Float.parseFloat(str_nota_primeiro);
			if(nota_primeiro<0 || nota_primeiro>30) JOptionPane.showMessageDialog(null, "Digite uma nota valida.", "Invalido", JOptionPane.ERROR_MESSAGE);
		}
		while(nota_segundo<0 || nota_segundo>35) {
			
			str_nota_segundo = JOptionPane.showInputDialog(null, "Digite a segunda nota, referente ao segundo trimestre(35 pts):", "Segundo Trimestre", JOptionPane.DEFAULT_OPTION);
			nota_segundo = Float.parseFloat(str_nota_segundo);
			if(nota_segundo<0 || nota_segundo>35) JOptionPane.showMessageDialog(null, "Digite uma nota valida.", "Invalido", JOptionPane.ERROR_MESSAGE);
		}
		while(nota_terceiro<0 || nota_terceiro>35) {
			
			str_nota_terceiro = JOptionPane.showInputDialog(null, "Digite a segunda nota, referente ao terceiro trimestre(35 pts):", "Terceiro Trimestre", JOptionPane.DEFAULT_OPTION);
			nota_terceiro = Float.parseFloat(str_nota_terceiro);
			if(nota_terceiro<0 || nota_terceiro>35) JOptionPane.showMessageDialog(null, "Digite uma nota valida.", "Invalido", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void Somatorio() {
		somatorio = nota_primeiro + nota_segundo + nota_terceiro;
		str_somatorio = Float.toString(somatorio);
		
		if(somatorio >= 70) {
			JOptionPane.showMessageDialog(null, "Nota Total: "+str_somatorio+"\n\nAprovado!", "Aprovado!!!", JOptionPane.INFORMATION_MESSAGE);
		} else {
			pendencia = 70 - somatorio;
			str_pendencia = Float.toString(pendencia);
			JOptionPane.showMessageDialog(null, "Nota Total: "+str_somatorio+"\n\nPrecisa de mais "+str_pendencia+" pontos para receber a aprovacao.", "Pendente", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
