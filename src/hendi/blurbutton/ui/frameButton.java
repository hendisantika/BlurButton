package hendi.blurbutton.ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("serial")
public class frameButton extends JFrame 
{

	private JPanel contentPane;
	private JButton btnRefresh;
	final JButton btnBlur = new BlurButton("Simpan Blur");
	private JTextField txtNIM;
	private JTextField txtNama;
	private JTextArea textAlamat;
	private JLabel lblBg;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	public frameButton()
	{
		super("Button Blur");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setIcon(new ImageIcon("src/hendi/blurbutton/images/Refresh.png"));
		btnRefresh.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent act)
			{
				btnBlur.setEnabled(isEnabled());
				txtNIM.setText("");
				txtNama.setText("");
				textAlamat.setText("");
				txtNIM.requestFocus();
			}
		});
		btnRefresh.setBounds(247, 259, 132, 44);
		contentPane.add(btnRefresh);
		btnBlur.setIcon(new ImageIcon("src/hendi/blurbutton/images/tampilData.png"));
		btnBlur.setText("Tampilkan");
		btnBlur.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnBlur.setEnabled(!btnBlur.isEnabled());
				String nim = txtNIM.getText();
				String nama = txtNama.getText();
				String alamat = textAlamat.getText();
				JOptionPane.showMessageDialog(null,"NIM : " + nim + "\n" + "Nama : " + nama + "\n" + "Alamat : " + alamat,"Pesan",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Gambar/Pesan.png"));
			}
		});
		
		btnBlur.setBounds(64, 259,155,44);
		contentPane.add(btnBlur);
		
		JLabel lblNim = new JLabel("NIM : ");
		lblNim.setForeground(new Color(255, 255, 255));
		lblNim.setBounds(12, 12, 70, 15);
		contentPane.add(lblNim);
		
		JLabel lblNama = new JLabel("Nama : ");
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setBounds(12, 59, 70, 15);
		contentPane.add(lblNama);
		
		JLabel lblAlamat = new JLabel("Alamat : ");
		lblAlamat.setForeground(new Color(255, 255, 255));
		lblAlamat.setBounds(12, 103, 70, 15);
		contentPane.add(lblAlamat);
		
		txtNIM = new JTextField();
		txtNIM.setBounds(82, 10, 155, 26);
		contentPane.add(txtNIM);
		txtNIM.setColumns(10);
		
		txtNama = new JTextField();
		txtNama.setBounds(82, 57, 269, 26);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		textAlamat = new JTextArea();
		textAlamat.setBounds(82, 103, 269, 95);
		contentPane.add(textAlamat);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("src/hendi/blurbutton/images/tools.png"));
		lblIcon.setBounds(369, 59, 132, 122);
		contentPane.add(lblIcon);
		
		lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("src/hendi/blurbutton/images/KDEBiru.jpg"));
		lblBg.setBounds(0, 0, 526, 371);
		contentPane.add(lblBg);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					frameButton frame = new frameButton();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}
