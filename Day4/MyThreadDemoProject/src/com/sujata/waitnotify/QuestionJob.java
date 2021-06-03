package com.sujata.waitnotify;

public class QuestionJob implements Runnable{

	private String[] questions= {"Hello","How are you?","Great!"};
	private Chat chat;
	
	
	public QuestionJob(Chat chat) {
		super();
		this.chat = chat;
	}


	public void run() {
		for(String question:questions) {
			chat.showQuestion(question);
		}
	}
}
