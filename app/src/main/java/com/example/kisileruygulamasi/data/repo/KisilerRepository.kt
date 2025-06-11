package com.example.kisileruygulamasi.data.repo

import com.example.kisileruygulamasi.data.datasource.KisilerDataSource

class KisilerRepository {
    val kds = KisilerDataSource()
    suspend fun kaydet(kisi_ad: String, kisi_tel: String) = kds.kaydet(kisi_ad, kisi_tel)

    suspend fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) =
        kds.guncelle(kisi_id, kisi_ad, kisi_tel)
}