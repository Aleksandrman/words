package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainGUI extends JFrame {

	private JPanel contentPane;
	private JTextField teamName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGUI frame = new mainGUI();
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
	public mainGUI() {
		initFrame();
	}

	private void initFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addTeam = new JButton("Добавить команду");
		addTeam.setBounds(239, 35, 140, 23);
		contentPane.add(addTeam);
		
		teamName = new JTextField();
		teamName.setBounds(33, 36, 182, 20);
		contentPane.add(teamName);
		teamName.setColumns(10);
		
		JLabel NewGameLable = new JLabel("Новая игра");
		NewGameLable.setBounds(171, 11, 140, 14);
		contentPane.add(NewGameLable);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 67, 333, 81);
		contentPane.add(textArea);
		
		JButton start = new JButton("Старт");
		start.setBounds(59, 172, 89, 23);
		contentPane.add(start);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StartGUI start = new StartGUI();
				dispose();
				start.setVisible(true);
				
			}
		});
		
		JButton exit = new JButton("Выход");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(254, 172, 89, 23);
		contentPane.add(exit);
	}
}
