SELECT first_name, dob FROM students;

CREATE DATABASE ramesaxeli;

DROP DATABASE ramesaxeli;

SELECT * FROM users;

DROP TABLE users;

CREATE TABLE people (
    id INTEGER,
    first_name TEXT,
    last_name VARCHAR(50),
    dob DATE,
    steps_walked BIGINT,
    body_weight NUMERIC(5, 2),
    is_alive BOOLEAN
);

SELECT * FROM people;

ALTER TABLE people RENAME TO adamianebi;

SELECT * FROM adamianebi;
DROP TABLE adamianebi;

ALTER TABLE people
ADD COLUMN email VARCHAR(150);

ALTER TABLE people
RENAME COLUMN email TO e_mail;

ALTER TABLE people
ALTER COLUMN steps_walked TYPE INTEGER;

ALTER TABLE people
DROP COLUMN e_mail;


DELETE FROM students;
SELECT * FROM students;

INSERT INTO students
VALUES (1, 'Data', 'Maisuradze', '2004-09-20');

INSERT INTO students (first_name, last_name)
VALUES ('Nini', 'Badridze');

INSERT INTO students VALUES 
(1, 'Data', 'Maisuradze', '2004-09-20'),
(2, 'Vato', 'Vatoshvili', '2001-01-23');

