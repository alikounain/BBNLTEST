package com.bbnl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mst_gram_panchayat")
public class GramPanchayat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gp_id")
	private Integer gpId;
	
	@Column(name = "gp_name")
	private String gpName;
	
	
	@OneToOne(targetEntity = Block.class,fetch = FetchType.EAGER)
	@JoinColumn(nullable = false,name = "block_id")
	private Block block;
}
