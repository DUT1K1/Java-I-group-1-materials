-- 1
CREATE DATABASE school;

-- 2
CREATE TABLE teachers (
    id BIGINT,
    first_name TEXT,
    last_name TEXT,
    hire_date DATE,
    email VARCHAR(150)
);

-- 3
SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public';

-- 4
INSERT INTO teachers VALUES
(1, 'Nino', 'Kiknadze', '2008-05-10', 'nino.k@example.com'),
(2, 'Giorgi', 'Lomidze', '2010-09-05', 'giorgi.l@example.com'),
(3, 'Mariami', 'Giorgadze', '2011-05-10', 'nino.k@example.com'),
(4, 'Levani', 'Sikharulidze', '202014-05-10', 'nino.k@example.com'),
(5, 'Tamari', 'Maisuradze', '2018-05-10', 'nino.k@example.com');

SELECT * FROM teachers;

-- 5
SELECT *
FROM teachers
WHERE hire_date >= '2009-01-01';

-- 6
ALTER TABLE teachers
ADD COLUMN departament TEXT;

-- 7
ALTER TABLE teachers
RENAME COLUMN email TO contact_email;

-- 8
SELECT first_name, contact_email
FROM teachers
WHERE hire_date < '2015-01-01' OR hire_date > '2018-12-31';