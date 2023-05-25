DROP TABLE IF EXISTS names;

CREATE TABLE names (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  age int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO names (id, name, age) VALUES (1, "chaki", 23);
INSERT INTO names (id, name, age) VALUES (2, "nakhasi", 26);
INSERT INTO names (id, name, age) VALUES (3, "satou", 21);
