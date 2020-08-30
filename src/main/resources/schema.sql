create table location(location_id int primary key, area varchar(20), city varchar(20));
create table PRICE_ADJUSTMENT(price_Id int primary key, start_time timestamp, end_time timestamp, price int);
create table food_details(food_Id int primary key, item_name varchar, price int, rating int, price_adjustment int);
create table order_food(food_Id int,order_id int);
create table restaurant_food(restaurant_Id int, food_Id int);
create table restaurant(restaurant_Id int primary key, name varchar, location_id int, contact number, rating int);
create table order_Details(order_ID int primary key, user_Id int, restaurant_Id int, status varchar, address varchar, order_Date timestamp);
create table user_Info(user_Id int primary key, name varchar, location_id int, contact number);