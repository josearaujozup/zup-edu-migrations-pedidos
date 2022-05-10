CREATE TABLE item_do_pedido (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  sku varchar(100),
  valor decimal(18,2),
  quantidade integer,
  pedido_id bigint
);