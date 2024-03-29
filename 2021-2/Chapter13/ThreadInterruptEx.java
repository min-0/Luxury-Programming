package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TimerRunnable1 implements Runnable {
	private JLabel timerLabel; //타이머 값이 출력된 레이블
	public TimerRunnable1(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	//스레드 코드, run()이 종료하면 스레드 종료
	public void run() {
		int n = 0; //타이머 카운트 값
		while(true) { //무한 루프
			timerLabel.setText(Integer.toString(n)); //타이머 값을 레이블에 출력
			n++; //카운트 증가
			try {
				Thread.sleep(1000); //1초동안 잠을 잔다
			}
			catch(InterruptedException e) {
				return; //예외가 발생하면 스레드 종료
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("고딕", Font.ITALIC, 80));
		
		//타이머 스레드로 사용할 Runnable 객체 생성
		//타이머 값을 출력할 레이블 컴포넌트를 생성자에게 전달한다.
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		th = new Thread(runnable); //스레드 생성
		c.add(timerLabel);
		
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); //타이머 스레드 강제 종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //버튼 비활성화
			}
		});
		c.add(btn);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); //스레드 동작 시킴
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
