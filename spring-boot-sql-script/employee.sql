CREATE DATABASE  IF NOT EXISTS `ams_directory`;
USE `ams_directory`;

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_num` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(50) NOT NULL,
  `emp_name` varchar(45) DEFAULT NULL,
  `emp_type` varchar(10) DEFAULT NULL,
  `curr_designation` varchar(45) DEFAULT NULL,
  `project_code` varchar(10) DEFAULT NULL,
  `project_name` varchar(50) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `ibu` varchar(45) DEFAULT NULL,
  `permanent_address` varchar(100) DEFAULT NULL,
  `local_address` varchar(100) DEFAULT NULL,
  `passport_number` varchar(10) DEFAULT NULL,
  `passport_issue_date` date DEFAULT NULL,
  `passport_expiry_date` date DEFAULT NULL,
  `issuing_office` varchar(30) DEFAULT NULL,
  `mobile_number` int(13) DEFAULT NULL,
  `educational_qualifications` varchar(100) DEFAULT NULL,
  `skills` varchar(100) DEFAULT NULL,
  `years_exp` int(2) DEFAULT NULL,
  `prev_employers` varchar(100) DEFAULT NULL,
  `prev_designation` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_num`)
);

INSERT INTO `employee` VALUES 
	(1,'pass@123','Nick Fury','super','COO','01','Project1','USA','BU1','Unknown, USA','Unknown, USA','P123456','2000-06-05','2025-06-04','USA', 1234567890 , 'Unknown', 'Skilled military strategist, Skilled armed and unarmed combatant',40,'CIA, S.H.I.E.L.D.', 'Colonel'),
	(2,'pass@123','James Bond','normal','007','01','Project1','USA','BU1','30, Wellington Square, USA','30, Wellington Square, USA','P007007','2010-07-25','2030-07-24','USA', 0700007007 , 'Unknown', 'Strategist, Master martial artist, Skilled assassin', 30 ,'MI6', '007'),
	(3,'pass@123','Sherlock Holmes','normal','Private Detective','02','Project2','UK','BU2','221-B Baker Street, London','221-B Baker Street, London','P234432','2004-01-10','2024-01-09','London', 991991991 , 'Unknown', 'Botany, Geology, Chemistry, Anatomy',10,'Freelancer','NA'),
	(4,'pass@123','Bruce Wayne','normal','Vigilante','03','Project3','Gotham','BU3','1007 Mountain Drive','1007 Mountain Drive','P198876','2008-12-14','2028-12-13','Gotham', 1243632812 , 'Engineering in CS', 'Indomitable Will, Combatant',5,'Wayne Enterprises', 'CEO'),
	(5,'pass@123','Tony Stark','super','CEO','02','Project2','USA','NA','10880 Malibu Point, USA','10880 Malibu Point, USA','P696969','2010-07-23','2030-07-22','USA', 00700700007 , 'Masters in Electrical Engineering', 'Expert Tactician, Master Engineer, Master Physicist', 10 ,'Stark Industries', 'CEO')

