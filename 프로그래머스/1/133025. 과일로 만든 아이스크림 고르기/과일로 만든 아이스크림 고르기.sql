-- 코드를 입력하세요
SELECT f.flavor
FROM first_half f, ICECREAM_INFO i
WHERE f.flavor = i.flavor and total_order > 3000 and ingredient_type = 'fruit_based';
