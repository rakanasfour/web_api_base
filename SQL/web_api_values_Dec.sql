INSERT INTO users (user_name, user_password, user_email, user_first_name, user_last_name, role, status, last_login, refresh_token, failed_login, account_locked_until)
VALUES
    ('jdoe', 'passwordHash1', 'jdoe@example.com', 'John', 'Doe', 'USER', 'active', '2024-10-15 14:22:01', NULL, 0, NULL),
    ('Rakan', 'passwordHash2', 'asmith@example.com', 'Alice', 'Smith', 'ADMIN', 'active', '2024-10-18 09:11:30', NULL, 0, NULL),
    ('Jeen', 'passwordHash3', 'bwayne@example.com', 'Bruce', 'Wayne', 'USER', 'banned', NULL, NULL, 3, '2024-11-07'),
    ('Shallin', 'passwordHash4', 'Shallin@example.com', 'Clark', 'Kent', 'USER', 'inactive', '2024-08-01 16:45:09', NULL, 1, NULL),
    ('Meron', 'passwordHash5', 'Meron@example.com', 'Diana', 'Meron', 'ADMIN', 'pending', NULL, NULL, 0, NULL),
    ('pparker', 'passwordHash6', 'pparker@example.com', 'Peter', 'Parker', 'USER', 'active', '2024-09-20 12:33:25', 'refreshToken1', 0, NULL),
    ('tstark', 'passwordHash7', 'tstark@example.com', 'Tony', 'Stark', 'ADMIN', 'active', '2024-11-01 08:10:12', 'refreshToken2', 2, NULL),
    ('banners', 'passwordHash8', 'banners@example.com', 'Bruce', 'Banner', 'USER', 'inactive', '2024-10-12 20:25:42', NULL, 1, NULL),
    ('nsummers', 'passwordHash9', 'nsummers@example.com', 'Nathan', 'Summers', 'USER', 'banned', NULL, NULL, 5, '2024-11-20'),
    ('rspector', 'passwordHash10', 'rspector@example.com', 'Marc', 'Spector', 'USER', 'pending', NULL, NULL, 0, NULL);
    
INSERT INTO distributors (distributor_name, distributor_address, distributor_country, distributor_status)
VALUES 
('Speedy Supplies', '123 Main St', 'USA', 'ACTIVE'),
('Global Logistics', '456 Market Ave', 'USA', 'INACTIVE'),
('Prime Distributors', '789 Elm Rd', 'USA', 'ACTIVE'),
('Metro Wholesale', '101 Pine Blvd', 'USA', 'ACTIVE'),
('Summit Trade Co.', '202 Oak Dr', 'USA', 'INACTIVE'),
('American Distributors', '305 Birch St', 'USA', 'ACTIVE'),
('Liberty Supply Chain', '420 Cedar Ave', 'USA', 'INACTIVE'),
('Pioneer Logistics', '612 Maple Rd', 'USA', 'ACTIVE'),
('National Wholesale', '800 Walnut Dr', 'USA', 'ACTIVE'),
('Evergreen Traders', '915 Spruce Ln', 'USA', 'INACTIVE'),
('NextGen Logistics', '1020 Redwood Blvd', 'USA', 'ACTIVE'),
('Starline Distributors', '1122 Ash Way', 'USA', 'ACTIVE'),
('Blue Ridge Supply', '1245 River St', 'USA', 'INACTIVE'),
('Golden State Wholesale', '1357 Valley Rd', 'USA', 'ACTIVE');


INSERT INTO packaging (packaging_type) VALUES
('BAG'),('BOTTLE'),('BOX'),('BUNNDLE'),('CAN'), ('HUMIBAG'), ('JAR'),('PACK'),('POUCH'),('SKID'),('STICK'),('TIN');


INSERT INTO channels (channel_description, channels_level, channel_default_uom) VALUES
('Retail Customer', 1, 'SINGLE'),
('Wholesaler', 2, 'CASE'),
('Dropshipper', 3, 'PALLET');

INSERT INTO attributes (attribute_name, attribute_type, attribute_assist_text) 
VALUES
('Sweet', 'TASTE', 'Indicates sweetness level'),
('Large', 'SIZE', 'Indicates size category'),
('Fruity', 'TASTE', 'Indicates fruity flavor'),
('Smooth', 'TASTE', 'Indicates smooth texture'),
('Tangy', 'TASTE', 'Indicates tangy flavor'),
('Salty', 'TASTE', 'Indicates saltiness level'),
('Small', 'SIZE', 'Indicates small size category'),
('Bold', 'TASTE', 'Indicates bold flavor profile'),
('Woody', 'SMELL', 'Indicates woody aroma'),
('Earthy', 'SMELL', 'Indicates earthy aroma'),
('Soft', 'TASTE', 'Indicates soft texture'),
('Light', 'SIZE', 'Indicates light weight'),
('Heavy', 'SIZE', 'Indicates heavy weight'),
('Bitter', 'TASTE', 'Indicates bitterness level');


