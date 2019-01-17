package com.ikerfah.microclubapp.formations

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ikerfah.microclubapp.R

class FormationFragment : Fragment() {

    companion object {
        fun newInstance() = FormationFragment()
    }

    private lateinit var viewModel: FormationViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.formation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FormationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
