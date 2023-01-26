insert into phone (name, battery, size, memory, ram, chipset, os) 
values ('ZFold4', 'ZFold4 B', 'Andriod', 'ZFold4 M', 'ZFold4 R', 'ZFold4 C', 'Android');
insert into phone (name, battery, size, memory, ram, chipset, os) 
values ('IPhone14PM', 'a', 'Andriod', 'c', 'd', 'e', 'IOS');

insert into stock (count, imei, name, color, sdate) values (100, '1234', 'ZFold4', 'GG', '23.01.26');

select * from phone; 
select * from stock;
select * from buyer;
select * from market;

delete from phone; 
delete from stock;
delete from buyer;
delete from market;