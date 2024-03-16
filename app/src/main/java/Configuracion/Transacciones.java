package Configuracion;

public class Transacciones {
    //Nombre de la base de datos
    public static final String DBName = "PMVIDEO";

    //Creación de las tablas de las bases de datos.
    public static final String TableVideos = "videos";

    //Creacion de los campos de base de datos

    public static final String id = "id";
    public static final String video_uri = "video_uri";

    // DDL Create
    public static final String CreateTableVideos = "Create table "+ TableVideos +"("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT, video_uri TEXT )";

    //DDL Drop
    public static final String DropTableVideos = "DROP TABLE IF EXISTS "+ TableVideos;

    //DML
    public static final String SelectAllVideos = "SELECT * FROM " + TableVideos;
}
