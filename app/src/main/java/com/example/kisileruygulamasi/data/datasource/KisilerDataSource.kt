package com.example.kisileruygulamasi.data.datasource

import android.util.Log

class KisilerDataSource {
    suspend fun kaydet(kisi_ad: String, kisi_tel: String) {
        Log.e("kişi kaydet", "$kisi_ad-$kisi_tel")
    }

    suspend fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) {
        Log.e("kişi güncelle", "$kisi_id-$kisi_ad-$kisi_tel")
    }
}