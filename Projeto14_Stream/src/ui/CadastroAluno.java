package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import classes.DocumentoCnpj;
import classes.DocumentoCpf;
import classes.Endereco;
import enumerados.Sexo;
import interfaces.Documento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroAluno extends JFrame {

	private static final long serialVersionUID = -6781220603442751941L;
	private JPanel contentPane;
	private JTextField txtIdade;
	private JTextField txtDocumento;
	private JTextField txtNome;
	private JTextField txtMatricula;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtCidade;
	private JTextField txtCep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
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
	public CadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Aluno = new JPanel();
		Aluno.setBorder(new TitledBorder(null, "Dados do Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aluno.setBounds(42, 32, 214, 336);
		contentPane.add(Aluno);
		Aluno.setLayout(null);
		
		JLabel lblDocumento = new JLabel("Documento: ");
		lblDocumento.setBounds(12, 27, 84, 17);
		Aluno.add(lblDocumento);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(12, 71, 59, 17);
		Aluno.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(12, 115, 59, 17);
		Aluno.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(12, 159, 59, 17);
		Aluno.add(lblSexo);
		
		JLabel lblMatrcula = new JLabel("Matrícula");
		lblMatrcula.setBounds(12, 203, 59, 17);
		Aluno.add(lblMatrcula);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(89, 114, 114, 21);
		Aluno.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(89, 24, 114, 21);
		Aluno.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(89, 69, 114, 21);
		Aluno.add(txtNome);
		txtNome.setColumns(10);
		
		JComboBox<Sexo> cmbSexo = new JComboBox<>();
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.setBounds(89, 159, 114, 21);
		Aluno.add(cmbSexo);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(89, 204, 114, 21);
		Aluno.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JCheckBox chkIncluirEndereo = new JCheckBox("Incluir endereço");
		chkIncluirEndereo.setBounds(23, 237, 168, 25);
		Aluno.add(chkIncluirEndereo);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String doc = txtDocumento.getText();
					Documento documento;
					if(doc.length() == 11) {
						documento = new DocumentoCpf(doc);
					} else if (doc.length() == 14) {
						documento = new DocumentoCnpj(doc);
					} else {
						throw new ArithmeticException("O documento informado é inválido");
					}
					
					String nome = txtNome.getText();
					int idade = Integer.parseInt(txtIdade.getText());
					Sexo sexo = (Sexo)cmbSexo.getSelectedItem();
					String matricula = txtMatricula.getText();
					
					classes.Aluno aluno = new classes.Aluno(documento, nome, idade, sexo, matricula);
					
					if(chkIncluirEndereo.isSelected()) {
						Endereco endereco;
						try {
							endereco = new Endereco(
									txtLogradouro.getText(),
									Integer.parseInt(txtNumero.getText()),
									txtCidade.getText(),
									txtCep.getText());
									aluno.setEndereco(endereco);
						} catch (NoSuchFieldException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (NoSuchMethodException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					JOptionPane.showMessageDialog(CadastroAluno.this, aluno);

				} catch(NumberFormatException | ArithmeticException ex) {
					JOptionPane.showMessageDialog(CadastroAluno.this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIncluir.setBounds(66, 280, 103, 27);
		Aluno.add(btnIncluir);
		
		JPanel Endereco = new JPanel();
		Endereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Endereco.setBounds(283, 32, 244, 285);
		contentPane.add(Endereco);
		Endereco.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Logradouro");
		lblNewLabel.setBounds(12, 36, 96, 17);
		Endereco.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("Número");
		lblNmero.setBounds(12, 89, 59, 17);
		Endereco.add(lblNmero);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(12, 142, 59, 17);
		Endereco.add(lblCidade);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(12, 195, 59, 17);
		Endereco.add(lblCep);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(101, 33, 114, 21);
		Endereco.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(101, 87, 114, 21);
		Endereco.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(101, 141, 114, 21);
		Endereco.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setBounds(101, 195, 114, 21);
		Endereco.add(txtCep);
		txtCep.setColumns(10);
	}
}
