use web_api_base;


INSERT INTO users (user_name, user_password, user_email, user_first_name, user_last_name, role, status, last_login, refresh_token, failed_login, account_locked_until)
VALUES
    ('jdoe', 'passwordHash1', 'jdoe@example.com', 'John', 'Doe', 'USER', 'active', '2024-10-15 14:22:01', NULL, 0, NULL),
    ('Rakan', 'passwordHash2', 'asmith@example.com', 'Alice', 'Smith', 'ADMIN', 'active', '2024-10-18 09:11:30', NULL, 0, NULL),
    ('bwayne', 'passwordHash3', 'bwayne@example.com', 'Bruce', 'Wayne', 'USER', 'banned', NULL, NULL, 3, '2024-11-07'),
    ('ckent', 'passwordHash4', 'ckent@example.com', 'Clark', 'Kent', 'USER', 'inactive', '2024-08-01 16:45:09', NULL, 1, NULL),
    ('dprince', 'passwordHash5', 'dprince@example.com', 'Diana', 'Prince', 'ADMIN', 'pending', NULL, NULL, 0, NULL),
    ('pparker', 'passwordHash6', 'pparker@example.com', 'Peter', 'Parker', 'USER', 'active', '2024-09-20 12:33:25', 'refreshToken1', 0, NULL),
    ('tstark', 'passwordHash7', 'tstark@example.com', 'Tony', 'Stark', 'ADMIN', 'active', '2024-11-01 08:10:12', 'refreshToken2', 2, NULL),
    ('banners', 'passwordHash8', 'banners@example.com', 'Bruce', 'Banner', 'USER', 'inactive', '2024-10-12 20:25:42', NULL, 1, NULL),
    ('nsummers', 'passwordHash9', 'nsummers@example.com', 'Nathan', 'Summers', 'USER', 'banned', NULL, NULL, 5, '2024-11-20'),
    ('rspector', 'passwordHash10', 'rspector@example.com', 'Marc', 'Spector', 'USER', 'pending', NULL, NULL, 0, NULL);


 INSERT INTO distributors (distributor_name, distributor_address, distributor_country,distributor_status)
VALUES ('new', '4 Suite', 'USA','INACTIVE'),
 ('Old', '3 Suite', 'Jordan','ACTIVE');

INSERT INTO packaging (packaging_type) VALUES
('SINGLE'),
('PACK'),
('BOX'),
('CASE'),
('PALLET');

INSERT INTO channels (channel_description, channels_level, channel_default_uom) VALUES
('Retail Customer', 1, 'SINGLE'),
('Wholesaler', 2, 'CASE'),
('Dropshipper', 3, 'PALLET');


INSERT INTO attributes (attribute_name, attribute_type, attribute_assist_text) VALUES
('Sweet', 'TASTE', 'Indicates sweetness level'),
('Large', 'SIZE', 'Indicates size category'),
('Fruity', 'TASTE', 'Indicates fruity flavor'),
('Spicy', 'TASTE', 'Indicates spicy flavor');

INSERT INTO shipping_dimensions (height, width, length, weight) VALUES
(10.00, 5.00, 5.00, 2.00),
(15.00, 10.00, 10.00, 5.00),
(20.00, 15.00, 15.00, 10.00);

INSERT INTO compliance_categories (compliance_category_name, compliance_categories_code, compliance_category_report_required, compliance_category_pct_item) VALUES
('Category A', 101, 1, '10%'),
('Category B', 102, 0, '5%');
 
 
INSERT INTO manufacturer_pricing (m_pricing_list, m_pricing_msrp, m_pricing_rmap, m_pricing_wholesale_price, m_pricing_federal_excise_tax, m_pricing_cost) VALUES
(25.00, 30.00, 27.50, 22.50, 0.50, 20.00),
(15.00, 20.00, 18.00, 13.50, 0.25, 10.00),
(35.00, 26.00, 56.00, 13.50, 1.25, 14.00);

INSERT INTO manufacturers (manufacturer_name, manufacturer_description, manufacturer_status) VALUES
('Manufacturer A', 'Description for Manufacturer A', 'ACTIVE'),
('Manufacturer B', 'Description for Manufacturer B', 'ACTIVE');

