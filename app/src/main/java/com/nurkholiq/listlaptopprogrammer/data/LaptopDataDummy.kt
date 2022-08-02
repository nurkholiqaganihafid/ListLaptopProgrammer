package com.nurkholiq.listlaptopprogrammer.data

import com.nurkholiq.listlaptopprogrammer.R
import com.nurkholiq.listlaptopprogrammer.model.Laptop

object LaptopDataDummy {
    private val laptopBrandsName = arrayOf(
        "Asus Zenbook Pro Duo UX482EG i7 1165G7",
        "Lenovo YOGA Slim 7i Carbon",
        "ASUS VivoBook Pro 14X N7400",
        "ACER Swift X SFX14",
        "HP Pavilion X360 14 dy0065TU",
        "MSI Modern 14 B11MOU",
        "Lenovo Thinkpad E14",
        "HP Pavilion Aero Laptop 13-be0002AU",
        "ACER Spin 5 Lite SP513-55N-77UK",
        "MSI Summit E13 Flip Evo",
    )

    private val laptopPrices = arrayOf(
        "Rp25.499.000",
        "Rp16.699.000",
        "Rp13.750.000",
        "Rp13.300.000",
        "Rp13.169.700",
        "Rp7.899.000",
        "Rp6.360.000",
        "Rp13.730.000",
        "Rp21.249.000",
        "Rp24.999.000",
    )

