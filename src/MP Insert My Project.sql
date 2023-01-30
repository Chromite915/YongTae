insert into phone (model, os, size, chipset, memory, ram, battery, count) 
values ('Z Fold 4', 'Android', '7.6Inch', 'Snap Dragon 8+Gen1', '512GB ~ 1TB', '12GB', '4400mAh', 1);
insert into phone (model, os, size, chipset, memory, ram, battery, count) 
values ('IPhone14 Pro Max', 'IOS', '? Inch', 'A16 Bionic', '256GB ~ 1TB', '? GB', '? mAh', 0);

insert into stock (bname, bpnum, model, imei, status, movedate, selldate) values ('홍길동', '010-1234-5678', 'Z Fold 4', '11111111', 'sell', '22.12.25', '22.12.26');
insert into stock (bname, bpnum, model, imei, status, movedate, selldate) values (null, null, 'Z Fold 4', '11111112', 'here', '23.01.26', null);
insert into stock (bname, bpnum, model, imei, status, movedate, selldate) values (null, null, 'Z Fold 4', '11111113', 'not here', '22.12.25', null);

select * from phone; 
select * from stock;

delete from phone; 
delete from stock;