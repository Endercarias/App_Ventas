package com.example.ventas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_principal.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val producto1= Producto("carne", 20,10.00,200.00 )
        val producto2=Producto("leche", 10, 10.00,100.00)
        val listaProductos = listOf(producto1, producto2)
        val adapter=ProductoItemAdapter(this, listaProductos)

        listViewProductos.adapter = adapter

    }

    fun onContinuar(view: View) {
        val intentContinuar = Intent(this, Principal::class.java)
        startActivity(intentContinuar)
    }

    fun Agregar() {
        btnagregar.setOnClickListener {
            Log.i("Click","has hecho un click")
        }
    }



}