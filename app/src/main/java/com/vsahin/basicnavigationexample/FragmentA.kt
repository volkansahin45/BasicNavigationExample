package com.vsahin.basicnavigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA : Fragment() {
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        view.go_to_fragment_b.setOnClickListener {
            val argument = view.textview_argument.text.toString()
            val action = FragmentADirections.actionFragmentAToFragmentB(argument)
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }
}
