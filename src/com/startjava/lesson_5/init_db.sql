TRUNCATE TABLE Jaegers;

--insert rows:
INSERT INTO Jaegers (modelName, mark, height, weight, status, origin, launch, kaijuKill)
VALUES ('Gipsy Danger',    'Mark-3', 79.25,  1980,  'Destroyed', 'America',   '2017-07-10', 9),
       ('Striker Eureka',  'Mark-5', 76.2,   1850,  'Destroyed', 'Australia', '2019-11-2',  11),
       ('Cherno Alpha', '   Mark-3', 85.34,  2412,  'Destroyed', 'Russia',    '2015-01-01', 6),
       ('Gipsy Avenger',   'Mark-6', 81.77,  2004,  'Destroyed', 'Unknown',   '2034-01-12', 1),
       ('Crimson Typhoon', 'Mark-4', 76.2,   1722,  'Destroyed', 'China',     '2018-08-22', 7),
       ('Unknown_2',       'Mark-1', 79.25,  1980,  'Launched',  'China',     '2050-05-01', 0),
       ('Unknown_3',       'Mark-2', 79.25,  1980,  'Launched',  'China',     '2050-05-02', 1),
       ('Unknown_4',       'Mark-3', 79.25,  1980,  'Launched',  'China',     '2050-05-03', 2),
       ('Unknown_5',       'Mark-4', 79.25,  1980,  'Launched',  'China',     '2050-05-04', 3),
       ('Unknown_6',       'Mark-5', 79.25,  1980,  'Launched',  'China',     '2050-05-05', 4);
