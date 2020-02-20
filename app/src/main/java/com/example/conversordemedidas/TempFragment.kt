package com.example.conversordemedidas


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 */
class TempFragment : Fragment() {

    val unidades: Array<String> = arrayOf("Celsius", "Kelvin", "Fahrenheit")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_temp, container, false)
    }

    override fun onStart() {
        super.onStart()

        val spinner:Spinner
        val adapter = unidades

    }

}