INSERT INTO shipping_dimensions (height, width, length, weight) VALUES
(10.00, 5.00, 5.00, 2.00),
(15.00, 10.00, 10.00, 5.00),
(20.00, 15.00, 15.00, 10.00),
(15.00, 10.00, 10.00, 5.00),
(20.00, 15.00, 15.00, 10.00),
(15.00, 10.00, 10.00, 5.00),
(20.00, 15.00, 15.00, 10.00),
(21.00, 5.20, 15.30, 10.40);

INSERT INTO compliance_categories (compliance_category_name, compliance_categories_code, compliance_category_report_required, compliance_category_pct_item)
VALUES
('Category C', 103, 1, '15%'),
('Category D', 104, 0, '8%'),
('Category E', 105, 1, '20%'),
('Category F', 106, 0, '12%'),
('Category G', 107, 1, '25%'),
('Category H', 108, 0, '5%'),
('Category I', 109, 1, '30%'),
('Category J', 110, 0, '18%');


INSERT INTO manufacturer_pricing (m_pricing_list, m_pricing_msrp, m_pricing_rmap, m_pricing_wholesale_price, m_pricing_federal_excise_tax, m_pricing_cost) VALUES
(1, 1, 1, 31, 1, 1),
(2, 2, 2, 32, 2, 2),
(3, 3, 3, 33, 3, 3),
(4,4, 4, 34, 4,4),
(5, 5, 5, 35, 5, 5),
(6, 6, 6, 66, 6, 6),
(7,7, 7, 77, 7,7),
(8, 8, 8, 88, 8, 8);
INSERT INTO manufacturers (manufacturer_name, manufacturer_description, manufacturer_status) 
VALUES
('Global Tech Industries', 'Leading manufacturer of high-tech solutions', 'ACTIVE'),
('Evergreen Products', 'Specializes in eco-friendly goods', 'INACTIVE'),
('Summit Manufacturing', 'Produces high-quality industrial equipment', 'ACTIVE'),
('Blue Ridge Suppliers', 'Known for innovative packaging solutions', 'INACTIVE'),
('PrimeCraft', 'Expert in crafting premium furniture', 'ACTIVE'),
('EcoLine Industries', 'Dedicated to sustainable manufacturing', 'ACTIVE'),
('Sunrise Fabrics', 'High-quality fabric producer', 'INACTIVE'),
('Apex Electronics', 'Advanced electronic components manufacturer', 'ACTIVE'),
('Pioneer Foods', 'Manufacturer of organic food products', 'ACTIVE'),
('SteelWorks Inc.', 'Specializes in steel and metal products', 'ACTIVE'),
('Golden State Tools', 'Leading manufacturer of power tools', 'ACTIVE'),
('NextGen Innovations', 'Cutting-edge technology manufacturer', 'INACTIVE'),
('Heritage Crafts', 'Traditional handcrafted goods manufacturer', 'ACTIVE');






INSERT INTO manufacturer_facilities (m_facility_name, m_facility_country, status, m_f_manufacturer_id) 
VALUES
('Facility A', 'Country A', 'ACTIVE', 1),
('Facility B', 'Country B', 'INACTIVE', 2),
('Facility C', 'USA', 'ACTIVE', 1),
('Facility D', 'Germany', 'ACTIVE', 3),
('Facility E', 'Canada', 'INACTIVE', 4),
('Facility F', 'India', 'ACTIVE', 5),
('Facility G', 'Australia', 'INACTIVE', 6),
('Facility H', 'Brazil', 'ACTIVE', 3),
('Facility I', 'UK', 'ACTIVE', 2),
('Facility J', 'South Africa', 'INACTIVE', 7),
('Facility K', 'Japan', 'ACTIVE', 8),
('Facility L', 'France', 'ACTIVE', 9),
('Facility M', 'China', 'INACTIVE', 10),
('Facility N', 'Mexico', 'ACTIVE', 1),
('Facility O', 'Italy', 'ACTIVE', 3);


