package curso.java.veolia.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import classes.Aluno;
import classes.Curso;
import classes.DocumentoCnpj;
import classes.DocumentoCpf;
import classes.Endereco;
import curso.java.veolia.enumerados.Sexo;
import curso.java.veolia.interfaces.Documento;

public class CadastroCompleto extends JFrame {

	private static final long serialVersionUID = -4075273651904605036L;
	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMatricula;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JTextField txtDescricao;
	private JTextField txtCh;
	private JTextField txtPreco;

	private JTextArea txtConteudo;
	private JComboBox<Aluno> cmbAlunos;
	
	private Thread thread;
	private boolean continua = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroCompleto frame = new CadastroCompleto();
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
	public CadastroCompleto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelAluno = new JPanel();
		panelAluno.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Dados do Aluno",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelAluno.setBounds(12, 0, 327, 249);
		contentPane.add(panelAluno);
		panelAluno.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setBounds(12, 28, 86, 17);
		panelAluno.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(12, 57, 59, 17);
		panelAluno.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(12, 86, 59, 17);
		panelAluno.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Sexo: ");
		lblNewLabel_3.setBounds(12, 115, 59, 17);
		panelAluno.add(lblNewLabel_3);

		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setBounds(12, 144, 86, 17);
		panelAluno.add(lblMatrcula);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(102, 26, 152, 21);
		panelAluno.add(txtDocumento);
		txtDocumento.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(102, 53, 213, 21);
		panelAluno.add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(102, 84, 152, 21);
		panelAluno.add(txtIdade);
		txtIdade.setColumns(10);

		JComboBox<Sexo> cmbSexo = new JComboBox<Sexo>();
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.setBounds(102, 110, 152, 26);
		panelAluno.add(cmbSexo);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(102, 142, 152, 21);
		panelAluno.add(txtMatricula);
		txtMatricula.setColumns(10);

