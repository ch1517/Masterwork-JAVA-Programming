package Chapter9;
//3��
//GridLayout�� ����Ͽ� ���� �׸��� ���� �� �ٿ� 10���� ��ư�� ������ ũ��� ��ġ�ϴ� �������α׷��� �ۼ��϶�.
import java.awt.*;
import javax.swing.*;

public class Chapter9_3 extends JFrame{

	Chapter9_3(){
		setTitle("Ten Buttons Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++){
			c.add(new JButton(i+""));
		}
		setSize(700,300);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_3();
	}

}