SELECT Weather.id FROM Weather
JOIN Weather AS previousday
ON DATEDIFF(Weather.recordDate,previousday.recordDate) = 1
WHERE Weather.temperature>previousday.temperature;