		JCheckBox chkIncluirEndereco = new JCheckBox("Incluir Endereço");
		chkIncluirEndereco.setBounds(102, 160, 152, 25);
		panelAluno.add(chkIncluirEndereco);

		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endereco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEndereco.setBounds(380, 0, 327, 147);
		contentPane.add(panelEndereco);
		panelEndereco.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Logradouro:");
		lblNewLabel_4.setBounds(12, 28, 94, 17);
		panelEndereco.add(lblNewLabel_4);

		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setBounds(12, 57, 59, 17);
		panelEndereco.add(lblNmero);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 86, 59, 17);
		panelEndereco.add(lblCidade);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(12, 115, 59, 17);
		panelEndereco.add(lblCep);

		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(128, 28, 114, 21);
		panelEndereco.add(txtLogradouro);
		txtLogradouro.setColumns(10);

		txtNumero = new JTextField();
		txtNumero.setBounds(128, 57, 114, 21);
		panelEndereco.add(txtNumero);
		txtNumero.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(128, 86, 114, 21);
		panelEndereco.add(txtCidade);
		txtCidade.setColumns(10);

		txtCep = new JTextField();
		txtCep.setBounds(128, 115, 114, 21);
		panelEndereco.add(txtCep);
		txtCep.setColumns(10);

		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String doc = txtDocumento.getText();
					Documento documento;
					if (doc.length() == 11) {
						documento = new DocumentoCpf(doc);
					} else if (doc.length() == 14) {
						documento = new DocumentoCnpj(doc);
					} else {
						throw new ArithmeticException("O documento informado é inválido.");
					}
					String nome = txtNome.getText();
					int idade = Integer.parseInt(txtIdade.getText());
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();
					String matricula = txtMatricula.getText();

					Aluno aluno = new Aluno(documento, nome, idade, sexo, matricula);

					if (chkIncluirEndereco.isSelected()) {
						Endereco endereco = new Endereco(txtLogradouro.getText(), Integer.parseInt(txtNumero.getText()),
								txtCidade.getText(), txtCep.getText());
						aluno.setEndereco(endereco);
					}
					cmbAlunos.addItem(aluno);

					JOptionPane.showMessageDialog(CadastroCompleto.this, aluno.getDados());

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(CadastroCompleto.this, ex.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIncluir.setBounds(12, 193, 103, 27);
		panelAluno.add(btnIncluir);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 408, 686, 62);
		panelAluno.add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Adicionar Cursos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(380, 169, 327, 202);
		contentPane.add(panel);
		panel.setLayout(null);

		cmbAlunos = new JComboBox<>();
		cmbAlunos.setBounds(103, 32, 212, 26);
		panel.add(cmbAlunos);

		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(26, 37, 59, 17);
		panel.add(lblAluno);

		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setBounds(26, 71, 77, 17);
		panel.add(lblDescricao);

		txtDescricao = new JTextField();
		txtDescricao.setBounds(102, 70, 213, 21);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);

		JLabel lblCh = new JLabel("C.H.:");
		lblCh.setBounds(26, 102, 69, 17);
		panel.add(lblCh);

		txtCh = new JTextField();
		txtCh.setBounds(103, 100, 95, 21);
		panel.add(txtCh);
		txtCh.setColumns(10);

		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(26, 133, 59, 17);
		panel.add(lblPreo);

		txtPreco = new JTextField();
		txtPreco.setBounds(103, 131, 114, 21);
		panel.add(txtPreco);
		txtPreco.setColumns(10);

		JButton btnAdicionarCursos = new JButton("Adicionar");
		btnAdicionarCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Aluno aluno = (Aluno) cmbAlunos.getSelectedItem();

					String descricao = txtDescricao.getText();
					int ch = Integer.parseInt(txtCh.getText());
					double preco = Double.parseDouble(txtPreco.getText());

					Curso curso = new Curso(descricao, ch, preco);
					aluno.getCursos().add(curso);

					JOptionPane.showMessageDialog(CadastroCompleto.this,
							"Curso adicionado para o aluno " + aluno.getNome());

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(CadastroCompleto.this, ex.toString(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdicionarCursos.setBounds(26, 164, 127, 27);
		panel.add(btnAdicionarCursos);

		JButton btnMostrarCursos = new JButton("Mostrar cursos");
		btnMostrarCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Aluno aluno = (Aluno) cmbAlunos.getSelectedItem();
					txtConteudo.setText(aluno.listarCursos());

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(CadastroCompleto.this, ex.toString(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnMostrarCursos.setBounds(179, 164, 136, 27);
		panel.add(btnMostrarCursos);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 394, 681, 188);
		contentPane.add(scrollPane_1);

		txtConteudo = new JTextArea();
		scrollPane_1.setViewportView(txtConteudo);

		JButton btnGerarArquivo = new JButton("Gerar Arquivo");
		btnGerarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int posicao = cmbAlunos.getSelectedIndex();
					if (posicao == -1) {
						throw new IllegalArgumentException("Nenhum aluno selecionado para esta operação");
					}

					Aluno aluno = (Aluno) cmbAlunos.getSelectedItem();
					String arquivo = "aluno_" + aluno.getMatricula() + ".txt";
					FileWriter writer = new FileWriter(
							"/home/jonathan.albuquerque/Documentos/emilio/" + arquivo, true);
					writer.write(aluno.getDados() +'\n' + aluno.listarCursos());
					writer.close();
					
					JOptionPane.showMessageDialog(CadastroCompleto.this, "Arquivo gerado com sucesso!");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(CadastroCompleto.this, ex.toString(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGerarArquivo.setBounds(12, 261, 138, 27);
		contentPane.add(btnGerarArquivo);
		
		JButton btnAbrirArquivo = new JButton("Abrir Arquivo");
		btnAbrirArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser chooser = new JFileChooser("/home/jonathan.albuquerque/Documentos/emilio/");
					
					if(chooser.showOpenDialog(CadastroCompleto.this) == JFileChooser.APPROVE_OPTION) {
					FileReader reader = new FileReader(chooser.getSelectedFile());
					StringBuilder builder = new StringBuilder();
					
					while(true) {
						int ch = reader.read();
						if(ch == -1) {
							break;
						}
						builder.append((char)ch);
					}
					txtConteudo.setText(builder.toString());
					reader.close();
					}
				} catch (Exception errinho) {
					JOptionPane.showMessageDialog(CadastroCompleto.this, errinho.toString(),
							"Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAbrirArquivo.setBounds(186, 261, 129, 27);
		contentPane.add(btnAbrirArquivo);
		
		JLabel lbHoraAtual = new JLabel("");
		lbHoraAtual.setBounds(257, 331, 93, 29);
		contentPane.add(lbHoraAtual);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				thread = new Thread(() -> {
					DateFormat df = new SimpleDateFormat("HH:mm:ss");
					continua = true;
					while (continua) {
						lbHoraAtual.setText(df.format(new Date()));
						try {
							thread.sleep(1000);
						} catch (InterruptedException e) {
					
							e.printStackTrace();
						}
					}
				});
				thread.start();
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(CadastroCompleto.this, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnIniciar.setBounds(22, 342, 103, 27);
		contentPane.add(btnIniciar);
		
		JButton btnParar = new JButton("Parar");
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(thread != null) {
					thread.stop();
				}
			}
		});
		btnParar.setBounds(136, 344, 103, 27);
		contentPane.add(btnParar);
		
		
		
		
	}
}

