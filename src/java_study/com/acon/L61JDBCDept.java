package java_study.com.acon;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;
//import com.mysql.cj.jdbc.Driver;
public class L61JDBCDept {
	//상수로 접속정보 선언
	private static final String URL="jdbc:mysql://localhost:3306/scott";
	private static final String USER="root";
	private static final String PW="mysql";	
	private static final String SQL="SELECT * FROM EMP e left join DEPT d on e.deptno=d.deptno";

	public static void main(String[] args) {
		//scott.dept 테이블의 리스트를 출력하세요 (DeptDTO를 작성하고 리스트로 출력!)
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(URL, USER, PW);
			pstmt=conn.prepareStatement(SQL);
			rs=pstmt.executeQuery();
			//List<DeptDTO> deptList=new ArrayList<DeptDTO>();
			List<EmpDTO> empList=new ArrayList<EmpDTO>();
			while(rs.next()) {
				EmpDTO emp=new EmpDTO();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setMgr(rs.getInt("mgr"));
				
				DeptDTO dept=new DeptDTO();
				dept.setDname(rs.getString("dname"));
				dept.setDeptno(rs.getInt("deptno"));
				dept.setLoc(rs.getString("loc"));
				
				emp.setDept(dept);
				empList.add(emp);
			}
			//swing jtable
			System.out.println(empList);
			System.out.println(
				empList.stream()
				.mapToDouble(EmpDTO::getSal)
				.sum()
			);
	
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)rs.close();
				if(conn!=null)rs.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
