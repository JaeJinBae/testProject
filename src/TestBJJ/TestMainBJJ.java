package TestBJJ;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestMainBJJ extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestMainBJJ frame = new TestMainBJJ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TestMainBJJ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(300, 100));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(42, 104, 382, 121);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnNewButton = new JButton("도서관리");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("회원관리");
		btnNewButton_1.addActionListener(this);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("대출&반납");
		btnNewButton_2.addActionListener(this);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("DGIT Book Manager");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 465, 76);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		BookManage frame = new BookManage();
		frame.setVisible(true);
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		RentReturnMange frame = new RentReturnMange();
		frame.setVisible(true);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		EmployeeManage frame = new EmployeeManage();
		frame.setVisible(true);
	}
}
