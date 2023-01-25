insert into employee (fname, minit, lname, ssn, super_ssn, bdate, address, sex, salary, dno) 
values ('홍', '길', '동', 1234, 4321, '1990.03.17', '인천', '남', 250.0, 101);
insert into employee (fname, minit, lname, ssn, super_ssn, bdate, address, sex, salary, dno) 
values ('유', '재', '석', 2345, 5432, '1990.04.17', '서울', '남', 260.0, 102);
insert into employee (fname, minit, lname, ssn, super_ssn, bdate, address, sex, salary, dno) 
values ('강', '호', '동', 3456, 6543, '1990.05.17', '부산', '남', 270.0, 103);

-- 삭제기능 테스트용 데이터(정상작동 확인)
insert into employee (fname, minit, lname, ssn, super_ssn, bdate, address, sex, salary, dno) 
values ('강', '호', '동3', 3457, 6547, '1990.05.17', '부산', '남', 270.0, 103);

insert into department (dname, dnumber) values ('Research', 101);
insert into department (dname, dnumber) values ('Administration', 102);
insert into department (dname, dnumber) values ('Headquarters', 103);

insert into supervisior (fname, minit, lname, ssn) values ('홍', '길', '동2', 1234);
insert into supervisior (fname, minit, lname, ssn) values ('유', '재', '석2', 2345);
insert into supervisior (fname, minit, lname, ssn) values ('강', '호', '동2', 3456);


select * from employee; 
select * from department;
select * from supervisior;

delete from employee;
delete from department;
delete from supervisior;

DROP TABLE department;
