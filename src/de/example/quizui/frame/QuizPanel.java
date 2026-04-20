package de.example.quizui.frame;

import java.awt.BorderLayout;

import de.example.quizui.panel.AnswerPanel;
import de.example.quizui.panel.QuestionPanel;
import de.example.quizui.ui.AppPanel;

public class QuizPanel extends AppPanel {

	public QuizPanel() {
		super(new BorderLayout(0, 15));
		add(new QuestionPanel(), BorderLayout.NORTH);
		add(new AnswerPanel(), BorderLayout.CENTER);
<<<<<<< HEAD

		// TODO Auto-generated constructor stub
	}
=======
	}
	
	
>>>>>>> 2126f613b09c3c7270dde347196c3a3a1b72dc18

}
