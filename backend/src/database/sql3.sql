drop database if exists sqldb6web;
create database sqldb6web;
use sqldb6web;
# 1. 회원테이블
drop table if exists member;
create table member(            # 아이돌 그룹
	mid char(8) not null ,         # 식별키       최대 8자리
    mname varchar(10) not null ,   # 그룹명      최대 10자리
    mnumber int not null ,         # 인원수      정수 +-21억정도
    maddr char(2) not null ,       # 지역      최대 2자리
    mphone1 char(3) ,            # 지역번호   최대 2자리 
    mphone2 char(8) ,            # 전화번호    최대 8자리
    mheight smallint ,            # 평균키       정수 +-3만정도
   mdebut date ,               # 데뷔일       yyyy-mm-dd 
    primary key ( mid )            # 제약조건 
);
# 2. 구매테이블
drop table if exists buy;
create table buy(
	bnum int auto_increment , 
    mid char(8),
    bpname char(6) not null ,
    bgname char(4) , 
    bprice int,
    bamout smallint not null ,
    primary key(bnum) ,
    foreign key ( mid ) references member(mid)
);


INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);

select*from member;
select*from buy;

# 테이블 전체 레코드 검색 [ 특정 필드 표시 ]
select mid from member;
select mid, mname from member;

# 필드 별칭[ as 별칭 ] -- 별칭은 검색에 표시할 필드명의 별명 ( 필드명 as 별칭 vs 필드명 별칭)
select mid as 그룹식별명 from member as m;
select mid 그룹식별명 from member m;
# -------> 위의 두 줄은 똑같은 결과

# 조건절 [ where ]
select*from member where mname = '블랙핑크';		# 필드의 값[문자이면 ' ']이 일치한 레코드 검색
select*from member where mnumber = 4;			# 필드의 값[숫자이면 ]이 일치한 레코드 검색

select*from member where mheight <= 162;		# 필드의 값이 이하이면 레코드 검색
select*from member where mheight >= 165 and mheight <= 170;		# 필드의 값이 이상이면서 이하이면 레코드 검색
select*from member where mheight between 165 and 170;			# 위의 코드와 동일한 값 출력
select*from member where mheight >= 165 or mnumber > 6;			# 필드의 값이 이상 이거나 초과 이면 레코드 검색
select*from member where maddr in('경기', '전남', '경남');
select*from member where mname = '에이핑크';
select*from member where not mname = '에이핑크';					# '에이핑크'가 아닌 레코드 검색
select*from member where mname != '에이핑크';						# '에이핑크'가 아닌 레코드 검색

select*from member where mname like '에이%';						# '에이'로 시작하는 문자
select*from member where mname like '%핑크';						# '핑크'로 끝나는 문자
select*from member where mname like '에이_';						# '에이'로 시작하는 세글자 문자
select*from member where mname like '에이__';					# '에이'로 시작하는 네글자 문자
select*from member where mname like '__핑크';					# '핑크'로 끝나는 네글자 문자
select*from member where mname like '%우%';						# '우'가 포함된 문자
select*from member where mname like '_우_';						# '우'가 두번째에 위차한 세글자 문자

select 
	mname 그룹명, mnumber 멤버수, mnumber+10, mnumber-10, mnumber*10, mnumber div 3, mnumber mod 3,
	mnumber * mheight
from member;													# 산술연산자
select*from member where mphone1 = '';							# 공백 검색
select*from member where mphone1 = ' ';							# 띄어쓰기문자 검색
select*from member where mphone1 is null;						# null 검색
select*from member where mphone1 is not null;					# null 아닌 값 검색


/* 
	null vs 공백 vs 띄어쓰기
		null : 참조값 없음
        공백 : 임의의공간을 확보하기 위한 임의값[쓰레기값]
        띄어쓰기 : 문자
    
	연산자
		1. 산술연산자	: + 더하기		- 빼기		* 곱하기		/ 나누기		div 몫		mod 나머지
        2. 비교연산자	: > 초과			< 미만		>= 이상		<= 이하		= 같다		!= 같지않다
        3. 논리연산자 	: and 이면서		or 이거나		not 부정
        4. 기타연산자	: 
			동일한 필드명의 여러개 연산을 나열할때 사용
				- between 시작값 and 끝값 	: 시작값 부터 끝값 사이 이면 = and 유사
				- in(값, 값, 값)			: 여7러 값 중 하나라도 포함하면 = or 유사
            패턴 비교 검색
				- like
					% : 모든 문자수 대응
					_ : _개수만큼 문자수 대응
            null 연산
				is null
				is not null
*/

# 검색 결과의 레코드 정렬하기[ order by 필드명 asc/desc ]
	# asc : 오름차순, 작은수 -> 큰수, 과거날짜 -> 최근날짜
    # desc : 내림차순, 큰수 -> 작은수, 최근날짜 -> 과거날짜
select*from member order by mdebut asc;				# 데뷔일 필드 기준으로 오름차순
select*from member order by mdebut desc;			# 데뷔일 필드 기준으로 내림차순
	# 정렬 기준 2개 이상 [ order by 필드명 정렬기준, 필드명 정렬기준 ]
    # 첫번째 정렬후 동일한 키가 있을경우 동일한 키 중에서 데뷔날짜 오름차순
select*from member order by mheight desc, mdebut asc;

