package com.kotlin.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        one.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToBlankFragment().setText("멋있네요!!")
            Navigation.findNavController(it).navigate(action)
        }

        two.setOnClickListener {
            Navigation.findNavController(it).navigate(MainFragmentDirections.actionMainFragmentToBlankFragment3().actionId)
        }

        three.setOnClickListener {
            Navigation.findNavController(it).navigate(MainFragmentDirections.actionMainFragmentToBlankFragment4().actionId)
        }
    }
}
