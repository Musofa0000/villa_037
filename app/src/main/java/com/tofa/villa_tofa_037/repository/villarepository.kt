package com.tofa.villa_tofa_037.repository

import com.tofa.villa_tofa_037.dao.villaDao
import com.tofa.villa_tofa_037.model.villa
import kotlinx.coroutines.flow.Flow

class TourRepository(private val villaDao: villaDao) {
    val Allvilla: Flow<List<villa>> = villaDao.getAllvilla()
    suspend fun insertvilla(villa: villa) {
        villaDao.insertvilla(villa)
    }

    suspend fun deletevilla(villa: villa) {
        villaDao.deletevilla(villa)
    }

    suspend fun updatevilla(villa: villa) {
        villaDao.updatevilla(villa)
    }
}