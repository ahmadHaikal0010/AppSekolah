package com.haikal.appsekolah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.haikal.appsekolah.adapter.AdapterSekolah
import com.haikal.appsekolah.model.ModelSekolah

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listSekolah = listOf<ModelSekolah>(
            ModelSekolah(
                "SMA Negeri 1 Gunung Talang",
                R.drawable.smk1gunungtalang,
                "087557334026",
                "VISI“ Sehat, religius, berkarakter, berwawasan\n" +
                        "MISI\n" +
                        "Lengkapnya sarana pembelajaran yang berwawasan ICT.\n" +
                        "Menciptakan siswa yang cerdas, kreatif inovatif, berkarakter, dan   mampu 90% tamatannya bersaing masuk Perguruan Tinggi terkemuka..\n" +
                        "Mewujudkan 50% Guru berkualifikasi S2.\n" +
                        "Menciptaka Guru yang mampu berbahasa Inggris.\n" +
                        "Menciptakan 80% Guru yang mampu mengembangkan kurikulum sendiri.\n" +
                        "Menciptakan 80% Guru yang mampu menggunakan ICT.\n" +
                        "Menciptakan Pegawai yang melaksanakan tertib administrasi, disiplin dan tepat waktu.\n" +
                        "Terwujudnya sekolah sehat, asri dan menyenangkan.                        \n" +
                        "Tertatanya pengelolaaan administrasi sekolahyang benar sesuai dengan aturan Misi sekolah.",
                -0.86349,
                100.6439325
            ),
            ModelSekolah(
                "SMA NEGERI 3 PADANG",
                R.drawable.smanegeri3padang,
                "07517055655",
                "Sekolah Menengah Atas Negeri 3 Padang juga dikenal sebagai SMANTRI adalah salah satu Sekolah Menengah Atas Negeri yang terletak di Kelurahan Gunung Pangilun, Kecamatan Padang Utara, Kota Padang, Provinsi Sumatera Barat. Sekolah yang beralamat Jalan Gajah Mada Nomor 11 ini sempat menyandang status sebagai rintisan sekolah bertaraf internasional (RSBI) dan mengganti kurikulum pengangan menjadi Kurikulum Cambridge.\n" +
                        "\n" +
                        "Di antaranya tokoh yang merupakan alumni sekolah ini yakni Irwan Prayitno, Endre Saifoel, Irwan Fikri, Andani Eka Putra, Defriman Djafri, Zulhefi Sikumbang, Zulheri Rani, Editiawarman, Dedi Vitra Johor, dan Pras Teguh.",
                -0.9195062,
                100.3620172
            ),
            ModelSekolah(
                "SMA Negeri 2 Lubuk Basung",
                R.drawable.sman2lubukbasung,
                " 0232123456",
                "Visi SMA Negeri 2 Lubuk Basung adalah :\n" +
                        "\n" +
                        "“Bertaqwa, Berwawasan luas, Mandiri dan Peduli Lingkungan dalam semangat Pancasila” Indikator Visi adalah sebagai berikut:\n" +
                        "\n" +
                        "Meningkatkan keimanan dan ketaqwaan warga sekolah.\n" +
                        "Terciptanya lulusan yang memiliki kompetensi sesuai Standar Nasional.,\n" +
                        "Mampu bersaing masuk ke Perguruan Tinggi Negeri yang tersebar di seluruh wilayah Indonesia,\n" +
                        "Terbentuknya disiplin diri, terampil dan berpengetahuan yang mampu menjawab tantangan zaman dalam berbagai prestasi akademik.\n" +
                        "Meningkatnya kegiatan ekstrakurikuler.\n" +
                        "Meningkatnya disiplin dan tata krama.\n" +
                        "Meningkatnya kompetensi tenaga pendidik dan tenaga kependidikan.\n" +
                        "Terwujudnya pengelolaan sekolah yang berbasis MBS.\n" +
                        "Terselenggaranya penilaian hasil belajar secara efektif, objektif dan sistematis.\n" +
                        "Terciptanya budaya peduli terhadap lingkungan sekitar." +
                        "Misi SMA Negeri 2 Lubuk Basung, yaitu :\n" +
                        "\n" +
                        "Menciptakan peserta didik yang taat menjalankan ibadah kepada Tuhan Yang Maha Esa serta berakhlak mulia dengan membiasakan shalat duha, shalat zuhur berjamaah, berdoa sebelum dan sesudah berkegiatan, dan membiasakan 5 S ( senyum, sapa, salam, santun, dan sopan)\n" +
                        "Meningkatkan Pendidikan Agama dan Pengamalannya melalui peringatan hari besar keagamaan\n" +
                        "Membiasakan sikap jujur,disiplin, santun, bertatakrama, dan mandiri\n" +
                        "Mengasah kemampuan kognitif, psikomotor dan afektif sehingga mampu bertahan dalam berbagai keadaan\n" +
                        "Meningkatkan kualitas pembelajaran dan bimbingan secara efektif sehingga setiap peserta didik berkembang secara optimal sesuai dengan potensi yang dimiliki\n" +
                        "Menghasilkan lulusan yang mampu berkompetensi di bidang akademik dan non akademik\n" +
                        "Mengoptimalkan Proses Pembelajaran untuk Tahun Pelajaran 2022/2023\n" +
                        "Meningkatkan Nilai Assesment Kompetensi Minimum ( AKM ) untuk Tahun Pelajaran 2022/2023\n" +
                        "Memberdayakan pendidik dan tenaga kependidikan\n" +
                        "Meningkatkan kegiatan Ekstrakurikuler dan Pengamalannya.\n" +
                        "Meningkatkan kesadaran warga sekolah untuk lebih peduli terhadap lingkungan dan memperoleh penghargaan sekolah Asean Echo School untuk tahun 2022.\n" +
                        "Mengujudkan sekolah sebagai wadah daya kreasi, inovasi untuk perkembangan teknologi ramah lingkungan",
                -0.3126634,
                100.0293347
            ),
            ModelSekolah(
                "SMA Negeri 1 Bukittinggi",
                R.drawable.sman1bukittinggi,
                "075222549",
                "SMA Negeri 1 Bukittinggi adalah sekolah menengah atas berstatus negeri tertua di Kota Bukittinggi. Sekolah ini terletak di Jalan Syekh M. Jamil Jambek No. 36, Kelurahan Pakan Kurai, Kecamatan Guguk Panjang, Kota Bukitinggi, Sumatera Barat. Sekolah ini sempat berstatus Rintisan Sekolah Bertaraf Internasional (RSBI) yang dimulai sejak tahun 2006 dan termasuk 5 R-SMABI pertama di Indonesia. SMA Negeri 1 Bukittinggi berasal dari pecahan SMA Negeri ABC Bukittinggi yang didirikan di Birugo pada tahun 1856 bertepatan pada masa-masa awal Kebangkitan Nasional yang pada masa itu pendidikan adalah hal yang sangat dibutuhkan oleh masyarakat. Sekolah ini berdiri atas prakarsa dr. A. Roesma.\n" +
                        "\n" +
                        "Pada saat Agresi Militer Belanda II, sekitar tahun 1949, SMA Negeri ABC Bukittinggi terpaksa dibubarkan, sebab pada saat itu sebagian guru dan siswanya terpaksa mengungsi ke daerah pedalaman. Meskipun begitu, pemerintah kolonial tetap membenarkan pendirian sekolah menengah secara terbatas yang pada saat itu dipimpin oleh Jaka Dt. Sati dan dibantu beberapa orang guru yang pada saat itu tidak ikut mengungsi.\n" +
                        "\n" +
                        "Setelah penyerahan kedaulatan terhadap negara Republik Indonesia, sejarah SMA Negeri ABC Bukittinggi kembali berlanjut di bawah kepemimpinan A. Manan St. Panghulu. Tenaga pendidik sekolah itu sendiri merupakan gabungan antara tenaga pendidik yang berasal dari luar kota (Guru Republik) ditambah dengan guru-guru yang menetap di Kota Bukittinggi (Guru Federal). Peserta didik SMA Negeri ABC Bukittinggi umumnya berasal dari seluruh daerah yang ada di Sumatra Tengah. Sesudah kepemimpinan A. Manan St Panghulu, terjadi beberapa kali pertukaran pimpinan sekolah, diantaranya M. Nazir St. Mudo, yang sebelumnya merupakan mantan Direktur SMA Negeri B Yogyakarta. Pada masa kepemimpinan nya, perkembangan murid-murid SMA Negeri ABC Bukittinggi mulai mengalami peningkatan, dengan jumlah kelas seluruhnya 16 buah. Bahkan pada saat itu, banyak siswa tamatan SMP dari seluruh Sumatra Tengah tidak dapat tertampung lagi di SMA Negeri ABC Bukittinggi.\n" +
                        "\n" +
                        "Sesudah kepemimpinan M. Nazir St. Mudo, jabatan kepala sekolah dilanjutkan oleh Sabirin St. Rajo Ameh. Pada masa pemerintahan dia, SMA Negeri ABC Bukittinggi, dibagi menjadi dua, yaitu SMA Negeri IB serta SMA Negeri II/AC, Bukittinggi. Di mana ketika itu SMA Negeri IB yang dipimpin oleh Bais St. Sinaro, sementara SMA Negeri II/AC dipimpin oleh Adam Saleh.\n" +
                        "\n" +
                        "Pada awalnya, seluruh kegiatan SMA Negeri ABC Bukittinggi dipusatkan di Birugo, yaitu bekas gedung Sekolah Raja (Kweekschool) serta Sekolah Negeri (Prifaatschool), yang ketika itu masih ditempati oleh SMA 2 dan SMA 3 Bukittinggi. Pada tahun 1957, Pemerintah Pusat Bukittinggi kemudian memutuskan untuk memindahkan SMA Negeri IB. Sejarah sekolah ini dimulai dengan pembangunan Gedung Induk berlantai tiga pada tahun 1957 di sebuah daerah pertanian yang sejuk, yang di dalam bahasa Belanda disebut Landbouw yang juga berarti pertanian. Biaya pembangunan fisik gedung seluruhnya merupakan hasil dari harta rampasan perang Belanda dan Jepang yang pada saat itu masih menjajah Indonesia. Pembangunan gedung baru rampung tiga tahun kemudian yaitu pada tahun 1959 ditandai dengan peresmian dan penggunaan gedung baru pada tanggal 23 Juli 1959.\n" +
                        "\n" +
                        "Pada tahun 2006, sekolah ini mendapat status baru sebagai Rintisan Sekolah Berstandar Internasional dan merupakan 5 R-SMABI pertama di Indonesia.\n" +
                        "\n" +
                        "Pada tahun 2013, berdasarkan keputusan Badan Akreditasi Provinsi Sekolah/Madrasah Sumatera Barat (BAP-SM SUMBAR) No. 1145/BAP-SM/LL/XII/2013, SMA Negeri 1 Bukittinggi berhasil memperolah Nilai Akhir Akreditasi Sekolah Tertinggi di Provinsi Sumatera Barat dengan nilai 93.70 (Amat Baik). Penilaian ini diukur dari delapan komponen penilaian, yaitu: isi, proses, lulusan, tenaga pendidik, sarana dan prasarana, pengelolaan, pembiayaan, dan penilaian.[1]\n" +
                        "\n" +
                        "Pada tanggal 9 Desember 2014, Dinas Pendidikan, Pemuda, dan Olahraga dibawah naungan Pemerintah Daerah menetapkan sekolah ini sebagai Sekolah Unggul jenjang sekolah menengah tingkat atas.[3]\n" +
                        "\n" +
                        "Pada tahun 2015, sekolah ini mendapatkan predikat sebagai Sekolah Berintegritas Ujian Nasional dengan nilai Indeks Integritas Ujian Nasional (IIUN) sekolah menengah atas tertinggi di Provinsi Sumatera Barat.[4][5]",
                -0.3029732,
                100.371308
            ),
            ModelSekolah(
                "SMA Negeri 2 Bukittinggi",
                R.drawable.sman2bukittinggi,
                "02157903020",
                "SMA Negeri 2 Bukittinggi, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Provinsi Sumatera Barat, Indonesia. Sekolah ini merupakan sekolah tertua di Bukittinggi dan salah satu sekolah tertua di Indonesia. Seperti SMA pada umumnya di Indonesia, masa pendidikan sekolah di SMAN 2 Bukittinggi ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
                -0.3165517,
                100.371931
            ),
            ModelSekolah(
                "SMA Negeri 1 Lubuk Basung",
                R.drawable.sman1lubas,
                "075276021",
                "VISI\n" +
                        "\n" +
                        "      Berakhlak Mulia, Berprestasi, Unggul dalam Mutu dan Peduli Lingkungan.\n" +
                        "\n" +
                        "      Indikator pencapaian visi :\n" +
                        "\n" +
                        "Memiliki budi pekerti luhur dan melaksanakan ibadah sesuai dengan agama masing- masing.\n" +
                        "Memiliki sopan santun dalam berbagai kehidupan.\n" +
                        "Berprestasi dalam bidang Akademik maupun non Akademik.\n" +
                        "Unggul dalam inovasi pembelajaran.\n" +
                        "Unggul dalam pengembangan kurikulum.\n" +
                        "Mempunyai pendidik yang berkualitas dan berkualifikasi S1 dan S\n" +
                        "Melaksanakan pembelajaran serta penilaian dengan baik.\n" +
                        "Menerapkan pembelajaran multi metode dan multi\n" +
                        "Memiliki sarana prasarana yang sesuai dengan kebutuhan proses pembelajaran dan aktif dalam melaksanakan kegiatan ekstrakurikuler.\n" +
                        "Menggalang dana untuk menunjang proses pembelajaran dan menerapkan manajemen yang bersifat transparan, kreatif dan partisipatif.\n" +
                        "Membudayakan bersih dan cinta lingkungan.\n" +
                        "Membudayakan pemanfaatan barang–barang bekas menjadi barang yang berguna.\n" +
                        " \n" +
                        "\n" +
                        "MISI\n" +
                        "\n" +
                        "      SMA N 1 Lubuk Basung mempunyai misi sebagai berikut :\n" +
                        "\n" +
                        "Menciptakan budaya Islami secara menyeluruh dalam kegiatan pembelajaran.\n" +
                        "Memaksimalkan peserta didik agar mampu memasuki berbagai Perguruan Tinggi Negeri I\n" +
                        "Meningkatkan pembinaan peserta didik untuk mengikuti berbagai lomba akademik dan non a\n" +
                        "Meningkatkan kualitas pendidik dan tenaga kependidikan.\n" +
                        "Meningkatkan personal yang tangguh dan mempunyai kompetensi yang baik pada setiap bidang akademik.\n" +
                        "Mengoptimalkan penggunaan sarana dan prasarana keagamaan dalam kegiatan sekolah.\n" +
                        "Mnghendaki warganya menjafi handal dalam berbagai bidang.\n" +
                        "Pendidik dapat memaksimalkan pengembangan dan pelaksanaan perangkat pembelaja\n" +
                        "Pendidik dapat melaksanakan penilaian pembelajaran sesuai dengan standar penilaian nasional.\n" +
                        "Sekolah dapat mengoptimalkan pemanfaatan perpustakaan.\n" +
                        "Sekolah dapat melengkapi sarana dan prasarana sesuai dengan kebutuhan pembelajaran.\n" +
                        "Membudayakan 5 menit bersih sebelum pembelajaran dimulai.\n" +
                        "Membudayakan membuang sampah pada",
                -0.3278864,
                100.0554462
            ),
            ModelSekolah(
                "SMA Negeri 3 Lubuk Basung",
                R.drawable.sman3lubas,
                "075276458",
                "Visi\n" +
                        "\n" +
                        "”Bertaqwa, Cerdas, Mandiri, Berbudaya, Berorientasi IPTEK Dan Berwawasan Lingkungan”\n" +
                        "\n" +
                        "Misi\n" +
                        "\n" +
                        "Membentuk peserta didik berperilaku religius sehingga dapat menghayati dan mengamalkan ajaran agama yang dianutnya dalam segala aspek kehidupan.\n" +
                        "Meningkatkan potensi, kecerdasan dan minat peserta dididk sesuai dengan tingkat perkembangan.\n" +
                        "Membina peserta didik unggul dalam prestasi akademik dan non akademik.\n" +
                        "Meningkatkan profesionalisme pendidik dalam rangka meningkatkan kualitas proses dan hasil belajar peserta didik.\n" +
                        "Melaksanakan pembelajaran yang dapat menumbuhkan kembangkan sikap kemandirian peserta didik.\n" +
                        "Mengembangkan life skil peserta didik melalui kegiatan intra kurikuler dan ekstrakurikuler.\n" +
                        "Membudayakan disiplin, toleransi, saling menghargai, percaya diri, sehingga terbentuk sikap peserta didik yang santun dan berbudipekerti luhur.\n" +
                        "Membudayakan literasi melalui intrakurikuler dan proyek profil pelajar Pancasila.\n" +
                        "Membentuk peserta didik yang mampu mengembangkan budaya daerah.\n" +
                        "Mengembangkan semangat kebangsaan yang berakar pada nilai budaya bangsa dan tetap mengikuti perkembangan ilmu pengetahuan dan teknologi.\n" +
                        "Meningkatkan proses pembelajaran yang unggul dalam Ilmu pengetahuan dan teknologi.\n" +
                        "Mengembangkan karakter peserta didik melalui pembelajaran yang berbasis kearifan lingkungan dan pengembangan kultur sekolah.\n" +
                        "Menciptakan lingkungan sekolah yang kondusif diukur dari terlaksananya Proses Belajar Mengajar dengan nyaman dan lancar.\n" +
                        "Meningkatkan manajemen sekolah diukur dari terintegrasi nya komunikasi unsur pimpinan sekolah dengan jajaran komite dan orang tua murid.\n" +
                        "Menetapkan Grand Desain 4 Tahun Kedepan\n" +
                        "Program Sukses Sekolah Keunggulan Global (English Club dan Kampus Inggris).\n" +
                        "Program Literasi Sekolah.\n" +
                        "Program Tahfiz dan Pembinaan Karakter.\n" +
                        "Program Persiapan Sekolah Berasrama (Boarding).\n" +
                        "Menambah Program Unggulan Sekolah\n" +
                        "Program Tahfiz dan Pembinaan Karakter.\n" +
                        "Program Sekolah Berbasis Kewirausahaan.\n" +
                        "Mensosialisasikan Perubahan Visi, Misi, Grand Desain 4 Tahun dan Program Unggulan Sekolah kepada warga sekolah, Komite, Pengawas, Orang Tua Murid dan Cabang Dinas Wilayah I.\n" +
                        "Menyusun RKJM, RKT, RKAS, dan RAPBS",
                -0.315253,
                99.967839
            ),
            ModelSekolah(
                "SMA Negeri 4 Pariaman",
                R.drawable.sman4pariaman,
                "0751690977",
                "SMAN 4 Pariaman adalah sebuah sekolah SMA negeri yang beralamat di Jl. Siti Manggopoh, Kota Pariaman.\n" +
                        "\n" +
                        "SMA negeri ini memulai kegiatan pendidikan belajar mengajarnya pada tahun 2004. Pada waktu ini SMA Negeri 4 Pariaman mengimplementasikan panduan kurikulum belajar SMA 2013 Bhs&Budaya. SMAN 4 Pariaman dibawah komando seorang kepala sekolah dengan nama Desi Susanti dan operator sekolah Mardaleni.",
                -0.587951,
                100.0999892
            ),
            ModelSekolah(
                "SMA Negeri 1 Padang Panjang",
                R.drawable.sman1padangpanjang,
                "075283208",
                "SMA Negeri (SMAN) 1 Padang Panjang, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Provinsi Sumatera Barat, Indonesia. Sama dengan SMA pada umumnya di Indonesia, masa pendidikan sekolah di SMAN 1 Padang Panjang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.\n" +
                        "\n" +
                        "Pada tahun 2007, sekolah ini menggunakan Kurikulum Tingkat Satuan Pendidikan sebelumnya dengan KBK.[1] [butuh rujukan]\n" +
                        "\n" +
                        "Sejarah Sekolah\n" +
                        "Sekolah ini Awalnya dibangun sebagai Sekolah Guru atau Noormal School oleh Pemerintah Kolonial Hindia Belanda di tahun 1918.[1] Noormal School diperuntukkan untuk siswa tamatan kelas V dari sekolah rendah pribumi tingkat II seperti Vervolgschool atau Standaardschool selama kurun waktu 4 tahun pendidikan dengan bahasa daerah sebagai bahasa pengantar di kelas. Lulusan dari sekolah ini ditempatkan sebagai guru di Tweede Inlandse School atau TIS (sekolah rendah pribumi.)\n" +
                        "\n" +
                        "Pada tahun 1926, Kota Padangpanjang mengalami gempa bumi dahsyat yang meluluhlantakkan kota, namun melihat foto sekolah di tahun kejadian, kemungkinan sekolah ini hanya mengalami beberapa kerusakan kecil yang tidak berpengaruh besar terhadap struktur bangunan.",
                -0.4636077,
                100.4035545
            ),
            ModelSekolah(
                "SMA Negeri 4 Padang",
                R.drawable.sman4padang,
                "075171361",
                "SMA Negeri 4 Padang adalah sekolah menengah atas negeri yang terletak di Kelurahan Lubuk Begalung Nan XX, Kecamatan Lubuk Begalung, Kota Padang. Sekolah ini beralamat di Jalan Linggarjati Nomor 1, yang merupakan ujung dari Jalan Dalam Gaduang[3] yang dimulai dari Simpang Tugu Lubuk Begalung. Bersama SMA Negeri 1 Padang, SMA Negeri 2 Padang, SMA Negeri 3 Padang, SMA Negeri 7 Padang, SMA Negeri 10 Padang, SMA Semen Padang, dan SMA Don Bosco Padang, sekolah ini dicanangkan sebagai sekolah percontohan (piloting) yang menggunakan Kurikulum 2013 untuk Kota Padang.[4]\n" +
                        "\n" +
                        "Pada tahun ajaran 2013/2014, SMA Negeri 4 Padang berhasil meraih peringkat ke-2 nilai akhir ujian nasional tingkat SMA se-Sumatera Barat.[5] Selama tiga tahun berturut-turut (2011-2013), SMA Negeri 4 Padang mengirimkan siswanya sebagai Paskibraka tingkat nasional.[6] Pada tahun 2015, sekolah ini meluluskan 175 siswa SMA Negeri 4 Padang melalui jalur SNMPTN 2015. Hasil kelulusan SNMPTN pada tahun 2015 merupakan yang tertinggi di Sumatera Barat.[butuh rujukan] Secara keseluruhan pada 2015, 94% lulusan sekolah ini melanjutkan ke perguruan tinggi negeri (PTN).[3]\n" +
                        "\n" +
                        "Sejarah\n" +
                        "SMA Negeri 4 Padang dirintis pada 1969 dengan diadakannya beberapa kali rapat tokoh masyarakat Kecamatan Lubuk Begalung di Gedung SMP Rimbo Datar Kecamatan Lubuk Kilangan (kini SMP Negeri 11 Padang) . Pendirian SMA dibutuhkan mengingat kesulitan masyarakat Padang Luar Kota — wilayah Kabupaten Padang Pariaman di sekitar Kota Padang sebelum 1980[7] — untuk melanjutkan pendidikan lebih tinggi. Saat itu hanya ada satu SMA negeri di pusat Kota Padang yaitu SMA Negeri 1 Padang.[8]\n" +
                        "\n" +
                        "Pada 1970, untuk pertama kali berdiri SMA Padang Luar Kota dengan meminjam gedung SMP Rimbo Datar. Guru SMP Rimbo Datar dan beberapa SMA lain di Kota Padang menjadi tenaga pengajar awal di sekolah ini.[8]\n" +
                        "\n" +
                        "Pada 1975 SMA Padang Luar Kota berganti nama menjadi SMA Lubuk Begalung dipimpin oleh Nazan Arif yang kemudian menjadi ketua yayasan. Sekolah ini dikukuhkan dengan akte notaris nomor 23 tertanggal 16 Maret 1976.[9] SMA Lubuk Begalung beroperasi dengan bantuan guru dan administrator dari SMP Lubuk Begalung. Drs. Syamsudin menjabat kepala sekolah SMA yang juga merangkap sebagai Kepala Sekolah SMP Lubuk Begalung. Syamsudin dibantu oleh AA. Ranasti dan Kaidir, BA sebagai wakil kepala sekolah. Selanjutnya pada tahun 1978, SMA Lubuk Begalung menjadi filial SMA Negeri 2 Padang.[8][10][11]\n" +
                        "\n" +
                        "Pada tahun 1979, gedung Sekolah Filial SMA Negeri 2 Padang dipindahkan ke lokasi saat ini. Guru-guru yang mengajar di sekolah ini adalah Drs. Helmi Mukhtar, Dra. Rohana Amir, Ermanida Yusuf, Nurma Roslan, Nuriah Nur, Misnar, Mardiati, dan Muslaini.[8][10][11]\n" +
                        "\n" +
                        "Dengan tercukupinya syarat menjadi sekolah tunggal, maka pada 15 Agustus 1979, Direktur Pendidikan Menengah Umum Ditjen Dikdasmen Depdikbud mengusulkan penunggalan SMA Lubuk Begalung Filial SMA Negeri II Padang. Hal ini didasarkan surat persetujuan Bupati Kepala Daerah (KDH) Tingkat II Padang Pariaman, Gubernur KDH Tingkat I Sumatera Barat, Kepala Bidang Pendidikan Menengah Umum, dan Kepala Kantor Wilayah Departemen Pendidikan dan Kebudayaan Sumatera Barat. Persyaratan seperti jumlah kelas, murid, persyaratan guru, animo masyarakat untuk kelangsungan sekolah, memiliki gedung sendiri, dan teknis edukatif sudah dipenuhi.[9]\n" +
                        "\n" +
                        "Berdasarkan Peraturan Pemerintah (PP) Nomor 17 Tahun 1980 tentang Perubahan Batas Wilayah Kotamadya Daerah Tingkat II Padang, maka wilayah Kecamatan Lubuk Begalung bersama beberapa kecamatan di wilayah Padang Luar Kota yang sebelumnya berada pada Pemerintah Kabupaten Padang Pariaman selanjutnya beralih dan bergabung dengan Pemerintah Kota Padang. Pada 31 Januari 1981, SMA Lubuk Begalung resmi berganti nama menjadi SMA Negeri 4 Padang hingga saat ini. Perkembangan selanjutnya berlangsung pada 1984–1990 di mana gedung sekolah ditambahkan beberapa ruang kelas.[8][10][11]\n" +
                        "\n" +
                        "Pada 2001–2005, sekolah ini terus mengalami kemajuan dengan sarana dan prasarana yang cukup. Pada 2005–2008, SMA Negeri 4 Padang menambah bangunan dengan ruangan kelas dan, ruangan, guru, dan ruangan kepala sekolah. Pada 2008–2014 sekolah ini berhasil membangun ruang kelas baru bertingkat. Sejak 2014, sekolah mengalami perkembangan pesat. Dalam kurun waktu 2014 hingga 2016, SMA Negeri 4 Padang berhasil meluluskan ke perguruan tinggi negeri terbanyak melalui jalur SNMPTN, peringkat tiga besar se-Kota Padang pada perolehan rerata nilai evaluasi murni (NEM) empat tahun berturut-turut dan peringkat enam se-Sumatera Barat pada Ujian Nasional (UN) 2017, dan peringkat keempat di Kota Padang pada Ujian Nasional Berbasis Komputer (UNBK) 2018. Prestasi siswa, guru dan tenaga pendidik terus bergulir karena deklarasi moto juang “GO..FIGHT...WIN...!!\" dan tag name SMANTSE (Tse artinya empat dalam bahasa Mandarin) untuk julukan SMAN 4 Padang. Dengan moto juang itu lahir program Tradisi Senin Berprestasi dari siswa dan GTK sampai saat ini. Artinya sekolah mempunyai target satu piala atau penghargaan setiap hari Senin. Pada tahun 2017 SMAN 4 Padang berhasil mempertahankan predikat terakreditasi A dengan kategori unggul.[10][11]\n" +
                        "\n" +
                        "Sejak 2018, SMA Negeri 4 Padang melakukan pembenahan sedikit demi sedikit. Mulai dari sarana, prasarana, administrasi, kedisiplinan dan hal-hal kecil lainnya untuk menuju sekolah yang lebih baik lagi.",
                -0.9596188,
                100.3988656
            )
        )

        val adapterSekolah = AdapterSekolah(listSekolah)

        val rv_sekolah : RecyclerView = findViewById(R.id.rv_sekolah)
        rv_sekolah.adapter = adapterSekolah

        rv_sekolah.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}