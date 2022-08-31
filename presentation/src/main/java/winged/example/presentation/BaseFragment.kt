package winged.example.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/*
Created this to prevent code duplications (initializing the binding variables, navigating etc.)
could be extended to also support viewModels for the fragments
*/
abstract class BaseFragment<T : ViewDataBinding>(@LayoutRes private val fragmentRes: Int) : Fragment() {

    private var _binding: T? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, fragmentRes, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun navigateTo(targetDestination: Int) {
        findNavController().navigate(targetDestination)
    }

    fun navigateUp() {
        findNavController().navigateUp()
    }
}
