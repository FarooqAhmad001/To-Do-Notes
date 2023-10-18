package com.hypersoft.notesapp.domain.enums

import androidx.compose.ui.graphics.Color
import com.hypersoft.notesapp.ui.theme.HighPriorityColor
import com.hypersoft.notesapp.ui.theme.LowPriorityColor
import com.hypersoft.notesapp.ui.theme.MediumPriorityColor
import com.hypersoft.notesapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}