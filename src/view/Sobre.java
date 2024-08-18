package view;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblSobALicensa_1;
	private JButton btnGitHub;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/317738_instagram_photography_photos_icon.png")));
		setTitle("Sobre o Carômetro");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Projeto Carômetro");
		lblNewLabel.setBounds(10, 31, 94, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblautorProfessorJos = new JLabel("@autor Professor José de Assis/Aluno Marlon  Silveira Gomes");
		lblautorProfessorJos.setBounds(5, 68, 313, 14);
		getContentPane().add(lblautorProfessorJos);
		
		JLabel lblSobALicensa = new JLabel("Sob a Licensa MIT");
		lblSobALicensa.setBounds(10, 93, 96, 14);
		getContentPane().add(lblSobALicensa);
		
		lblSobALicensa_1 = new JLabel("");
		lblSobALicensa_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblSobALicensa_1.setBounds(328, 11, 96, 96);
		getContentPane().add(lblSobALicensa_1);
		
		btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/marlonsilveiragomes");
				
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setContentAreaFilled(false);
		btnGitHub.setBorderPainted(false);
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitHub.setBounds(36, 189, 48, 48);
		getContentPane().add(btnGitHub);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(344, 212, 73, 23);
		getContentPane().add(btnOk);

	}
	
	private void link(String url) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(url);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);	
		}
	}
}
