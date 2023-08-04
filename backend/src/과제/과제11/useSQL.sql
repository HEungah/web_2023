drop database if exists sqldb4web;
create database sqldb4web;

# 아이디 비밀번호 이름 전화번호를 저장하는 member 테이블 생성
# 테이블과 비슷하게 memberDto 클래스 설계

use sqldb4web;
drop table if exists member;
create table member(
	mno int auto_increment,			-- 자동부여[PK만 가능]
	mid varchar(30) unique not null,
	mpw varchar(30) not null,		-- 중복허용
	mname varchar(30) not null,		-- 중복허용
	mpnum varchar(13) unique not null,
	
	primary key(mno)
);