/*											***상위정렬의 동일데이터 기준[ 동일한 학년끼리의 점수 정렬 ] 
	학년 점수			---> 학년 오름차순			학년 점수			--->	점수 오름차순			학년 점수
    1	90									1	90										1	90
    3	80									1	100										1	100
    2	95									2	95										2	95
    1	100									3	80										3	75
    3	75									3	75										3	80
*/

# 검색된 레코드 수 제한[ limit 레코드수, limit 시작레코드번호, 개수 ]
select*from member limit 2;							# 검색 결과의 레코드를 2개만 출력
select*from member limit 0, 3;						# 0(첫번째)레코드 부터 3개만 표시
select*from member order by mheight desc limit 3;	# 평균키 상위 3명

# 검색된 필드의 레코드 중복 제거[ distinct ]
select maddr from member;							# 모든 주소 검색
select distinct maddr from member;					# 모든 주소에서 중복 제거

/*
	***정리
		select : 검색
			select 필드명 from 테이블명
            select*from 테이블명
        1. where 조건절
			select*from 테이블명 where 조건절
		2. order by 필드명 정렬기준
			select*from 테이블명 order by 필드명 정렬기준
		3. limit 레코드수
			select*from 테이블명 limit 레코드수
            select*from 테이블명 limit 시작레코드번호[0], 레코드수
        4. distinct : 필드 중복제거
			select distinct 필드명 from 테이블명
        5. 연산자
			1. as : 별칭
				select 필드명 as 별칭 from 테이블명
                select 필드명 별칭 from 테이블명 별칭
			2. 산술
            3. 비교
            4. 논리
            5. 기타
				between : 필드명 between 시작값 and 끝값
                in : 필드명 in(값, 값, 값)
                like : '%값%'(모든 문자 수 대응), '_값_'(언더바 개수만큼 대응)
                null : is null, is not null
        -키워드 우선순위
			select*from 테이블명 where 조건절 order by 필드명 정렬기준 limit 레코드 수
                
*/

# 1. 날짜/함수
	# 1. now() : 현재 시스템[DB서버의 PC]의 날짜/시간 반환
select now();
	# 2. curdate() : 현재 시스템[DB서버의 PC]의 날짜 반환
select curdate();
	# 3. curtime() : 현재 시스템[DB서버의 PC]의 시간 반환
select curtime();
	# 4. year(날짜) : 해당 날짜의 연도 반환
	   # month(날짜) : 해당 날짜의 월 반환
	   # day(날짜) : 해당 날짜의 일 반환
	   # weekday(날짜) : 해당 날짜의 요일반환(월요일 = 0, 일요일 = 6) 
       # lsat_day(날짜) : 해당 날짜 월의 마지막 날짜 반환
       # date('연도-월-일') : 해당 날짜 반환
select year(now()), month(now()), day(now()), weekday(now()), last_day(now()), date('2023-08-14');
	   # hour(시간) : 시간 반환
       # minute(시간) : 분 반환
       # second(시간) : 초 반환
select hour(now()), minute(now()), second(now());
	# 5. date_format(필드명, '형식') :  날짜 형식 형식 기준으로 변환
select date_format(now(), '%Y년 %m월 %c월 %d일 %W');		-- 년(네자리) 월(두자리) 월(한자리) 일(두자리) 요일(영문)
select date_format(now(), '%y년 %M %D %e일 %a');		-- 년(두자리) 월(영문) 일서수(th) 일(한자리) 요일(약자)
select date_format(now(), '%H %i %S');		-- 시(두자리) 분(두자리) 초(두자리)

# 예)
select mname as 그룹명, date_format(mdebut, '%Y %m월 %d일') as 데뷔일 from member order by 데뷔일 asc;
select date_format(time('11:10:30'), '%H시 %i분 %S초');



# 2. 집계함수
	# 1. sum(필드명) : 해당 필드의 값 총 합계
select sum(bamout) as 총구매수량 from buy;
	# 2. avg(필드명) : 해당 필드의 값 평균
select avg(bamout) as 평균구매수량 from buy;
	# 3. max(필드명) : 해당 필드의 최댓값
select max(mheight) as 가장큰키 from member;
	# 4. min(필드명) : 해당 필드의 최솟값
select min(mheight) as 가장작은키 from member;
	# 5. count(필드명) : 해당 필드의 레코드 수
		-- count(*)
select count(bgname) as 구매횟수 from buy;	# [상품 그룹의 개수] -> null 포함하지 않음
select count(*) as 구매횟수 from buy;			# null을 포함함
select*from buy;

# 수학함수
select abs(100), abs(-100);										-- abs(필드/값) : 절대값
select ceil(10.1), ceil(10.4), ceil(10.5), ceil(10.0);			-- ceil(필드/값) : 무조건 올림
select floor(10.1), floor(10.4), floor(10.5), floor(10.0);		-- floor(필드/값) : 무조건 내림
select round(10.12), round(10.4), round(10.5), round(10.0);		-- round(필드/값) : 반올림[ 5이상 ]
select round(1.23456789, 1), round(1.23456789, 4), round(1.23456789, 7);		-- round(필드/값, 자리수) : 자리수에서 반올림[ 5이상 ]
select truncate(1.23456789, 1), truncate(1.23456789, 4), truncate(1.23456789, 7);		-- truncate(필드/값, 자리수) : 자리수에서 자르기
select pow(10, 2);												-- pow(필드/값, 제곱수) : 필드/값의 제곱수만큼의 제곱값




























