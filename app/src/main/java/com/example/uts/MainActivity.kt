package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = tambahData()
        rv_fakultas.layoutManager = LinearLayoutManager(this)
        rv_fakultas.setHasFixedSize(true)
        // Adapter untuk menampilkan item pada recycler view sesuai banyaknya data yang diinputkan
        rv_fakultas.adapter = Adapter_Fakultas(testData) { fakultasItem: Data_fakultas -> klikFakultasItem(fakultasItem) }
    }
    //Ketika klik Resep item menerima parameter resepItem, masuk ke ResepDetailActivity
    private fun klikFakultasItem(fakultasItem: Data_fakultas) {
        val showDetailActivityIntent = Intent(this, Activity_Detail_Fakultas::class.java)

        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, fakultasItem.namaFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INDEX, fakultasItem.deskripsiFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakultasItem.jurusan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CHOSEN_COMPONENT, fakultasItem.image)
        showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, fakultasItem.email)
        showDetailActivityIntent.putExtra(Intent.EXTRA_ORIGINATING_URI, fakultasItem.website)

        //Menjalankan Activity showDetailActivityIntent
        startActivity(showDetailActivityIntent)
    }
}
