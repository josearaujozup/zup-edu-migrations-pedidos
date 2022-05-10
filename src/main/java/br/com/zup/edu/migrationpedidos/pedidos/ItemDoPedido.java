package br.com.zup.edu.migrationpedidos.pedidos;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item_do_pedido")
public class ItemDoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;

    private BigDecimal valor;

    private int quantidade;

    @ManyToOne
    private Pedido pedido;

    @Deprecated
    public ItemDoPedido() {
    }
}
