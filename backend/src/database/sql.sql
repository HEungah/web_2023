# 데이터베이스 생성
drop database if exists sqldb2web1;
create database sqldb2web1;

# 테이블 생성
use sqldb2web1;
drop table if exists memberboard;
create table memberboard(
	mno int,
    mid varchar(20),
    mpw varchar(20),
    bno int,
    btitle varchar(100),
    bcontent longtext,
    bview int,
    bdate datetime
);

select*from memberboard;

# memberboard 테이블을 정규화
use sqldb2web1;
drop table if exists memberList;
create table memberList(
	mno int,		# pk
    mid varchar(20),
    mpw varchar(20)
);
select*from memberList;

drop table if exists boardList;
create table boardList(
	mno int,		# fk
	bno int,		# pk
    btitle varchar(100),
    bcontent longtext,
    bview int,
    bdate datetime
);
select*from boardList;

# ; 명령어마다 실행 ctrl + enter
# 기본키( primary key ) : 테이블의 유일한 값을 가지는 필드 ( 중복이 없고 null 과 공백이 없는 필드)
# 외래키( foreign key ) : 참조키, PK필드와 연결된 다른 테이블의 필드 (중복 가능, null과 공백 가능)

# PK와 FK 필드 선정
# PK : 데이터의 중복이 없는 식별가능한 필드 ---> mno( 회원번호 )
	# 번호형태의 PK필드를 권장하는 이유 ---> 문자열데이터 필드보다는 메모리를 효율적으로 사용이 가능하다
# FK : 다른 테이블에 있는 PK 필드와 연결
	# PK필드명과 동일하게 FK필드명 사용(권장)
    # FK필드의 타입은 PK 필드의 타입과 반드시 같아야한다
    # [참조하는테이블] 에서 FK 필드 선언
 # 제약 조건
	# pk : primary key(pk 필드명) -> 식별키 (중복x, not null, 공백x, 테이블1개당 1개이상 권장), 다른 테이블의 필드에서 해당 pk필드를 참조 당한다.
    # fk : foreign key(fk 필드명) references pk테이블명(pk필드명) [ 선택 옵션 ] -> 참조키 ( 접수테이블[접수자], 출결[출근한사번], 각종서류[주민등록] )
		# 다른테이블의 pk필드를 참조하는 FK필드
        # 중복o, null 가능
        
    # auto_increment : insert(삽입) 할때 해당 필드를 생략하면 자동번호 부여 [ 자동으로 1씩 증가 ]
		# auto_increment는 pk필드만 사용가능하다
        
    # not null : insert 할때 해당 필드의 공백 방지
    # unique : insert 할때 해당 필드의 값 중복 방지
    # default : insert 할때 해당 필드의 값 생략하면 자동으로 대입되는 기본값
		# default 0
        # default now()		---> now() 현재날짜/시간 반환해주는 함수
        # default '문자열'

use sqldb2web1;
drop table if exists member2;
create table member2(
	mno int,		# pk
    mid varchar(20),
    mpw varchar(20),
    primary key(mno) -- 현재 테이블에서 mno 라는 필드를 식별키로 설정하겠다는 명령어
);

drop table if exists board2;
create table board2(
	mno int,		# fk
	bno int,		# pk
    btitle varchar(100),
    bcontent longtext,
    bview int,
    bdate datetime,
    primary key(bno),
    foreign key(mno) references member2(mno)
);

# database --> reverse engineer (관계 보기)

/*
	문제 5 : 조건
		1) 키오스크 시스템 개발 'sqldb2sys' 라는 이름으로 DB 생성
        2) 카테고리(category)와 제품(product) 테이블 2개를 선언
        3) 카테고리 : 카테고리번호(cno), 카테고리명(cname)
		   제품 : 제품번호(pno), 제품명(pname), 제품가격(pprice)
        4) pk필드는 새로 생성하지 않고 pk 설정만 fk 필드는 선언후 관계 설정   

*/

drop database if exists sqldb2sys;
create database sqldb2sys;

use sqldb2sys;
drop table if exists category;
create table category(
	cno tinyint,	#pk
    cname varchar(20),
    primary key(cno)
);

drop table if exists product;
create table product(
	pno tinyint,	#pk
    pname varchar(20),
    pprice int,
    cno tinyint,	#fk	category
    primary key(pno),
    foreign key(cno) references category(cno)
);

drop table if exists basket;
create table basket(
	bno tinyint,	#pk
    bdate datetime,
    borderno tinyint,
    pno tinyint,	#fk	product
    primary key(bno),
    foreign key(pno) references product(pno)
);

