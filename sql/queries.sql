create database taxi;
use taxi;
create table customer(user_id varchar(20),username varchar(10),phone int(10),address varchar(20),primary key(user_id));
create table driver(driver_id varchar(20),drivername varchar(10),driverphone int(10),driverlicense varchar(20),vehicleno varchar(10),vehicletype varchar(10),cost int,primary key(driver_id));
create table booking(booking_id varchar(20),user_id varchar(20),driver_id varchar(20),booking_date date,booking_duration int,foreign key(user_id) references customer(user_id),foreign key(driver_id) references driver(driver_id),primary key(booking_id));
create table payment(payment_id varchar(20),booking_id varchar(20),payment_date date,modeofpayment varchar(10),foreign key(booking_id) references booking(booking_id),primary key(payment_id));
insert into customer values('1','A',1231231231,'Bangalore');
insert into customer values('2','Ab',1231231232,'Bangalore');
insert into customer values('3','B',1231232231,'Chennai');
insert into customer values('4','A',1231232231,'Chennai');
insert into customer values('5','B',423123231,'Bangalore');
insert into driver values('11','Z',234232323,'fff','ka 01 id 0','Indica',300);
insert into driver values('12','Za',224223323,'f4f','ka 01 id 1','Indica',350);
insert into driver values('13','Za',224323323,'f4f4','tn 01 id 1','Santro',550);
insert into driver values('14','Zab',242323523,'f4f5','tn 01 id 2','Santro',650);
insert into driver values('15','Zaff',942323323,'f4f','ka 01 id 4','Indica',350);
insert into booking values('1','1','11','1111-11-11',5);
insert into booking values('2','2','12','1111-11-12',2);
insert into booking values('3','3','13','1111-11-13',3);
insert into booking values('4','4','14','1111-11-14',4);
insert into booking values('5','5','15','1111-11-15',6);
insert into payment values('111','1','1111-11-11','cash');
insert into payment values('112','2','1111-11-12','paytm');
insert into payment values('113','3','1111-11-13','paytm');
insert into payment values('114','4','1111-11-14','phonepay');
insert into payment values('115','5','1111-11-15','bhim upi');
select * from customer where address="Bangalore";
select * from payment where modeofpayment="paytm";
select * from payment as p,booking as b where b.booking_id=p.booking_id and modeofpayment="paytm";