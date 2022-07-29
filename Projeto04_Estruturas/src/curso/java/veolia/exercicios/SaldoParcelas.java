package curso.java.veolia.exercicios;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

/*
 * Uma pessoa possui um saldo de R$ 21.600,00 na conta.
 * Ela compra um automovel cujo  parcelamento acontece sem juros.
 * A compra foi realizada em 36 parcelas de R$ 600,00.
 * 
 * Se o dinheiro ficar parado na contao, ao final de 36 meses o saldo
 * será zerado.
 * 
 * Mas o dinheiro permanecesrá investido em um fundo que rende 1.2% ao mês.
 * 
 * Nestas condições, qual será o saldo após o pagamento da última parcela?
 * 
 * Mes 1: saldo de 21.600 
 * Mês 2: Saldo de 21.859.20 (21.600 + 1.2)) menos 600 = 21.259,20
 * 
 */

public class SaldoParcelas {

	public static void main(String[] args) {
		
		double saldo = 21600;
		int parcelas = 36;
		double investimento = 1.2;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		for (int i = 0; i < 36; i++) {
			saldo += (saldo * 0.012);
			saldo = saldo - 600;
		}
		
		JOptionPane.showMessageDialog(null, "Saldo final: " + nf.format(saldo) );
		
	}
}
