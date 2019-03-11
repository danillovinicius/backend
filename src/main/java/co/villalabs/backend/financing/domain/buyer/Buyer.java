package co.villalabs.backend.financing.domain.buyer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import co.villalabs.backend.financing.domain.financing.Financing;

@Entity
@Table(name = "tb_comprador", schema = "public")
public class Buyer {
	@Id
	@SequenceGenerator(name = "tb_comprador_sequence", sequenceName = "public.seq_tb_comprador", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_comprador_sequence")
	@Column(name = "id_tb_comprador")
	private Long financingId;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_financiamento", referencedColumnName = "id_financiamento")
	@NotNull
	@JsonIgnore
	private Financing financing;
}
