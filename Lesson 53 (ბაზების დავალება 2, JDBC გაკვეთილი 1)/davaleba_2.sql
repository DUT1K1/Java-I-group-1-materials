CREATE DATABASE davaleba;


-- 1
CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    dob DATE,
    enrollment_date TIMESTAMP DEFAULT NOW(),
    grade INTEGER NOT NULL CHECK (grade BETWEEN 1 AND 12),
    email TEXT NOT NULL UNIQUE
);

-- 2
INSERT INTO students (
    first_name, 
    last_name, 
    dob, 
    grade,
    email) VALUES
('Nika', 'Beridze', '2011-05-04', 5, 'nika.beridze@example.com'),
('Tea', 'Nikoleishvili', '2010-09-02', 6, 'tea.nikoleishvili@example.com'),
('Ana', 'Giorgashvili', '2012-01-30', 7, 'ana.giorgashvili@example.com'),
('Data', 'Makharadze', '2011-07-11', 5, 'data.makharadze@example.com'),
('Data', 'Maisuradze', '2004-09-20', 12, 'data.maisuradze@example.com');

SELECT * FROM students;


-- 3
INSERT INTO students (
    first_name, 
    last_name, 
    dob, 
    grade,
    email) VALUES
('Vinme', 'Vinmeshvili', '2000-01-01', 11, 'data.maisuradze@example.com');

-- 4
SELECT * FROM students;

UPDATE students
SET grade = grade + 1
WHERE id = 4;

-- 5
DELETE FROM students
WHERE first_name = 'Data';

SELECT * FROM students;