package winged.example.presentation.hello_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import winged.example.presentation.BaseFragment
import winged.example.presentation.R
import winged.example.presentation.databinding.FragmentHelloBinding

class HelloFragment : BaseFragment<FragmentHelloBinding>(R.layout.fragment_hello) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding.someView... you know what do to :)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
