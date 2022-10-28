SELECT COUNT(id), industry
FROM jump2digital.company
GROUP BY industry
ORDER BY COUNT(id);