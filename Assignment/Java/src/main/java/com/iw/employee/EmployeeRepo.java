/**
 * 
 */
package com.iw.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Mayuresh
 *
 */

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
