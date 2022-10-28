SELECT COUNT(id), industry
FROM jump2digital.company
GROUP BY industry
ORDER BY COUNT(id);

SELECT size, COUNT(id)
FROM jump2digital.company
GROUP BY size
ORDER BY COUNT(id);