create table person
  (
	 id integer not null,
     name varchar(255) not null,
	 location varchar(255),
	 birth_date timestamp,
	 primary key(id)
 );
insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE )
values(10001,  'Ranga', 'Hyderabad',current_date());

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE )
values(10002,  'Krishna', 'London',current_date());

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE )
values(10003,  'KSKR', 'Newyork',current_date());