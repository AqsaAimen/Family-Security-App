package com.example.familysecurityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val listMember= listOf<MemberModel>(


            MemberModel("Lokesh","Australia melbourne house 890, street 57,west",67,2345),
            MemberModel("DANISH","lONDON  manchester house 690, street 27,west",97,209),
            MemberModel("ZOHAIB ","Ireland  York house 009, street 677,west",52,2000),
            MemberModel("ASMA","Fineland birmingham   house 0009, street 403,west",10,888),
            MemberModel("ATIYA","Australia melbourne house S345, street 001,west",42,3321),
        )
        val adapter=MemberAdapter(listMember)
       val recycler=requireView().findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager=LinearLayoutManager(requireContext())
        recycler.adapter=adapter
    }

    companion object {

        @JvmStatic
        fun newInstance()= HomeFragment()
                }
            }

