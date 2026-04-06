CREATE DATABASE datadata;

DROP DATABASE datadata;

SELECT * FROM students;

CREATE TABLE example (
    id INTEGER,
    name TEXT,
    dob DATE
);

DROP TABLE example;

INSERT INTO students VALUES (5, 'Nini', 'Badridze', '2009-05-23');

SELECT * FROM students;

SELECT first_name, last_name FROM students;



-- მონაცემების წაკითხვა
SELECT *
FROM students
WHERE id = 1;

SELECT *
FROM students
WHERE first_name = 'Dachi';

SELECT * 
FROM students
WHERE id <= 2;

SELECT *
FROM students
WHERE id IS NULL;

SELECT *
FROM students
WHERE dob >= '2009-01-01';

SELECT *
FROM students
WHERE id <> 1;


-- ინფორმაციის განახლება
UPDATE students
SET first_name = 'Davit';

DELETE FROM students;

INSERT INTO students
VALUES (1, 'Data', 'Maisuradze', '2004-09-20');

INSERT INTO students (first_name, last_name)
VALUES ('Givi', 'Sikharulidze');

INSERT INTO students VALUES 
(2, 'Nata', 'Kvantaliani', '2009-05-20'),
(3, 'Ana', 'Maghradze', '2010-08-19'),
(4, 'Dachi', 'Chelidze', '2008-09-25');

INSERT INTO students
VALUES (9, 'Vigac', 'Vigacashvili', NOW());

UPDATE students
SET first_name = 'Davit'
WHERE last_name = 'Maisuradze';

DELETE FROM students
WHERE id IS NULL;

UPDATE students 
SET first_name = 'NATA'
WHERE id = 2;

SELECT * FROM students;

drop table users;

CREATE TABLE users(
    id INTEGER,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    join_date TIMESTAMP
);

INSERT INTO users VALUES (1, 'Data', 'Maisuradze', NOW());

SELECT * FROM users;


DROP TABLE courses;

CREATE TABLE courses (
    id INTEGER UNIQUE,
    course_name VARCHAR(100) UNIQUE,
    price DECIMAL(6, 2) NOT NULL DEFAULT 0
);

ALTER TABLE courses
ADD CONSTRAINT check_id CHECK(id < 2000);

ALTER TABLE courses ADD CONSTRAINT unique_id UNIQUE(id);

INSERT INTO courses VALUES (2, 'Java 2', 9876.54);
INSERT INTO courses VALUES (1, 'Java 1', 9876.54);
INSERT INTO courses (course_name, price) 
VALUES ('Python', 1232.23);
INSERT INTO courses VALUES (4, 'Java 3', 987.54);
INSERT INTO courses VALUES (1231, 'Java 4', 9871.54);
INSERT INTO courses VALUES (12311, 'Java 5', 9871.54);

INSERT INTO courses (id, course_name) 
VALUES (1, 'Python');

SELECT * FROM courses;