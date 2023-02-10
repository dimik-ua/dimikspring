CREATE TABLE IF NOT EXISTS user (
    id BIGINT NOT NULL AUTO_INCREMENT,
    password varchar(64) NOT NULL,
    username varchar(64) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS todo (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title varchar(64) NOT NULL,
    completed BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);