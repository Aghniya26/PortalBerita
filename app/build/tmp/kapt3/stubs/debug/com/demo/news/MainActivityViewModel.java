package com.demo.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0014\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/demo/news/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "recyclerListData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/demo/news/ModelArticle;", "getRecyclerListData", "()Landroidx/lifecycle/MutableLiveData;", "setRecyclerListData", "(Landroidx/lifecycle/MutableLiveData;)V", "recyclerViewAdapter", "Lcom/demo/news/RecyclerViewAdapter;", "getRecyclerViewAdapter", "()Lcom/demo/news/RecyclerViewAdapter;", "setRecyclerViewAdapter", "(Lcom/demo/news/RecyclerViewAdapter;)V", "getAdapter", "getRecyclerListDataObserver", "makeAPICall", "", "country", "", "api", "setAdapterData", "data", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.news.ModelArticle>> recyclerListData;
    @org.jetbrains.annotations.NotNull()
    public com.demo.news.RecyclerViewAdapter recyclerViewAdapter;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.news.ModelArticle>> getRecyclerListData() {
        return null;
    }
    
    public final void setRecyclerListData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.news.ModelArticle>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.news.RecyclerViewAdapter getRecyclerViewAdapter() {
        return null;
    }
    
    public final void setRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    com.demo.news.RecyclerViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.news.RecyclerViewAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.demo.news.ModelArticle> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.news.ModelArticle>> getRecyclerListDataObserver() {
        return null;
    }
    
    public final void makeAPICall(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String api) {
    }
    
    public MainActivityViewModel() {
        super();
    }
}