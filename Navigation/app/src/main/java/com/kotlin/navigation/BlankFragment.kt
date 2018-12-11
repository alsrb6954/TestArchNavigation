package com.kotlin.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)=
        inflater.inflate(R.layout.fragment_blank, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // MainFragmentDirections.actionMainFragmentToBlankFragment().arguments
        tv.text = BlankFragmentArgs.fromBundle(arguments).text

    }



}
