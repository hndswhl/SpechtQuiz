package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;

import element.AppPanel;

public class QuizPanel extends AppPanel {

	public QuizPanel() {
		super(new BorderLayout(0, 15));
		add(new QuestionPanel(), BorderLayout.NORTH);
		add(new AnswerPanel(), BorderLayout.CENTER);

	}
}
