CREATE TABLE incidents (
    id BIGSERIAL PRIMARY KEY,
    serviceName VARCHAR(100) NOT NULL,
    severity VARCHAR(20) NOT NULL,
    current_status VARCHAR(20) NOT NULL,
    description TEXT,
    started_at TIMESTAMP NOT NULL,
    resolved_at TIMESTAMP
);