INSERT INTO brands (brand_name, brand_description, brand_status, brand_manufacturer_id, brand_distributor_id) 
VALUES
('Brand A', 'Description for Brand A', 'AVAILABLE', 1,1),
('Brand B', 'Description for Brand B', 'AVAILABLE', 1,3),
('Brand C', 'Description for Brand C', 'DISCONTINUED', 2,3),
('Brand D', 'Description for Brand D', 'AVAILABLE', 2,2),
('Brand E', 'Description for Brand E', 'DISCONTINUED', 3,3),
('Brand F', 'Description for Brand F', 'AVAILABLE', 3,2),
('Brand G', 'Description for Brand G', 'DISCONTINUED', 4,2),
('Brand H', 'Description for Brand H', 'AVAILABLE', 4,3),
('Brand I', 'Description for Brand I', 'DISCONTINUED', 5,3),
('Brand J', 'Description for Brand J', 'AVAILABLE', 5,3),
('Brand K', 'Description for Brand K', 'DISCONTINUED', 6,1),
('Brand L', 'Description for Brand L', 'AVAILABLE', 6,3),
('Brand M', 'Description for Brand M', 'DISCONTINUED', 7,2),
('Brand N', 'Description for Brand N', 'AVAILABLE', 7,2),
('Brand O', 'Description for Brand O', 'AVAILABLE', 8,2);


INSERT INTO models (model_name, model_description, model_brand_id, model_manufacturer_facility_id)
VALUES
('Model A', 'Description for Model A', 1, 1),
('Model B', 'Description for Model B', 2, 2),
('Model C', 'Description for Model C', 3, 3),
('Model D', 'Description for Model D', 4, 4),
('Model E', 'Description for Model E', 5, 5);


INSERT INTO model_pictures (m_picture_name, m_picture_link, m_picture_model_id) 
VALUES
('Model A Picture', 'https://www.ashtoncigar.com/sites/default/files/ashton-collection-hero-mobile.jpg', 1),
('Model B Picture', 'https://img.cigar.com/products/MTW-PM_art.jpg?v=515662', 2),
('Model B Alternate Picture', 'https://cdn.thebackyshop.co.uk/system/pictures/15991/large/Jose_Piedra_Cazadores_12_Box_1.jpg', 3),
('Model C Picture', 'https://torchcigarbar.com/wp-content/uploads/2016/07/Why-People-Prefer-Cuban-Cigars.jpg', 4);


INSERT INTO sales_categories (s_category_name, s_category_measurement_type, s_category_system_measurement) 
VALUES
('Cigar', 'count', 'METRIC'),
('Nicotine Pouch', 'WEIGHT', 'IMPERIAL'),
('Pipe Tobacco', 'WEIGHT', 'METRIC'),
('Chewing Tobacco', 'WEIGHT', 'IMPERIAL'),
('Cigarette', 'count', 'IMPERIAL'),
('Snuff', 'WEIGHT', 'METRIC'),
('Rolling Paper', 'count', 'IMPERIAL'),
('Vape Cartridge', 'VOLUME', 'METRIC'),
('Hookah Tobacco', 'WEIGHT', 'METRIC'),
('Heat Stick', 'count', 'IMPERIAL'),
('Cigarillo', 'count', 'METRIC'),
('Electronic Cigarette', 'count', 'IMPERIAL'),
('Moist Snuff', 'WEIGHT', 'METRIC'),
('Dry Snuff', 'WEIGHT', 'IMPERIAL'),
('Smoking Accessories', 'count', 'METRIC');




INSERT INTO classes (class_name) VALUES
('Full-Bodied'),
('Medium-Bodied'),
('Mild-Bodied'),
('Natural Wrapper'),
('Maduro Wrapper'),
('Habano Wrapper'),
('Dominican Origin'),
('Nicaraguan Origin'),
('Connecticut Wrapper');

INSERT INTO attribute_class (attribute_class_attribute_id, attribute_class_class_id) VALUES
(1, 1), 
(2, 2), 
(3, 3), 
(4, 4),
(5, 5), 
(6, 6), 
(7, 7), 
(8, 8), 
(9, 9);



INSERT INTO items (
    item_name, 
    item_sku, 
    item_description, 
    item_availability, 
    item_msa_promo_item,  
    item_model_id, 
    item_manufacturer_pricing_id, 
    item_compliance_category_id
) 
VALUES
('Captain black', 'SKU001', 'Description Captain black unit(1)', 'AVAILABLE', 'Promo3', 1, 1, 1),
('winston LIGHT', 'SKU002', 'Description for winston unit(20)', 'AVAILABLE', 'Promo4', 2, 2, 2),
('LM RED', 'SKU003', 'Description for LM unit(20)', 'AVAILABLE', 'Promo5', 3, 3, 3),
('Malboroe LIGTH', 'SKU004', 'Description for Malboroe single (20)', 'AVAILABLE', 'Promo6', 4, 4, 4),
('Malboroe RED', 'SKU007', 'Malboroe box box(45)', 'AVAILABLE', 'Promo7', 5, 5, 5);

select * from items;

