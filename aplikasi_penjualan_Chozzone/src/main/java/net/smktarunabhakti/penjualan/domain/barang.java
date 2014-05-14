package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_barang")
public class barang implements Serializable
{
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
	private String uid;
	@NotNull
	@Column(name="kd_barang",nullable = false , length=5)
	private String kdBarang;
	
	@Column(name="nm_barang",nullable = false)
	private String nmBarang;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getKdBarang() {
		return kdBarang;
	}
	public void setKdBarang(String kdBarang) {
		this.kdBarang = kdBarang;
	}
	public String getNmBarang() {
		return nmBarang;
	}
	public void setNmBarang(String nmBarang) {
		this.nmBarang = nmBarang;
	}
}
