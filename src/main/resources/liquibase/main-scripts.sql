-- liquibase formatted sql

-- changeSet ivan:1

CREATE TABLE web_site_user
(
    user_id         SERIAL PRIMARY KEY,
    user_first_name TEXT,
    user_last_name  TEXT,
    user_phone      TEXT,
    user_email      TEXT
);

CREATE TABLE user_creating
(
    user_password TEXT PRIMARY KEY,
    first_name    TEXT,
    last_name     TEXT,
    phone         TEXT,
    email         TEXT
);