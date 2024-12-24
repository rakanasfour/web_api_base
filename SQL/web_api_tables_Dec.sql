
Drop database web_api_base;
CREATE DATABASE web_api_base;
use web_api_base;

# this is just for the users who can access the system 
CREATE TABLE users (
    user_id INT UNSIGNED UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(99) NOT NULL UNIQUE,
     user_password VARCHAR(99) NOT NULL,
    user_email VARCHAR(99) NOT NULL UNIQUE,
    user_first_name VARCHAR(99) NOT NULL,
    user_last_name VARCHAR(99) NOT NULL,
    role ENUM('USER', 'ADMIN') NOT NULL DEFAULT 'USER',
    status ENUM('ACTIVE', 'INACTIVE', 'BANNED', 'PENDING') NOT NULL DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_login TIMESTAMP NULL,
    refresh_token VARCHAR(300),
    failed_login INT DEFAULT 0,
    account_locked_until DATE NULL,
    INDEX (user_email),
    INDEX (user_name)
);


#one edistributor will have many brands
create table distributors(
distributor_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
distributor_name varchar(99) NOT NULL UNIQUE,
distributor_address varchar(250),
distributor_country varchar(99),
distributor_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
distributor_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
#distributor_updated_at_by Varchar(99),
distributor_status ENUM('ACTIVE', 'INACTIVE') NOT NULL DEFAULT 'ACTIVE',
INDEX (distributor_name)
);

#one to many with u/m 
CREATE TABLE packaging (
    packaging_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    packaging_type ENUM('BAG','BOTTLE','BOX','BUNNDLE','CAN', 'HUMIBAG', 'JAR','PACK','POUCH','SKID','STICK','TIN') NOT NULL
);

create table channels (
channel_id int UNSIGNED primary key auto_increment,
channel_description varchar(250),
channels_level int, 
channel_default_uom ENUM('SINGLE','SUB_UNIT','UNIT', 'CASE', 'PALLET') NOT NULL
);
#many to many with item table(we will have junction table)
create table attributes(
attribute_id int UNSIGNED primary key auto_increment,
attribute_name varchar(25),
attribute_type ENUM('TASTE','SIZE', 'SMELL', 'LOCTION') NOT NULL,
attribute_assist_text varchar(250)
);
#one to one with u/m
CREATE TABLE shipping_dimensions(
shipping_dimension_id INT UNSIGNED primary key AUTO_INCREMENT,
height DECIMAL(10, 2),
width DECIMAL(10, 2),
length DECIMAL(10, 2),
weight DECIMAL(10, 2)
);
select * from shipping_dimensions;
#one to one with item (we will have junction table)
create table compliance_categories(
compliance_category_id int UNSIGNED primary key auto_increment,
compliance_category_name varchar(25),
compliance_categories_code int, 
compliance_category_report_required TINYINT,
compliance_category_pct_item varchar(25)
);

