# Write your MySQL query statement below
SELECT name from SalesPerson WHERE sales_id NOT IN (
    SELECT Orders.sales_id
    from Orders
    JOIN Company on Orders.com_id=Company.com_id
    WHERE Company.name="RED"
);