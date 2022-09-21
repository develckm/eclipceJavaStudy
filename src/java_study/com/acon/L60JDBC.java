package java_study.com.acon;

import java.sql.*; //(jdk)java로 db에 접속하고 쿼리를 실행하는 것을 돕는 타입이 정의 됨
import java.util.*;
//import com.mysql.cj.jdbc.Driver;

public class L60JDBC {
	public static void main(String[] args) {
		//java로 JDBC 라이브러리 사용하기 : mysql 접속
		//1.오라클 사이트에서 제공하는 ConnetorJ를 다운로드 
		//2.프로젝트 설정으로 다운 받은 ConnetorJ에 있는 jar를 추가 
		//3.Class.forName()는 동적으로 인스턴스 객체를 생성
		String url="jdbc:mysql://localhost:3306/scott";
		String user="root";
		String pw="mysql";		
		String sql="select * from emp where sal > ? and  deptno=(select deptno from dept where dname=?)";
		//통신을 하고 나면 꼭 닫아주어야하는데 try catch의 finally 닫아주기 위해서 
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			//DriverManager가 접속에 필요한 객체를 동적으로 생성해서 주입해준다.(동적로딩)
			conn=DriverManager.getConnection(url, user, pw); //접속 
			stmt=conn.prepareStatement(sql); //쿼리 작성 준비
			stmt.setInt(1, 2000);
			stmt.setString(2, "sales");
			rs=stmt.executeQuery(); //select를 실행하는 함수 => ResultSet		
			List<EmpDTO> empList=new ArrayList<EmpDTO>();
			while(rs.next()) {
				EmpDTO emp=new EmpDTO();
				DeptDTO dept=new DeptDTO();
				dept.setDeptno(rs.getInt("deptno"));
				emp.setDept(dept);
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setMgr(rs.getInt("mgr"));
				empList.add(emp);
			}	
			System.out.println(empList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//자바는 스레드를 자동으로 생성해주지 않는다!
		System.out.println("메인스레드 종료!");
	}
}
