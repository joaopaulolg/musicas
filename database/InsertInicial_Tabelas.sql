INSERT INTO ARTISTA
(NM_ARTISTA)
VALUES
('Led Zeppelin'),
('Deep Purple'),
('Black Sabbath'),
('Metallica'),
('Ozzy Osbourne'),
('Tony Iommi'),
('Geezer Butler'),
('Bill Ward'),
('Martin Birch');

INSERT INTO ESTILO
(NM_ESTILO)
VALUES
('Rock'),
('Heavy Metal'),
('Thrash Metal'),
('Hard Rock');

INSERT INTO GRAVADORA
(NM_GRAVADORA, ANO_FUNDACAO)
VALUES
('EMI', '1931'),
('Warner Music Group', '1958'),
('Decca Records', '1934'),
('Nuclear Blast', '1987');

INSERT INTO BANDA
(FK_ARTISTA, DT_CRIACAO)
VALUES
(3, '1968-06-01 00:00:00');

INSERT INTO ARTISTA_INDIVIDUAL
(FK_ARTISTA, NM_REAL, DT_NASCIMENTO)
VALUES
(5, 'John Michael Osbourne', '1948-12-03 00:00:00'),
(6, 'Anthony Frank Iommi', '1948-02-19 00:00:00'),
(7, 'Terence Michael Joseph Butler', '1949-07-17 00:00:00'),
(8, 'William Thomas Ward', '1948-05-05 00:00:00');

INSERT INTO MEMBROS_BANDA
(FK_BANDA, FK_ARTISTA_INDIVIDUAL, DT_INICIO)
VALUES
(1, 1, '1968-06-01 00:00:00'),
(1, 2, '1968-06-01 00:00:00'),
(1, 3, '1968-06-01 00:00:00'),
(1, 4, '1968-06-01 00:00:00');

INSERT INTO ALBUM
(NM_ALBUM, FK_ARTISTA, FK_ESTILO, FK_PRODUTOR, DT_LANCAMENTO, ST_COLETANEA)
VALUES
('Heaven And Hell', 3, 2, 9, '1980-04-25 00:00:00', 'N');

INSERT INTO MUSICA
(NM_MUSICA, FK_ARTISTA, FK_ALBUM, NR_ORDEM, NR_DISCO, NR_DURACAO)
VALUES
('Neon Knights', 3, 1, 1, 1, 233),
('Children Of The Sea', 3, 1, 1, 1, 334),
('Lady Evil', 3, 1, 1, 1, 266),
('Heaven And Hell', 3, 1, 1, 1, 419),
('Wishing Well', 3, 1, 1, 1, 247),
('Die Young', 3, 1, 1, 1, 285),
('Walk Away', 3, 1, 1, 1, 265),
('Lonely Is The Word', 3, 1, 1, 1, 351);
