package curso.java.veolia.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class CadastroAlunos extends JFrame implements Serializable {

	private static final long serialVersionUID = -4075273651904605036L;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAlunos frame = new CadastroAlunos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAluno = new JPanel();
		panelAluno.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelAluno.setBounds(12, 12, 186, 254);
		contentPane.add(panelAluno);
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelEndereco.setBounds(210, 12, 229, 248);
		contentPane.add(panelEndereco);
	}
}
