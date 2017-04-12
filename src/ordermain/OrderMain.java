package ordermain;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderMain extends JFrame{
	JPanel panel_product,panel_order, panel_delete,panel_pay;
	JButton bt_hot_ameicano_small, bt_pay, bt_delete_menu;
	JLabel label_sum;
	
	
	
	
	public OrderMain() {
		panel_product=new JPanel();
		panel_order=new JPanel(); 
		panel_delete=new JPanel();
		panel_pay=new JPanel();
		
		bt_delete_menu=new JButton("�޴�����");
		bt_hot_ameicano_small=new JButton("HOT AMERICANO SMALL");
		bt_pay=new JButton("�����ϱ�");
		label_sum=new JLabel("�հ�");
		
		
		
		//�г� ũ�� ����
		panel_product.setPreferredSize(new Dimension(700,500)); //�ֹ��Ѱ� �ߴ°� 
		panel_order.setPreferredSize(new Dimension(500,700)); //�ֹ���ư��
		panel_delete.setPreferredSize(new Dimension(700,300)); //������ �հ��ִ� �г�
		panel_pay.setPreferredSize(new Dimension(500,300)); //�����ϱ� ��ư �ִ� �г�
		
		panel_product.setBackground(Color.PINK);
		panel_order.setBackground(Color.ORANGE);
		panel_delete.setBackground(Color.WHITE);
		panel_pay.setBackground(Color.GREEN);
		
		
		
		add(panel_product,BorderLayout.WEST);
		add(panel_order,BorderLayout.EAST);
		add(panel_delete,BorderLayout.EAST);
		add(panel_pay,BorderLayout.WEST);
		
		
	//	panel_west.setLayout(new FlowLayout());
		//panel_west.setLayout(new BorderLayout());
		//panel_west.add(bt_delete_menu,BorderLayout.SOUTH);
		
		setSize(1200,1000);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new OrderMain();
	}

}