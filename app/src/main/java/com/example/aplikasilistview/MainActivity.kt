package com.example.aplikasilistview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = mutableListOf<Novel>()

        list.add(Novel("Brianna dan Bottomwise", " By Andrea Hirata." , R.drawable.brianna))
        list.add(Novel("Terdidik (Educated) - Sebuah Memoar",  "By Tara Westover." , R.drawable.terdidik))
        list.add(Novel("Man Boy", " By Alia Zaela." , R.drawable.manboy))
        list.add(Novel("Tiga Dalam Kayu", " By Ziggy Zezsyazeoviennazabrizkie." , R.drawable.tigadalamkayu))
        list.add(Novel("Tempat Paling Liar di Muka Bumi","By Theoresia Rumthe & Weslly Johannes." , R.drawable.liar))

        listView.adapter = NovelFiksi( this, R.layout.listnovel, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Kamu Memilih Novel Brianna dan Bottomwise", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu Memilih Novel Terdidik (Educated) - Sebuah Memoar", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu Memilih Novel Man Boy", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu Memilih Novel Tiga Dalam Kayu", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu Memilih Novel Tempat Paling Liar di Muka Bumi", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah Anda yakin ingin keluar?")
            .setPositiveButton("Yes",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("No",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            .show()
    }
}