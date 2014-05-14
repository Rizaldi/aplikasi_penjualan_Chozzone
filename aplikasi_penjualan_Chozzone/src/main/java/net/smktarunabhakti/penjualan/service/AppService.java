package net.smktarunabhakti.penjualan.service;

import java.awt.print.Pageable;
import java.util.List;

import net.smktarunabhakti.penjualan.domain.barang;

public interface AppService {
	void simpanBarang(barang b);
	
	void hapusBarang(barang b);
	
//	Page<barang> cariSemuaBarang(Pageable p);
	
	List<barang> cariSemuaBarang();
	
	barang cariBarangById();
	
	Long countSemuaBarang();
}
