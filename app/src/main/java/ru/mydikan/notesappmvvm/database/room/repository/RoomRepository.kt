package ru.mydikan.notesappmvvm.database.room.repository

import androidx.lifecycle.LiveData
import ru.mydikan.notesappmvvm.database.DatabaseRepository
import ru.mydikan.notesappmvvm.database.room.dao.NoteRoomDao
import ru.mydikan.notesappmvvm.model.Note

class RoomRepository(private val noteRoomDao: NoteRoomDao) : DatabaseRepository {
    override val readAll: LiveData<List<Note>>
        get() = noteRoomDao.getAllNotes()

    override suspend fun create(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.addNote(note = note)
    }

    override suspend fun update(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.updateNote(note = note)
    }

    override suspend fun delete(note: Note, onSuccess: () -> Unit) {

    }
}
