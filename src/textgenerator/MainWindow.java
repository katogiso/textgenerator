package textgenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JButton;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 579);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmClose);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("NULL");
		chckbxNewCheckBox.setBounds(11, 0, 93, 33);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblOfMaster = new JLabel("# of Masters");
		lblOfMaster.setBounds(11, 50, 93, 26);
		lblOfMaster.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblOfMaster);
		
		textField = new JTextField();
		textField.setBounds(104, 51, 104, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblOfSlaves = new JLabel("# of Slaves");
		lblOfSlaves.setBounds(11, 88, 93, 26);
		contentPane.add(lblOfSlaves);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 88, 104, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(252, 88, 108, 26);
		contentPane.add(btnUpdate);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 126, 658, 393);
		contentPane.add(panel);
	}
}
