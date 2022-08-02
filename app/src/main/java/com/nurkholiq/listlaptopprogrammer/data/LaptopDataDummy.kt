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

    private val laptopScreen = arrayOf(
        "14\" (16:9) LED-backlit FHD (1920 x 1080) 60 Hz touchscreen",
        "13.3\" QHD (2560x1600) Low power IPS 300nits Anti-glare, 100% sRGB, Dolby Vision, Aspect Ratio 16:10, 91% active area ratio",
        "14 inci OLED, 2,8 K (2880 x 1800 piksel), rasio 16:9, 100% DCI-P3, refresh rate 90 Hz",
        "14\" IPS Full HD (1920 x 1080), 100% sRGB, high-brightness (300nits), Acer ComfyView™ LED-backlit TFT LCD",
        "14\" diagonal, FHD (1920 x 1080), multitouch-enabled, IPS, edge-to-edge glass, micro-edge, 250 nits, 45% NTSC",
        "14\" FHD (1920*1080), IPS-Level",
        "14\" FHD (1920x1080) IPS 250nits Anti-glare",
        "13.3\" diagonal, WQXGA (2560 x 1600), IPS, micro-edge, anti-glare, 400 nits, 100% sRGB",
        "13.5\" VertiView display IPS 2K (2256 x 1504), high-brightness Acer CineCrystal™ LED-backlit TFT LCD, supporting multi-touch and AES pen solution, 3:2 aspect ratio, Wide viewing angle up to 170 degrees",
        "13.4\" FHD+ (1920x1200), 16:10, IPS-Level, Touchscreen, Support MSI Pen"
    )

    private val laptopProcessor = arrayOf(
        "Intel® Core™ i7-1165G7 (4 core 8 thread, 2,8 GHz up to 4,7 GHz)",
        "Intel Core i7-1165G7 (4C / 8T, 2.8 / 4.7GHz, 12MB)",
        "Intel Core i7 11370H (4 core, 8 thread, 3 GHz up to 4,8 GHz, 12 MB L3 cache)",
        "AMD Ryzen 7 5700U (8 core, 16 thread, 1.8GHz Up to 4.3GHz, 8MB)",
        "Intel Core i7-1165G7 (4 core, 8 thread, 2,8 GHz up to 4,7 GHz)",
        "Intel Core i7-1165G7 (4 core, 8 thread, 2,8 GHz up to 4,7 GHz)",
        "Intel Core i7-1165G7 (4C / 8T, 2.8 / 4.7GHz, 12MB)",
        "AMD Ryzen 7 5800U (8 core, 16 thread, up to 4,4 Ghz)",
        "Intel Core i7-1165G7 (4 core, 8 thread, 2,8 up to 4,7 GHz)",
        "Intel Core i7-1195G7 (4 core, 8 thread, 2,9 GHz up to 5 GHz)",
    )

    private val laptopGraphic = arrayOf(
        "Intel® Iris Xe graphics, NVIDIA® GeForce® MX450, with 2 GB GDDR6",
        "Intel Iris Xe",
        "NVIDIA GeForce RTX3050 (4GB GDDR6)",
        "Nvidia Geforce RTX 3050Ti (4GB GDDR6)",
        "Intel Iris Xe",
        "Intel Iris Xe",
        "NVIDIA GeForce MX450 (2GB GDDR5)",
        "AMD Radeon integrated",
        "Intel Iris Xe",
        "Intel Iris Xe",
    )

    private val laptopRam = arrayOf(
        "16 GB LPDDR4x",
        "16GB soldered memory dual channel, not upgradable",
        "16GB DDR4 onboard",
        "16GB LPDDR4X dual-channel, onboard",
        "8 GB DDR4-3200 MHz RAM (2 x 4 GB)",
        "8 GB DDR4 3200MHz",
        "8GB SO-DIMM DDR4-3200, satu slot kosong SODIMM (up to 32 GB)",
        "16 GB DDR4-3200 MHz RAM (onboard)",
        "16 GB LPDDR4X",
        "16 GB LPDDR4X dual channel, onboard",
    )

    private val laptopStorage = arrayOf(
        "512 GB SSD",
        "1TB SSD M.2 2280 PCIe 3.0x4 NVMe",
        "1TB M.2 NVMe™ PCIe® 3.0 SSD",
        "512 GB SSD PCIe Gen3, 8 Gb/s, NVMe, satu slot kosong NVMe",
        "512 GB PCIe® NVMe™ M.2 SSD",
        "512GB NVMe PCIe Gen3x4 SSD",
        "512GB SSD M.2 2242 PCIe 3.0x4 NVMe, satu slot kosong M.2 2280 SSD",
        "512 GB PCIe® NVMe™ M.2 SSD",
        "512 GB PCIe Gen4, NVMe",
        "512 GB SSD (1x M.2 NVMe PCIe Gen4)",
    )

    private val laptopBattery = arrayOf(
        "70 Wh, 4-cell Li-ion",
        "50Wh",
        "63 Wh",
        "4 cell, 59 Wh",
        "3-cell, 43 Wh Li-ion polymer",
        "3 cell, 52Wh",
        "3 Cell 45Wh",
        "3-cell, 43 Wh Li-ion polymer",
        "4 cell Li-Ion, hingga 15 jam",
        "4-Cell, 70 Wh",
    )

    private val shopeeLink = arrayOf(
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11189120000&af_sub_siteid=34529-2de327865a87443a84c160a952ce67ca--102809&af_viewthrough_lookback=1d&c=4jn8t3nushkb-&is_retargeting=true&keyword=asus%20zenbook%20pro%20duo%20ux482eg%20i7%201165g7&pid=affiliates&utm_campaign=4jn8t3nushkb-&utm_content=34529-2de327865a87443a84c160a952ce67ca--102809&utm_medium=affiliates&utm_source=an_11189120000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-37122b114394490f80fe73800dd10044--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=lenovo%20yoga%20slim%207i%20carbon&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-37122b114394490f80fe73800dd10044--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-f1550318ef10427ab2387028401b8580--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=asus%20vivobook%20pro%2014x%20n7400pc&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-f1550318ef10427ab2387028401b8580--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-9ddc22b1dfd345dfb0f6891c54b664f5--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=acer%20swift%20x%20sfx14&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-9ddc22b1dfd345dfb0f6891c54b664f5--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-b8c72f2a160a4922ad5980433f88f966--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=hp%20pavilion%20x360%2014%20dy0065tu&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-b8c72f2a160a4922ad5980433f88f966--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-9056ffd118c9446e8fbaa840a80abe01--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=msi%20modern%2014%20b11mou&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-9056ffd118c9446e8fbaa840a80abe01--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-39546db049f64b759ed5d06b8ba3177a--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=lenovo%20thinkpad%20e14&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-39546db049f64b759ed5d06b8ba3177a--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-54156087afc94e6686be9af44c7e3def--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=hp%20pavilion%20aero%20laptop%2013-be0002au&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-54156087afc94e6686be9af44c7e3def--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-236e82c3c8104fbba9f60077d443cedf--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=acer%20spin%205%20lite%20sp513&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-236e82c3c8104fbba9f60077d443cedf--102796&utm_medium=affiliates&utm_source=an_11188960000",
        "https://shopee.co.id/search?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11188960000&af_sub_siteid=34529-8bcb6078bb8b4bc69aa4fc5e1e59743f--102796&af_viewthrough_lookback=1d&c=4avki4e7onab-&is_retargeting=true&keyword=msi%20summit%20e13%20flip%20evo&pid=affiliates&utm_campaign=4avki4e7onab-&utm_content=34529-8bcb6078bb8b4bc69aa4fc5e1e59743f--102796&utm_medium=affiliates&utm_source=an_11188960000"
    )

    private val lazadaLink = arrayOf(
        "https://www.lazada.co.id/catalog/?q=Asus%20Zenbook%20Pro%20Duo%20UX482EG%20i7%201165G7&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.3650385bV2XblN&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi4e531g9f0ssrbmi3l&mkttid=clkgi4e531g9f0ssrbmi3l",
        "https://www.lazada.co.id/catalog/?q=Lenovo%20YOGA%20Slim%207i%20Carbon&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.4d556397c2p8sT&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi4c6i1g9f0t7ueghrb&mkttid=clkgi4c6i1g9f0t7ueghrb",
        "https://www.lazada.co.id/catalog/?q=ASUS%20VivoBook%20Pro%2014X%20N7400PC&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.5796162f6kZsMs&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi4e531g9f0ti2mmmvn&mkttid=clkgi4e531g9f0ti2mmmvn",
        "https://www.lazada.co.id/catalog/?q=ACER%20Swift%20X%20SFX14&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.4ca932f4BEqtfj&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi491i1g9f0tr62l5t8&mkttid=clkgi491i1g9f0tr62l5t8",
        "https://www.lazada.co.id/catalog/?q=HP%20Pavilion%20X360%2014%20dy0065TU%20&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.7ec114bcsZuWao&laz_trackid=2:mm_150030203_51200509_2010250508:clkgg3b2n1g9f0u3lhc211&mkttid=clkgg3b2n1g9f0u3lhc211",
        "https://www.lazada.co.id/catalog/?q=MSI%20Modern%2014%20B11MOU&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.27961221uEpBPt&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi4c6f1g9f0udi2lbgp&mkttid=clkgi4c6f1g9f0udi2lbgp",
        "https://www.lazada.co.id/catalog/?q=Lenovo%20Thinkpad%20E14&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.4d517805wln3om&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi4cqj1g9f0umppr9ku&mkttid=clkgi4cqj1g9f0umppr9ku",
        "https://www.lazada.co.id/catalog/?q=HP%20Pavilion%20Aero%20Laptop%2013-be0002AU&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.4b9ce68bRqKQNA&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi496b1g9f0uui1jr05&mkttid=clkgi496b1g9f0uui1jr05",
        "https://www.lazada.co.id/catalog/?q=ACER%20Spin%205%20Lite%20SP513&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.5a4f3f46Eszc3o&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi491i1g9f0v6pllen7&mkttid=clkgi491i1g9f0v6pllen7",
        "https://www.lazada.co.id/catalog/?q=MSI%20Summit%20E13%20Flip&_keyori=ss&from=input&spm=a2o4j.searchlist.search.go.29b64f17Y3fbL2&laz_trackid=2:mm_150030203_51200509_2010250508:clkgi48tp1g9f0vf73oumr&mkttid=clkgi48tp1g9f0vf73oumr"
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
                laptop.screen = laptopScreen[position]
                laptop.processor = laptopProcessor[position]
                laptop.graphic = laptopGraphic[position]
                laptop.ram = laptopRam[position]
                laptop.storage = laptopStorage[position]
                laptop.battery = laptopBattery[position]
                laptop.shopeeLink = shopeeLink[position]
                laptop.lazadaLink = lazadaLink[position]
                laptop.detail = laptopDetails[position]
                laptop.image = laptopImages[position]
                list.add(laptop)
            }
            return list
        }
}