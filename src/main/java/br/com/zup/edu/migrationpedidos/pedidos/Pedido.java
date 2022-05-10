package br.com.zup.edu.migrationpedidos.pedidos;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCliente;
    private Long idEstabelecimento;
    private LocalDateTime dataPedido;

    @OneToMany(mappedBy = "pedido")
    private List<ItemDoPedido> itens = new ArrayList<>();

    @Deprecated
    public Pedido() {
    }
}
