CREATE DATABASE petcare_db;

USE petcare_db;

CREATE TABLE pets (
    pet_id INT PRIMARY KEY AUTO_INCREMENT,
    pet_name VARCHAR(100) NOT NULL,
    species VARCHAR(50) NOT NULL,
    breed VARCHAR(100),
    age INT,
    owner_name VARCHAR(100) NOT NULL,
    owner_phone VARCHAR(10),
    health_status VARCHAR(100)
);

INSERT INTO pets
(pet_name, species, breed, age, owner_name, owner_phone, health_status)
VALUES
('Bruno', 'Dog', 'Labrador', 3, 'Rahul', '9876543210', 'Healthy'),
('Kitty', 'Cat', 'Persian', 2, 'Priya', '9876543211', 'Under Observation');

SELECT * FROM pets;