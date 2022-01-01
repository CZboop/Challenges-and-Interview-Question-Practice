CREATE PROCEDURE solution()
BEGIN
	SELECT project_name, team_lead, income FROM projects ORDER BY internal_id;
END