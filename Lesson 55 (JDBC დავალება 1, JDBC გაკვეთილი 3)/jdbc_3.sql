SELECT * FROM students;

-- SELECT * FROM students WHERE id = ?

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    first_name TEXT,
    last_name TEXT
);

SELECT * FROM users;