package br.com.iq.mcapp

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity


@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    // Propriedade para acessar o contexto de qualquer lugar
    protected val context: Context get() = this
    // Métodos comuns para todas activities aqui...

}
