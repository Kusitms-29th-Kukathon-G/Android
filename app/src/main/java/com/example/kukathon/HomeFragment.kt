package com.example.kukathon

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.kukathon.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // btn_next 버튼에 클릭 리스너 추가
        binding.btnNext.setOnClickListener {
            // 이미지를 담을 ImageView 생성
            val imageView = ImageView(requireContext()).apply {
                setImageResource(R.drawable.alert_image) // drawable 폴더의 이미지를 설정
            }

            // Dialog 생성 및 설정
            Dialog(requireContext()).apply {
                requestWindowFeature(Window.FEATURE_NO_TITLE) // 타이틀 숨기기
                setContentView(imageView) // ImageView를 Dialog의 내용으로 설정
                window?.setBackgroundDrawableResource(android.R.color.transparent) // 배경을 투명하게 설정
                setCanceledOnTouchOutside(true) // 바깥 영역 터치시 닫히게 설정
                show() // Dialog 표시
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}