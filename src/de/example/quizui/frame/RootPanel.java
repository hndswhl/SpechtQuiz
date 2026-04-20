package de.example.quizui.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;

import de.example.quizui.ui.AppPanel;

public class RootPanel extends AppPanel{

	public RootPanel() {
		super(new BorderLayout(0, 15));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		setBackground(new Color(245, 245, 245));

	}

	public RootPanel(LayoutManager layout) {
		super(layout);
		
	}

}
