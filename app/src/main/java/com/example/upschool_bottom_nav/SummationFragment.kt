package com.example.upschool_bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_summation.*
import kotlinx.android.synthetic.main.fragment_summation.view.*

class SummationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val design = inflater.inflate(R.layout.fragment_summation, container, false)

        design.buttonSum.setOnClickListener {

            val incomingData1 = editTextNum1.text.toString()
            val incomingData2 = editTextNum2.text.toString()

            var result:Int = incomingData1.toInt()+incomingData2.toInt()

            val incomingData = SummationFragmentDirections.sumToResult(result)

            Navigation.findNavController(it).navigate(incomingData)
        }

        return design
    }

}

