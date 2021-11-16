/**
 * 
 */
package com.iw.department;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLInsert;

/**
 * @author Mayuresh
 *
 */

@Entity
@Table(name="department")
@SQLInsert(sql = "INSERT  INTO department (dept_id, dept_name, total_emp) " +
        "VALUES (?, ?, ?)" )

public class Department {
	@Id
	@Column
	private int dept_id;
	@Column
	private String dept_name;
	@Column
	
	private int total_emp;
	/**
	 * @return the dept_id
	 */
	public int getDept_id() {
		return dept_id;
	}
	/**
	 * @param dept_id the dept_id to set
	 */
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	/**
	 * @return the dept_name
	 */
	public String getDept_name() {
		return dept_name;
	}
	/**
	 * @param dept_name the dept_name to set
	 */
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	/**
	 * @return the total_emp
	 */
	public int getTotal_emp() {
		return total_emp;
	}
	/**
	 * @param total_emp the total_emp to set
	 */
	public void setTotal_emp(int total_emp) {
		this.total_emp = total_emp;
	}
	
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", total_emp=" + total_emp + "]";
	}

}
