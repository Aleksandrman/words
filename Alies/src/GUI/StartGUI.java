package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class StartGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGUI frame = new StartGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public StartGUI() {
		initFrame();
	}
	/**
	 * Create start game menu.
	 */
	private void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox boxCommands = new JComboBox();
		boxCommands.setBounds(121, 58, 206, 20);
		contentPane.add(boxCommands);
		
		JLabel nameCommand = new JLabel("Ход команды: ");
		nameCommand.setBounds(20, 61, 91, 14);
		contentPane.add(nameCommand);
		
		JLabel langs = new JLabel("Словарь");
		langs.setBounds(140, 22, 115, 14);
		contentPane.add(langs);
		
		JButton start = new JButton("Начать");
		start.setBounds(10, 101, 89, 23);
		contentPane.add(start);
		
		JButton exit = new JButton("Выход");
		exit.setBounds(258, 101, 89, 23);
		contentPane.add(exit);
		
		JButton setup = new JButton("Настройки");
		setup.setBounds(121, 101, 115, 23);
		contentPane.add(setup);
	}
}
