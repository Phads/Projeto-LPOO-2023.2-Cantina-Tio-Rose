package telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastrarClientes {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCpfCnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarClientes window = new CadastrarClientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastrarClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 90, 619, 193);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 11, 78, 24);
		panel.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(79, 14, 153, 25);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblCpfCnpj = new JLabel("CPF/CNPJ:");
		lblCpfCnpj .setFont(new Font("Arial", Font.PLAIN, 20));
		lblCpfCnpj .setBounds(10, 59, 107, 24);
		panel.add(lblCpfCnpj );
		
		tfCpfCnpj = new JTextField();
		tfCpfCnpj.setBounds(126, 59, 139, 25);
		panel.add(tfCpfCnpj);
		tfCpfCnpj.setColumns(10);
		
		JLabel lblCadastrarClientes = new JLabel("Cadastrar Clientes");
		lblCadastrarClientes.setFont(new Font("Arial", Font.PLAIN, 40));
		lblCadastrarClientes.setBounds(170, 11, 400, 68);
		frame.getContentPane().add(lblCadastrarClientes);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 30));
		btnCadastrar.setBounds(207, 366, 250, 73);
		frame.getContentPane().add(btnCadastrar);
	}

}
