package com.example.uts

fun tambahData(): List<Data_fakultas> {
    val partList = ArrayList<Data_fakultas>()
    partList.add(
        Data_fakultas(
        "Fakultas Ilmu Komputer",
            " Fakultas Ilmu Komputer Merupakan Salah Satu dari 7 Fakultas di UPN Veteran Jawa Timur .",
            "\n  Yang Terdiri dari Program Studi:"+
                    "\n 1. Prodi S1 Sistem Informasi" +
                    "\n 2. Prodi S1 Teknik Informatika",
            R.drawable.logo_upn,
            "fik@upnjatim.ac.id",
            "https://fik.upnjatim.ac.id"
        )
    )
    partList.add(
        Data_fakultas(
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Ilmu Sosial dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur.",
            "Yang terdiri dari program studi:"+
                    "\n 1. Prodi S1 Ilmu Komunikasi" +
                    "\n 2. Prodi S1 Ilmu Administrasi Bisnis" +
                    "\n 3. Prodi S1 Ilmu Administrasi Negara" +
                    "\n 4. Prodi S1 Hubungan Internasional",
            R.drawable.logo_upn,
            "fisip@upnjatim.ac.id",
            "http://fisip.upnjatim.ac.id/"
        )
    )
    partList.add(
        Data_fakultas(
                "Fakultas Teknik",
        " Fakultas Teknik Merupakan Salah Satu dari 7 Fakultas di UPN Veteran Jawa Timur",
            "\n  Yang Terdiri dari Program Studi:"+
                    "\n 1. Prodi S1 Teknik Kimia" +
                    "\n 2. Prodi S1 Teknik Industri"+
                    "\n 3. Prodi S1 Teknik Sipil"+
                    "\n 4. Prodi S1 Teknik Lingkungan"+
                    "\n 5. Prodi S1 Teknik Pangan",
        R.drawable.logo_upn,
            "ft@upnjatim.ac.id",
            "http://ft.upnjatim.ac.id"

    )
    )
    partList.add(
        Data_fakultas(
            "Fakultas Ekonomi dan Bisnis",
            " Fakultas Ilmu Komputer Merupakan Salah Satu dari 7 Fakultas di UPN Veteran Jawa Timur .Yang Terdiri dari Program Studi:",
            "\n  Yang Terdiri dari Program Studi:"+
                    "\n 1. Prodi S1 Ekonomi Pembangunan" +
                    "\n 2. Prodi S1 Akuntansi"+
                    "\n 3. Prodi S1 Ekonomi Manajemen" ,
            R.drawable.logo_upn,
            "feb@upnjatim.ac.id",
            "http://febis.upnjatim.ac.id/"
        )
    )
    partList.add(
        Data_fakultas(
            "Fakultas Arsitektur dan Desain",
            "Fakultas Arsitektur dan Desain merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. ",
            "Yang terdiri dari program studi:"+
                    "\n1. Prodi S1 Teknik Arsitektur" +
                    "\n2. Prodi S1 Desain Komunikasi Visual",
            R.drawable.logo_upn,
            "fad@upnjatim.ac.id",
            "http://fad.upnjatim.ac.id/"
        )
    )
    partList.add(
        Data_fakultas(
            "Fakultas Pertanian",
            " Fakultas Pertanian Merupakan Salah Satu dari 7 Fakultas di UPN Veteran Jawa Timur ",
            "\n  Yang Terdiri dari Program Studi:"+
                    "\n 1. Prodi S1 Agroteknologi" +
                    "\n 2. Prodi S1 Agribisnis",
            R.drawable.logo_upn,
            "faperta@upnjatim.ac.id",
            "http://faperta.upnjatim.ac.id/"
        )
    )
    partList.add(
        Data_fakultas(
            "Fakultas Hukum",
            " Fakultas Hukum Merupakan Salah Satu dari 7 Fakultas di UPN Veteran Jawa Timur ",
            "\n  Yang Terdiri dari Program Studi:"+
                    "\n 1. Prodi S1 Hukum" ,
            R.drawable.logo_upn,
            "fhukum@upnjatim.ac.id",
            "http://fhukum.upnjatim.ac.id/"
        )
    )
    partList.add(
        Data_fakultas(
            "M.NURFIAN TRIANTONO",
            "\n TTL     : Sidoarjo, 07 November 1999"+
                            "\n Alamat : Jalan Kolonel Sugiono No.24 Gedongan Wau Sidoarjo"+
                            "\n No.Hp  : 081331334645",

            "\n Riwayat Pendidikan:"+
                    "\n - SMP Negeri 1 Waru"+
                    "\n - SMA Negeri 1 Gedangan"+
                    "\n UPN Veteran Jawa Timur"+
                    "\n" +
                    "\n Penghargaan:" +
                    "\n -Duta Anti Narkoba Kabupaten Sidoarjo Tahun 2015"+
                    "\n -Guk Persahabatan Sidoarjo Tahun 2017"+
                    "\n -Duta Gemarikan Jawa Timur Tahun 2020",


            R.drawable.pribadi,
            "muhammadnurfian07@gmail.com",
            "https://github.com/fianalaflah/"
        )
    )
    return partList

}

