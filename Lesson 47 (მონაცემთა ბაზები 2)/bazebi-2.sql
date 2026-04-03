CREATE TABLE example (
    id INTEGER
);

DROP TABLE example;

CREATE TABLE students (
    id INTEGER,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    dob DATE
);

SELECT * FROM students;

-- ALTER TABLE moswavleebi RENAME TO students;

ALTER TABLE students ADD COLUMN email VARCHAR(100);

ALTER TABLE students RENAME COLUMN email TO e_mail;

-- ALTER TABLE students MODIFY COLUMN id BIGINT; 

ALTER TABLE students DROP COLUMN e_mail;



-- ინფორმაციის შენახვა
INSERT INTO students
VALUES (1, 'Data', 'Maisuradze', '2004-09-20');

INSERT INTO students (first_name, last_name)
VALUES ('Givi', 'Sikharulidze');

INSERT INTO students VALUES 
(2, 'Nata', 'Kvantaliani', '2009-05-20'),
(3, 'Ana', 'Maghradze', '2010-08-19'),
(4, 'Dachi', 'Chelidze', '2008-09-25');

SELECT * FROM students;

SELECT first_name, last_name FROM students;