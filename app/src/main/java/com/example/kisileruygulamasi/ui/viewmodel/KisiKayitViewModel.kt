package com.example.kisileruygulamasi.ui.viewmodel

import android.content.ContentUris
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiKayitViewModel : ViewModel() {

    var krepo = KisilerRepository()
    fun kaydet(kisi_ad: String, kisi_tel: String) {
        viewModelScope.launch {
            krepo.kaydet(kisi_ad, kisi_tel)
        }

    }
}