create database jdbc_mhs;

use jdbc_mhs;

CREATE TABLE mahasiswa (
    id INT(11) NOT NULL AUTO_INCREMENT,
    nama VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

drop table mahasiswa;

CREATE TABLE mahasiswa (
    id INT NOT NULL AUTO_INCREMENT,
    nama VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

select * from mahasiswa;