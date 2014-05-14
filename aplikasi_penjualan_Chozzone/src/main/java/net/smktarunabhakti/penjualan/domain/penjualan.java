package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="trx_jual_header")
public class penjualan implements Serializable{
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
	private String uid;
	@Column(name="waktu_transaksi")
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date tgl;
	@Column(nullable=false)
	private String kasir;
	
	@Column(name="no_struk",nullable=false)
	private String no_struk;
	
	@OneToMany(mappedBy = "header")
	@Cascade(value = CascadeType.ALL)
	private List<penjualanDetail> listPenjualanDetail = new ArrayList<penjualanDetail>();
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Date getTgl() {
		return tgl;
	}
	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}
	public String getKasir() {
		return kasir;
	}
	public void setKasir(String kasir) {
		this.kasir = kasir;
	}
	public String getNo_struk() {
		return no_struk;
	}
	public void setNo_struk(String no_struk) {
		this.no_struk = no_struk;
	}
}
