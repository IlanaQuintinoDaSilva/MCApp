package br.com.iq.mcapp

import android.content.Intent
import android.os.Bundle
import br.com.iq.mcapp.fingerprint.FingerprintActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        bCadBiometria.setOnClickListener { onClickCadBiometria()}
    }

    private fun onClickCadBiometria(){
        val intent = Intent(context, FingerprintActivity::class.java)
        startActivity(intent)

    }
}
