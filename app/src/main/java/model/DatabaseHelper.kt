package model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "PrefeituraDB", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE Servico (id INTEGER PRIMARY KEY, nome TEXT, descricao TEXT)")
        db?.execSQL("CREATE TABLE Prefeitura (id INTEGER PRIMARY KEY, nome TEXT, endereco TEXT, latitude REAL, longitude REAL)")
        db?.execSQL("CREATE TABLE Usuario (id INTEGER PRIMARY KEY, nome TEXT, email TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS Servico")
        db?.execSQL("DROP TABLE IF EXISTS Prefeitura")
        db?.execSQL("DROP TABLE IF EXISTS Usuario")
        onCreate(db)
    }
}
