package cn.hnust;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBConnection b =new DBConnection();
			//String sql = "insert into process(tid,question,optA,optB,optC,optD,answer) values('1507','Tom',20,'计算机','湖南')";
			
			//b.execute(sql);
			ResultSet rs = b.executeQuery("select * from process");
			
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				String tid = rs.getString(1);
				String question = rs.getString(2);
				String optA= rs.getString(3);
				String optB = rs.getString(4);
				String optC = rs.getString(5);
				String optD= rs.getString(6);
				String answer= rs.getString(7);
				Question t = new Question(tid,question,optA,optB,optC,optD,answer);
				list.add(t);
			}
			b.close();
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1,-1};
			while(j<5) {
				int randnumber = r.nextInt(list.size());
				System.out.println(randnumber);
				//if not exist 
				ques[j] = randnumber;
				j++;
			}
			
			for(int k=0;k<5;k++) {
				Question s = list.get(k);
				System.out.println(s.gettid());
				//System.out.println(s.getName());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
