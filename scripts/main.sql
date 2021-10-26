CREATE TABLE physical_activities
(
    id       NUMBER GENERATED BY DEFAULT AS IDENTITY not null,
    name     NVARCHAR2(60)                           not null,
    duration INT                                     not null,
    calories NUMBER                                  not null,
    PRIMARY KEY (id)
);

SELECT * FROM physical_activities ORDER BY id;

UPDATE physical_activities
SET name = '<NAME>',
    calories = '<CALORIES>',
    duration = '<DURATION>'
WHERE id = '<ID>';

DELETE FROM physical_activities WHERE id = '<ID>';
