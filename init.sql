CREATE TABLE IF NOT EXISTS users (
                                     id SERIAL PRIMARY KEY,        -- Auto-increment ID
                                     imie VARCHAR(100) NOT NULL,   -- Имя пользователя
                                     nazwisko VARCHAR(100) NOT NULL, -- Фамилия
                                     email VARCHAR(255) NOT NULL UNIQUE,  -- Email, уникальное поле
                                     wiek INT                     -- Возраст
);

-- Вставка данных в таблицу users
INSERT INTO users (imie, nazwisko, email, wiek) VALUES
                                                    ('Jan', 'Kowalski', 'jan.kowalski@example.com', 30),
                                                    ('Anna', 'Nowak', 'anna.nowak@example.com', 25),
                                                    ('Piotr', 'Zieliński', 'piotr.zielinski@example.com', 35);