-- Produtos
INSERT INTO tb_product (name, price) VALUES ('Telefone', 1000.00);
INSERT INTO tb_product (name, price) VALUES ('Mouse', 200.00);
INSERT INTO tb_product (name, price) VALUES ('Teclado', 300.00);
INSERT INTO tb_product (name, price) VALUES ('Monitor', 1500.00);

-- Clientes
INSERT INTO tb_client (name, email) VALUES ('João da Silva', 'joao@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('Maria Oliveira', 'Maria@gmail.com');

-- Pedidos
INSERT INTO tb_order (moment, status, client_id) VALUES (CURRENT_TIMESTAMP, 'WAITING', 1);
INSERT INTO tb_order (moment, status, client_id) VALUES (CURRENT_TIMESTAMP, 'PAID', 2);

-- Itens do pedido de João (pedido ID 1)
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (2, 1000.00, 1, 1);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 200.00, 2, 1);

-- Itens do pedido de Maria (pedido ID 2)
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 300.00, 3, 2);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (2, 1500.00, 4, 2);
