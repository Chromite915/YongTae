CREATE DATABASE `sample` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `buyer` (
  `b_name` varchar(45) DEFAULT NULL,
  `b_pnum` varchar(45) DEFAULT NULL,
  `b_imei` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `market` (
  `m_name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `phone` (
  `p_name` varchar(45) NOT NULL,
  `battery` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `memory` varchar(45) DEFAULT NULL,
  `ram` varchar(45) DEFAULT NULL,
  `chipset` varchar(45) DEFAULT NULL,
  `os` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`p_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `stock` (
  `stock_cnt` int NOT NULL,
  `imei` varchar(45) DEFAULT NULL,
  `s_name` varchar(45) DEFAULT NULL,
  `s_color` varchar(45) DEFAULT NULL,
  `s_sdate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`stock_cnt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
