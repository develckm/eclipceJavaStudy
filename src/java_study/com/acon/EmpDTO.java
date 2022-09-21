package java_study.com.acon;

import java.util.Date;

public class EmpDTO { //Data Transfer Object : data가 전송되면서 타입이 변경될 수 있는데 이를 방지하기 위해 생성하는 객체
/* 
 * Scott.emp table 명세서
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| EMPNO    | int         | NO   | PRI | NULL    |       |
| ENAME    | varchar(10) | YES  |     | NULL    |       |
| JOB      | varchar(9)  | YES  |     | NULL    |       |
| MGR      | int         | YES  | MUL | NULL    |       |
| HIREDATE | date        | YES  |     | NULL    |       |
| SAL      | float(7,2)  | YES  |     | NULL    |       |
| COMM     | float(7,2)  | YES  |     | NULL    |       |
| DEPTNO   | int         | YES  | MUL | NULL    |       |
+----------+-------------+------+-----+---------+-------+ 
 * */
	private int empno;
	private String ename;
	private String job;
	private int mgr; //emp selfjoin으로 변경해 보세요~
	private Date hiredate;
	private double sal;
	private double comm;
	private DeptDTO dept; //join 해서 추가할 table
	//private int deptno; //dept.deptno
	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", dept=" + dept + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public DeptDTO getDept() {
		return dept;
	}
	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}
}
