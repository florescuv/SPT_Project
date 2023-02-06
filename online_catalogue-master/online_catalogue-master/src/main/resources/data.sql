insert into users(username, password ,enabled) values
    ('alex','pass', 'true'),
    ('andrei','pass', 'true'),
    ('dobrean','pass', 'true');

insert into studenti(nume, prenume, email, parola,username) values
    ('bolt', 'alex', 'alex@mail.com', 'pass','alex'),
    ('vlad','andrei', 'andrei@mail.com','pass','andrei'),
    ('razvan','dobrean','dobrean@mail.com','pass','dobrean');

insert into authorities(username,authority) values
    ('alex','ROLE_ADMIN'),
    ('andrei','ROLE_ADMIN'),
    ('dobrean','ROLE_ADMIN');

insert into cursuri(cod_disciplina, nume_disciplina, an, credite) values
    (111, 'Electronica Digitala', 'II', 6),
    (112, 'Programare Orientata pe Obiect', 'II', 5),
    (113, 'Elemente de Grafica pe Calculator', 'II', 4),
    (114, 'Programarea Algoritmilor', 'II', 3),
    (115, 'Comunicatii mobile', 'II', 2);

insert into note(cod_disciplina, cod_student, nota, situatie, departament) values
    (111, 1, 7, 'Promovat', 'Tehnologii si Sisteme de Telecomunicatii'),
    (112, 1, 10, 'Promovat', 'Tehnologii si Sisteme de Telecomunicatii'),
    (113, 2, 4, 'Nepromovat', 'Tehnologii si Sisteme de Telecomunicatii'),
    (114, 2, 8, 'Promovat', 'Tehnologii si Sisteme de Telecomunicatii'),
    (115, 3, 10, 'Promovat', 'Tehnologii si Sisteme de Telecomunicatii');

insert into examene(cod_disciplina,cod_student,data,ora) values
    (114,1, '14/06/2005', '9:00'),
    (113,2, '26/06/2005', '12:00'),
    (115,3, '26/06/2005', '14:00');