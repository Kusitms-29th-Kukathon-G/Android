package com.example.kukathon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kukathon.databinding.FragmentHomeBinding
import com.example.kukathon.databinding.FragmentMakeTodoBinding


class MakeTodoFragment : Fragment() {
    private var _binding: FragmentMakeTodoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMakeTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButton()
    }
    private fun nextButton() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_makeTodoFragment_to_navigation_home)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}