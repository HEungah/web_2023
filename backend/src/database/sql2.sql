#insert into 테이블명(필드명, 필드명) values(값1, 값2)
-- 회원가입
#insert into 테이블명(mid, mpw, mname, mphone) values(?, ?, ?, ?)	--> java에서 사용

-- 로그인
#select*from member where mid = ? and mpw = ?;

-- 아이디중복체크
#select*from 테이블명 where mid = ?;

-- 비밀번호 수정 : 특정회원의 비밀번호를 새로운 비밀번호로 수정
#update 테이블명 set mpw = ? , mphone = ? where mno = ?;

-- 회원탈퇴 : 특정회원의 레코드 삭제
#delete from member where mno = ?;

drop database if exists sqldb4web;
create database sqldb4web;

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

# 테이블의 모든 레코드 검색
select*from member;

# 회원가입 : mno 자동부여이므로 생략
insert into member(mid, mpw, mname, mpnum) values('ezen02', '1234', '이젠', '010-443-1234');
insert into member(mid, mpw, mname, mpnum) values(?, ?, ?, ?);

# 로그인 : 입력한 값 비교
select*from member where mid = 'ezen02' and mpw = '1234';	-- 로그인성공(레코드 1개이상 검색되면)
select*from member where mid = 'ezen02' and mpw = '4321';	-- 로그인실패(레코드가 0개 검색)

# 아이디/전화번호 중복체크(유효성검사) : 입력한 값이 존재하는지 검색
select*from member where mid = 'ezen02';				-- 조건에 맞는 레코드의 모든 필드 검색
select*from member where mid = ?;						-- java에서 사용할때
select*from member where mpunm = '010-443-1234';		-- 조건에 맞는 레코드의 모든 필드 검색
select*from member where mpunm = ?;						-- java에서 사용할때

# 아이디찾기 / 비밀번호찾기 : 입력한 값의 레코드 검색
select mid from member where mname = '이젠' and mpnum = '010-443-1234';		-- 조건에 맞는 레코드의 아이디 필드만 검색
select mid from member where mname = ? and mpnum = ?;						-- java에서 사용할때
select mpw from member where mid = 'ezen02' and mpnum = '010-443-1234';		-- 조건에 맞는 레코드의 비밀번호 필드만 검색
select mpw from member where mid = ? and mpnum = ?;							-- java에서 사용할때

# 회원수정 : 비밀번호 수정 (pk를 식별기준으로 사용 ---> pk필드는 수정하지않는 것을 권장함) 
update member set mpw = '12345' where mno = 4;		-- 4번 회원인 레코드의 비밀번호 수정
update member set mpw = ? where mno = ?;			-- java에서 사용할때

# 회원수정 : 이름, 전화번호 수정
update member set mname = 'ezen' , mpnum = '010-1234-1234' where mno = 4;
update member set mname = ? , mpnum = ? where mno = ?;			-- java에서 사용할때

# 회원탈퇴 : pk 식별 조건
delete from member where mno = 4;			-- 회원번호가 4인 회원 레코드 삭제
delete from member where mno = ?;			-- java에서 사용할때



#-----------------------------------------------------------------------
drop database if exists sqldb6web;
create database sqldb6web;
use sqldb6web;

drop table if exists member;
create table member(						# 아이돌 그룹
	mid char(8) not null,					# 식별키			최대 8자리
    mname varchar(10) not null,				# 그룹명			최대 10자리
    mnumber int not null,					# 인원수			정수
    maddr char(2) not null,					# 지역			최대 2자리
    mphone1 char(3),						# 지역번호		최대 2자리
    mphone2 char(8),						# 전화번호		최대 8자리
    mheight smallint,						# 평균키			정수 +- 3만정도
    mdebut date,							# 데뷔날짜		yyyy-mm-dd
    primary key(mid)						# 제약조건
    
);

drop table if exists buy;
create table buy(
	bnum int auto_increment,					# 구매번호	정수			자동번호부여
    bpname char(6) not null,					# 제품명		최대 6자리
    bgname char(4),								# 분류명		최대 4자리
    bprice int not null,						# 가격		정수
    bamout smallint not null,					# 구매수량	정수
    mid char(8),								# 구매자		FK
    primary key(bnum),							# 제약조건
    foreign key(mid) references member(mid)
);



# 샘플데이터




















