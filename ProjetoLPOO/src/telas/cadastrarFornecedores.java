package telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class cadastrarFornecedores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeFornecedor;
	private JTextField tfEmail;
	private JTextField tfCnpjFornecedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrarFornecedores frame = new cadastrarFornecedores();
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
	public cadastrarFornecedores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarFornecedores = new JLabel("Cadastrar Fornecedores ");
		lblCadastrarFornecedores.setFont(new Font("Arial", Font.PLAIN, 40));
		lblCadastrarFornecedores.setBounds(119, 11, 450, 78);
		contentPane.add(lblCadastrarFornecedores);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 100, 559, 170);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNomeFornecedor = new JLabel("Nome:");
		lblNomeFornecedor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNomeFornecedor.setBounds(10, 11, 99, 24);
		panel.add(lblNomeFornecedor);
		
		tfNomeFornecedor = new JTextField();
		tfNomeFornecedor.setBounds(76, 14, 159, 25);
		panel.add(tfNomeFornecedor);
		tfNomeFornecedor.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEmail.setBounds(10, 46, 68, 24);
		panel.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(76, 49, 159, 25);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblCnpjFornecedor = new JLabel("CNPJ:");
		lblCnpjFornecedor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCnpjFornecedor.setBounds(10, 88, 68, 24);
		panel.add(lblCnpjFornecedor);
		
		tfCnpjFornecedor = new JTextField();
		tfCnpjFornecedor.setBounds(76, 89, 159, 25);
		panel.add(tfCnpjFornecedor);
		tfCnpjFornecedor.setColumns(10);
		
		JButton btnCadastrarFornecedor = new JButton("CADASTRAR");
		btnCadastrarFornecedor.setFont(new Font("Arial", Font.PLAIN, 20));
		btnCadastrarFornecedor.setBounds(180, 302, 284, 78);
		contentPane.add(btnCadastrarFornecedor);
	}
}
