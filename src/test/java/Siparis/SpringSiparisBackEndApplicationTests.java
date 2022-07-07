package Siparis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import Siparis.Models.SiparisModel;
import Siparis.Models.UrunModel;
import Siparis.Repositroy.SiparisRepository;

@SpringBootTest
class SpringSiparisBackEndApplicationTests {

	@Autowired
	private SiparisRepository siparisRepository;

	@Test
	void contextLoads() {

	}

	@Test
	void SiparisKaydet() {
		SiparisModel siparisModel = new SiparisModel();
		UrunModel urunModel = new UrunModel();
		siparisModel.setMasaNo(15);
		String[] icindekiler = { "patates", "sogan" };
		int fiyat = 15;
		String urunAd = "pattes";
		urunModel.setUrun(urunAd);
		urunModel.setFiyat(fiyat);
		urunModel.setIcindekiler(icindekiler);
		String[] Ekstralar = { "patates" };
		siparisModel.setEkstralar(Ekstralar);
		siparisModel.setNot("cileki");
		siparisModel.setToplamFiyat(250);
		siparisModel.setSiparisAktifMi(true);
		siparisRepository.save(siparisModel);
		System.out.println("id: " + siparisModel.getId());
		System.out.println("Masa: " + siparisModel.getMasaNo());
		System.out.println("Urun Adi:" + urunAd);
		System.out.println("Fiyat:" + fiyat);
		System.out.println("Icerik:" + icindekiler[0]);
		System.out.println("Ekstra: " + Ekstralar[0]);
		System.out.println("Not: " + siparisModel.getNot());
		System.out.println("Fiyat: " + siparisModel.getToplamFiyat());
		System.out.println("Siparis Durumu: " + siparisModel.isSiparisAktifMi());
	}
}
