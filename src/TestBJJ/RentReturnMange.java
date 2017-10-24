package TestBJJ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class RentReturnMange extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;


	public RentReturnMange() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 781, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 990, 667);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("대여 관리", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBounds(0, 0, 759, 234);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(12, 10, 252, 132);
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("회원코드로 검색");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("전화번호로 검색");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("회원코드");
		panel_6.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("회원이름");
		panel_6.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		panel_6.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_2 = new JTextField();
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("검 색");
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취 소");
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(276, 10, 471, 214);
		panel_2.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"도서코드", "도서명", "저 자", "출판사"}));
		panel_8.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_8.add(textField_3);
		
		JButton button = new JButton("검색");
		panel_8.add(button);
		
		JPanel panel_9 = new JPanel();
		panel_7.add(panel_9);
		
		JLabel lblNewLabel_4 = new JLabel("도서코드");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		panel_9.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_7.add(panel_10);
		
		JLabel lblNewLabel_5 = new JLabel("도서명");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		panel_10.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11);
		
		JLabel lblNewLabel_6 = new JLabel("저 자");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		panel_11.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_7.add(panel_12);
		
		JLabel lblNewLabel_7 = new JLabel("출판사");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		panel_12.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_7.add(panel_13);
		
		JLabel lblNewLabel_8 = new JLabel("가 격");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		panel_13.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_7.add(panel_14);
		
		JButton btnNewButton_2 = new JButton("대여");
		panel_14.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("취소");
		panel_14.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("뭘 넣을까?");
		panel_14.add(btnNewButton_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 244, 759, 188);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("대여가능 도서 목록");
		lblNewLabel_1.setBounds(0, 0, 759, 38);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 36, 759, 142);
		panel_3.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 466, 759, 172);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("대여도서");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 15));
		label.setBounds(0, 431, 137, 34);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("반납 관리", null, panel_1, null);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