drop database if exists sqldb3web;
create database sqldb3web;
use sqldb3web;
# 예제 변경될때
drop table if exists member1;
create table member1(
	mno int auto_increment ,							-- 회원번호[pk, 자동번호 부여]
    memail varchar(20) not null unique,					-- 회원이메일[공백x, 중복x]
    mid varchar(10) not null unique,					-- 회원아이디[공백x, 중복x]
    /* 예6*/
    mpoint int not null default 1000,					-- 회원점수[공백x, 기본값 0]		--> 회원가입시 고객이 입력하는 사항x
    mdate datetime not null default now(),				-- 회원가입일[공백x, 기본값 현재날짜/시간]	--> 회원가입시 고객이 입력하는 사항x
    mreceive boolean not null default true,				-- 회원이메일수신여부[공백x, 기본값 true]	--> 이메일수신여부 동의가 기본값
    mimg varchar(1000) not null default '기본프로필.jpg',	-- 회원프로필사진[공백x, 기본값 '기본프로필']
    primary key(mno)									-- pk 설정
);
select*from member1;
# ----------------------------------------

# *테이블에 레코드/행 추가하기 [inser into 테이블명 values(값1, 값2, 값3); ]
	# insert into 테이블명(필드명1, 필드명2) values(값1, 값2)
