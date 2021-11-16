


CREATE TABLE `employee` (
  `emp_id` int NOT NULL,
  `dept_id` int DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `emp_num` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `department` (
  `dept_id` int NOT NULL,
  `dept_name` varchar(255) DEFAULT NULL,
  `total_emp` int DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
