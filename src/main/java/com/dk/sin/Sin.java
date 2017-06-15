package com.dk.sin;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sin extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3750010775925870394L;
	private double x;
	private double y;
	
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.WHITE);//设置面板背景色
		g.fillRect(0, 0, 400, 300);//填充面板
		g.setColor(Color.RED);//设置画线的颜色
		for(x=0;x<=360;x+=0.1)//一个周期
		{
			y=Math.sin(x*Math. PI/180);//转化为弧度,1度=π/180弧度
			y=(100+80*y);//便于在屏幕上显示
			//g.drawString(".",(int)x,(int)y);//用这种方式也可以
			g.drawLine((int)x, (int)y, (int)x,(int) y);//画点
		}
	}
	
	public static void main(String[] args) {
		Sin s= new Sin();
		JFrame j=new JFrame();
		j.setTitle("一个周期的正弦曲线");
		j.add(s);
		j.setSize(400, 300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}

}
