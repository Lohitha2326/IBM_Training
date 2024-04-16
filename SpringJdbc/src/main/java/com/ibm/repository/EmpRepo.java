package com.ibm.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.model.Employee;

@Repository
public class EmpRepo {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}


	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

    //To insert the values
	public void save(Employee emp)
	{
		String sql="insert into employee values(?,?,?,?)";
		int data=jdbc.update(sql,emp.getEmpno(),emp.getEname(),emp.getSal(),emp.getDeptno());
		System.out.println(data+"Records inserted");
	}
	
	
	//to update the salary value
	public void saveUpdate(Employee emp)
	{
		String sql="update employee set esal=? where empno=?";
		int data=jdbc.update(sql,emp.getSal(),emp.getEmpno());
		System.out.println(data+"Records updated");
	}
	
	//to print data row by row we use RowMapper
	public List<Employee> getAll()
	{
		String sql="select * from employee";
		RowMapper<Employee> mapper=new RowMapper<Employee>()
				{

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getInt("esal"));
				emp.setDeptno(rs.getInt("deptno"));
				return emp;
			}
				};
				return jdbc.query(sql, mapper);
	}
	

}