INSERT INTO item_pictures (item_picture_main, item_p_item_id) 
VALUES
('https://as1.ftcdn.net/v2/jpg/00/44/83/14/1000_F_44831410_ZYORjO4MklXQaMnILgP1biJ0JyhwclS2.jpg', 1),
('https://images.squarespace-cdn.com/content/v1/6520484036855f7cec755951/95095c28-8379-4fdf-8b09-f0541dbf75d6/AdobeStock_570996384.jpeg', 2),
('https://www.goodcigar.co/cdn/shop/products/good-cigar-co-pre-paid-gift-subscription-3-months-15034104217648_1400x.jpg?v=1607366298', 3),
('https://torchcigarbar.com/wp-content/uploads/2016/07/Why-People-Prefer-Cuban-Cigars.jpg', 4),
('https://as1.ftcdn.net/v2/jpg/00/44/83/14/1000_F_44831410_ZYORjO4MklXQaMnILgP1biJ0JyhwclS2.jpg', 5);


INSERT INTO uoms (uom_type,uom_sub_type,uom_quantity,uom_level,uom_weight, uom_updated_at_by, uom_status, uom_shipping_dimension_id, uom_packaging_id,uom_item_id,uom_manufacturer_pricing_id) VALUES
('SINGLE','SINGLE',1, 1, 0.2,'Admin', 'AVAILABLE', 1, 1,1,1),
('UNIT','SINGLE',15, 5, 1.2,'Admin', 'AVAILABLE', 2, 2,1,2),
('CASE','UNIT',25, 6, 12,'Admin', 'AVAILABLE', 3, 3,1,3),
('PALLET','SINGLE',1, 10,33, 'Admin', 'AVAILABLE', 4, 1,1,4),
('SINGLE','SINGLE',1, 1, 0.4,'Admin', 'AVAILABLE', 5, 1,2,5),
('UNIT','SINGLE',15, 5, 1.4,'Admin', 'AVAILABLE', 6, 2,2,6),
('CASE','UNIT',25, 6, 7,'Admin', 'AVAILABLE', 7, 7,2,7),
('PALLET','SINGLE',1, 10, 12,'Admin', 'AVAILABLE', 8, 1,2,8)

;

INSERT INTO uom_pictures (uom_picture_name, uom_picture_link, uom_picture_uom_id) VALUES
('Single UOM Picture', 'http://example.com/uom_single.jpg', 1),
('Pack UOM Picture', 'http://example.com/uom_pack.jpg', 2);


INSERT INTO document_storage (document_storage_1, document_s_item_id) 
VALUES
('Cigar Aging and Storage Guide', 1),
('Long-Term Cigar Preservation Tips', 2),
('Proper Cigar Storage - Humidity and Temperature Guidelines', 3),
('Tips for Storing Cigars in a Humidor', 4),
('How to Maintain Ideal Conditions for Cigar Freshness', 5);





INSERT INTO uoms_channels (uom_ch_channel_id, uom_ch_uom_id)
VALUES
(1, 1),  -- Item 1 available to Retail Customer
(1, 2),  -- Item 1 available to Retail Customer
(1, 3),  -- Item 1 available to Retail Customer

(2, 1),  -- Item 2 available to Wholesaler
(2, 2),  -- Item 2 available to Wholesaler
(3, 3),  -- Item 3 available to Dropshipper
(3, 2); -- Item 3 available to Dropshipper

INSERT INTO items_attributes (item_a_item_id, item_a_attribute_id)
VALUES
(1, 1),  -- Item 1 associated with attribute 'Sweet'
(1, 2),  -- Item 1 associated with attribute 'Sweet'
(1, 3),  -- Item 1 associated with attribute 'Sweet'
(1, 4),  -- Item 1 associated with attribute 'Sweet'
(1, 5),  -- Item 1 associated with attribute 'Sweet'
(2, 4),  -- Item 2 associated with attribute 'Smooth'
(2, 5),  -- Item 2 associated with attribute 'Smooth'
(3, 5),  -- Item 3 associated with attribute 'Large'
(4, 8);  -- Item 4 associated with attribute 'Bold'

INSERT INTO item_sales_categories (item_s_c_item, item_s_c_category_id)
VALUES
(1, 1),  -- Item 1 categorized as Cigar
(1, 2),  -- Item 1 categorized as Cigar
(1, 3),  -- Item 1 categorized as Cigar
(1, 4),  -- Item 1 categorized as Cigar
(2, 1),  -- Item 2 categorized as Nicotine Pouch
(2, 4),  -- Item 2 categorized as Nicotine Pouch
(2, 2),  -- Item 2 categorized as Nicotine Pouch
(3, 3),  -- Item 3 categorized as Pipe Tobacco
(4, 4),  -- Item 4 categorized as Chewing Tobacco
(5, 5);  -- Item 5 categorized as Cigarette

SELECT uom_manufacturer_pricing_id, COUNT(*)
FROM uoms
GROUP BY uom_manufacturer_pricing_id
HAVING COUNT(*) > 1;

