CREATE PROCEDURE solution()
BEGIN
	SELECT name, id FROM grades WHERE (final > (midterm1*0.25 + midterm2*0.25 + final*0.5)) AND (final > (midterm2*0.5 + midterm1*0.5)) ORDER BY SUBSTR(name, 1, 3), id;
END