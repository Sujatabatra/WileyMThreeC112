package com.sujata.waitnotify;

public class AnswerJob implements Runnable{

	private String[] answers= {"Hi","I am doing good, and you? ","Have a nice day"};
	private Chat chat;
	
	
	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}


	public void run() {
		for(String answer:answers) {
			chat.showAnswer(answer);
		}
	}
}
