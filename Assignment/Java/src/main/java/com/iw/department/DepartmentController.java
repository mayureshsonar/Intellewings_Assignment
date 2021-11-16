/**
 * 
 */
package com.iw.department;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mayuresh
 *
 */

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/")

public class DepartmentController {

}
