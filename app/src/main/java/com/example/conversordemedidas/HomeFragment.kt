package com.example.conversordemedidas


import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        view.findViewById<ImageView>(R.id.btnComp).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.btnPeso).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.btnTemp).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
    when(v!!.id){
        R.id.btnComp->navController!!.navigate(R.id.action_homeFragment_to_compFragment)
        R.id.btnPeso->navController!!.navigate(R.id.action_homeFragment_to_pesoFragment)
        R.id.btnTemp->navController!!.navigate(R.id.action_homeFragment_to_tempFragment)
    }
    }

}
