create table doctors(

    id bigint not null auto_increment,
    name varchar(100) not null,
    mail varchar(100) not null unique,
    crm varchar(6) not null unique,
    medic_field varchar(100) not null,
    country varchar(50) not null,
    state varchar(100) not null,
    city varchar(50) not null,
    postal_code varchar(10) not null,
    district varchar(50),
    street varchar(100) not null,
    number varchar(10) not null,

    primary key(id)

);