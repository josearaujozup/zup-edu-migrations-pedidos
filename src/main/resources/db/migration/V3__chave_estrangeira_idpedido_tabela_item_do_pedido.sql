ALTER TABLE item_do_pedido
ADD CONSTRAINT fk_id_pedido_item_do_pedido
FOREIGN KEY (pedido_id) REFERENCES pedido(id);