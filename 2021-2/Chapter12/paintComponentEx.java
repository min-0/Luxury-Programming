package Chapter12;

import javax.swing.*;
import java.awt.*;

public class paintComponentEx extends JFrame {
	public paintComponentEx() {
		setTitle("���ο� ��ư �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		c.add(b);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyButton extends JButton { //JButton�� ��ӹ޾� ���ο� ��ư�� �����Ѵ�. �� ��ư�� ���� ��ư�� �׻� ��ư�� �������� ������.
		public MyButton(String s) {
			super(s); //JButton�� ������ ȣ��
		}
		public void paintComponent(Graphics g) { //���ο� ��ư�� �׸���.
			super.paintComponent(g); //JButton���� �⺻ ��ư ����� �׸����� �Ѵ�.
			//Jbutton�� �⺻ ��� ���� �߰������� ���������� ��ư ũ�⸸�� Ÿ���� �׸���.
			g.setColor(Color.red);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1); //��ư�� Ÿ���� �׻� �׷����� �Ѵ�.
		}
	}

	public static void main(String[] args) {
		new paintComponentEx();
	}
}