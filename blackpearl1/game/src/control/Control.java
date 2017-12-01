package control;
import java.sql.*;
import model.*;

public class Control {
	
	public static boolean checkUserInfo(UserInfo user) {
		boolean b = false;
		String userName = user.getUserName();
		String passWord = user.getPassWord();
		
        // 对比账号密码
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
			try {
				// 
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=123456");
				Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery("select * from user where username = \"" + userName + "\"");
				if (rs.next()) {
					b = (rs.getString("password").equals(passWord));
				} 
				if (b == true) {
					System.out.println("密码正确");
					int level = Integer.parseInt(rs.getString("level"));
					int money = Integer.parseInt(rs.getString("money"));
					// 如果是用户存在，就开始填充 user 信息
					user.setLevel(level);
					user.setMoney(money);				
				} else {
					System.out.println("用户名不存在或密码错误");
				}
			} catch (SQLException ex) {
			// handle any errors
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getMessage());
				System.out.println("VendorError: " + ex.getMessage());
			} 		
			return b;
	}
}
