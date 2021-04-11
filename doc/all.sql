drop table if exists `test`;
create table `test`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment '名称',
                       `password` varchar(50) comment '密码',
                       primary key (`id`)
) engine= innodb default charset =utf8mb4 comment ='测试';

insert into `test` (id, name, password) values (1,'测试','password')


create table `demo`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment '名称',

                       primary key (`id`)
) engine= innodb default charset =utf8mb4 comment ='测试2';

insert into `demo` (id, name) values (1,'测试2');

drop table if exists `ebook`;
create table `ebook`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment '名称',
                       `categoryid_1` bigint comment 'categoryid_1',
                       `categoryid_2` bigint comment 'categoryid_2',
                        `description` varchar(200) comment '描述',
                        `cover` varchar(200) comment '封面',
                        `doc_count` int comment '文档数',
                       `vote_count` int comment '点赞数',
                       `view_count` int comment '浏览数',


                       primary key (`id`)
) engine= innodb default charset =utf8mb4 comment ='ebook';

insert into `ebook` (id, name, description) values (1,'《spring boot 开发》','好好学习');
insert into `ebook` (id, name, description) values (2,'《vue 开发》','天天向上');


