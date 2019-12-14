CREATE TABLE `comment`
(
    `id`           bigint        NOT NULL AUTO_INCREMENT,
    `parent_id`    bigint        NOT NULL,
    `type`         int           NOT NULL ,
    `commentator`  int           NOT NULL,
    `content`      varchar(1024) NOT NULL,
    `like_count`   bigint        NOT NULL DEFAULT 0,
    `gmt_create`   bigint        NOT NULL,
    `gmt_modified` bigint        NOT NULL,
    PRIMARY KEY (`id`)
);

