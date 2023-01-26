CREATE DATABASE `sample` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `buyer` (
  `name` varchar(45) DEFAULT NULL,
  `pnum` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `department` (
  `dname` varchar(45) DEFAULT NULL,
  `dnumber` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `employee` (
  `fname` varchar(45) DEFAULT NULL,
  `minit` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `ssn` int DEFAULT NULL,
  `super_ssn` int DEFAULT NULL,
  `bdate` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `dno` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `market` (
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `phone` (
  `name` varchar(45) NOT NULL,
  `os` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `chipset` varchar(45) DEFAULT NULL,
  `memory` varchar(45) DEFAULT NULL,
  `ram` varchar(45) DEFAULT NULL,
  `battery` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `stock` (
  `count` int NOT NULL,
  `imei` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `sdate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`count`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `supervisor` (
  `fname` varchar(45) DEFAULT NULL,
  `minit` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `ssn` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
