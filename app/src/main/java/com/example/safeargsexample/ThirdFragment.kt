package com.example.safeargsexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_third.view.*

class ThirdFragment : Fragment() {
    private val args: ThirdFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.contentTextView.text = args.content
        view.valueTextView.text = args.value.toString()
        val infos = arrayOf<String>(
                                    "1 is the only square-free square",
                                    "2 is the only even prime number",
                                    "3 is the only triangular number that is also prime",
                                    "4 is the only compositorial square",
                                    "5 is the smallest odd prime which is not a Gaussian prime",
                                    "6 is the only perfect factorial",
                                    "7 is the only prime followed by a cube",
                                    "8 is the only composite cube in the Fibonacci sequence",
                                    "9 is the smallest odd composite number",
                                    "10 is the base of our number system"
        )

        view.nextButton.setOnClickListener {
            val myData = MyData(
                args.content,
                args.value,
                if(args.value < 10) infos[args.value-1] else "Sorry number out of bounds"
            )

            val action = ThirdFragmentDirections.actionThirdToFourth(myData)
            findNavController().navigate(action)
        }
    }
}
