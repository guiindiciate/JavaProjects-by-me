package com.tempcelcius;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("Slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN,25));
		slider.setOrientation(SwingConstants.VERTICAL);
		
		
		label.setText(slider.getValue() + "°C");
		label.setFont(new Font("MV Boli", Font.PLAIN,30));
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText(slider.getValue() + "°C");
		
	}
	
	

}