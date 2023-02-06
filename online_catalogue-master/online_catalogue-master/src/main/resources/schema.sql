create table users(
    username varchar(50) not null primary key,
    password varchar(50) not null,
    enabled boolean not null
);

create table studenti(
    id integer auto_increment,
    nume varchar(50),
    prenume varchar(50),
    email varchar(50),
    parola varchar(50),
    username varchar(50) references users(username),
    primary key(id)
);

create table authorities(
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities(username,authority);

create table cursuri(
    cod_disciplina int,
    nume_disciplina varchar(50),
    an varchar(50),
    credite integer(50),
    primary key(cod_disciplina)
);

create table note(
    Id integer auto_increment,
    cod_disciplina int references cursuri(cod_disciplina),
    cod_student integer references studenti(id),
    nota integer(50),
    situatie varchar(50),
    departament varchar(50),
    primary key(Id)
);

create table examene(
    id integer auto_increment,
    cod_disciplina int references cursuri(cod_disciplina),
    cod_student integer references studenti(id),
    data varchar(50),
    ora varchar(50),
    primary key(id)
);