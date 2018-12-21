# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table grade (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  subject                       varchar(255) not null,
  now_grade                     integer not null,
  user_id                       bigint,
  constraint pk_grade primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  password                      varchar(255) not null,
  salt                          varchar(255) not null,
  sessionid                     varchar(255),
  highscool_area                varchar(255),
  highscool                     varchar(255),
  uni_area                      varchar(255),
  university                    varchar(255),
  major                         varchar(255),
  constraint pk_user primary key (id)
);

alter table grade add constraint fk_grade_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_grade_user_id on grade (user_id);


# --- !Downs

alter table grade drop constraint if exists fk_grade_user_id;
drop index if exists ix_grade_user_id;

drop table if exists grade;

drop table if exists user;

