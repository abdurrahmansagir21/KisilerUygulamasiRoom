package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {

    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false)
        binding.toolbarKisiDetay.title = "Kişi Detay"
        val bundle: KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        binding.editTextKisiAd.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_tel)

        binding.buttonGuncelle.setOnClickListener {

            val kisi_ad_guncel = binding.editTextKisiAd.text.toString()
            val kisi_tel_guncel = binding.editTextKisiTel.text.toString()
            guncelle(gelenKisi.kisi_id, kisi_ad_guncel, kisi_tel_guncel)
        }

        return binding.root
    }

    fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) {
        Log.e("kişi güncelle", "$kisi_id-$kisi_ad-$kisi_tel")
    }
}