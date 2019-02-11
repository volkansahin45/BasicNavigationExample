package com.vsahin.basicnavigationexample


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args = arguments?.let { FragmentBArgs.fromBundle(it) }
        val a : String? = args?.argument
        Toast.makeText(activity, a, Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_b, container, false)
    }
}
