CREATE SCHEMA denemedogan;
CREATE TABLE denemedogan.personel (
id int(11) NOT NULL AUTO_INCREMENT,
adi varchar(50) DEFAULT NULL,
soyadi varchar(60) DEFAULT NULL,
tecrube int(11) DEFAULT NULL,
primary key(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

SELECT * FROM denemedogan.personel;