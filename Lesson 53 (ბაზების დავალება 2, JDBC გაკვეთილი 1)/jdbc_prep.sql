CREATE DATABASE test;

CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT
);

INSERT INTO students (first_name, last_name) VALUES
('Davit', 'Maisuradze'),
('Dachi', 'Chelidze'),
('Ana', 'Maghradze'),
('Nini', 'Badridze'),
('Nata', 'Kvantaliani');

SELECT * FROM students;