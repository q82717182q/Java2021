-- for h2 db

CREATE TABLE IF NOT EXISTS product
(
    product_id         INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    product_name       VARCHAR(128) NOT NULL,
    category           VARCHAR(32)  ,
    image_url          VARCHAR(256) ,
    price              INT          ,
    stock              INT          ,
    description        VARCHAR(1024),
    created_date       TIMESTAMP    ,
    last_modified_date TIMESTAMP
);

