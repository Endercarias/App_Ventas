package com.example.ventas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.producto_layout.view.*

class ProductoItemAdapter (
    private val mContext: Context,
    private val listaproductos: List<Producto>): ArrayAdapter<Producto>(
        mContext, 0,
        listaproductos )
    {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var productosLayout = LayoutInflater.from(mContext).inflate(R.layout.producto_layout, parent, false)
            productosLayout.nombre.text=listaproductos.get(position).nombre
            productosLayout.cantidad.text=  "${listaproductos.get(position).cantidad}"
            productosLayout.precio.text=  "Q. ${listaproductos.get(position).precio}"
            productosLayout.total.text=  "Q. ${listaproductos.get(position).total}"
            return productosLayout

        }
    }