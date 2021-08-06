package com.demo.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001e\u0010\u0015\u001a\u00020\u000e2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/demo/news/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/news/RecyclerViewAdapter$MyViewHolder;", "()V", "items", "Ljava/util/ArrayList;", "Lcom/demo/news/ModelArticle;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataList", "data", "Lkotlin/collections/ArrayList;", "Companion", "MyViewHolder", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.news.RecyclerViewAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.demo.news.ModelArticle> items;
    public static final com.demo.news.RecyclerViewAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.demo.news.ModelArticle> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.demo.news.ModelArticle> p0) {
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.demo.news.ModelArticle> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.news.RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.news.RecyclerViewAdapter.MyViewHolder holder, int position) {
    }
    
    public RecyclerViewAdapter() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView thubmImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/news/RecyclerViewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/demo/news/databinding/RecyclerviewRowBinding;", "(Lcom/demo/news/databinding/RecyclerviewRowBinding;)V", "getBinding", "()Lcom/demo/news/databinding/RecyclerviewRowBinding;", "bind", "", "data", "Lcom/demo/news/ModelArticle;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.demo.news.databinding.RecyclerviewRowBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.news.ModelArticle data) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.demo.news.databinding.RecyclerviewRowBinding getBinding() {
            return null;
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.demo.news.databinding.RecyclerviewRowBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/demo/news/RecyclerViewAdapter$Companion;", "", "()V", "loadImage", "", "thubmImage", "Landroid/widget/ImageView;", "url", "", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"loadImage"})
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView thubmImage, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        private Companion() {
            super();
        }
    }
}