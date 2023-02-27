create sequence items_seq start with 1 increment by 1;
CREATE TABLE items (
    id int not null,
    description varchar (512) not null,
    primary key (id)
)


