package mx.edu.ittepic.daar.ladm_u1_practica1_maslayouts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.edu.ittepic.daar.ladm_u1_practica1_maslayouts.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    var vectorImagenes = arrayOf(R.drawable.imagen1,R.drawable.imagen2,R.drawable.imagen3,R.drawable.imagen4,R.drawable.imagen5,R.drawable.imagen6,R.drawable.imagen7)
    var vectorLugar = arrayOf("Playa los muertos","Playa nuevo vallarta","Cerro los monos","Islas Marietas","Playa punta de mita","Santuario de cocodrilos el cora","Santa Maria del oro")
    var indice = 0
    var indice2 = 0

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.anterior.setOnClickListener {
            indice--
            if (indice < 0) indice = vectorImagenes.size - 1
            binding.imagenes.setImageResource(vectorImagenes[indice])
            indice2--
            if (indice2 < 0) indice2 = vectorLugar.size - 1
            binding.lugar.setText(vectorLugar[indice2])
        }

        binding.siguiente.setOnClickListener {
            indice++
            if (indice == vectorImagenes.size) indice = 0
            binding.imagenes.setImageResource(vectorImagenes[indice])
            indice2++
            if (indice2 == vectorLugar.size) indice2 = 0
            binding.lugar.setText(vectorLugar[indice2])
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}