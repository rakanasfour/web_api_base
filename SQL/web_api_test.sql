use web_api_test;

create table manufacturer_pricing(
m_pricing_id int primary key auto_increment, 
m_pricing_base int
);

create table uom (
uom_id int primary key auto_increment, 
uom_type varchar(25), 
uom_m_p_id int NOT NULL, 
foreign key (uom_m_p_id) references manufacturer_pricing(m_pricing_id)
)

drop table manufacturer_pricing;

INSERT INTO manufacturer_pricing (m_pricing_base) VALUES (100);
INSERT INTO manufacturer_pricing (m_pricing_base) VALUES (200);
INSERT INTO manufacturer_pricing (m_pricing_base) VALUES (300);


INSERT INTO uom (uom_type, uom_m_p_id) VALUES ('Kilogram', 1);
INSERT INTO uom (uom_type, uom_m_p_id) VALUES ('Gram', 2);
INSERT INTO uom (uom_type, uom_m_p_id) VALUES ('Pound', 3);



create table sales_categories (
sales_category_id int primary key auto_increment, 
sales_category_name varchar(25)
);

create table attributes (
attribute_id int primary key auto_increment, 
attribute_type varchar(25)

);
create table sales_attributes (
sales_attribute_id int primary key auto_increment, 
s_a_quantity int, 
s_a_sales_id int NOT NULL, 
foreign key (s_a_sales_id) references sales_categories(sales_category_id),
s_a_attribute_id int NOT NULL, 
foreign key (s_a_attribute_id) references attributes(attribute_id)
)


-- Populate sales_categories table
INSERT INTO sales_categories (sales_category_name) VALUES ('Electronics');
INSERT INTO sales_categories (sales_category_name) VALUES ('Furniture');
INSERT INTO sales_categories (sales_category_name) VALUES ('Clothing');

-- Populate attributes table
INSERT INTO attributes (attribute_type) VALUES ('Size');
INSERT INTO attributes (attribute_type) VALUES ('Color');
INSERT INTO attributes (attribute_type) VALUES ('Material');

-- Populate sales_attributes table with relationships
-- Example entries for Electronics category
INSERT INTO sales_attributes (s_a_quantity, s_a_sales_id, s_a_attribute_id) VALUES (100, 1, 1); -- Electronics, Size
INSERT INTO sales_attributes (s_a_quantity, s_a_sales_id, s_a_attribute_id) VALUES (50, 1, 2);  -- Electronics, Color

-- Example entries for Furniture category
INSERT INTO sales_attributes (s_a_quantity, s_a_sales_id, s_a_attribute_id) VALUES (200, 2, 3); -- Furniture, Material
INSERT INTO sales_attributes (s_a_quantity, s_a_sales_id, s_a_attribute_id) VALUES (150, 2, 1); -- Furniture, Size

-- Example entries for Clothing category
INSERT INTO sales_attributes (s_a_quantity, s_a_sales_id, s_a_attribute_id) VALUES (300, 3, 2); -- Clothing, Color
INSERT INTO sales_attributes (s_a_quantity, s_a_sales_id, s_a_attribute_id) VALUES (100, 3, 1); -- Clothing, Size
