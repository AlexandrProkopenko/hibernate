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

