package com.dicoding.picodiploma.perusahaanelonmusk

import Hero
import com.example.testelon.R

object HeroesData {
    private val heroNames = arrayOf(
        "Tesla",
        "Spacex",
        "The Boring Company",
        "Future of Life",
        "Hyperloop",
        "Neuralink",
        "Starlink",
        "Paypal",
        "OpenAI",
        "SolarCity")

    private val heroDetails = arrayOf(
        "Tesla, Inc. adalah sebuah perusahaan otomotif dan penyimpanan energi asal Amerika Serikat yang didirikan oleh Elon Musk, Martin Eberhard, Marc Tarpenning, JB Straubel dan Ian Wright, serta berbasis di Palo Alto, California.",
        "Space Exploration Technologies Corporation adalah perusahaan transportasi luar angkasa swasta Amerika Serikat yang didirikan oleh Elon Musk. Perusahaan ini telah mengembangkan keluarga roket Falcon dengan tujuan menjadi kendaraan peluncuran yang dapat dipakai ulang.",
        "The Boring Company adalah perusahaan jasa konstruksi infrastruktur dan terowongan Amerika yang didirikan oleh Elon Musk pada bulan Desember 2016. Musk telah menyebutkan kesulitan dengan lalu lintas Los Angeles dan keterbatasan dengan jaringan transportasi dua dimensi saat ini sebagai inspirasi untuk proyek tersebut",
        "The Future of Life Institute adalah lembaga penelitian nirlaba dan organisasi penjangkauan di wilayah Boston yang bekerja untuk mengurangi risiko eksistensial yang dihadapi manusia, khususnya risiko eksistensial dari kecerdasan buatan tingkat lanjut.",
        "Hyperloop adalah konsep sistem transportasi berkecepatan tinggi yang diajukan oleh wiraswasta Elon Musk. Hyperloop bergerak dengan menciptakan tekanan rendah yang memungkinkan kapsul bergerak dengan kecepatan yang amat tinggi.",
        "Neuralink Corporation adalah perusahaan neuroteknologi Amerika yang didirikan oleh Elon Musk dan lainnya, mengembangkan antarmuka mesin otak yang dapat ditanamkan. Kantor pusat perusahaan berada di San Francisco; ini dimulai pada 2016 dan pertama kali dilaporkan secara publik pada Maret 2017.",
        "Starlink adalah sebuah proyek pengembangan konstelasi satelit yang sedang dijalankan oleh perusahaan Amerika Serikat bernama SpaceX. Proyek ini bertujuan untuk menghadirkan sebuah sistem komunikasi internet berbasis satelit yang memiliki performa tinggi serta dengan harga yang terjangkau",
        "PayPal Inc. adalah perusahaan dalam jaringan yang menyediakan jasa transfer uang melalui surat elektronik, menggantikan metode lama yang masih menggunakan kertas, seperti cek dan wesel pos.",
        "OpenAI adalah perusahaan nirlaba yang ingin mengembangkan kecerdasan buatan yang bersahabat dan dapat menguntungkan manusia secara keseluruhan. Para pendirinya terdorong oleh ketakutan mereka akan kemungkinan bahwa kecerdasan buatan dapat mengancam keberadaan manusia.",
        "SolarCity Corporation adalah anak perusahaan dari Tesla, Inc. yang berspesialisasi dalam layanan energi surya dan berkantor pusat di San Mateo, California.")

    private val heroesImages = intArrayOf(
        R.drawable.tesla,
        R.drawable.spacex,
        R.drawable.boring,
        R.drawable.future,
        R.drawable.hyperloop,
        R.drawable.neuralink,
        R.drawable.starlink,
        R.drawable.paypal,
        R.drawable.open,
        R.drawable.solar)

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}