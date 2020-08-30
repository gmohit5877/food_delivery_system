insert into location values(100,'pimple saudagar', 'pune');
insert into location values(101,'hinjewadi phase 1', 'pune');
insert into location values(102,'hinjewadi phase 2', 'pune');
insert into location values(103,'hinjewadi phase 3', 'pune');
insert into location values(104,'vishal nagar', 'pune');
insert into location values(105,'wakad', 'pune');
insert into location values(106,'shivaji nagar', 'pune');

insert into PRICE_ADJUSTMENT values(201,TO_TIMESTAMP('30-01-2020', 'DD-MM-YYYY'),TO_TIMESTAMP('31-01-2020', 'DD-MM-YYYY'), 200);
insert into PRICE_ADJUSTMENT values(202,TO_TIMESTAMP('3-02-2020', 'DD-MM-YYYY'),TO_TIMESTAMP('4-02-2020', 'DD-MM-YYYY'), 300);
insert into PRICE_ADJUSTMENT values(203,TO_TIMESTAMP('4-04-2020', 'DD-MM-YYYY'),TO_TIMESTAMP('5-02-2020', 'DD-MM-YYYY'), 400);
insert into PRICE_ADJUSTMENT values(204,TO_TIMESTAMP('5-03-2020', 'DD-MM-YYYY'),TO_TIMESTAMP('6-02-2020', 'DD-MM-YYYY'), 500);
insert into PRICE_ADJUSTMENT values(205,TO_TIMESTAMP('6-02-2020', 'DD-MM-YYYY'),TO_TIMESTAMP('7-02-2020', 'DD-MM-YYYY'), 600);

insert into user_Info values(301,'Mohit',100, 9982455785);
insert into user_Info values(302,'Aditya',101, 9982455785);
insert into user_Info values(303,'Mahima',102, 9982455785);
insert into user_Info values(304,'Himani',103, 9982455785);
insert into user_Info values(305,'Abhijit',104, 9982455785);

insert into restaurant values(401, 'abc hotel', 100, 9982455786, 5 );
insert into restaurant values(402, 'punjabi dhaba', 101, 9982455786, 4 );
insert into restaurant values(403, 'xyz motel', 102, 9982455786, 3 );
insert into restaurant values(404, 'icecream parlour', 103, 9982455786, 5 );
insert into restaurant values(405, 'indori poha', 104, 9982455786, 4 );
insert into restaurant values(406, 'shivar hotel', 105, 9982455786, 3 );

insert into food_details values(501,'Paneer lababadar', 230, 4, 201);
insert into food_details values(502,'Paneer bhurji', 330, 3, 201);
insert into food_details values(503,'Paneer kadai', 430, 5, 205);
insert into food_details values(504,'Paneer matar', 530, 2, 204);
insert into food_details values(505,'Mix Veg', 130, 3, 203);
insert into food_details values(506,'Kadai Veg', 240, 4, 202);

insert into restaurant_food values (401,501);
insert into restaurant_food values (401,502);
insert into restaurant_food values (401,503);
insert into restaurant_food values (401,504);
insert into restaurant_food values (401,505);
insert into restaurant_food values (402,506);
insert into restaurant_food values (402,505);
insert into restaurant_food values (402,504);
insert into restaurant_food values (402,503);
insert into restaurant_food values (402,502);
insert into restaurant_food values (402,501);
insert into restaurant_food values (403,506);
insert into restaurant_food values (403,505);
insert into restaurant_food values (403,504);
