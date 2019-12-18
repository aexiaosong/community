CREATE TABLE `notification` (
    `id`  bigint NOT NULL AUTO_INCREMENT ,
    `notifier`  bigint NOT NULL ,
    `receiver`  bigint NOT NULL ,
    `outer_id`  bigint NOT NULL ,
    `type`  int NOT NULL ,
    `notifier_name` varchar(100) NULL,
    `outer_title` varchar(256) NULL,
    `gmt_create`  bigint NOT NULL ,
    `status`  int NOT NULL DEFAULT 0 ,
    PRIMARY KEY (`id`)
);
