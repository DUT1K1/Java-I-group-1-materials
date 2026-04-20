SELECT * FROM students;

SELECT first_name, dob
FROM students
WHERE last_name = 'Krol';

SELECT *
FROM students
WHERE id <> 100 OR id IS NULL;

-- UPDATE
UPDATE students
SET first_name = 'Nana';

DELETE FROM students;

SELECT * FROM students;

UPDATE students
SET first_name = 'Nana'
WHERE id = 5;

DELETE FROM students
WHERE id = 5;

SELECT COUNT(*)
FROM students;

-- NOW()
CREATE TABLE users(
    id INTEGER,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    join_date TIMESTAMP
);

INSERT INTO users
VALUES (1, 'Data', 'Maisuradze', NOW());

SELECT * FROM users;

SELECT CURRENT_DATE;
SELECT CURRENT_TIME;
SELECT CURRENT_TIMESTAMP;
SELECT NOW();


-- UNIQUE
DROP TABLE courses;
CREATE TABLE courses(
    id INTEGER,
    course_name VARCHAR(100) UNIQUE,
    price NUMERIC(6, 2)
);

INSERT INTO courses VALUES
(1, 'JAVA 1', 1000.56),
(2, 'JAVA 1', 5555.55);

INSERT INTO courses VALUES
(4, 'JAVA 2', 1000.56);

SELECT * FROM courses;

ALTER TABLE courses
ADD CONSTRAINT unique_course_name UNIQUE (course_name, price)

ALTER TABLE courses
ADD CONSTRAINT unique_course_name UNIQUE (course_name);
ALTER TABLE courses
ADD CONSTRAINT unique_course_name UNIQUE (price);


-- NOT NULL
DROP TABLE courses;
CREATE TABLE courses(
    id INTEGER,
    course_name VARCHAR(100) UNIQUE,
    price NUMERIC(6, 2) NOT NULL
);

INSERT INTO courses (id, course_name)
VALUES (1, 'JAVA 1');

INSERT INTO courses VALUES (1, 'JAVA 2', 3000.99);

SELECT * FROM courses;

ALTER TABLE courses
ALTER COLUMN price SET NOT NULL;

ALTER TABLE courses
ALTER COLUMN price DROP NOT NULL;


-- CHECK
DROP TABLE courses;
CREATE TABLE courses(
    id INTEGER,
    course_name VARCHAR(100) UNIQUE,
    price NUMERIC(6, 2) NOT NULL,
    CONSTRAINT chk_price_mziuri_courses CHECK (price >= 1000)
);

SELECT * FROM courses;

INSERT INTO courses VALUES (2, 'Java 2', 900.56);
DELETE FROM courses WHERE id = 2;
INSERT INTO courses VALUES (1, 'Java 1', 9000.56);

ALTER TABLE courses
DROP CONSTRAINT chk_price_mziuri_courses;

ALTER TABLE courses
ADD CONSTRAINT chk_price CHECK (price >= 1000);