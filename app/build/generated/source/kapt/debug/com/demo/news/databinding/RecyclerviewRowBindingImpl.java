package com.demo.news.databinding;
import com.demo.news.R;
import com.demo.news.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerviewRowBindingImpl extends RecyclerviewRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerviewRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RecyclerviewRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            );
        this.authorTextView.setTag(null);
        this.createdDateTextView.setTag(null);
        this.descTextView.setTag(null);
        this.nameTextView.setTag(null);
        this.recyclholder.setTag(null);
        this.thubmImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.modelArticle == variableId) {
            setModelArticle((com.demo.news.ModelArticle) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModelArticle(@Nullable com.demo.news.ModelArticle ModelArticle) {
        this.mModelArticle = ModelArticle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.modelArticle);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String modelArticleTitle = null;
        com.demo.news.ModelSource modelArticleModelSource = null;
        java.lang.String modelArticleModelSourceName = null;
        java.lang.String modelArticleModelSourceNameJavaLangString = null;
        java.lang.String modelArticleAuthor = null;
        java.lang.String modelArticleModelSourceNameJavaLangStringModelArticleAuthorJavaLangString = null;
        java.lang.String modelArticlePublishedAt = null;
        java.lang.String modelArticleModelSourceNameJavaLangStringModelArticleAuthor = null;
        java.lang.String modelArticleDescription = null;
        com.demo.news.ModelArticle modelArticle = mModelArticle;
        java.lang.String modelArticleUrlToImage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (modelArticle != null) {
                    // read modelArticle.title
                    modelArticleTitle = modelArticle.getTitle();
                    // read modelArticle.modelSource
                    modelArticleModelSource = modelArticle.getModelSource();
                    // read modelArticle.author
                    modelArticleAuthor = modelArticle.getAuthor();
                    // read modelArticle.publishedAt
                    modelArticlePublishedAt = modelArticle.getPublishedAt();
                    // read modelArticle.description
                    modelArticleDescription = modelArticle.getDescription();
                    // read modelArticle.urlToImage
                    modelArticleUrlToImage = modelArticle.getUrlToImage();
                }


                if (modelArticleModelSource != null) {
                    // read modelArticle.modelSource.name
                    modelArticleModelSourceName = modelArticleModelSource.getName();
                }


                // read (modelArticle.modelSource.name) + ("  (")
                modelArticleModelSourceNameJavaLangString = (modelArticleModelSourceName) + ("  (");


                // read ((modelArticle.modelSource.name) + ("  (")) + (modelArticle.author)
                modelArticleModelSourceNameJavaLangStringModelArticleAuthor = (modelArticleModelSourceNameJavaLangString) + (modelArticleAuthor);


                // read (((modelArticle.modelSource.name) + ("  (")) + (modelArticle.author)) + (")")
                modelArticleModelSourceNameJavaLangStringModelArticleAuthorJavaLangString = (modelArticleModelSourceNameJavaLangStringModelArticleAuthor) + (")");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.authorTextView.setText(modelArticleModelSourceNameJavaLangStringModelArticleAuthorJavaLangString);
            this.createdDateTextView.setText(modelArticlePublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descTextView, modelArticleDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextView, modelArticleTitle);
            com.demo.news.RecyclerViewAdapter.loadImage(this.thubmImage, modelArticleUrlToImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): modelArticle
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}