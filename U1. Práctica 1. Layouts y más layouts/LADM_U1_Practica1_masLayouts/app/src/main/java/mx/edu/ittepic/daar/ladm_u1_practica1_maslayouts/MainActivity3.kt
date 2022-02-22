package mx.edu.ittepic.daar.ladm_u1_practica1_maslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.daar.ladm_u1_practica1_maslayouts.databinding.ActivityMain3Binding
import mx.edu.ittepic.daar.ladm_u1_practica1_maslayouts.databinding.FragmentFirstBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reservar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("ATENCION")
                .setMessage("La reservacion se ha generado")
                .setNeutralButton("ACEPTAR", {d,i-> d.dismiss() })
                .show()
        }

        binding.salir.setOnClickListener {
            finish()
        }
    }
}