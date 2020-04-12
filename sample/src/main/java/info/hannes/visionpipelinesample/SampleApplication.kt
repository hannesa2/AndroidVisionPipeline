package info.hannes.visionpipelinesample

import android.app.Application
import info.hannes.timber.DebugTree
import timber.log.Timber

class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(DebugTree())
    }
}