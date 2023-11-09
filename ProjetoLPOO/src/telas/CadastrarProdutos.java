package telas;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.produto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class CadastrarProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfPrecoVenda;
	private JTextField tfPrecoCompra;
	private JTextField tfEstoque;
	private JTextField tfCodigoBarras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProdutos frame = new CadastrarProdutos();
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
	public CadastrarProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 107, 664, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(0, 12, 70, 24);
		panel.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(65, 15, 123, 25);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblPrecoVenda = new JLabel("Preço de venda:");
		lblPrecoVenda.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPrecoVenda.setBounds(0, 44, 166, 24);
		panel.add(lblPrecoVenda);
		
		tfPrecoVenda = new JTextField();
		tfPrecoVenda.setBounds(147, 47, 112, 25);
		panel.add(tfPrecoVenda);
		tfPrecoVenda.setColumns(10);
		
		JLabel lblPrecoCompra = new JLabel("Preço de compra:");
		lblPrecoCompra.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPrecoCompra.setBounds(0, 91, 166, 25);
		panel.add(lblPrecoCompra);
		
		tfPrecoCompra = new JTextField();
		tfPrecoCompra.setText("");
		tfPrecoCompra.setBounds(165, 92, 112, 24);
		panel.add(tfPrecoCompra);
		tfPrecoCompra.setColumns(10);
		
		JLabel lblEstoque = new JLabel("Estoque: ");
		lblEstoque.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEstoque.setBounds(0, 137, 93, 24);
		panel.add(lblEstoque);
		
		tfEstoque = new JTextField();
		tfEstoque.setBounds(88, 140, 123, 24);
		panel.add(tfEstoque);
		tfEstoque.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Código de Barras:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 188, 172, 24);
		panel.add(lblNewLabel);
		
		tfCodigoBarras = new JTextField();
		tfCodigoBarras.setBounds(173, 188, 166, 25);
		panel.add(tfCodigoBarras);
		tfCodigoBarras.setColumns(10);
		
		JButton btnLeitorCodigoBarras = new JButton("Ler Código de Barras");
		btnLeitorCodigoBarras.setFont(new Font("Arial", Font.PLAIN, 20));
		btnLeitorCodigoBarras.setBounds(362, 188, 246, 43);
		panel.add(btnLeitorCodigoBarras);
		
		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFornecedor.setBounds(0, 250, 149, 25);
		panel.add(lblFornecedor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jpack ", "Gdoor ", "Xtear"}));
		comboBox.setBounds(119, 252, 140, 24);
		panel.add(comboBox);
	
		JLabel lblCadastrarProdutos = new JLabel("Cadastrar Produtos");
		lblCadastrarProdutos.setFont(new Font("Arial", Font.PLAIN, 40));
		lblCadastrarProdutos.setBounds(165, 11, 400, 69);
		contentPane.add(lblCadastrarProdutos);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso");
			}
		});
		btnNewButton.setBounds(227, 427, 259, 48);
		contentPane.add(btnNewButton);
	}
}
