package ru.sikuda.mobile.start_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ru.sikuda.mobile.start_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val list: Array<String> =  arrayOf<String>("ivan", "maria", "vasya")

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UsersAdapter

    //private val binding: ActivityMainBinding by lazy {
    //    ActivityMainBinding.inflate(layoutInflater)
    //}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setTitle("Test RecycleView")

        adapter = UsersAdapter(list)
        binding.recyclerView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        //setContentView(binding.root)

        //setContentView(R.layout.activity_main)
    }

}