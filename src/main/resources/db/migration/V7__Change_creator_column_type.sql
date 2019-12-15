ALTER TABLE `question` MODIFY COLUMN `creator`  bigint(11) NULL DEFAULT NULL AFTER `description`;
ALTER TABLE `comment` MODIFY COLUMN `commentator`  bigint(11) NOT NULL AFTER `type`;