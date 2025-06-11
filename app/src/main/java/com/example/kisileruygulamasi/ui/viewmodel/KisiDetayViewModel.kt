package com.example.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.launch

class KisiDetayViewModel : ViewModel() {

    var krepo = KisilerRepository()
    fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) {
        viewModelScope.launch {
            krepo.guncelle(kisi_id, kisi_ad, kisi_tel)
        }
    }
}