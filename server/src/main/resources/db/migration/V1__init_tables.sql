CREATE TABLE email_subscription
(
    id    BIGSERIAL PRIMARY KEY,
    email TEXT      NOT NULL UNIQUE,
    ts    TIMESTAMP NOT NULL DEFAULT current_timestamp
);
