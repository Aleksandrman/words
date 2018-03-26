package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class GameGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameGUI frame = new GameGUI();
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
	public GameGUI() {
		initFrame();
	}

	void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel word = new JLabel("Слово");
		word.setFont(new Font("Tahoma", Font.PLAIN, 42));
		word.setBounds(85, 23, 253, 49);
		contentPane.add(word);
		
		JButton next = new JButton("Следующее");
		next.setBounds(224, 99, 140, 23);
		contentPane.add(next);
		
		JButton skip = new JButton("Пропустить");
		skip.setBounds(36, 99, 148, 23);
		contentPane.add(skip);
	}

}
