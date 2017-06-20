
-- 建表脚本是根据 hibernate 导出的
-- 用于 oracle 数据库

drop table SYS_CCY cascade constraints

drop table SYS_CRM_PARAMETER cascade constraints

drop table SYS_INSTN cascade constraints

drop table SYS_RCD cascade constraints

drop table SYS_ROLE_INFO cascade constraints

drop table SYS_ROLE_MENU cascade constraints

drop table SYS_ROLE_USER cascade constraints

drop table SYS_SITE_NOTICE cascade constraints

drop table SYS_TELLER cascade constraints

drop table SYS_USER_INFO cascade constraints

drop table hibernate_sequences cascade constraints

create table SYS_CCY (
    CCY_ID varchar2(255 char) not null,
    GB_ID varchar2(255 char),
    EN_ID varchar2(255 char),
    CCY_NAM varchar2(255 char),
    primary key (CCY_ID)
)

create table SYS_CRM_PARAMETER (
    PAR_CODE varchar2(255 char) not null,
    PAR_NAME varchar2(255 char),
    PAR_ROOT varchar2(255 char),
    PAR_VALUE varchar2(255 char),
    PAR_DESC varchar2(255 char),
    primary key (PAR_CODE)
)

create table SYS_INSTN (
    INSTN_ID varchar2(255 char) not null,
    INSTN_NAM varchar2(255 char),
    INSTN_ABBR varchar2(255 char),
    INSTN_ADDR varchar2(255 char),
    INSTN_TEL varchar2(255 char),
    INSTN_PAR varchar2(255 char),
    INSTN_LEV varchar2(255 char),
    INSTN_TYP varchar2(255 char),
    OP_DT date,
    INSTN_VAILD varchar2(255 char),
    SORT_ID number(19,0),
    primary key (INSTN_ID)
)

create table SYS_RCD (
    ID number(19,0) not null,
    USER_ID varchar2(255 char),
    RCD_TM timestamp,
    USR_INSTN varchar2(255 char),
    IP varchar2(255 char),
    USR_EVT varchar2(255 char),
    primary key (ID)
)

create table SYS_ROLE_INFO (
    ROLE_ID number(19,0) not null,
    ROLE_NAM varchar2(255 char),
    NOTES varchar2(255 char),
    primary key (ROLE_ID)
)

create table SYS_ROLE_MENU (
    ID number(19,0) not null,
    ROLE_ID number(19,0),
    MENU_ID varchar2(255 char),
    primary key (ID)
)

create table SYS_ROLE_USER (
    ROLE_ID number(19,0) not null,
    USER_ID varchar2(255 char) not null,
    primary key (USER_ID, ROLE_ID)
)

create table SYS_SITE_NOTICE (
    ID number(19,0) not null,
    FROM_USER varchar2(255 char),
    USER_ID varchar2(255 char),
    FROM_DATE date,
    CONTENT varchar2(255 char),
    READ_STATE varchar2(255 char),
    primary key (ID)
)

create table SYS_TELLER (
    TELLER_ID varchar2(255 char) not null,
    INSTN_ID varchar2(255 char),
    NAM varchar2(255 char),
    primary key (TELLER_ID)
)

create table SYS_USER_INFO (
    USER_ID varchar2(255 char) not null,
    USER_PWD varchar2(255 char),
    USER_TELLER_ID varchar2(255 char),
    USER_NAM varchar2(255 char),
    INITN_ID varchar2(255 char),
    USER_IDEN varchar2(255 char),
    USER_TYP varchar2(255 char),
    USER_TLE varchar2(255 char),
    USER_DEP varchar2(255 char),
    USER_TEL varchar2(255 char),
    USER_MOBL varchar2(255 char),
    USER_VALID varchar2(255 char),
    primary key (USER_ID)
)

alter table SYS_RCD 
    add constraint FKC3428FA1AAD2B21E 
    foreign key (USR_INSTN) 
    references SYS_INSTN

alter table SYS_ROLE_MENU 
    add constraint FKAA83B076A7D25A6F 
    foreign key (ROLE_ID) 
    references SYS_ROLE_INFO

alter table SYS_ROLE_USER 
    add constraint FKAA8786E2A7D25A6F 
    foreign key (ROLE_ID) 
    references SYS_ROLE_INFO

alter table SYS_ROLE_USER 
    add constraint FKAA8786E24CFD6BCF 
    foreign key (USER_ID) 
    references SYS_USER_INFO

alter table SYS_TELLER 
    add constraint FKA252E9F027E2EB73 
    foreign key (INSTN_ID) 
    references SYS_INSTN

alter table SYS_USER_INFO 
    add constraint FKAAB761907BC30DED 
    foreign key (USER_TELLER_ID) 
    references SYS_TELLER

alter table SYS_USER_INFO 
    add constraint FKAAB7619016D2753D 
    foreign key (INITN_ID) 
    references SYS_INSTN

create table hibernate_sequences (
     sequence_name varchar2(255 char),
     sequence_next_hi_value number(10,0) 
) 
    
-- 基础数据
-- admin 的密码  njbank

INSERT INTO  sys_instn
VALUES('9900', '南京银行', '南京银行', '', '0                   ', '9900', '2', '0', NULL, '1', NULL);

INSERT INTO  sys_teller
VALUES('0001', '9900', '李明');
 
INSERT INTO  sys_user_info VALUES
('admin', '06db1cd3c292e767c42b5f7cb5a56e5e', NULL, 'administrator', '9900', '', '9', '5', '', '', '', '1') ;

INSERT INTO  sys_role_info
VALUES(1, '系统管理员', '拥有操作系统管理模块的角色');

INSERT INTO sys_role_menu
VALUES(105, 1, '102/1001/1005');

INSERT INTO sys_role_menu
VALUES(104, 1, '102/1004/1001');

INSERT INTO sys_role_menu
VALUES(103, 1, '102/1003/1001');

INSERT INTO sys_role_menu
VALUES(102, 1, '102/1005/1001');

INSERT INTO  sys_role_user
VALUES(1, 'admin');    