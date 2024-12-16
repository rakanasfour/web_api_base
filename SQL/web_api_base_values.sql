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
('SINGLE'),
('TIN'),
('BUNDLE'),
('PACK'),
('BOX'),
('CASE'),
('PALLET');


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
(20.00, 15.00, 15.00, 10.00);

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
(25.00, 30.00, 27.50, 22.50, 0.50, 20.00),
(15.00, 20.00, 18.00, 13.50, 0.25, 10.00),
(35.00, 26.00, 56.00, 13.50, 1.25, 14.00),
(50.00, 60.00, 55.00, 45.00, 2.00, 40.00),
(10.00, 12.00, 11.00, 9.50, 0.10, 8.00),
(45.00, 50.00, 48.00, 40.00, 1.75, 35.00),
(30.00, 35.00, 32.50, 28.00, 0.75, 25.00),
(20.00, 25.00, 23.00, 18.00, 0.50, 15.00),
(55.00, 65.00, 60.00, 50.00, 2.50, 45.00),
(40.00, 45.00, 42.00, 36.00, 1.25, 30.00),
(18.00, 22.00, 20.00, 16.50, 0.35, 14.00);

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


INSERT INTO brands (brand_name, brand_description, brand_status, brand_manufacturer_id) 
VALUES
('Brand A', 'Description for Brand A', 'AVAILABLE', 1),
('Brand B', 'Description for Brand B', 'AVAILABLE', 1),
('Brand C', 'Description for Brand C', 'DISCONTINUED', 2),
('Brand D', 'Description for Brand D', 'AVAILABLE', 2),
('Brand E', 'Description for Brand E', 'DISCONTINUED', 3),
('Brand F', 'Description for Brand F', 'AVAILABLE', 3),
('Brand G', 'Description for Brand G', 'DISCONTINUED', 4),
('Brand H', 'Description for Brand H', 'AVAILABLE', 4),
('Brand I', 'Description for Brand I', 'DISCONTINUED', 5),
('Brand J', 'Description for Brand J', 'AVAILABLE', 5),
('Brand K', 'Description for Brand K', 'DISCONTINUED', 6),
('Brand L', 'Description for Brand L', 'AVAILABLE', 6),
('Brand M', 'Description for Brand M', 'DISCONTINUED', 7),
('Brand N', 'Description for Brand N', 'AVAILABLE', 7),
('Brand O', 'Description for Brand O', 'AVAILABLE', 8);


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


INSERT INTO uoms (uom_type, uom_level, uom_updated_at_by, uom_status, uom_shipping_dimension_id, uom_packaging_id) VALUES
('Single', 1, 'Admin', 'AVAILABLE', 1, 1),
('Pack', 2, 'Admin', 'AVAILABLE', 2, 2),
('Box', 3, 'Admin', 'DISCONTINUED', 3, 3);

INSERT INTO uom_pictures (uom_picture_name, uom_picture_link, uom_picture_uom_id) VALUES
('Single UOM Picture', 'http://example.com/uom_single.jpg', 1),
('Pack UOM Picture', 'http://example.com/uom_pack.jpg', 2);

INSERT INTO items (
    item_name, 
    item_sku, 
    item_description, 
    item_type, 
    item_quantity, 
    item_availability, 
    item_msa_promo_item, 
    item_base_price, 
    item_weight, 
    item_distributor_id, 
    item_model_id, 
    item_manufacturer_pricing_id, 
    item_compliance_category_id
) 
VALUES
('Acid Blue 1400cc Unit (18)', 'SKU003', 'Description for Acid Blue 1400cc Unit (18)', 'UNIT', 18, 'AVAILABLE', 'Promo3', 45.99, 1.8, 3, 3, 1, 1),
('Acid Gold Atom Maduro Unit (24)', 'SKU004', 'Description for Acid Gold Atom Maduro Unit (24)', 'UNIT', 24, 'AVAILABLE', 'Promo4', 55.99, 2.4, 3, 3, 2, 2),
('Acid Blue Blondie Unit (40)', 'SKU005', 'Description for Acid Blue Blondie Unit (40)', 'UNIT', 40, 'AVAILABLE', 'Promo5', 35.99, 4.0, 4, 4, 3, 3),
('Acid Blue Blondie Belicoso Unit (24)', 'SKU006', 'Description for Acid Blue Blondie Belicoso Unit (24)', 'UNIT', 24, 'AVAILABLE', 'Promo6', 29.99, 2.4, 4, 4, 4, 4),
('Acid Blue Blondie Maduro Unit (40)', 'SKU007', 'Description for Acid Blue Blondie Maduro Unit (40)', 'UNIT', 40, 'AVAILABLE', 'Promo7', 39.99, 4.0, 5, 5, 5, 5);

INSERT INTO item_pictures (item_picture_main, item_p_item_id) 
VALUES
('https://as1.ftcdn.net/v2/jpg/00/44/83/14/1000_F_44831410_ZYORjO4MklXQaMnILgP1biJ0JyhwclS2.jpg', 1),
('https://images.squarespace-cdn.com/content/v1/6520484036855f7cec755951/95095c28-8379-4fdf-8b09-f0541dbf75d6/AdobeStock_570996384.jpeg', 2),
('https://www.goodcigar.co/cdn/shop/products/good-cigar-co-pre-paid-gift-subscription-3-months-15034104217648_1400x.jpg?v=1607366298', 3),
('https://torchcigarbar.com/wp-content/uploads/2016/07/Why-People-Prefer-Cuban-Cigars.jpg', 4),
('https://as1.ftcdn.net/v2/jpg/00/44/83/14/1000_F_44831410_ZYORjO4MklXQaMnILgP1biJ0JyhwclS2.jpg', 5);


INSERT INTO document_storage (document_storage_1, document_s_item_id) 
VALUES
('Cigar Aging and Storage Guide', 1),
('Long-Term Cigar Preservation Tips', 2),
('Proper Cigar Storage - Humidity and Temperature Guidelines', 3),
('Tips for Storing Cigars in a Humidor', 4),
('How to Maintain Ideal Conditions for Cigar Freshness', 5);

INSERT INTO items_uoms (item_uom_quantity, item_uom_item_id, item_uom_uom_id) 
VALUES
(18, 1, 1),  -- Item 1 associated with Single UOM
(18, 1, 2),  -- Item 1 associated with Single UOM
(18, 1, 3),  -- Item 1 associated with Single UOM
(24, 2, 3),  -- Item 2 associated with Pack UOM
(40, 3, 1),  -- Item 3 associated with Single UOM
(24, 4, 2),  -- Item 4 associated with Pack UOM
(24, 4, 3),  -- Item 4 associated with Pack UOM
(40, 5, 1),  -- Item 5 associated with Box UOM
(40, 5, 3);  -- Item 5 associated with Box UOM

INSERT INTO items_channels (item_ch_channel_id, item_ch_item_id)
VALUES
(1, 1),  -- Item 1 available to Retail Customer
(1, 2),  -- Item 1 available to Retail Customer
(1, 3),  -- Item 1 available to Retail Customer
(1, 4),  -- Item 1 available to Retail Customer
(1, 5),  -- Item 1 available to Retail Customer
(2, 1),  -- Item 2 available to Wholesaler
(2, 2),  -- Item 2 available to Wholesaler
(2, 5),  -- Item 2 available to Wholesaler
(3, 3),  -- Item 3 available to Dropshipper
(3, 2),  -- Item 3 available to Dropshipper
(3, 5);  -- Item 5 available to Wholesaler

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
(4, 8),  -- Item 4 associated with attribute 'Bold'
(5, 10); -- Item 5 associated with attribute 'Earthy'

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


