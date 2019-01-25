# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255) not null,
  password                      varchar(255) not null,
  salt                          varchar(255) not null,
  sessionid                     varchar(255),
  highscool_area                integer not null,
  highscool                     integer not null,
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

alter table sample add constraint fk_sample_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_sample_user_id on sample (user_id);


# --- !Downs

alter table sample drop constraint if exists fk_sample_user_id;
drop index if exists ix_sample_user_id;

drop table if exists user;

drop table if exists sample;

drop table if exists tasks;

