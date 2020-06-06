CREATE DATABASE  IF NOT EXISTS `ams_directory`;
USE `ams_directory`;

CREATE TABLE employee (
  emp_num int auto_increment NOT NULL,
  emp_name varchar(45) DEFAULT NULL,
  emp_type varchar(10) DEFAULT NULL,
  curr_ibu varchar(45) DEFAULT NULL,
  project_code int DEFAULT NULL,
  location varchar(20) DEFAULT NULL,
  permanent_address varchar(100) DEFAULT NULL,
  local_address varchar(100) DEFAULT NULL,
  passport_number varchar(10) DEFAULT NULL,
  passport_issue_date date DEFAULT NULL,
  passport_expiry_date date DEFAULT NULL,
  issuing_office varchar(30) DEFAULT NULL,
  mobile_number double DEFAULT NULL,
  educational_qualifications varchar(100) DEFAULT NULL,
  skills varchar(100) DEFAULT NULL,
  years_exp int DEFAULT NULL,
  prev_employers varchar(100) DEFAULT NULL,
  prev_designation varchar(45) DEFAULT NULL,

  PRIMARY KEY (emp_num)
);

INSERT INTO employee VALUES 
	(1,'John Doe','super','Analytics Business Unit','04','USA','12 St, USA','12 St, USA','P123456','2000-07-24','2020-07-23','USA', 7011338879 , 'MBA', 'Project Management',20,'Oracle', 'Senior Developer'),
	(2,'Andrew','normal','Integration Business Unit','02','USA','30, Wellington Square, USA','30, Wellington Square, USA','P007007','2010-12-14','2030-12-13','USA', 981338879 , 'MCA', '.NET, JAVA', 5 ,'NA', 'NA'),
	(3,'David','normal','Integration Business Unit','01','UK','221-B Baker Street, London','221-B Baker Street, London','P234432','2015-08-29','2035-08-28','London', 8911338879 , 'M.Tech', 'JAVA, Springboot, Node.js',10,'Microsoft','Associate Developer'),
	(4,'Nick','normal','Analytics Business Unit','03','Gotham','1007 Mountain Drive','1007 Mountain Drive','P198876','2008-05-07','2028-05-06','Gotham', 7011234981 , 'Engineering in CS', 'UI/UX Expert',15,'Microsoft', 'UI/UX Developer'),
	(5,'Jessica','admin','Sales Business Unit','01','USA','10880 Malibu Point, USA','10880 Malibu Point, USA','P696969','2011-10-17','2021-10-16','USA', 9811322134 , 'MBA, M.Tech', 'Master Engineer, Project Management', 25 ,'Stark Industries', 'Product Manager');


CREATE TABLE project (
  project_code int auto_increment NOT NULL,
  project_name varchar(50) DEFAULT NULL,
  ibu varchar(45) DEFAULT NULL,
  ibu_head_id int default NULL,
  
  PRIMARY KEY (project_code)
);

INSERT INTO project VALUES 
	(01,'Salesforce','Sales Business Unit',5),
	(02,'CX Integration','Integration Business Unit',2),
	(03,'ILM','Analytics Business Unit',4),
	(04,'Cloud Analytics','Analytics Business Unit',1),
	(05,'Spartacus','Integration Business Unit',3);
    
    
CREATE TABLE credential (
  emp_num int default NULL,
  emp_name varchar(45) NOT NULL,
  password varchar(50) NOT NULL,
  auth_token varchar(100) DEFAULT NULL
);

INSERT INTO credential VALUE 
	(1,'John Doe','pass@123', null),
    (2,'Andrew','pass@123', null),
    (3,'David','pass@123', null),
    (4,'Nick','pass@123', null),
    (5,'Jessica','pass@123', null);
  

-- ALTER table project
-- ADD FOREIGN KEY (ibu_head_id) REFERENCES employee(emp_num)
-- on delete cascade
-- on update cascade;

-- ALTER table employee
-- ADD FOREIGN KEY (project_code) REFERENCES project(project_code)
-- on delete cascade
-- on update cascade;

-- ALTER table credential
-- ADD FOREIGN KEY (emp_num) REFERENCES employee(emp_num)
-- on delete cascade
-- on update cascade;

-- ALTER table credential
-- ADD  primary key (emp_num);

-- delete from employee where emp_num=5;