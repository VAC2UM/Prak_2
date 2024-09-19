package com.itproger.prak_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        val buttonNext: Button = view.findViewById(R.id.btn_next)

        // Ручное управление
//        buttonNext.setOnClickListener {
//            val fragment2 = Fragment2()
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container, fragment2)
//                .addToBackStack(null)
//                .commit()
//        }

        // Навигация с помощью API
        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        return view
    }
}