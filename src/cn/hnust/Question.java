package cn.hnust;

public class Question {

	public String gettid() {
		return tid;
	}

	public void settid(String tid) {
		this.tid =tid;}
	

	public String getquestion() {
		return question;
	}

	public void setquestion(String question ) {
		this.question = question;
	}

	public String getoptA() {
		return optA;
	}

	public void setoptA(String optA) {
		this.optA = optA;
	}

	public String getoptB() {
		return optB;
	}

	public void setoptB(String optB) {
		this.optB = optB;
	}

	public String getoptC() {
		return optC;
	}

	public void setoptC(String optC) {
		this.optC = optC;
	}
	public String getoptD() {
		return optD;
	}

	public void setoptD(String optD) {
		this.optD = optD;
	}
	public String getanswer() {
		return answer;
	}

	public void setanswer(String answer) {
		this.answer = answer;
	}

	public String tid;
	public String question;
	public String optA;
	public String optB;
	public String optC;
	public String optD;
	public String answer;
	
	public Question() {
		
	}
	public Question(String tid, 
			String question, String optA, 
			String optB, String optC,String optD,String answer) {
		this.tid = tid;
		this.question = question;
		this.optA =optA;
		this.optB =optB;
		this.optC =optC;
		this.optD =optD;
		this.answer =answer;
	}
	public static void main(String[] args) {
		

	}

}
