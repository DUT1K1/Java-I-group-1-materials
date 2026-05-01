DROP DATABASE school;

SELECT c.course_name, t.first_name, t.last_name
FROM courses c
JOIN teachers t ON t.id = c.teacher_id;


-- 1 : n
SELECT *
FROM courses c
JOIN teachers t ON t.id = c.teacher_id;

DROP TABLE games;
DROP TABLE people;
DROP TABLE students;
DROP TABLE users;
DROP TABLE transactions;


CREATE TABLE students (
    id BIGINT PRIMARY KEY,
    first_name TEXT,
    last_name TEXT
);

CREATE TABLE enrollments (
    student_id BIGINT,
    course_id BIGINT,
    enrollment_date DATE,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (course_id) REFERENCES courses(id)
);

INSERT INTO students VALUES
(1, 'Ana', 'Maghradze'),
(2, 'Dachi', 'Chelidze');

SELECT * FROM courses;

INSERT INTO enrollments VALUES
(1, 1, '2025-09-29'),
(1, 3, '2026-04-27'),
(2, 2, '2025-01-01');

SELECT * FROM enrollments;

SELECT 
    s.first_name, 
    s.last_name, 
    e.enrollment_date, 
    c.course_name,
    c.price AS kursis_fasi,
    t.first_name AS teacher_first_name,
    t.last_name AS teacher_last_name
FROM students s
JOIN enrollments e ON s.id = e.student_id
JOIN courses c ON c.id = e.course_id
JOIN teachers t ON t.id = c.teacher_id;