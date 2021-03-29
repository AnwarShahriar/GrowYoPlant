package me.anwarshahriar.growyoplant

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(@ApplicationContext context: Context) : ViewModel() {

  private val _lastTakenImage = MutableLiveData<Drawable>()
  val lastTakenImage: LiveData<Drawable> = _lastTakenImage

  init {
    _lastTakenImage.value = ContextCompat.getDrawable(context, R.drawable.ic_green_tea)
  }
}