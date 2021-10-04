import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class swing_GUI extends JFrame{
	swing_GUI ()
	{
		setTitle("원 넓이 구하기");
		setLayout(new BorderLayout(10,10));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel1 = new JPanel(new GridLayout(2,0));
		
		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(false);
		
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);		
		panel1.add(p1);
		panel1.add(p2);
		add(panel1, BorderLayout.NORTH);
		//
		JPanel panel2 = new JPanel();
		
		JTextArea area = new JTextArea(30,20);
		area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
		area.setEditable(false);
		area.setForeground(Color.RED);
		
		panel2.add(area);
		add(panel2, BorderLayout.CENTER);
		//
		String[] color = {"red","blue"};
		
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		
		JButton cal = new JButton("계산");
		JComboBox<String> cb = new JComboBox<String>(color);
		JButton reset = new JButton("리셋");
		
		panel3.add(cal);
		panel3.add(cb);
		panel3.add(reset);
		
		add(panel3, BorderLayout.SOUTH);
		
		cal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (t1.getText().isEmpty())
					area.setText("반지름을 입력하세요!!!");
				else
				{
					String s = t1.getText();
					double radius = Double.parseDouble(s);
					double result = radius*radius*3.14;
					t2.setText(""+result);
					area.setText(radius+"*"+radius+"*3.14="+result);
				}
			}			
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
			}
		});
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int index = ((JComboBox) cb).getSelectedIndex();
				if (index == 0)
					area.setForeground(Color.RED);
				else
					area.setForeground(Color.BLUE);				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,220);
		setVisible(true);
	}



	public static void main(String[] args) {
		new swing_GUI();
	}

}
