package mega.boicot;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: mega.boicot.k */
/* compiled from: bd */
public class C5665k extends SQLiteOpenHelper {
    public C5665k(Context context) {
        super(context, "ac_data", null, 24);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE productos (_id integer UNIQUE,orden integer PRIMARY KEY AUTOINCREMENT,ref text NOT NULL,titulo text NOT NULL,descr text NOT NULL,idcat integer NOT NULL,precio real,precio_descr text NOT NULL,anyo integer NOT NULL,mes integer NOT NULL,dia integer NOT NULL,url_detalle NOT NULL,url_compra NOT NULL,img1_p blob,img1 blob,img1_id integer NOT NULL,img1_url text NOT NULL,det_cargado integer NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE fotos(_id integer PRIMARY KEY,idprod integer NOT NULL,url text NOT NULL,img_p blob,img blob,orden integer NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE cats(_id integer PRIMARY KEY,idcat integer,descr text NOT NULL);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS productos");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fotos");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cats");
        onCreate(sQLiteDatabase);
    }
}
