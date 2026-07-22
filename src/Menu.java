import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.codejava.swing.CustomOutputStream;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextArea textArea = new JTextArea();
	int x = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500,500 );
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		textArea.setBounds(162, 10, 312, 440);
		contentPane.add(textArea);
		System.setOut(printStream);
		System.setErr(printStream);
		
		JButton btnNewButton = new JButton("Show Menu");
		btnNewButton.setBounds(25, 29, 114, 37);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			//Menu Console Printer
				public void actionPerformed(ActionEvent e) {
					if(x == 0) {
						Main.main(null);
						x++;
					}
						
					
				}
			});
	}
}