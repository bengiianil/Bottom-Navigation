package com.example.upschool_bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_mult_result.view.*
import kotlinx.android.synthetic.main.fragment_sum_result.view.*

class MultResultFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val design = inflater.inflate(R.layout.fragment_mult_result, container, false)

        val bundle: MultResultFragmentArgs by navArgs()

        val result = bundle.result

        design.textViewMultResult.text = "Multiplication Result: $result"

        return design
    }

}