package com.demo.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import com.demo.news.databinding.ActivityMainBinding
import com.demo.news.util.Utils.getCountry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    //, RecyclerViewAdapter.ItemClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = makeApiCall()

        setupBinding(viewModel)
    }

    fun setupBinding(viewModel: MainActivityViewModel) {

        val activityMainBinding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        activityMainBinding.setVariable(BR.viewModel,  viewModel)
        activityMainBinding.executePendingBindings()

        recyclerView.apply {

            layoutManager = LinearLayoutManager(this@MainActivity)
            val decoration  = DividerItemDecoration(this@MainActivity, VERTICAL)
            addItemDecoration(decoration)
        }

    }

    fun makeApiCall(): MainActivityViewModel {

       val viewModel =  ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        viewModel.getRecyclerListDataObserver().observe(this, Observer<ArrayList<ModelArticle>>{
            progressbar.visibility = GONE
            if(it != null) {
                //update the adapter
                viewModel.setAdapterData(it)
            } else {
                Toast.makeText(this@MainActivity, "Error in fetching data", Toast.LENGTH_LONG).show()
            }
        })
        viewModel.makeAPICall(getCountry(), "6e0f7ff8870a4c6e94bf588ad00bc6fb")

        return viewModel
    }

//     fun onNewsClick(modelArticle: ModelArticle) {
//        val intent = Intent(this, DetailNewsActivity::class.java)
//        intent.putExtra(DetailNewsActivity.DETAIL_NEWS, modelArticle)
//        this.startActivity(intent)
//    }
}