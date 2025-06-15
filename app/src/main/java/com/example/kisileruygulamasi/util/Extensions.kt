package com.example.kisileruygulamasi.util

import android.view.View
import androidx.navigation.Navigation
import com.example.kisileruygulamasi.MainActivity
import com.example.kisileruygulamasi.ui.fragment.AnasayfaFragment

fun Navigation.gecisYap(it: View, Id: Int) {

    findNavController(it).navigate(Id)
}
