ALTER TABLE `comment` ADD COLUMN `comment_count`  int NOT NULL DEFAULT 0 AFTER `content`;
