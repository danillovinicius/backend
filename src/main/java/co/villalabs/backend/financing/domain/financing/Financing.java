package co.villalabs.backend.financing.domain.financing;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import co.villalabs.backend.financing.domain.buyer.Buyer;

@Entity
@Table(name = "tb_financiamento", schema = "public")
public class Financing {
	@Id
	@SequenceGenerator(name = "tb_financimaneto_sequence", sequenceName = "public.seq_tb_financiamento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_financiamento_sequence")
	@Column(name = "id_financiamento")
	private Long financingId;
	
	@OneToMany(mappedBy = "financing", cascade = {CascadeType.ALL}, orphanRemoval = true)
	@NotNull
	private List<Buyer> buyer = new ArrayList<Buyer>();
}
