package com.example.aplikasilistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class NovelFiksi(var mContext: Context, var resources: Int, var items:List<Novel>): ArrayAdapter<Novel>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.photo)
        val NovelFiksi:TextView = view.findViewById(R.id.tvNovel)
        val Deskripsi:TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Novel = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        NovelFiksi.text = mItem.novel
        Deskripsi.text = mItem.deskripsi
        return view
    }
}