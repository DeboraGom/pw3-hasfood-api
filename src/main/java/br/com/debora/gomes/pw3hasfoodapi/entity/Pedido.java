package br.com.debora.gomes.pw3hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.debora.gomes.pw3hasfoodapi.enums.StatusPedidoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PEDIDO")
	private Long id_pedido;
	

	@Column(name = "DT_PEDIDO")
	private LocalDate data_pedido;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TX_STATUS")	
    private StatusPedidoEnum Status;
	
	@Column(name = "ID_RESTAURANTE")
	private Long id_restaurante;
}