INSERT INTO manufacturer_facilities (m_facility_name, m_facility_country, status, m_f_manufacturer_id) VALUES
('Facility A', 'Country A', 'ACTIVE', 1),
('Facility B', 'Country B', 'INACTIVE', 2);

INSERT INTO brands (brand_name, brand_description, brand_status, brand_manufacturer_id) VALUES
('Brand A', 'Description for Brand A', 'AVAILABLE', 1),
('Brand B', 'Description for Brand B', 'AVAILABLE', 1),
('Brand C', 'Description for Brand C', 'DISCONTINUED', 2);

INSERT INTO models (model_name, model_description, model_brand_id, model_manufacturer_facility_id) VALUES
('Model A', 'Description for Model A', 1, 1),
('Model B', 'Description for Model B', 2, 1),
('Model B', 'Description for Model B', 1, 2),
('Model C', 'Description for Model C', 1, 1);

INSERT INTO model_pictures (m_picture_name, m_picture_link, m_picture_model_id) VALUES
('Model A Picture', 'https://i.etsystatic.com/40317824/r/il/339134/4827441773/il_1588xN.4827441773_887m.jpg', 1),
('Model B Picture', 'http://example.com/modelB.jpg', 2);

INSERT INTO sales_categories (s_category_name, s_category_measurement_type, s_category_system_measurement) VALUES
('Cigar', 'count', 'METRIC'),
('Nicotine Pouch', 'WEIGHT', 'IMPERIAL');

INSERT INTO uoms (uom_type, uom_level, uom_updated_at_by, uom_status, uom_shipping_dimension_id, uom_packaging_id) VALUES
('Single', 1, 'Admin', 'AVAILABLE', 1, 1),
('Pack', 2, 'Admin', 'AVAILABLE', 2, 2),
('Box', 3, 'Admin', 'DISCONTINUED', 3, 3);

INSERT INTO uom_pictures (uom_picture_name, uom_picture_link, uom_picture_uom_id) VALUES
('Single UOM Picture', 'http://example.com/uom_single.jpg', 1),
('Pack UOM Picture', 'http://example.com/uom_pack.jpg', 2);

INSERT INTO items (item_name, item_sku, item_description, item_type, item_quantity, item_availability, item_msa_promo_item, item_base_price, item_weight, item_distributor_id, item_model_id, item_manufacturer_pricing_id, item_compliance_category_id) VALUES
('Item A', 'SKU001', 'Description for Item A', 'Type A', 100, 'AVAILABLE', 'Promo1', 15.99, 1.5, 1, 1, 1, 1),
('Item B', 'SKU002', 'Description for Item B', 'Type B', 50, 'AVAILABLE', 'Promo2', 25.99, 2.0, 2, 2, 2, 2);

INSERT INTO item_pictures (item_picture_main, item_p_item_id) VALUES
('Main Picture for Item A', 1),
('Main Picture for Item B', 2);

INSERT INTO document_Storage (document_storage_1, document_s_item_id) VALUES
('Document for Item A', 1),
('Document for Item B', 2);


INSERT INTO items_uoms (item_uom_quantity, item_uom_item_id, item_uom_uom_id) VALUES
(1, 1, 1),
(20, 1, 2),
(30, 1, 3),
(1, 2, 1),
(10, 2,2),
(33, 2, 2);


INSERT INTO items_channels (item_ch_channel_id, item_ch_item_id) VALUES
(1, 1),
(2, 1),
(3, 1),
(1, 2),
(2, 2);

INSERT INTO items_attributes (item_a_item_id, item_a_attribute_id) VALUES
(1, 1),
(2, 2);

INSERT INTO item_sales_categories (item_s_c_item, item_s_c_category_id) VALUES
(1, 1),
(2, 2);


SELECT 
    items.item_name,
    items.item_sku,
    items.item_description,
    items.item_type, 
    items.item_quantity, 
    items.item_base_price,
    items.item_weight,
    uoms.uom_level,
    uoms.uom_type,
    items_uoms.item_uom_quantity,
    items_uoms.item_uom_quantity * items.item_base_price AS total_price
FROM items
JOIN items_uoms ON items_uoms.item_uom_item_id = items.item_id
JOIN uoms ON items_uoms.item_uom_uom_id = uoms.uom_id
WHERE items.item_id = 1;


select * from packaging;

SELECT * FROM items_channels;

