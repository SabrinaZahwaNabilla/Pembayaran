package com.example.pembayaran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //variabel
    private lateinit var txtHargaBarang: EditText
    private lateinit var txtPotonganHarga: EditText
    private lateinit var txtJumlahBeli: TextView
    private lateinit var txtTotalBayar: TextView
    private lateinit var btnKurang: Button
    private lateinit var btnTambah: Button
    private lateinit var btnBayar: Button

    var totalDiskon:Int = 0
    var totalBayar:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtHargaBarang = findViewById(R.id.editHargaBarang)
        txtPotonganHarga = findViewById(R.id.editPotongan)
        txtJumlahBeli = findViewById(R.id.editJumbel)
        txtTotalBayar = findViewById(R.id.txtTotalBayar)
        btnKurang = findViewById(R.id.btnMinus)
        btnTambah = findViewById(R.id.btnPlus)
        btnBayar = findViewById(R.id.btnBayar)
    }

    // Fungsi/method diskon
    private fun  setDiskon (){
        val harga = txtHargaBarang.text.toString().toInt()
        val jumBel = txtJumlahBeli.text.toString().toInt()
        totalDiskon = (harga*jumBel)*10/100
        txtPotonganHarga.setText(totalDiskon.toString())
    }

    //Total bayar
    private fun setTotalBayar(){
        val harga = txtHargaBarang.text.toString().toInt()
        val jumBel = txtJumlahBeli.text.toString().toInt()
        val diskon = txtPotonganHarga.text.toString().toInt()
        totalBayar = (harga*jumBel) - diskon
        txtTotalBayar.setText(totalBayar.toString())
    }
}