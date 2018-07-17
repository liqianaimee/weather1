package cn.hnust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;


public class Student extends HttpServlet {

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
			ResultSet rs = db.executeQuery("select * from student where id = '" + student_id +"'");
//student为表格名称
			String id = "";
			String name = "";
			String age = "";
			String zxc = "";

			while(rs.next()){
				id=rs.getString(1);
				name=rs.getString(2);
				age=rs.getString(3);
				zxc=rs.getString(4);
			}
			db.close();

			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();

			obj.put("result", "ok");
			obj.put("name", name);
			obj.put("age", age);
			obj.put("id", id);
			obj.put("zxc", zxc);
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void doSearch(String number) {
		try {

			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from student where id=" + number );

			String name = "";
			String age = "";
			String id = "";
			String zxc = "";

			while(rs.next()){
				id=rs.getString(1);
				name=rs.getString(2);
				age=rs.getString(3);
				zxc=rs.getString(4);
			}
			db.close();

			JSONObject obj = new JSONObject();

			obj.put("result", "ok");
			obj.put("name", name);
			obj.put("age", age);
			obj.put("id", id);
			obj.put("zxc", zxc);

			System.out.println(obj.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		doSearch("1");
	}

}
