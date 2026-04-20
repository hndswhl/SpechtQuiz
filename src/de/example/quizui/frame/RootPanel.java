package de.example.quizui.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;

<<<<<<< HEAD
=======
import de.example.quizui.panel.HeaderPanel;
>>>>>>> 2126f613b09c3c7270dde347196c3a3a1b72dc18
import de.example.quizui.ui.AppPanel;

public class RootPanel extends AppPanel{

	public RootPanel() {
		super(new BorderLayout(0, 15));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		setBackground(new Color(245, 245, 245));
<<<<<<< HEAD

=======
		
		add(new HeaderPanel(), BorderLayout.NORTH);
		
>>>>>>> 2126f613b09c3c7270dde347196c3a3a1b72dc18
	}

	public RootPanel(LayoutManager layout) {
		super(layout);
<<<<<<< HEAD
		
	}
=======
		// TODO Auto-generated constructor stub
	}
	
	
>>>>>>> 2126f613b09c3c7270dde347196c3a3a1b72dc18

}
