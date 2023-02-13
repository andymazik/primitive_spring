create table company.supervisors
(
    id            integer,
    name          varchar,
    title         varchar,
    salary        integer,
    hire_date     date,
    subordinates  integer,
    department_id integer
);

INSERT INTO company.supervisors (id, name, title, salary, hire_date, subordinates, department_id) VALUES (12, 'Игорь Катамаранов', 'Супервайзер', 2500, '2012-11-02', 3, 24);
INSERT INTO company.supervisors (id, name, title, salary, hire_date, subordinates, department_id) VALUES (14, 'Всеволод Старозубов', 'Старший супервайзер', 1, '2005-01-08', 34, 15);
INSERT INTO company.supervisors (id, name, title, salary, hire_date, subordinates, department_id) VALUES (15, 'Зина Кашина', 'Супервайзер', 3000, '2019-01-03', 4, 15);
INSERT INTO company.supervisors (id, name, title, salary, hire_date, subordinates, department_id) VALUES (16, 'Ричард Сапогов', 'Супервайзер', 302500, '2010-03-06', 7, 10);
INSERT INTO company.supervisors (id, name, title, salary, hire_date, subordinates, department_id) VALUES (13, 'Татьяна Восьмиглазова', 'Супервайзер', 302500, '2015-12-24', 5, 10);
INSERT INTO company.supervisors (id, name, title, salary, hire_date, subordinates, department_id) VALUES (17, 'Гвидон Вишневский', 'Старший супервайзер', 307000, '2010-08-15', 28, 10);
