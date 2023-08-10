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



drop table if exists board;
create table board(
	bno int auto_increment,									# 정수, 자동번호 부여
    btitle varchar(50) not null,							# 문자50, 공백불가
    bcontent longtext,										# 긴글[4G]
    bwriteDate datetime default now(),						# 날짜/시간, 기본값은 레코드삽입기준 자동
    bview int default 0,									# 정수, 기본값은 0
    mno int,												# 작성자의 회원번호 [ 작성자의 식별번호 ]
    primary key(bno),										# 제약조건 [ PK ]
    foreign key(mno) references member(mno) on delete cascade		# 회원탈퇴[PK레코드삭제] 되면 FK의 레코드 같이 삭제
    #foreign key(mno) references member(mno) on delete restrict,		# 회원탈퇴[PK레코드삭제] 할때 FK의 레코드가 존재하면 탈퇴 불가능
    #foreign key(mno) references member(mno) on delete set null,		# 회원탈퇴[PK레코드삭제] 되면 FK의 값을 NULL로 수장
    #foreign key(mno) references member(mno) on delete no action		# 아무런 변화가 없음
);