# 예1)
insert into member1 values(1);	-- member1 테이블의 mno 필드에 값 추가
# 예2)
insert into member1 values(1, '유재석');	-- 직접 데이터 입력할경우 문자/날짜 입력시 ' '사용
# 예3)
insert into member1 values(1, '유재석');	-- 가능
insert into member1 values('유재석');	-- 오류 ('유재석' 데이터를 어떤 필드에 넣을지 식별 불가능
# auto_increment : insert(삽입시) 해당 필드에 값 생략하면 자동번호가 삽입
insert into member1(mid) values('유재석');	-- 특정 필드에만 데이터를 삽입할경우 테이블명뒤에 필드명 명시

# 예) not null : null 삽입 방지(해당 필드에 값이 무조건 존재해야하는 경우에 사용)

#예4)
insert into member1(mid, memail) values('유재석', 'qwe');
insert into member1(mid) values('유재석');	-- 삽입시 필드 생략하면 null이 저장됨
insert into member1(memail) values('qwe');	-- mid 필드가 not null 이기때문에 오류 발생

#예5) unique : 해당 필드에 값의 중복 방지
insert into member1(mid) values('유재석');
insert into member1(mid) values('유재석');	-- 오류발생 >>> mid 필드는 unique 제약조건을 사용했으므로 기존에 있는 값을 대입할 수 없다. [ 중복방지 ]

# 예6) default : 해당 필드에 값 삽입시 생략하면 자동으로 들어가는 기본값 설정
insert into member1(mid, memail) values('유재석', 'qwe@qer.com');
insert into member1(mid, memail, mpoint) values('강호동', 'qwr@qer.com', 2000);	-- dafault 값을 무시하고 직접 설정 할수도 있음

select*from member1;

insert into member1(mid, memail, mreceive) values('신동엽', 'dks@qer.com', false);
insert into member1(mid, memail, mreceive, mimg) values('한서희', 'han@qer.com', false, '증명사진.jpg');

/*
	mno int auto_increment ,							-- 회원번호[pk, 자동번호 부여]
    memail varchar(20) not null unique,					-- 회원이메일[공백x, 중복x]
    mid varchar(10) not null unique,					-- 회원아이디[공백x, 중복x]
    mpoint int not null default 1000,					-- 회원점수[공백x, 기본값 0]		--> 회원가입시 고객이 입력하는 사항x
    mdate datetime not null default now(),				-- 회원가입일[공백x, 기본값 현재날짜/시간]	--> 회원가입시 고객이 입력하는 사항x
    mreceive boolean not null default true,				-- 회원이메일수신여부[공백x, 기본값 true]	--> 이메일수신여부 동의가 기본값
    mimg varchar(1000) not null default '기본프로필.jpg',	-- 회원프로필사진[공백x, 기본값 '기본프로필']
    primary key(mno)									-- pk 설정
*/

drop database if exists sqldb3web2;
create database sqldb3web2;
use sqldb3web2;

drop table if exists product;
create table product(
	pno int auto_increment,								-- 제품번호 [ 정수타입, pk필드, 자동번호부여 ]
    pname varchar(100) not null unique,					-- 제품명 [ 문자열(100), 중복제고 ]
    pprice int not null default 0,						-- 제품가격 [ 정수타입, 기본값 0 ]
    pdate datetime not null default now(),				-- 제품등록일 [ 날짜/시간타입, 기본값 현재시간 ]
    cno int not null,									-- category 테이블의 cno 필드를 fk로 설정
    primary key(pno),									-- 제품번호 필드를 pk필드 설정
    foreign key(cno) references category(cno)			-- product 테이블이 category 테이블의 하위 테이블이기 때문에 fk는 product 테이블에서 설정한다
														-- category 테이블이 우선적으로 생성이 되어 있는 상태이여야만 참조가 가능하다
);

select*from product;

/*
	[조건]
		위에서 선언한 'product' 테이블과 관계가 있는 'category'테이블 생성
        [ 요구사항 ]
        1. 카테고리별 제품관리
			탄산류, 에이드류, 커피류 등등 문자열 형식으로 카테고리명 사용
        2. 필드
			카테고리번호 : 카테고리식별용으로 정수형태로 저장하고 자동번호 부여
            카테고리명 : 문자열 형태로 20글자 내외, 중복x
        3. 관계
			'product' 테이블과 'categrory' 테이블 관계 연결 해주세요
*/

drop table if exists category;
create table category(
	cno int auto_increment,
    cname varchar(20) not null unique,
    primary key(cno)
);

insert into category(cname) values('탄산');			# '탄산' 카테고리 등록 [자동번호 부여 = 1]
insert into category(cname) values('커피');			# '커피' 카테고리 등록 [자동번호 부여 = 2]
insert into category(cname) values('유제품');			# '유제품' 카테고리 등록 [자동번호 부여 = 3]

insert into product(pname, cno) values('콜라', 1);
insert into product(pname, pprice, pdate, cno) values('환타', 2000, '2023-08-03 17:55:46', 1);
insert into product(pname, cno) values('티오피', 2);
insert into product(pname, pprice, cno) values('서울우유', 2300, 3);

select*from category;
select*from product;

#--------------------------------------------------
# JDBC와 연결한 DB 선언
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

# 1. 회원가입[ 테이블에 레코드 삽입 ]
insert into member(mid,mpw,mname,mpnum) values('dkrtpsxm12', '1234', '최의선', '010-9159-7827');

# 2. 로그인 [ 테이블에 값 검색(select) ]

/*
	1. 테이블의 필드에 해당하는 레코드 검색
		select 필드명 from 테이블명;			-> 해당 필드의 레코드 검색
        select 필드명, 필드명 from 테이블명;		-> 여러개 필드들의 레코드 검색
		select*from 테이블명;					-> 모든 필드의 레코드 검색
*/

select*from member;
select mid from member;
select mid,mpw from member;
select mid,mpw,mname from member;

# 1. 로그인할때 필요한 필드 검색
select mid, mpw from member;

# 2. 필드에 조건 추가			[ where 조건절 ]
	# select 필드명 from 테이블명 where 조건
    # 아이디와 패스워드가 일치한 레코드 검색
select mid, mpw from member where mid = 'dkrtpsxm12' and mpw = '1234';     # mid필드가 'dkrtpsxm12'이고 mpw필드가 '1234'인 레코드 검색
select mid, mpw from member where mid = 'kkk' and mpw = '1234';

# 자바 문자열 변환
# select mid, mpw from member where mid = ? and mpw = ?;



#--------------------------------------------------------------------

drop database if exists sqldb5web;
create database sqldb5web;

use sqldb5web;
drop table if exists table1;
create table table1(
	데이터1 int,
    데이터2 varchar(100)
);

# 1. insert[ C : create] 	회원가입, 글쓰기, 제품등록, ...
	# insert into 테이블명(필드명, 필드명,...) values(값, 값,...);
insert into table1(데이터1, 데이터2) values(1, '유재석');
insert into table1(데이터1, 데이터2) values(2, '강호동');


# 2. select[ R : read]	로그인, 아이디찾기, 비밀번호찾기, 글목록, 글조회, 제품조회, 주문현황, 검색 등등
	# select 필드명 from 테이블명
    # select 필드명 from 테이블명 where 조건절
select*from table1;   # 모든 레코드 검색[모든 필드 표시]
select*from table1 where 데이터2 = '강호동';	# 데이터2의 값이 '강호동'인 레코드 검색 [모든 필드 표시]
select 데이터1 from table1 where 데이터2 = '강호동';		#데이터2의 값이 '강호동'인 레코드 검색 [데이터1 필드만 표시] 
 
# 3. update[ U : update]
	# update 테이블명 set 필드명 = 수정값, 필드명 = 수정값;
    # update 테이블명 set 필드명 = 수정값, 필드명 = 수정값 where 조건절;
update table1 set 데이터1 = 3;		# 모든 레코드의 데이터1의 값을 3으로 변경
	# 메뉴 -> edit -> preferences -> sql editor -> safe update 체크해제 [ update, delete 사용시 ]
update table1 set 데이터1 = 2 where 데이터2 = '유재석';	# 데이터2의 값이 '유재석'이면 데이터1 필드의 값을 2로 변경

# 4. delete[ D : delete]
	# delete from 테이블명
    # delete from 테이블명 where 조건절
delete from table1;		# 모든 레코드를 삭제
delete from table1 where 데이터1 = 2;		# 데이터1의 값이 2인 레코드를 삭제



