insert into students (id, first_name, last_name, dob) values (1, 'Loleta', 'Sargent', '2022-05-15');
insert into students (id, first_name, last_name, dob) values (2, 'Susanna', 'Laughnan', '2023-02-07');
insert into students (id, first_name, last_name, dob) values (3, 'Naomi', 'Refford', '1997-09-19');
insert into students (id, first_name, last_name, dob) values (4, 'Dew', 'Jales', '2023-09-24');
insert into students (id, first_name, last_name, dob) values (5, 'Chrissy', 'Steptow', '2009-03-16');
insert into students (id, first_name, last_name, dob) values (6, 'Marleen', 'Stieger', '2022-08-03');
insert into students (id, first_name, last_name, dob) values (7, 'Percival', 'Krol', '2014-06-21');
insert into students (id, first_name, last_name, dob) values (8, 'Alma', 'Karlmann', '1991-12-23');
insert into students (id, first_name, last_name, dob) values (9, 'Lamond', 'Galea', '2023-07-20');
insert into students (id, first_name, last_name, dob) values (10, 'Gradeigh', 'Yare', '1997-06-10');
insert into students (id, first_name, last_name, dob) values (11, 'Archaimbaud', 'Gritsunov', '2014-08-02');
insert into students (id, first_name, last_name, dob) values (12, 'Lissi', 'Gabbatiss', '2018-11-20');
insert into students (id, first_name, last_name, dob) values (13, 'Arlinda', 'Sterricker', '1998-03-31');
insert into students (id, first_name, last_name, dob) values (14, 'Guthry', 'Rimell', '1996-12-09');
insert into students (id, first_name, last_name, dob) values (15, 'Violette', 'Bernardini', '2014-07-18');
insert into students (id, first_name, last_name, dob) values (16, 'Frederica', 'Syers', '2019-11-19');
insert into students (id, first_name, last_name, dob) values (17, 'Tildie', 'Deighan', '1993-12-10');
insert into students (id, first_name, last_name, dob) values (18, 'Nappy', 'Cases', '1995-04-05');
insert into students (id, first_name, last_name, dob) values (19, 'Maurie', 'Monnelly', '2022-07-27');
insert into students (id, first_name, last_name, dob) values (20, 'Janeva', 'Triggel', '2001-12-25');
insert into students (id, first_name, last_name, dob) values (21, 'Blinnie', 'Gabbett', '2021-07-31');
insert into students (id, first_name, last_name, dob) values (22, 'Wynnie', 'D''eathe', '2025-01-26');
insert into students (id, first_name, last_name, dob) values (23, 'Angela', 'Patzelt', '2022-02-23');
insert into students (id, first_name, last_name, dob) values (24, 'Dede', 'Gandley', '2025-09-10');
insert into students (id, first_name, last_name, dob) values (25, 'Ira', 'Lowder', '2017-02-08');
insert into students (id, first_name, last_name, dob) values (26, 'Mildrid', 'Klemps', '2023-07-19');
insert into students (id, first_name, last_name, dob) values (27, 'Kayley', 'Marritt', '2012-02-25');
insert into students (id, first_name, last_name, dob) values (28, 'Mora', 'Doble', '2007-10-11');
insert into students (id, first_name, last_name, dob) values (29, 'Roi', 'Gash', '2017-03-11');
insert into students (id, first_name, last_name, dob) values (30, 'Augustin', 'Musla', '2009-05-20');
insert into students (id, first_name, last_name, dob) values (31, 'Kerry', 'Darington', '2015-01-15');
insert into students (id, first_name, last_name, dob) values (32, 'Christyna', 'Thorneley', '1992-04-27');
insert into students (id, first_name, last_name, dob) values (33, 'Elisabetta', 'Dzenisenka', '2019-08-20');
insert into students (id, first_name, last_name, dob) values (34, 'Ruthie', 'Hollyard', '1994-06-30');
insert into students (id, first_name, last_name, dob) values (35, 'Chelsea', 'Puzey', '2024-04-06');
insert into students (id, first_name, last_name, dob) values (36, 'Bridie', 'Hailston', '2023-06-07');
insert into students (id, first_name, last_name, dob) values (37, 'Verge', 'Morphet', '2008-07-10');
insert into students (id, first_name, last_name, dob) values (38, 'Rafa', 'Jessope', '2022-05-01');
insert into students (id, first_name, last_name, dob) values (39, 'Alaine', 'Goaley', '1996-12-02');
insert into students (id, first_name, last_name, dob) values (40, 'Ulberto', 'Bracchi', '2018-08-08');
insert into students (id, first_name, last_name, dob) values (41, 'Carolina', 'Moxom', '2020-01-06');
insert into students (id, first_name, last_name, dob) values (42, 'Tobye', 'Shearwood', '1999-12-12');
insert into students (id, first_name, last_name, dob) values (43, 'Latrena', 'Gamwell', '2005-05-06');
insert into students (id, first_name, last_name, dob) values (44, 'Basia', 'Cote', '2004-10-19');
insert into students (id, first_name, last_name, dob) values (45, 'Northrop', 'Greening', '1997-09-08');
insert into students (id, first_name, last_name, dob) values (46, 'Floria', 'Burde', '2006-03-19');
insert into students (id, first_name, last_name, dob) values (47, 'Octavia', 'Macklam', '2015-09-18');
insert into students (id, first_name, last_name, dob) values (48, 'Mozelle', 'Heugle', '2022-02-01');
insert into students (id, first_name, last_name, dob) values (49, 'Donny', 'Garrick', '2016-12-12');
insert into students (id, first_name, last_name, dob) values (50, 'Simone', 'Robley', '2009-04-15');
insert into students (id, first_name, last_name, dob) values (51, 'Cleopatra', 'Ruggles', '2023-02-08');
insert into students (id, first_name, last_name, dob) values (52, 'Abner', 'Elmore', '2004-01-25');
insert into students (id, first_name, last_name, dob) values (53, 'Merrick', 'Kinney', '1991-09-06');
insert into students (id, first_name, last_name, dob) values (54, 'Simonette', 'Jukubczak', '2024-07-17');
insert into students (id, first_name, last_name, dob) values (55, 'Irwin', 'Bockler', '1994-06-27');
insert into students (id, first_name, last_name, dob) values (56, 'Mellisa', 'Nilles', '2021-05-29');
insert into students (id, first_name, last_name, dob) values (57, 'Addie', 'Ambrosch', '2017-07-30');
insert into students (id, first_name, last_name, dob) values (58, 'Dur', 'Mattioli', '2010-08-15');
insert into students (id, first_name, last_name, dob) values (59, 'Benjamen', 'Varden', '2023-05-30');
insert into students (id, first_name, last_name, dob) values (60, 'Abigael', 'Poor', '2004-08-14');
insert into students (id, first_name, last_name, dob) values (61, 'Mervin', 'Tillard', '2018-03-19');
insert into students (id, first_name, last_name, dob) values (62, 'Adela', 'Leiden', '2011-01-08');
insert into students (id, first_name, last_name, dob) values (63, 'Brien', 'Earingey', '2026-02-13');
insert into students (id, first_name, last_name, dob) values (64, 'Conrad', 'Kubat', '2018-05-29');
insert into students (id, first_name, last_name, dob) values (65, 'Jacquie', 'Eggerton', '2000-07-27');
insert into students (id, first_name, last_name, dob) values (66, 'Robinett', 'Knight', '2016-08-30');
insert into students (id, first_name, last_name, dob) values (67, 'Vin', 'Lesurf', '2012-09-13');
insert into students (id, first_name, last_name, dob) values (68, 'Florance', 'Conkling', '2013-01-26');
insert into students (id, first_name, last_name, dob) values (69, 'Ashia', 'Nurse', '2010-01-17');
insert into students (id, first_name, last_name, dob) values (70, 'Simonette', 'Houten', '2023-05-04');
insert into students (id, first_name, last_name, dob) values (71, 'Guss', 'Severns', '2011-03-30');
insert into students (id, first_name, last_name, dob) values (72, 'Niels', 'Gummer', '2002-02-16');
insert into students (id, first_name, last_name, dob) values (73, 'Genevieve', 'Yakuntsov', '2015-10-12');
insert into students (id, first_name, last_name, dob) values (74, 'Edeline', 'Lorand', '1992-02-07');
insert into students (id, first_name, last_name, dob) values (75, 'Valle', 'Beaney', '2011-02-10');
insert into students (id, first_name, last_name, dob) values (76, 'Shalna', 'Wilse', '2000-12-03');
insert into students (id, first_name, last_name, dob) values (77, 'Cherish', 'O''Shields', '1995-01-31');
insert into students (id, first_name, last_name, dob) values (78, 'Emlyn', 'Keemar', '1991-04-17');
insert into students (id, first_name, last_name, dob) values (79, 'Mae', 'Dafforne', '2008-02-10');
insert into students (id, first_name, last_name, dob) values (80, 'Desiree', 'Revell', '2009-02-24');
insert into students (id, first_name, last_name, dob) values (81, 'Ulysses', 'Beynke', '2010-05-15');
insert into students (id, first_name, last_name, dob) values (82, 'Arin', 'Enderle', '2023-10-03');
insert into students (id, first_name, last_name, dob) values (83, 'Jacquetta', 'Sawford', '2021-12-18');
insert into students (id, first_name, last_name, dob) values (84, 'Berky', 'Cullinane', '2005-05-28');
insert into students (id, first_name, last_name, dob) values (85, 'Harvey', 'Broadbury', '1993-05-23');
insert into students (id, first_name, last_name, dob) values (86, 'Margaret', 'Tolliday', '2008-10-11');
insert into students (id, first_name, last_name, dob) values (87, 'Keen', 'Twigg', '2010-05-14');
insert into students (id, first_name, last_name, dob) values (88, 'Andrey', 'Glenwright', '2017-10-16');
insert into students (id, first_name, last_name, dob) values (89, 'Agneta', 'Blakeney', '2019-09-27');
insert into students (id, first_name, last_name, dob) values (90, 'Cristie', 'Haddrell', '1993-08-23');
insert into students (id, first_name, last_name, dob) values (91, 'Laryssa', 'MacMenamin', '1996-05-28');
insert into students (id, first_name, last_name, dob) values (92, 'Claiborne', 'McCreery', '1996-10-31');
insert into students (id, first_name, last_name, dob) values (93, 'Ted', 'McKaile', '2020-01-25');
insert into students (id, first_name, last_name, dob) values (94, 'Feodor', 'Hartzog', '1996-12-12');
insert into students (id, first_name, last_name, dob) values (95, 'Portia', 'Lehemann', '1998-01-20');
insert into students (id, first_name, last_name, dob) values (96, 'Kiri', 'Bartod', '1996-04-03');
insert into students (id, first_name, last_name, dob) values (97, 'Florinda', 'Stoyle', '2023-09-28');
insert into students (id, first_name, last_name, dob) values (98, 'Trina', 'Skirvane', '2015-12-28');
insert into students (id, first_name, last_name, dob) values (99, 'Jesse', 'Bambrick', '1995-07-09');
insert into students (id, first_name, last_name, dob) values (100, 'Sinclare', 'Dyos', '2020-07-13');

SELECT * FROM students;
DELETE FROM students WHERE first_name = 'Data' OR first_name = 'Nini';


SELECT * FROM students;
SELECT first_name, last_name FROM students;

SELECT * 
FROM students
WHERE id = 55;

SELECT *
FROM students
WHERE first_name = 'Percival';

SELECT * 
FROM students
WHERE dob >= '2020-01-01';

SELECT * 
FROM students
WHERE id <> 55;

SELECT * FROM students;

UPDATE students
SET id = NULL
where id = 1;

SELECT *
FROM students
WHERE id IS NULL;