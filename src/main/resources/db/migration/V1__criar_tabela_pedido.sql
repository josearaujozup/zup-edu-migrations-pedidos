  CREATE TABLE pedido (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    id_cliente bigint,
    id_estabelecimento bigint,
    data_pedido timestamp
  );