#one to one with u/m
create table manufacturer_pricing(
m_pricing_id int UNSIGNED primary key auto_increment, 
m_pricing_list DECIMAL(10, 2),
m_pricing_msrp DECIMAL(10, 2),
m_pricing_rmap DECIMAL(10, 2),
m_pricing_wholesale_price DECIMAL(10, 2),
m_pricing_federal_excise_tax DECIMAL(10, 4),
m_pricing_cost DECIMAL(10, 2)
);
#one to many with manufacturer_facilities
CREATE TABLE manufacturers (
    manufacturer_id INT UNSIGNED UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    manufacturer_name VARCHAR(99) NOT NULL UNIQUE,
    manufacturer_description VARCHAR(300) NOT NULL,
    manufacturer_status ENUM('ACTIVE', 'INACTIVE') NOT NULL DEFAULT 'ACTIVE',
    manufacturer_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    manufacturer_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX (manufacturer_name)
);
# many to one with manufacturers
CREATE TABLE manufacturer_facilities (
    m_facility_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    m_facility_name VARCHAR(250) NOT NULL UNIQUE,
    m_facility_country VARCHAR(250) NOT NULL,
	status ENUM('ACTIVE', 'INACTIVE') NOT NULL DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    m_f_manufacturer_id INT UNSIGNED NOT NULL,
    FOREIGN KEY (m_f_manufacturer_id) REFERENCES manufacturers(manufacturer_id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX (m_f_manufacturer_id)
);
#many to one with manufacturers
#one to many with brand_pictures
CREATE TABLE brands (
    brand_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    brand_name VARCHAR(99) NOT NULL UNIQUE,
    brand_description VARCHAR(300) NOT NULL,

    brand_status ENUM('AVAILABLE', 'DISCONTINUED') NOT NULL DEFAULT 'AVAILABLE',
    brand_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    brand_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    brand_manufacturer_id INT UNSIGNED NOT NULL,  -- Many-to-one relationship with manufacturers
    FOREIGN KEY (brand_manufacturer_id) REFERENCES manufacturers(manufacturer_id) ON DELETE CASCADE ON UPDATE CASCADE,
    brand_distributor_id int unsigned,
    FOREIGN KEY (brand_distributor_id) REFERENCES distributors(distributor_id),
    INDEX (brand_manufacturer_id),  
    INDEX (brand_name)  
);

# many to one brands
CREATE TABLE brand_pictures (
    brand_picture_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    brand_picture_name VARCHAR(300),
    brand_picture_link VARCHAR(300) NOT NULL UNIQUE,
    b_p_brand_id INT UNSIGNED NOT NULL,  -- Many-to-one relationship with manufacturers
    FOREIGN KEY (b_p_brand_id) REFERENCES brands(brand_id) ON DELETE CASCADE ON UPDATE CASCADE
);

# many to one with brand
#one to many with model_pictures
create table models (
model_id int UNSIGNED primary key auto_increment,
model_name varchar(99),
model_description varchar(4000),
model_brand_id int UNSIGNED NOT NULL, # -- Many-to-one relationship with brand
foreign key (model_brand_id) references brands(brand_id),
model_manufacturer_facility_id int UNSIGNED,
foreign key (model_manufacturer_facility_id) references manufacturer_facilities(m_facility_id),
INDEX (model_name) 
);


#many to one with models
CREATE TABLE model_pictures (
    m_picture_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    m_picture_name VARCHAR(300),
    m_picture_link VARCHAR(300) NOT NULL UNIQUE,
    m_picture_model_id INT UNSIGNED NOT NULL,  -- Many-to-one relationship with manufacturers
    FOREIGN KEY (m_picture_model_id) REFERENCES models(model_id) ON DELETE CASCADE ON UPDATE CASCADE
);

#this desifined the sales is it for cigar or nicotine pouches

CREATE TABLE sales_categories (
    s_category_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,  
    s_category_name VARCHAR(99) NOT NULL,          
     s_category_measurement_type ENUM('COUNT', 'WEIGHT', 'VOLUME') NOT NULL DEFAULT 'COUNT',  
     s_category_system_measurement ENUM('METRIC', 'IMPERIAL') NOT NULL DEFAULT 'IMPERIAL'

);

#one item will have differnt unit of measurement one box will have 1)box 2)single 3)case 4)pallet


CREATE TABLE classes (
    class_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,  
    class_name VARCHAR(99) NOT NULL
);


CREATE TABLE attribute_class (
    attribute_class_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    attribute_class_attribute_id INT UNSIGNED,
    FOREIGN KEY ( attribute_class_attribute_id) REFERENCES attributes(attribute_id),
   attribute_class_class_id INT UNSIGNED,
    FOREIGN KEY (attribute_class_class_id) REFERENCES classes(class_id)
);






CREATE TABLE items (
    item_id INT UNSIGNED  PRIMARY KEY AUTO_INCREMENT ,
    item_name VARCHAR(100) NOT NULL,
	item_sku varchar(99),
	item_description TEXT,
    item_availability varchar(55),
    item_msa_promo_item varchar(55),
    item_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	item_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	item_updated_at_by Varchar(99),
	item_status ENUM('AVAILABLE','NOTAVAILABLE', 'DISCONTINUED') NOT NULL DEFAULT 'AVAILABLE',
    
	#one to one 
	item_manufacturer_pricing_id int UNSIGNED unique,
     foreign key (item_manufacturer_pricing_id) references manufacturer_pricing(m_pricing_id),

    
	item_model_id int unsigned,
	foreign key (item_model_id) references models(model_id),
    
	item_compliance_category_id int UNSIGNED unique, 
	foreign key (item_compliance_category_id) references compliance_categories(compliance_category_id),
    INDEX (item_name) 
);



CREATE TABLE uoms (
    uom_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    uom_type ENUM('SINGLE','SUB_UNIT','UNIT', 'CASE', 'PALLET') NOT NULL,
	uom_sub_type ENUM('SINGLE','SUB_UNIT','UNIT', 'CASE', 'PALLET') NOT NULL,
    uom_quantity INT  NOT NULL,
    uom_level INT,
	uom_weight DECIMAL(10, 2) NOT NULL,
	uom_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	uom_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	uom_updated_at_by Varchar(99),
	uom_status ENUM('AVAILABLE','NOTAVAILABLE', 'DISCONTINUED') NOT NULL DEFAULT 'AVAILABLE',
 
    #I am not sure yet
	uom_manufacturer_barcode Varchar(55),
     #I am not sure yet
	uom_internal_barcode Varchar(55),
     #one to one 
	uom_shipping_dimension_id INT UNSIGNED UNIQUE,
	foreign key (uom_shipping_dimension_id) REFERENCES shipping_dimensions(shipping_dimension_id),
       #many to one 
	uom_packaging_id int UNSIGNED,
	foreign key (uom_packaging_id) references packaging(packaging_id),
    
     #many to one 
    uom_item_id int UNSIGNED,
	foreign key (uom_item_id) references items(item_id),
    
    uom_manufacturer_pricing_id INT UNSIGNED ,
	foreign key (uom_manufacturer_pricing_id) REFERENCES manufacturer_pricing(m_pricing_id)
);


create table uom_pictures(
 uom_picture_id int UNSIGNED primary key auto_increment,
 uom_picture_name varchar(99),
 uom_picture_link varchar(300),
# many to one
 uom_picture_uom_id int UNSIGNED,
foreign key (uom_picture_uom_id) references uoms(uom_id)
);


#one to one with items
create table item_pictures(
item_picture_id int UNSIGNED primary key auto_increment,
item_picture_main varchar(250),
# many to one
item_p_item_id int UNSIGNED,
foreign key (item_p_item_id) references items(item_id)
);

#oen to many with items table
create table document_Storage(
document_Storage_id int UNSIGNED primary key auto_increment,
document_storage_1 varchar(300), 
document_s_item_id int UNSIGNED,
foreign key (document_s_item_id) references items(item_id)

);




CREATE TABLE uoms_channels (
    uom_ch_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    uom_ch_channel_id INT UNSIGNED,
    FOREIGN KEY (uom_ch_channel_id) REFERENCES channels(Channel_id),
   uom_ch_uom_id INT UNSIGNED,
    FOREIGN KEY (uom_ch_uom_id) REFERENCES uoms(uom_id)
);


#junction table between item and sales categories
create table items_attributes(
item_attribute_id int UNSIGNED primary key auto_increment,

item_a_item_id int UNSIGNED , 
foreign key (item_a_item_id) references items(item_id),

item_a_attribute_id int UNSIGNED , 
foreign key (item_a_attribute_id) references attributes(attribute_id)

);


#junction table between item and sales categories
CREATE TABLE item_sales_categories (
    item_s_c_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    item_s_c_item INT UNSIGNED,
    FOREIGN KEY (item_s_c_item) REFERENCES items(item_id),
    
    item_s_c_category_id INT UNSIGNED,
    FOREIGN KEY (item_s_c_category_id) REFERENCES sales_categories(s_category_id)
);

#CREATE TABLE item_classes (
  #  item_class_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   # item_class_item_id INT UNSIGNED,
    #FOREIGN KEY (item_s_c_item) REFERENCES items(item_id),
    
   # item_class_class_id INT UNSIGNED,
   # FOREIGN KEY (item_s_c_category_id) REFERENCES classes(class_id)
#);
