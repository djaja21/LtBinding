package com.dekkson.Ltbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dekkson.Ltbinding.databinding.LoginfrmBinding

class login : AppCompatActivity() {
    private lateinit var oBinding:LoginfrmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var name: String = ""

        var text:String = ""
        oBinding = LoginfrmBinding.inflate(layoutInflater)
        setContentView(oBinding.root)

        oBinding.btnLogin.setOnClickListener {
            if (oBinding.etxUserName.text.toString().isEmpty()) {
                oBinding.etxUserName.setError("Require User Name")
            }else if (oBinding.etxUserPassword.text.toString().isEmpty()) {
                oBinding.etxUserPassword.setError("Require Password")
            }else{
                Toast.makeText(this, "Name : "+oBinding.etxUserName.text+
                        ", berhasil Login", Toast.LENGTH_SHORT).show()
            }
        }

        oBinding.txvRegister.setOnClickListener {
            val intent :Intent = Intent(this,register::class.java)
            startActivity(intent)
        }

    }
}