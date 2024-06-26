package com.example.kukathon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kukathon.databinding.FragmentOnBoardingBinding
import com.example.kukathon.databinding.FragmentStudyResultBinding

class StudyResultFragment : Fragment() {

    private var _binding: FragmentStudyResultBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStudyResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButton()
    }
    private fun nextButton() {
        binding.tvResultButton.setOnClickListener {
            findNavController().navigate(R.id.action_studyResultFragment_to_makeTodoFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}