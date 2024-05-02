package com.lvp.espressotesting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lvp.espressotesting.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    private val binding get() = _binding!!

    private var isHiddenText = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            toggleTextContent()
        }
    }

    private fun toggleTextContent() {
        isHiddenText = !isHiddenText
        if (isHiddenText) {
            binding.textviewSecond.setText(R.string.lorem_ipsum)
        } else {
            binding.textviewSecond.setText(R.string.txt_text_content)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}