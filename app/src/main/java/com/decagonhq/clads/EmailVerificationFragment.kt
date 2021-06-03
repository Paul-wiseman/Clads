package com.decagonhq.clads

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.decagonhq.clads.databinding.FragmentEmailVerificationBinding

class EmailVerificationFragment : Fragment() {

    // using binding
    private var preBinding: FragmentEmailVerificationBinding? = null
    private val binding: FragmentEmailVerificationBinding get() = preBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        preBinding = FragmentEmailVerificationBinding.inflate(inflater, container, false)
        return preBinding!!.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_email_verification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.emailVerificationFragmentVerifyEmailAddressButton.setOnClickListener {
            findNavController().navigate(R.id.action_emailVerificationFragment_to_loginFragment)
        }
    }
}
