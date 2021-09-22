DROP TABLE IF EXISTS user_info;
 
CREATE TABLE user_info (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO user_info (first_name, last_name, career) VALUES
  ('Ram', 'data', 'Lord'),
  ('Krish', 'data', 'saviour'),
  ('Hanuman', 'data', 'fighter');