package ElvisMail.elvis.elvismail;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ElvisMailBD extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="elvismail.bd";
    private static final int VERSION_BD=1;
    private static final String TABLA_MAIL="CREATE TABLE ELVISMAIL(NOMBRE TEXT PRIMARY KEY, CORREO TEXT, TELEFONO TEXT, CIUDAD TEXT, EDAD TEXT, ESTADO TEXT )";

    public ElvisMailBD(@Nullable Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_MAIL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_MAIL);
        sqLiteDatabase.execSQL(TABLA_MAIL);
    }

    public void agregarDatos(String nombre, String correo, String telefono, String ciudad, String edad, String estado){
        SQLiteDatabase bd=getWritableDatabase();

    }
}
