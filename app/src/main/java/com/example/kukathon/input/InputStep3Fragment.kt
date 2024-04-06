package com.example.kukathon.input

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kukathon.R
import com.example.kukathon.databinding.FragmentInputStep3Binding

class InputStep3Fragment : Fragment() {
    private var _binding: FragmentInputStep3Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInputStep3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
        nextButton()
    }

    private fun setupClickListeners() {
        val imageViews = listOf(
            binding.btnQ1A1,
            binding.btnQ1A2,
            binding.btnQ2A1,
            binding.btnQ2A2,
            binding.btnQ2A3,
            binding.btnQ2A3,
            binding.btnQ2A4
        )

        imageViews.forEach { imageView ->
            imageView.setOnClickListener { view ->
                view.isSelected = !view.isSelected
            }
        }
    }

    private fun nextButton() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_inputStep3Fragment_to_studyResultFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}