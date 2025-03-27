-- Clear the students table before adding new data
DELETE FROM students;

-- Create the students table if it does not exist
CREATE TABLE IF NOT EXISTS students (
                                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                                        last_name TEXT NOT NULL,
                                        first_name TEXT NOT NULL,
                                        patronymic TEXT NOT NULL,
                                        birth_date DATE NOT NULL,
                                        record_book_number TEXT NOT NULL
);

-- Add students
INSERT INTO students (last_name, first_name, patronymic, birth_date, record_book_number)
VALUES
    ('Smith', 'John', 'William', '2001-05-15', '12345'),
    ('Johnson', 'Michael', 'Andrew', '2000-03-12', '54321'),
    ('Williams', 'James', 'David', '1999-07-10', '67890'),
    ('Brown', 'Emma', 'Marie', '2002-11-22', '11223'),
    ('Jones', 'Daniel', 'Robert', '2001-05-05', '44556'),
    ('Garcia', 'David', 'Antonio', '2000-01-17', '78901'),
    ('Martinez', 'Sophia', 'Olivia', '1998-04-29', '22334'),
    ('Davis', 'Benjamin', 'Lucas', '1999-09-01', '33445'),
    ('Miller', 'Emily', 'Grace', '2000-12-15', '55667'),
    ('Wilson', 'Madison', 'Evelyn', '2002-03-03', '77889'),
    ('Moore', 'Charlotte', 'Avery', '2001-02-20', '99887'),
    ('Taylor', 'Amelia', 'Katherine', '2001-08-25', '66778'),
    ('Anderson', 'Abigail', 'Harper', '2002-10-10', '33456'),
    ('Thomas', 'Ethan', 'Samuel', '1999-05-06', '11234'),
    ('Jackson', 'Mia', 'Isabella', '2000-07-19', '55688'),
    ('White', 'Ava', 'Lily', '2001-01-09', '77890'),
    ('Harris', 'Lucas', 'Henry', '2002-02-28', '33467'),
    ('Clark', 'Zoe', 'Grace', '2001-01-13', '22345'),
    ('Lewis', 'Max', 'Aaron', '2000-09-17', '88990'),
    ('Young', 'Isabella', 'Alice', '1999-12-12', '66799');


