create table participation (id number primary key, email varchar(50), activity number);
create table activity(id number primary key, date date ,beginTime time,endTime time ,maxPlaces number, description varchar);
