package co.nordprojects.lantern

import android.os.Build


object BoardDefaults {
    private val DEVICE_RPI3 = "rpi3"

    /**
     * Return the I2C bus that the accelerometer can be accessed on
     */
    val busForAccelerometer: String
        get() {
            when (Build.DEVICE) {
                DEVICE_RPI3 -> return "I2C1"
                else -> throw IllegalStateException("Unsupported Build.DEVICE " + Build.DEVICE)
            }
        }
}