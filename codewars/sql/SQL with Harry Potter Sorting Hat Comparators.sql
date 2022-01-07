SELECT * FROM students 
WHERE ('evil' IN (quality1, quality2) AND 'cunning' IN (quality1, quality2))
OR ('brave' IN (quality1, quality2) AND 'evil' NOT IN (quality1, quality2))
OR ('studious'IN (quality1, quality2) OR 'intelligent' IN (quality1, quality2)) 
OR ('hufflepuff' IN (quality1, quality2))
ORDER BY id;