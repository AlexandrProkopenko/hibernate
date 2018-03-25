-- auto-generated definition
CREATE DATABASE IF NOT EXISTS `anno`;

USE `anno`;

CREATE TABLE IF NOT EXISTS `children`
(
  id_child   BIGINT       NOT NULL
    PRIMARY KEY,
  child_age  INT          NULL,
  child_name VARCHAR(255) NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE IF NOT EXISTS `toys`
(
  toy_id   BIGINT       NOT NULL
    PRIMARY KEY,
  toy_name VARCHAR(255) NULL,
  owner_id BIGINT       NULL,
  CONSTRAINT FKf5oaxoyggpr0ite3veuw2323l
  FOREIGN KEY (owner_id) REFERENCES children (id_child)
)
  ENGINE = InnoDB;

CREATE INDEX FKf5oaxoyggpr0ite3veuw2323l
  ON toys (owner_id);


INSERT INTO children (id_child, child_age, child_name) VALUES (1,	4,	'Kolia');
INSERT INTO children (id_child, child_age, child_name) VALUES (2,	3,	'Masha');
INSERT INTO children (id_child, child_age, child_name) VALUES (3,	5,	'Dasha');
INSERT INTO children (id_child, child_age, child_name) VALUES (4,	4,	'Sasha');

INSERT INTO toys (toy_id, toy_name, owner_id) VALUES (1,	'Traktor',	1);
INSERT INTO toys (toy_id, toy_name, owner_id) VALUES (2,	'Car',	4);
INSERT INTO toys (toy_id, toy_name, owner_id) VALUES (3,	'Bus',	2);
INSERT INTO toys (toy_id, toy_name, owner_id) VALUES (4,	'Barby',	3);
INSERT INTO toys (toy_id, toy_name, owner_id) VALUES (5,	'Ship',	2);