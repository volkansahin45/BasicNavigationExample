package com.vsahin.basicnavigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentB)
        }
        return view
    }
}
