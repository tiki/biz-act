/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

-- -----------------------------------------------------------------------
-- Example
-- -----------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS example(
    id BIGSERIAL NOT NULL,
    name TEXT,
    PRIMARY KEY(id)
);