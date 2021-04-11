package com.example.upschool_bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_sum_result.view.*
import kotlinx.android.synthetic.main.fragment_summation.view.*

class SumResultFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val design = inflater.inflate(R.layout.fragment_sum_result, container, false)

        val bundle: SumResultFragmentArgs by navArgs()

        val result = bundle.result

        design.textViewSumResult.text = "Summation Result: $result"

        return design
    }

}