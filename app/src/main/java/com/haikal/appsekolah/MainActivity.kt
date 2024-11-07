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
                "SMK Negeri 1 Gunung Talang",
                R.drawable.smk1gunungtalang,
                "+62 755 7334026",
                "Kapolres Solok Kasat Binmas AKP Edwin. S,H, Senin (21/10/2024) memimpin upacara bendera di Sekolah Menengah Kejuruan (SMK) Negeri 1 ",
                -0.991389,
                100.611523
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