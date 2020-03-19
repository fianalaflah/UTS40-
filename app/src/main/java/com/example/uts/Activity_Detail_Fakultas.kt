package com.example.uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_fakultas.*

class Activity_Detail_Fakultas : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Dapat memberikan tampilan konten ke R.layout.activity_detail_resep
        setContentView(R.layout.activity_detail_fakultas)

        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_INTENT)) {
            //Inisialisasi part kirimsan Intent
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            var partDeskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INDEX)
            var partJurusan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partImage =
                intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_CHOSEN_COMPONENT, 0)

            tv_detail_nama.text = partName
            tv_deskripsi.text = partDeskripsi
            tv_detail_jurusan.text = partJurusan
            tv_item_image.contentDescription = partName
            tv_item_image.setImageResource(partImage)
        }
    }
}








