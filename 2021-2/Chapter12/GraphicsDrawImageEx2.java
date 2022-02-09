package Chapter12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx2() {
		setTitle("�г��� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/sky.jpg"); //�̹��� �ε�
		private Image img = icon.getImage(); //�̹��� ��ü
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//�̹����� �г� ũ��� �����Ͽ� �׸���.
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}

}