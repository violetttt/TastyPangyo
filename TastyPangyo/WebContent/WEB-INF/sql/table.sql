create table member(
member_id varchar2(50) primary key,
member_pw varchar2(50) not null,
member_name varchar2(50) not null,
visit_date date not null
);
drop table member;

create table review(
review_no number primary key,
member_id varchar2(50) not null,
restaurant_id number not null,
restaurant_name varchar2(50) not null,
registered_date date not null,
title varchar2(50) not null,
comments varchar2(1000) not null,
kostar number(1) not null,
constraint review_member_fk foreign key(member_id) references member(member_id),
constraint review_restaurant_fk foreign key(restaurant_id) references restaurant(restaurant_id)
);
drop table review;

create table restaurant(
restaurant_id number primary key,
food_category varchar2(50) not null,
location varchar2(50) not null,
restaurant_name varchar2(50) not null,
hits number not null,
restaurant_tel_num varchar2(50) not null,
introduction varchar2(1000) not null,
menu varchar2(1000) not null
);
drop table restaurant;
	
create table image(
restaurant_id number not null,
restaurant_image varchar2(100),
constraint image_restaurant_fk foreign key(restaurant_id) references restaurant(restaurant_id)
);
drop table image;

-- sequence
create sequence restaurant_id_seq;
create sequence review_no_seq;
	
-----------------------test---------------------------
SELECT COUNT(member_id) FROM member
insert into member values('shh', '000', '서현화', '2017,05,01');
insert into member values('lbm', '111', '이병문', '2017,05,01');
insert into member values('lsh', '222', '이승헌', '2017,05,01');
insert into member values('jgh', '555', '장규현', '2017,05,01');
insert into member values('sey', '777', '성은영', '2017,05,01');

select * from member order by member_id
select * from review

DELETE FROM member WHERE visit_date < '2017,05,20'












	