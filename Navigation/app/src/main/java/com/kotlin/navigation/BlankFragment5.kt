package com.kotlin.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_blank_fragment5.*

class BlankFragment5 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = BlankFragment5Args.fromBundle(arguments).name

        if(name == ""){
            AlertDialog.Builder(activity!!).setMessage("로그인 하자")
                .setPositiveButton("좋아") { dialog, which ->
                    Navigation.findNavController(view).navigate(BlankFragment5Directions.actionBlankFragment5ToLoginFragment().actionId)
                }
                .setNegativeButton("꺼져"){dialog, which ->
                    Navigation.findNavController(view).popBackStack()
                }.show()
        }else{
            studentName.text = name
        }
    }
}
