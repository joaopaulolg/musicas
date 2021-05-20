/* CREATE DATABASE MUSICAS; */

CREATE TABLE ARTISTA (
PK_ARTISTA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NM_ARTISTA VARCHAR(100) NOT NULL
) ENGINE = INNODB;

CREATE TABLE ESTILO (
PK_ESTILO INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NM_ESTILO VARCHAR(100) NOT NULL
) ENGINE = INNODB;

CREATE TABLE GRAVADORA (
PK_GRAVADORA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NM_GRAVADORA VARCHAR(100) NOT NULL,
ANO_FUNDACAO INT NOT NULL
) ENGINE = INNODB;

CREATE TABLE ARTISTA_INDIVIDUAL (
PK_ARTISTA_INDIVIDUAL INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
FK_ARTISTA INT NOT NULL,
NM_REAL VARCHAR(100) NOT NULL,
DT_NASCIMENTO DATETIME NOT NULL,
CONSTRAINT FK_ARTISTA_INDIVIDUAL_01 FOREIGN KEY(FK_ARTISTA) REFERENCES ARTISTA(PK_ARTISTA)
) ENGINE = INNODB;

CREATE TABLE BANDA (
PK_BANDA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
FK_ARTISTA INT NOT NULL,
DT_CRIACAO DATETIME NOT NULL,
CONSTRAINT FK_BANDA_01 FOREIGN KEY(FK_ARTISTA) REFERENCES ARTISTA(PK_ARTISTA)
) ENGINE = INNODB;

CREATE TABLE MEMBROS_BANDA (
PK_MEMBROS_BANDA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
FK_BANDA INT NOT NULL,
FK_ARTISTA_INDIVIDUAL INT NOT NULL,
DT_INICIO DATETIME NOT NULL,
DT_FIM DATETIME,
CONSTRAINT FK_MEMBROS_BANDA_01 FOREIGN KEY(FK_BANDA) REFERENCES BANDA(PK_BANDA),
CONSTRAINT FK_MEMBROS_BANDA_02 FOREIGN KEY(FK_ARTISTA_INDIVIDUAL) REFERENCES ARTISTA_INDIVIDUAL(PK_ARTISTA_INDIVIDUAL)
) ENGINE = INNODB;

CREATE TABLE ALBUM (
PK_ALBUM INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NM_ALBUM VARCHAR(200) NOT NULL,
FK_ARTISTA INT NULL,
FK_ESTILO INT NOT NULL,
FK_PRODUTOR INT NOT NULL,
DT_LANCAMENTO DATETIME NOT NULL,
ST_COLETANEA CHAR(1) NOT NULL,
CONSTRAINT FK_ALBUM_01 FOREIGN KEY(FK_ARTISTA) REFERENCES ARTISTA(PK_ARTISTA),
CONSTRAINT FK_ALBUM_02 FOREIGN KEY(FK_ESTILO) REFERENCES ESTILO(PK_ESTILO),
CONSTRAINT FK_ALBUM_03 FOREIGN KEY(FK_PRODUTOR) REFERENCES ARTISTA(PK_ARTISTA)
) ENGINE = INNODB;

CREATE TABLE MUSICA (
PK_MUSICA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NM_MUSICA VARCHAR(200) NOT NULL,
FK_ARTISTA INT NOT NULL,
FK_ALBUM INT NULL,
NR_ORDEM INT NOT NULL,
NR_DISCO INT NOT NULL,
NR_DURACAO INT NOT NULL,
CONSTRAINT FK_MUSICA_01 FOREIGN KEY(FK_ARTISTA) REFERENCES ARTISTA(PK_ARTISTA),
CONSTRAINT FK_MUSICA_02 FOREIGN KEY(FK_ALBUM) REFERENCES ALBUM(PK_ALBUM)
) ENGINE = INNODB;