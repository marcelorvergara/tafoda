package android.vergara.tafoda


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    val selected = MutableLiveData<Note>()

    fun select (item: Note){
        selected.value = item

    }

}