package com.mattintech.emmtools.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mattintech.emmtools.AppConstants
import com.mattintech.emmtools.R
import com.mattintech.emmtools.util.AbnormalAppUtils

/**
 * A simple [Fragment] subclass.
 * Use the [AbnormalAppFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AbnormalAppFragment : Fragment(), View.OnClickListener {

    private val TAG: String = String.format("%sAbnormalAppFragment:", AppConstants.LOG_TAG)

    private val abnormal = AbnormalAppUtils()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abnormal_app, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiInit(view)
    }

    private fun uiInit(view: View) {
        val btnStartAnr: Button = view.findViewById(R.id.btn_anr_start)
        btnStartAnr.setOnClickListener(this)

        val btnStartCrash: Button = view.findViewById(R.id.btn_crash_start)
        btnStartCrash.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_anr_start -> {
                Log.d(TAG, "onClick: startAnr")
                abnormal.startAnr()
            }
            R.id.btn_crash_start -> {
                Log.d(TAG, "onClick: startCrash")
                abnormal.appCrash()
            }
        }
    }

}