package com.example.focustimer.domain.model

import com.example.focustimer.core.Constants.Companion.FOCUS_TIME
import com.example.focustimer.core.Constants.Companion.LONG_BREAK_TIME
import com.example.focustimer.core.Constants.Companion.ONE_MIN_IN_SEC
import com.example.focustimer.core.Constants.Companion.ONE_SEC_IN_MILLIS
import com.example.focustimer.core.Constants.Companion.SHORT_BREAK_TIME

// SIEMPRE LOS ENUM DEBEN DE IR SEPARADOS POR COMA Y EL ULTIMO TERMINA EN PUNTO Y COMA
enum class TimerTypeEnum(val title: String, private val time: Long) {
    FOCUS("Focus Timer", FOCUS_TIME),
    SHORT_BREAK("Short Break", SHORT_BREAK_TIME),
    LONG_BREAK("Long Break", LONG_BREAK_TIME);

    fun timeToMillis(): Long {
        return time * ONE_MIN_IN_SEC * ONE_SEC_IN_MILLIS
    }
}