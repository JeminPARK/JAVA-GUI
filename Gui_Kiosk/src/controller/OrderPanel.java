package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.JButton;

import model.Coffee;
import model.KioskRect;
import model.Tea;

public class OrderPanel extends Gui_MyUtil{

	JButton backPage;
	
	public static Vector<Coffee> coffee = new Vector<>();
	public static Vector<Tea> tea = new Vector<>();
	
	private KioskRect[] menu = null;
	JButton coffeeButton;
	JButton teaButton;
	
	
	
	public OrderPanel() {
		setLayout(null);
		setBounds(0,0,700,800);
		setBackground(new Color(218,173,45));
		
		setButton();
		
		setCoffee();
		
	}
	private void setCoffee() {
		coffee.add(new Coffee(1,"�Ƹ޸�ī��",1500));
		coffee.add(new Coffee(2,"����ȾƸ޸�ī��",2500));
		coffee.add(new Coffee(3,"������� �Ƹ޸�ī��",2000));
		coffee.add(new Coffee(4,"���ھƸ޸�ī��",2500));
		coffee.add(new Coffee(5,"īǪġ��",2500));
		coffee.add(new Coffee(6,"ī���",2500));
		coffee.add(new Coffee(7,"������Ӷ�",3000));
		coffee.add(new Coffee(8,"�ٴҶ��",3000));
		coffee.add(new Coffee(9,"ũ���̶�",3000));
		coffee.add(new Coffee(10,"�������ũ���̶�",3500));
		coffee.add(new Coffee(11,"ī���ī",3500));
		coffee.add(new Coffee(12,"ī��ḶŰ�ƶ�",3500));
		coffee.add(new Coffee(13,"����������",1500));
		coffee.add(new Coffee(14,"��ġĿ��",2500));
		coffee.add(new Coffee(15,"��ġ�ó���",3000));
		coffee.add(new Coffee(16,"��ġ���ڳӶ�",3000));
		
		int x = 30;
		int y = 30;
		
		this.menu = new KioskRect[coffee.size()];
		for(int i=0; i<menu.length; i++) {
			this.menu[i] = new KioskRect(i+1, x,y,70,70);
			
			
			
			y+=70;
			
		}
	}
	private void setButton() {
		this.backPage = new JButton();
		this.backPage.setText("�ڷΰ���");
		this.backPage.setBounds(10,10,100,30);
		add(this.backPage);
		
		
		this.coffeeButton = new JButton();
		this.coffeeButton.setText("Ŀ�� �޴�");
		this.coffeeButton.setBounds(240,10,100,30);
		this.coffeeButton.addActionListener(this);
		add(this.coffeeButton);
		
		this.teaButton = new JButton();
		this.teaButton.setText("���� �޴�");
		this.teaButton.setBounds(360,10,100,30);
		this.teaButton.addActionListener(this);
		add(this.teaButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
		
		if(e.getSource() instanceof JButton) {
			JButton target = (JButton) e.getSource();
			
			if(target == this.coffeeButton) {
				for(int i=0; i<coffee.size(); i++) {
					System.out.println(coffee.get(i));
				}
			}
			else if(target == this.teaButton) {
				
			}
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		for(int i=0; i<coffee.size(); i++) {
			g.drawImage(coffee.get(i).getImage().getImage(), 30, 200, null);
			
		}
		repaint();
	}
}
