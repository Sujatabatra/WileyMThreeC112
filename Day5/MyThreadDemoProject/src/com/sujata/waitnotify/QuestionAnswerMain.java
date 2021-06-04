package com.sujata.waitnotify;

public class QuestionAnswerMain {

	public static void main(String args[]) {
		Chat chat=new Chat();
		
		Thread Rishabh=new Thread(new QuestionJob(chat),"Rishabh");
		Thread Sushant=new Thread(new AnswerJob(chat),"Sushant");
		
		Rishabh.start();
		Sushant.start();
	}
}
