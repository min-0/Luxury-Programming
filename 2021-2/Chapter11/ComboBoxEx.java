package Chapter11;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi","mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private String [] names = {"Kitae", "jaemoon", "hyosoo", "namyun"};
	public ComboBoxEx() {
		setTitle("�޺��ڽ� ����� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits); //���ڿ� �޺��ڽ� ����
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>(); //�� �޺��ڽ� ����
		for(int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]); //�޺��ڽ��� ���ڿ� ������ ����
		}
		
		c.add(nameCombo);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
