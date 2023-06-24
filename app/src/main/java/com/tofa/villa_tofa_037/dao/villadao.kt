package com.tofa.villa_tofa_037.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.tofa.villa_tofa_037.model.villa
import kotlinx.coroutines.flow.Flow



    @Dao
    interface villaDao {
        @Query("SELECT * FROM `villa_table` ORDER by name ASC")
        fun getAllvilla(): Flow<List<villa>>

        @Insert
        suspend fun insertvilla(villa: villa)

        @Delete
        suspend fun deletevilla(villa: villa)

        @Update
        suspend fun updatevilla(villa: villa)
    }
