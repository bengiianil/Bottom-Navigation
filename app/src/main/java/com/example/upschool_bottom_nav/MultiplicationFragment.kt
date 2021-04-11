package com.example.upschool_bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_multiplication.*
import kotlinx.android.synthetic.main.fragment_multiplication.view.*
import kotlinx.android.synthetic.main.fragment_summation.*

class MultiplicationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val design = inflater.inflate(R.layout.fragment_multiplication, container, false)

        design.buttonMult.setOnClickListener {

            val incomingData1 = editTextNum3.text.toString()
            val incomingData2 = editTextNum4.text.toString()

            var result:Int = incomingData1.toInt()*incomingData2.toInt()

            val incomingData = MultiplicationFragmentDirections.multToResult(result)

            Navigation.findNavController(it).navigate(incomingData)
        }

        return design
    }

}