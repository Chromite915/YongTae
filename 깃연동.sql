CREATE DATABASE `sample` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `department` (
  `dname` varchar(45) DEFAULT NULL,
  `dnumber` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `employee` (
  `fname` varchar(45) NOT NULL,
  `minit` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `ssn` int DEFAULT NULL,
  `bdate` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `dno` int DEFAULT NULL,
  `super_ssn` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `enrol` (
  `sub_no` char(3) NOT NULL,
  `stu_no` char(9) NOT NULL,
  `enr_grade` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `student` (
  `name` varchar(20) NOT NULL,
  `id` varchar(45) NOT NULL,
  `dept` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `student2` (
  `stu_no` char(9) NOT NULL,
  `stu_name` varchar(12) DEFAULT NULL,
  `stu_dept` varchar(20) DEFAULT NULL,
  `stu_grade` int DEFAULT NULL,
  `stu_class` char(1) DEFAULT NULL,
  `stu_gender` char(1) DEFAULT NULL,
  `stu_height` int DEFAULT NULL,
  `stu_weight` int DEFAULT NULL,
  PRIMARY KEY (`stu_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `subject` (
  `sub_no` char(3) NOT NULL,
  `sub_name` varchar(30) DEFAULT NULL,
  `sub_prof` varchar(12) DEFAULT NULL,
  `sub_grade` int DEFAULT NULL,
  `sub_dept` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `supervisior` (
  `fname` varchar(45) DEFAULT NULL,
  `minit` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `ssn` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
