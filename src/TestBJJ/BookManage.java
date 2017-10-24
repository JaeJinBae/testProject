package TestBJJ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;

public class BookManage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public BookManage() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1188, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(320, 10, 767, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(32, 20, 93, 25);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"도서코드", "도서명", "저자", "출판사", "가격"}));
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(157, 20, 421, 25);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setBounds(627, 21, 93, 23);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(233, 102, 916, 465);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"aaa", "aa", "aaa", "aaa", "100000", "30"},
				{"bbb", "bb", "bbbb", "bbb", "100000", "10"},
				{"ccc", "ccc", "cccc", "cccc", "200000", "40"},
				{"dddd", "dddd", "dddd", "dddd", "400000", "50"},
				{"eeee", "eeee", "eeee", "eeee", "300000", "30"},
				{"ffff", "ffff", "ffff", "ffff", "9900", "10"},
				{"gggg", "gggg", "gggg", "gggg", "140000", "100"},
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
				"도서코드", "도서명", "저 자", "출판사", "가 격", "총 대여 횟수"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 197, 304);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("도서코드");
		panel_1.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("도서명");
		panel_1.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JLabel label_1 = new JLabel("저 자");
		panel_1.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JLabel label_2 = new JLabel("출판사");
		panel_1.add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		JLabel label_3 = new JLabel("가격");
		panel_1.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		JLabel label_4 = new JLabel("총대여횟수");
		panel_1.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_1.add(textField_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(33, 401, 156, 146);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_3 = new JButton("추  가");
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("수  정");
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("삭  제");
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("새로고침");
		panel_2.add(btnNewButton_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(22, 324, 171, 31);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton_1 = new JButton("확인");
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("취소");
		panel_3.add(btnNewButton_2);
	}
}
