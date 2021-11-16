/**
 * 
 */
package com.iw.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



/**
 * @author Mayuresh
 *
 */

@RepositoryRestResource(collectionResourceRel = "department", path = "department")

public interface DepartmentRepo extends JpaRepository <Department, Integer>{

}
