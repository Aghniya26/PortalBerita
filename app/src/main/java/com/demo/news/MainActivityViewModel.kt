package com.demo.news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class MainActivityViewModel : ViewModel(){

    lateinit var recyclerListData: MutableLiveData<ArrayList<ModelArticle>>
    lateinit var recyclerViewAdapter : RecyclerViewAdapter

    init {
        recyclerListData = MutableLiveData()
        recyclerViewAdapter = RecyclerViewAdapter()
    }

    fun getAdapter(): RecyclerViewAdapter {
        return recyclerViewAdapter
    }

    fun setAdapterData(data: ArrayList<ModelArticle>) {
        recyclerViewAdapter.setDataList(data)
        recyclerViewAdapter.notifyDataSetChanged()
    }

    fun getRecyclerListDataObserver(): MutableLiveData<ArrayList<ModelArticle>> {
        return recyclerListData
    }

    fun makeAPICall(country : String, api: String) {
        val retroInstance = RetroInstance.getRetroInstance().create(RetroService::class.java)
        val call = retroInstance.getDataFromAPI(country, api)
        call.enqueue(object : Callback<RecyclerData>{
            override fun onFailure(call: Call<RecyclerData>, t: Throwable) {
                recyclerListData.postValue(null)
                println("hahahahahhahahha")
            }

            override fun onResponse(call: Call<RecyclerData>, response: Response<RecyclerData>) {
                if(response.isSuccessful){

                    recyclerListData.postValue(response.body()?.modelArticle as ArrayList<ModelArticle>)
                } else {
                    recyclerListData.postValue(null)
                    println("wkwkwkwkwkwkwkwkwkwkwkw")
                }
            }
        })
    }

}