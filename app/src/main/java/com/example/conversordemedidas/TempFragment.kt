package com.example.conversordemedidas


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.conversordemedidas.R.array.temperaturas
import com.example.conversordemedidas.R.id.spinner1
import com.example.conversordemedidas.R.id.spinner2
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_temp.*

/**
 * A simple [Fragment] subclass.
 */
class TempFragment : Fragment(), AdapterView.OnItemSelectedListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_temp, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnConverteTemp.setOnClickListener{convertTemp()}
        val spinner:Spinner = view.findViewById(R.id.spinner1)
        ArrayAdapter.createFromResource(
            this,
            temperaturas,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }
    fun convertTemp() {
        when(R.id.spinner1){
            0-> {
                if (R.id.spinner2 == 1) txtResult.text = "${(R.id.valBase + 273.15).toFloat()} K"
                if (R.id.spinner2 == 2)  txtResult.text = "${(R.id.valBase*(9/5)+32).toFloat()} °F"
            }
            1->{
                if(R.id.spinner2 == 0) txtResult.text = "${(R.id.valBase - 273.15).toFloat()} °C"
                if(R.id.spinner2 == 2) txtResult.text = "${((R.id.valBase - 273.15)*(9/5)+32).toFloat()} °F"
            }
            2->{
                if(R.id.spinner2 == 0) txtResult.text = "${((R.id.valBase - 32)*(5/9)).toFloat()} °C"
                if(R.id.spinner2 == 1) txtResult.text = "${((R.id.valBase - 32)*(5/9)+273.15).toFloat()} K"
            }
            else -> txtResult.text = "You are a Genius!!!"
        }

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}