    private val laptopDetails = arrayOf(
        "ASUS ZenBook Pro Duo UX482EG i7 1165G7 adalah laptop yang kuat untuk produktivitas dan kreativitas. Laptop ini hadir dengan fitur layar sekunder ScreenPad Plus dengan desain miring baru yang menawarkan ergonomis yang mudah dan alur kerja yang mulus. Didukung oleh prosesor Intel Core Generasi ke-11 terbaru, laptop ini siap menghadirkan performa yang andal untuk menunjang pekerjaan-pekerjaan berat.",
        "Banyak yang bilang bahwa Linux adalah sistem operasi paling nyaman untuk coding atau programming. Namun, jika laptop Windows sekeren Lenovo YOGA Slim 7i Carbon yang ditawarkan, Anda bisa jadi berubah pikiran.\n\nPasalnya, laptop 16 jutaan ini mempunyai banyak atribut yang cocok buat para programmer. Atribut pertama adalah layarnya yang tajam dan minim emisi cahaya biru. Layar 2K dengan sertifikasi TUV Rheinland ini penting untuk bekerja, apalagi untuk memperhatikan deretan kode secara intens.",
        "ASUS VivoBook Pro 14X N7400 bisa dibilang sebagai salah satu ultrabook dengan kemampuan terlengkap. Hal ini tidak lepas dari keluwesan laptop ini dalam menyelesaikan berbagai pekerjaan. Mulai dari merancang desain UI/UX, desain grafis, merekap jutaan item data, sampai edit video.\n\nSeluruh pekerjaan berat itu bisa diatasi dengan sigap berkat prosesor canggih Intel Core i7 11370H. Core i7 generasi ke-11 ini merupakan seri prosesor tangguh karena punya embel-embel \"H\" di belakangnya. Dukungan GPU seri atas RTX3050 menjadi modal kuat bagi si laptop untuk pengolahan grafis.",
        "Performa bukanlah satu hal yang perlu dipertanyakan lagi dari ACER Swift X SFX14 Pasalnya, prosesor Ryzen 7 5000 Series yang dipakainya punya delapan core dan 16 thread, sehingga mampu menyelesaikan tugas dengan lebih cepat.\n\nAdanya layar IPS dengan kedalaman warna 100% sRGB dan GPU diskret RTX3050Ti membuat laptop ini bisa diandalkan oleh content creator. Main game juga oke karena GPU RTX ini mendukung teknologi ray tracing yang membuat tampilan seperti bayangan terlihat lebih nyata.",
        "Pandemi Covid-19 memiliki satu hikmah penting buat dunia profesional. Hikmah itu adalah orang kini ternyata bisa produktif di mana pun tempatnya, tak terkecuali di rumah. Bahkan saat bersantai di atas kasur pun orang tetap bisa bekerja.\n\nJika Anda adalah tipe orang yang seperti itu, laptop seperti HP Pavilion X360 14 dy0065TU perlu Anda pertimbangkan. Pasalnya, ini adalah laptop konvertibel alias bisa dilipat dan berubah menjadi tablet. Bekerja dengan laptop 13 jutaan ini akan sangat nyaman, apalagi jika Anda memakai pena stylus.",
        "MSI Modern 14 B11MOU memang diperuntukkan bagi kalangan profesional. Meski begitu, laptop ini juga boleh dimiliki siapa saja yang memerlukan kemampuan komputasi tinggi. Kemampuan tersebut didapat berkat penyematan prosesor Core i7 generasi ke-11 (Tiger Lake) dengan GPU terintegrasi Iris Xe.",
        "Sejak masih dinaungi IBM, ThinkPad memang laptop unik seri bisnis. Setelah dibeli Lenovo, seri ini tetap memiliki ciri yang sama. Yakni desain tegas dan adanya tombol navigasi merah di bagian tengah keyboard. Lenovo Thinkpad E14 Gen 2 yang satu ini juga demikian.\n\nMeski begitu, laptop ini sudah didesain lebih tipis (1,79 cm) dan lebih ringan (1,5 kg) untuk mendukung mobilitas tinggi. Tidak hanya itu, fitur AI noise cancellation, layar IPS dengan kedalaman warna 100% sRGB, dan sertifikasi ketahanan militer merupakan tanda bahwa laptop ini mengutamakan pengalaman pakai terbaik.",
        "Tidak semua orang menyukai laptop dengan ukuran terlalu besar. Hal itu memang benar. Karena itu, beberapa produsen masih memproduksi laptop dengan ukuran layar 13,3 inci. Laptop dengan layar selebar itu punya ukuran ringkas, tetapi keyboard-nya masih normal dan enak buat mengetik cepat.\n\nNah, HP Pavilion Aero Laptop 13-be0002AU ini memenuhi syarat tersebut. Beratnya juga ringan, kurang dari 1 kg. Namun, HP tak menjelaskan secara spesifik bobot si laptop. Yang pasti, meski ukurannya ringkas, laptop ini punya performa yang gesit.",
        "Tidak salah bila orang berasumsi bahwa laptop tipis punya ruang internal yang sempit. Kondisi ini membuat sebuah laptop tidak bisa menampung sistem pembuangan panas yang kompleks. Untungnya laptop seperti ACER Spin 5 Lite SP513-55N dirancang dengan sistem termal sedemikian rupa, sehingga proses pembuangan panas tetap optimal.\n\nACER mengeklaim, laptop dengan ketebalan 1,49 cm ini memiliki kemampuan pembuangan panas 30% lebih baik ketimbang pendahulunya. Dengan pembuangan panas yang baik performa tangguh Core i7-1165G7 bisa dipertahankan dalam waktu lama.",
        "Estetika menjadi jualan utama dari laptop dengan nama lengkap MSI Summit E13 Flip Evo A11MT ini. MSI menyebut bahwa laptop terbaik pada CES 2021 ini menggunakan desain postmodern yang indah dan berkelas.\n\nWalau begitu, laptop Rp24 jutaan ini sejatinya tetap laptop seri bisnis yang mengutamakan performa dan portabilitas. Adanya sertifikasi Intel Evo membuat laptop ini tidak hanya andal dalam hal menyelesaikan tugas dengan cepat berkat prosesor Core i7 generasi ke 11, SSD NVMe PCIe Gen 4, dan RAM besar.",
    )

    private val laptopImages = arrayOf(
        R.drawable.laptop_1,
        R.drawable.laptop_2,
        R.drawable.laptop_3,
        R.drawable.laptop_4,
        R.drawable.laptop_5,
        R.drawable.laptop_6,
        R.drawable.laptop_7,
        R.drawable.laptop_8,
        R.drawable.laptop_9,
        R.drawable.laptop_10,
    )

    val listLaptop: ArrayList<Laptop>
        get() {
            val list = arrayListOf<Laptop>()
            for (position in laptopBrandsName.indices) {
                val laptop = Laptop()
                laptop.brandName = laptopBrandsName[position]
                laptop.price = laptopPrices[position]
                laptop.detail = laptopDetails[position]
                laptop.image = laptopImages[position]
                list.add(laptop)
            }
            return list
        }
}