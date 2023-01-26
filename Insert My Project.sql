insert into phone (name, os, size, chipset, memory, ram, battery, count) 
values ('Z Fold 4', 'Android', '7.6Inch', 'Snap Dragon 8+Gen1', '512GB ~ 1TB', '12GB', '4400mAh', 5);
insert into phone (name, os, size, chipset, memory, ram, battery, count) 
values ('IPhone14 Pro Max', 'IOS', '? Inch', 'A16 Bionic', '256GB ~ 1TB', '? GB', '? mAh', 5);

insert into stock (model, imei, color, movedate) values ('Z Fold 4', '1234', 'GG', '23.01.26');

select * from phone; 
select * from stock;
select * from buyer;
select * from market;

delete from phone; 
delete from stock;
delete from buyer;
delete from market;