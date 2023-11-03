package com.example.treu_beauty.ui.productos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.treu_beauty.databinding.FragmentProductosBinding
import com.example.treu_beauty.databinding.FragmentHomeBinding

class ProductosFragment : Fragment() {

    private var _binding: FragmentProductosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val productosViewModel =
            ViewModelProvider(this).get(ProductosViewModel::class.java)

        _binding = FragmentProductosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.productos
        productosViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}