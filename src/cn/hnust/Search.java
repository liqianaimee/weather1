package cn.hnust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import cn.hnust.DBConnection;

public class Search extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		String student_id = request.getParameter("id");
		System.out.println("id:" + student_id);
		
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from process");
			
			String tid = "";
			String question = "";
			String optA = "";
			String optB = "";
			String optC= "";
			String optD= "";
			String answer= "";
			int count=0;
			ArrayList<Question> list =new ArrayList<Question>();
			while(rs.next()){
				count++;
				tid=rs.getString(1);
				question=rs.getString(2);
				optA=rs.getString(3);
				optB=rs.getString(4);
				optC=rs.getString(5);
				optD=rs.getString(6);
				answer=rs.getString(7);
				Question q=new Question(tid,question,optA,optB,optC,optD,answer);
				list.add(q);
			}
			db.close();
			
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1,-1};
			while(j<5) 
			{
				int randnumber = r.nextInt(list.size());
				int i=0;boolean ok=true;
			while(i<j)
			{
				if(randnumber==ques[i])
				
			{
				ok=false;
				break;
			}
				i++;
			}
			if(ok)
			{
				//System.out.println(randnumber;)
				ques[j]=randnumber;
				j++;
			}
			}
			
			JSONObject obj1 = new JSONObject();
			Question q1=list.get(ques[0]);
			obj1.put("result", "ok");
			obj1.put("tid", q1.tid);
			obj1.put("question",q1.question);
			obj1.put("optA", q1.optA);
			obj1.put("optB", q1.optB);
			obj1.put("optC", q1.optC);
			obj1.put("optD", q1.optD);
			obj1.put("answer",q1.answer);
			obj.put("question1",obj1);
			JSONObject obj2 = new JSONObject();
			Question q2=list.get(ques[1]);
			obj2.put("result", "ok");
			obj2.put("tid", q2.tid);
			obj2.put("question",q2.question);
			obj2.put("optA", q2.optA);
			obj2.put("optB", q2.optB);
			obj2.put("optC", q2.optC);
			obj2.put("optD", q2.optD);
			obj2.put("answer",q2.answer);
			obj.put("question2",obj2);
			JSONObject obj3 = new JSONObject();
			Question q3=list.get(ques[2]);
			obj3.put("result", "ok");
			obj3.put("tid", q3.tid);
			obj3.put("question",q3.question);
			obj3.put("optA", q3.optA);
			obj3.put("optB", q3.optB);
			obj3.put("optC", q3.optC);
			obj3.put("optD", q3.optD);
			obj3.put("answer",q3.answer);
			obj.put("question3",obj3);
			JSONObject obj4 = new JSONObject();
			Question q4=list.get(ques[3]);
			obj4.put("result", "ok");
			obj4.put("tid", q4.tid);
			obj4.put("question",q4.question);
			obj4.put("optA", q4.optA);
			obj4.put("optB", q4.optB);
			obj4.put("optC", q4.optC);
			obj4.put("optD", q4.optD);
			obj4.put("answer",q4.answer);
			obj.put("question4",obj4);
			JSONObject obj5 = new JSONObject();
			Question q5=list.get(ques[4]);
			obj5.put("result", "ok");
			obj5.put("tid", q5.tid);
			obj5.put("question",q1.question);
			obj5.put("optA", q5.optA);
			obj5.put("optB", q5.optB);
			obj5.put("optC", q5.optC);
			obj5.put("optD", q5.optD);
			obj5.put("answer",q5.answer);
			obj.put("question5",obj5);
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		}
			catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void doSearch(String student_id) {
		try {
			
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from process");
			
			String tid = "";
			String question = "";
			String optA = "";
			String optB = "";
			String optC= "";
			String optD= "";
			String answer= "";
			int i=0;
			ArrayList<Question> list =new ArrayList<Question>();
			while(rs.next()){
				i++;
				tid=rs.getString(1);
				question=rs.getString(2);
				optA=rs.getString(3);
				optB=rs.getString(4);
				optC=rs.getString(5);
				optD=rs.getString(6);
				answer=rs.getString(7);
				Question q=new Question(tid,question,optA,optB,optC,optD,answer);
				list.add(q);
			}
			db.close();
			JSONObject obj = new JSONObject();
			for(int k=0,num=1;k<5;k++,num++) {
				Question q1=list.get(k);
				//System.out.println(s.getId());
				System.out.println("绗�"+num+"棰�");
				//System.out.println(q1.question);
				System.out.println(q1.optA);
				System.out.println(q1.optB);
				System.out.println(q1.optC);
				System.out.println(q1.optD);
				//System.out.println(s.getanswer());
			}

			System.out.println(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		doSearch("1705050128");
	}

}
