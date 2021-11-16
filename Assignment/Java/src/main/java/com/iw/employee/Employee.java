/**
 * 
 */
package com.iw.employee;

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
@Table(name="employee")
@SQLInsert(sql = "INSERT  INTO employee(emp_id, emp_num, name, dob, dept_id, salary) " +
        "VALUES (?, ?, ?, ?, ?, ?)" )

public class Employee {
	@Id
	@Column
	private int emp_id;
	@Column
	private  int emp_num;
	@Column	
	private String name;
	@Column
		private String dob;
	@Column
		private int dept_id;
	@Column
	private float salary;
		/**
		 * @return the emp_id
		 */
		public int getEmp_id() {
			return emp_id;
		}
		/**
		 * @param emp_id the emp_id to set
		 */
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		/**
		 * @return the emp_num
		 */
		public int getEmp_num() {
			return emp_num;
		}
		/**
		 * @param emp_num the emp_num to set
		 */
		public void setEmp_num(int emp_num) {
			this.emp_num = emp_num;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the dob
		 */
		public String getDob() {
			return dob;
		}
		/**
		 * @param dob the dob to set
		 */
		public void setDob(String dob) {
			this.dob = dob;
		}
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
		 * @return the salary
		 */
		public float getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", emp_num=" + emp_num + ", name=" + name + ", dob=" + dob
					+ ", dept_id=" + dept_id + ", salary=" + salary + "]";
		}

}
