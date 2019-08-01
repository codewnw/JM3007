CREATE TABLE JM3007_ONETOONE_BI_STUDENT_DETAIL(
ID BIGINT AUTO_INCREMENT PRIMARY KEY,
COLLEGE_NAME VARCHAR(50),
ROLL_NO NUMBER,
);

CREATE TABLE JM3007_ONETOONE_BI_STUDENT(
ID BIGINT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(50),
AGE NUMBER,
NATIONALITY VARCHAR(50),
STUDENT_DETAIL_ID BIGINT,
FOREIGN KEY (STUDENT_DETAIL_ID) REFERENCES JM3007_ONETOONE_BI_STUDENT_DETAIL(ID)
);