package com.example.uts

import android.content.Intent
import android.net.Uri
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

        }

            //Inisialisasi part kirimsan Intent
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            var partDeskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INDEX)
            var partJurusan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partImage =
                intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_CHOSEN_COMPONENT, 0)
            var partEmail = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EMAIL)
            var partWeb= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_ORIGINATING_URI)


            tv_detail_nama.text = partName
            tv_deskripsi.text = partDeskripsi
            tv_detail_jurusan.text = partJurusan
            tv_item_image.contentDescription = partName
            tv_item_image.setImageResource(partImage)
            if (partEmail == "") {
                isi_email.text = ""
                label_email.text = ""
            } else {
                isi_email.text = partEmail
            }
            if (partWeb == "") {
                isi_website.text = ""
                label_website.text = ""
            } else {
                isi_website.text = partWeb
            }
                isi_email.setOnClickListener {
                //Jalankan function klikWeb dengan parameter partWeb
                klikEmail(partEmail)
            }

            isi_website.setOnClickListener {
                //Jalankan function klikWeb dengan parameter partWeb
                klikWeb(partWeb)
            }
        }

        private fun klikEmail(email: String) {
            //ACTION_SEND untuk menjalankan email client yang terinstall pada perangkat Android
            val mailIntent = Intent(Intent.ACTION_SEND)
            /*Untuk mengirim email memberikan mailto: sebagai URI menggunakan method setData()
            dan type data text/plain menggunakan method setType()*/
            mailIntent.data = Uri.parse("mailto:")
            mailIntent.type = "text/plain"

            //Memasukkan penerima / to pada intent
            /* penerima menggunakan array karena email dapat dikirim ke beberapa penerima
               jadi berikan koma(,) untuk memisahkan email, akan tersimpan sebagai array*/
            mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            //Memasukkan subject pada intent
            mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email dari aplikasi")
            //Memasukkan text email pada intent
            mailIntent.putExtra(Intent.EXTRA_TEXT, "Coba email")

            /*NB lihat file Intent.java dengan cara Ctrl+klik kiri pada EXTRA_TEXT dll untuk melihat
            fungsi masing masing EXTRA_blabla*/

            //start email intent
            startActivity(Intent.createChooser(mailIntent, "Pilih Email Client..."))
        }

        //Function klikWeb ketika tv_detail_web diklik -> parameter url yang akan ditampilkan
        private fun klikWeb(url: String) {
            val showWebActivity = Intent(this, WebFakultas::class.java)

            //Kiriman Intent
            showWebActivity.putExtra(Intent.ACTION_VIEW, url)

            //Menjalankan Activity FakultasWeb dengan Intent
            startActivity(showWebActivity)
        }
    }










