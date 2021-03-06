# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table accgrade (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  subject                       varchar(255) not null,
  acc_grade                     integer not null,
  tag                           varchar(255) not null,
  user_id                       bigint,
  registered_at                 bigint,
  constraint pk_accgrade primary key (id)
);

create table comment (
  id                            bigint auto_increment not null,
  threadid                      bigint not null,
  comment                       varchar(255) not null,
  imagepath                     varchar(255) not null,
  registered_at                 bigint not null,
  username                      varchar(255) not null,
  anchor                        bigint not null,
  thread_id                     bigint,
  constraint pk_comment primary key (id)
);

create table event (
  id                            bigint auto_increment not null,
  title                         varchar(255) not null,
  start_date                    timestamp not null,
  end_date                      timestamp not null,
  color                         varchar(255),
  start_date_string             varchar(255),
  end_date_string               varchar(255),
  username                      varchar(255) not null,
  constraint pk_event primary key (id)
);

create table grade (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  subject                       varchar(255) not null,
  now_grade                     integer not null,
  tag                           varchar(255) not null,
  user_id                       bigint,
  constraint pk_grade primary key (id)
);

create table thread (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  threadname                    varchar(255) not null,
  updated_at                    bigint not null,
  constraint pk_thread primary key (id)
);

create table thread_user (
  thread_id                     bigint not null,
  user_id                       bigint not null,
  constraint pk_thread_user primary key (thread_id,user_id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  password                      varchar(255) not null,
  salt                          varchar(255) not null,
  sessionid                     varchar(255),
  highscool_area                varchar(255) not null,
  highscool                     varchar(255) not null,
  uni_area                      varchar(255) not null,
  university                    varchar(255) not null,
  major                         varchar(255) not null,
  constraint pk_user primary key (id)
);

create table sample (
  id                            bigint auto_increment not null,
  message                       varchar(255) not null,
  user_id                       bigint,
  constraint pk_sample primary key (id)
);

create table tasks (
  id                            bigint auto_increment not null,
  title                         varchar(255) not null,
  sessionid                     varchar(255),
  done                          boolean default false not null,
  subject                       varchar(255),
  registered_at                 timestamp not null,
  deadline                      timestamp not null,
  constraint pk_tasks primary key (id)
);

alter table accgrade add constraint fk_accgrade_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_accgrade_user_id on accgrade (user_id);

alter table comment add constraint fk_comment_thread_id foreign key (thread_id) references thread (id) on delete restrict on update restrict;
create index ix_comment_thread_id on comment (thread_id);

alter table grade add constraint fk_grade_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_grade_user_id on grade (user_id);

alter table thread_user add constraint fk_thread_user_thread foreign key (thread_id) references thread (id) on delete restrict on update restrict;
create index ix_thread_user_thread on thread_user (thread_id);

alter table thread_user add constraint fk_thread_user_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_thread_user_user on thread_user (user_id);

alter table sample add constraint fk_sample_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_sample_user_id on sample (user_id);


# --- !Downs

alter table accgrade drop constraint if exists fk_accgrade_user_id;
drop index if exists ix_accgrade_user_id;

alter table comment drop constraint if exists fk_comment_thread_id;
drop index if exists ix_comment_thread_id;

alter table grade drop constraint if exists fk_grade_user_id;
drop index if exists ix_grade_user_id;

alter table thread_user drop constraint if exists fk_thread_user_thread;
drop index if exists ix_thread_user_thread;

alter table thread_user drop constraint if exists fk_thread_user_user;
drop index if exists ix_thread_user_user;

alter table sample drop constraint if exists fk_sample_user_id;
drop index if exists ix_sample_user_id;

drop table if exists accgrade;

drop table if exists comment;

drop table if exists event;

drop table if exists grade;

drop table if exists thread;

drop table if exists thread_user;

drop table if exists user;

drop table if exists sample;

drop table if exists tasks;

