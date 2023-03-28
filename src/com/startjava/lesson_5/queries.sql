
--whole table:
SELECT * FROM Jaegers;

--not-destroyed robots
SELECT * FROM Jaegers WHERE NOT status = 'Destroyed';

--robots with mark: Mark-1 и Mark-4
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

--robots with marks not equal Mark-1 и Mark-4
SELECT * FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

--sorted table by field mark
SELECT * FROM Jaegers ORDER BY mark;

--the olest robot
SELECT * FROM Jaegers WHERE launch = (SELECT min(launch) FROM Jaegers);

--robots who killed most of all kaiju
SELECT * FROM Jaegers WHERE kaijukill = (SELECT max(kaijukill) FROM Jaegers);

--average weight
SELECT avg(weight) FROM Jaegers;

--increase by one quqntity of killed kaiju by not destroyed robots
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE NOT status = 'Destroyed';

--delete destroyed robots
DELETE FROM Jaegers WHERE status = 'Destroyed';


