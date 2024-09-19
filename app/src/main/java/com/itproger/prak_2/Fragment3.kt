package com.itproger.prak_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        // Ручное управление
        val buttonBack: Button = view.findViewById(R.id.btn_back)

//        buttonBack.setOnClickListener {
//            parentFragmentManager.popBackStack()
//        }

        buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return view
    }
}