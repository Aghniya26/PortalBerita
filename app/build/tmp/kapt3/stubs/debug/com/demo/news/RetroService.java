package com.demo.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/demo/news/RetroService;", "", "getDataFromAPI", "Lretrofit2/Call;", "Lcom/demo/news/RecyclerData;", "country", "", "apiKey", "app_debug"})
public abstract interface RetroService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "top-headlines")
    public abstract retrofit2.Call<com.demo.news.RecyclerData> getDataFromAPI(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "country")
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey);
}