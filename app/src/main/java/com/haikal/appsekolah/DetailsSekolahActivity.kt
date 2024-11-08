package com.haikal.appsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.haikal.appsekolah.databinding.ActivityDetailsSekolahBinding

class DetailsSekolahActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityDetailsSekolahBinding
    private lateinit var namaSekolah : TextView
    private lateinit var gambarSekolah : ImageView
    private lateinit var deskripsiSekolah : TextView
    private lateinit var detailLokasi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsSekolahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        namaSekolah = findViewById(R.id.namaSekolah)
        gambarSekolah = findViewById(R.id.gambarSekolah)
        deskripsiSekolah = findViewById(R.id.deskripsiSekolah)
        detailLokasi = findViewById(R.id.detailLokasi)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val nama = intent.getStringExtra("namaSekolah")
        val gambar = intent.getIntExtra("gambarSekolah", 0)
        val deskripsi = intent.getStringExtra("deskripsiSekolah")
        val lattitude = intent.getDoubleExtra("lattitude", 0.0)
        val longitude = intent.getDoubleExtra("longitude", 0.0)

        namaSekolah.text = nama
        gambarSekolah.setImageResource(gambar)
        deskripsiSekolah.text = deskripsi

        detailLokasi.setOnClickListener() {
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("namaSekolah", nama)
            intent.putExtra("lattitude", lattitude)
            intent.putExtra("longitude", longitude)
            startActivity(intent)
        }

        // Add a marker in Sydney and move the camera
        val koordinat = LatLng(lattitude, longitude)
        mMap.addMarker(MarkerOptions().position(koordinat).title(nama))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(koordinat, 14F))
    }
}