package com.example.wmtfriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wmtfriends.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    private lateinit var nameList: ArrayList<Names>
    private lateinit var namesAdapter: NamesAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        nameList = ArrayList()
        namesAdapter = NamesAdapter(nameList)
        namesListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = namesAdapter
    }
    private fun namesListItems(){
        nameList.add(Names(R.drawable.avatar1, "Omolola"))
        nameList.add(Names(R.drawable.avata, "Temitope"))
        nameList.add(Names(R.drawable.avatar1, "Charity"))
        nameList.add(Names(R.drawable.avata, "Halimat"))
        nameList.add(Names(R.drawable.avatar1, "Gift"))
        nameList.add(Names(R.drawable.avata, "Kafilat"))
        nameList.add(Names(R.drawable.avatar1, "Ololade"))
        nameList.add(Names(R.drawable.avata, "Boluwatife"))
        nameList.add(Names(R.drawable.avatar2, "Taofeek"))
        nameList.add(Names(R.drawable.avatar2, "AbdWasiu"))
        nameList.add(Names(R.drawable.avatar1, "Olaitan"))
        nameList.add(Names(R.drawable.avatar2, "Abidemi"))
        nameList.add(Names(R.drawable.avatar2, "Obinna"))
        nameList.add(Names(R.drawable.avata, "Blessing"))
        nameList.add(Names(R.drawable.avatar2, "Richard"))
    }

}